package com.chinalife.sz.carcalculate.service.impl;

import com.alibaba.fastjson.JSON;
import com.chinalife.sz.carcalculate.service.WebService;
import com.chinalife.sz.carcalculate.utils.ConfigUtils;
import com.chinalife.sz.carcalculate.utils.LogUtils;
import com.chinalife.sz.carcalculate.webservice.ProposalSaveServiceStub;
import com.chinalife.sz.cc.domain.OrderRequest;
import com.chinalife.sz.cc.log.service.LogService;
import com.chinalife.sz.cc.model.log.LogDTO;
import com.chinalife.sz.cc.model.order.OrderInfoDTO;
import com.chinalife.sz.cc.order.service.OrderInfoService;
import com.prs.framework.core.exception.BusinessException;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;
import java.rmi.RemoteException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/**
 * Created by tianwei on 2016/12/14.
 */
public class proposalSaveService implements WebService {

    private ProposalSaveServiceStub stub;
    @Autowired
    OrderInfoService orderInfoService;
    private Logger logger= Logger.getLogger(this.getClass());
    @Resource
    private LogService logService;
    @Override
    public <T> boolean checkData(T object) {
        if (object instanceof ProposalSaveServiceStub.InsureConfirmEhmRequest) {
            ProposalSaveServiceStub.InsureConfirmEhmRequest request = (ProposalSaveServiceStub.InsureConfirmEhmRequest) object;
            ProposalSaveServiceStub.TXInsuranceRequestExtensionEhm extensionEhmS = new ProposalSaveServiceStub.TXInsuranceRequestExtensionEhm();
            ConfigUtils.setMainInfo(extensionEhmS, "tXInsuranceRequestExtension");
            ProposalSaveServiceStub.TXInsuranceRequestEhm ehmS = new ProposalSaveServiceStub.TXInsuranceRequestEhm();
            ConfigUtils.setMainInfo(ehmS, "tXInsuranceRequest");
//        requestS.set`
            request.setTXInsuranceRequestEhm(ehmS);
            request.setTXInsuranceRequestExtensionEhm(extensionEhmS);
            request.setRequestType(ConfigUtils.getValue("basic.requestType"));//系统来源
//            request.setTmkFlag("1");//类型:1 传统业务 2电销3 门店
            request.setLogonRole(ConfigUtils.getValue("proposalSave.main.logonRole"));
            request.setCombosCode(ConfigUtils.getValue("proposalSave.main.combosCode"));//此处传套餐代码无用

//            计算投保人 车主 被保险人年龄

            if(request.getApplicant().getIdentifyNumber()!=null){
                if(request.getApplicant().getIdentifyNumber().length()==18){
                    int age = ConfigUtils.getAge(request.getApplicant().getIdentifyNumber());
                    request.getApplicant().setAge(age);
                }
            }
            if(request.getInsuredData().getIdentifyNumber()!=null){
                if(request.getInsuredData().getIdentifyNumber().length()==18){
                    int age=ConfigUtils.getAge(request.getInsuredData().getIdentifyNumber());
                    request.getInsuredData().setAge(age);
                }
            }
            if(request.getCarOwnerDataEhm().getIdentifyNumber()!=null){
                if(request.getCarOwnerDataEhm().getIdentifyNumber().length()==18){
                    int age= ConfigUtils.getAge(request.getCarOwnerDataEhm().getIdentifyNumber());
                    request.getCarOwnerDataEhm().setAge(age);
                }
            }

//              其他信息
//            request.setArbitBoardName("深圳仲裁机构");
            /**指定修理厂信息,非必传**/
//            ProposalSaveServiceStub.RepairFactoryEhm factory = new ProposalSaveServiceStub.RepairFactoryEhm();
            //			factory.setOrderNo("");
            //			factory.setFactoryCode("");
            //			factory.setFactoryName("");
            request.setRepairFactoryEhm(null);
            return true;
        }
        return false;
    }

    @Override
    public <T> T dealData(Object domain, T response) {
        ProposalSaveServiceStub.InsureConfirmEhmRequest request = new ProposalSaveServiceStub.InsureConfirmEhmRequest();
        String orderjson = JSON.toJSONString(domain);
        request = JSON.parseObject(orderjson, request.getClass());
        if (checkData(request)) {
            ProposalSaveServiceStub.SaveProposalEhm saveProposalEhm = new ProposalSaveServiceStub.SaveProposalEhm();
            saveProposalEhm.setRequest(request);
            ProposalSaveServiceStub.SaveProposalEhmResponse responseSave = null;

            // 写入日志
            Object reqJson = ConfigUtils.formatJson(request);
            logger.info("投保确认--" + request.getProposalNo() + "(request):" + reqJson);
            LogDTO logDTO = new LogDTO();
            logDTO.setServiceNme("投保确认");
            logDTO.setCarOwner(request.getCarOwnerDataEhm().getInsuredName());
            logDTO.setReqTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            logDTO.setReqXml(reqJson.toString());

            try {
                responseSave = new ProposalSaveServiceStub().saveProposalEhm(saveProposalEhm);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            ProposalSaveServiceStub.InsureConfirmEhmResponse cResponse = responseSave.get_return();
            logDTO.setRespTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
            if(cResponse!=null){
                Object respJson= ConfigUtils.formatJson(cResponse);
                logger.info("投保确认--"+request.getProposalNo()+"(response):"+respJson);
                logDTO.setRespXml(respJson.toString());
            }

            ProposalSaveServiceStub.TransResultEhm result = cResponse.getTXInsuranceResponseEhm().getTransResultEhm();
            if (response instanceof HashMap) {
                HashMap resultMap = (HashMap) response;
                resultMap.put("provisonalno", cResponse.getProvisonalno());
                resultMap.put("message", result.getResultInfoDesc());
                resultMap.put("resultCode", result.getResultCode());
                if ("1".equals(result.getResultCode())) {
                    logDTO.setLogType("success");
                    asynWtireLog(logDTO);
                    if(domain instanceof OrderRequest){
                        OrderRequest orderRequest=(OrderRequest)domain;
                        OrderInfoDTO dto = new OrderInfoDTO();
                        dto.setProposalNo(request.getProposalNo());
                        dto.setAppliName(request.getApplicant().getAppliName());
                        dto.setFrameNo(orderRequest.getFrameNo());
                        dto.setLicenseNo(orderRequest.getLicenseNo());
                        Date date=new Date();
                        DateFormat df=new SimpleDateFormat("yyyy-MM-dd");
                        String formatDate = df.format(date);
                        dto.setInputDate(formatDate);
                        dto.setHandlerName(orderRequest.getHandler1Name());
                        orderInfoService.saveOrderInfo(dto);
                    }

                }
                else{
                    logDTO.setLogType("fail");
                    logDTO.setErrMsg(result.getResultInfoDesc());
                    asynWtireLog(logDTO);
                }
                return response;
            }
        }

        return null;
    }

    @Override
    public void asynWtireLog(final LogDTO logDTO) {
        LogUtils.executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    logService.addLog(logDTO);
                } catch (BusinessException e) {
                    e.printStackTrace();
                }
            }
        });
    }
    private void SaveOrderInfo(OrderInfoDTO orderInfoDTO) {

    }

    public ProposalSaveServiceStub getStub() {
        return stub;
    }

    public void setStub(ProposalSaveServiceStub stub) {
        this.stub = stub;
    }
}
