package com.chinalife.sz.carcalculate.service.impl;

import com.alibaba.fastjson.JSON;
import com.chinalife.sz.carcalculate.service.WebService;
import com.chinalife.sz.carcalculate.utils.ConfigUtils;
import com.chinalife.sz.carcalculate.utils.LogUtils;
import com.chinalife.sz.carcalculate.webservice.VehicleModelQueryServiceV1XStub;
import com.chinalife.sz.cc.domain.TransResultEhm;
import com.chinalife.sz.cc.log.service.LogService;
import com.chinalife.sz.cc.model.log.LogDTO;
import com.prs.framework.core.exception.BusinessException;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by tianwei on 2016/7/31.
 * 车型计算
 */
public class VehicleModelQueryService implements WebService {
    private VehicleModelQueryServiceV1XStub stub;
    @Resource
    private LogService logService;

    private Logger logger= Logger.getLogger(this.getClass());
    @Override
    public <T> boolean checkData(T object) {
        if (object instanceof VehicleModelQueryServiceV1XStub.VehicleModelQueryRequest) {
            VehicleModelQueryServiceV1XStub.VehicleModelQueryRequest request = (VehicleModelQueryServiceV1XStub.VehicleModelQueryRequest) object;
            request.setPolicySort(ConfigUtils.getValue("basic.policySort"));
            request.setStandardName(request.getBrandName());
            request.setBrandName("");

            ConfigUtils.setMainInfo(request, "car");
//            VehicleModelQueryServiceV1XStub.TXInsuranceRequestExtensionEhm extensionEhm=new VehicleModelQueryServiceV1XStub.TXInsuranceRequestExtensionEhm();
//            ConfigUtils.setMainInfo(extensionEhm,"tXInsuranceRequestExtension");
//            VehicleModelQueryServiceV1XStub.TXInsuranceRequestEhm  ehm= new VehicleModelQueryServiceV1XStub.TXInsuranceRequestEhm();
//            ConfigUtils.setMainInfo(ehm,"tXInsuranceRequest");
//            VehicleModelQueryServiceV1XStub.IInsuranceExtensionEhm Iehm = new VehicleModelQueryServiceV1XStub.IInsuranceExtensionEhm();
//            ConfigUtils.setMainInfo(Iehm,"iInsuranceExtension");
//            ehm.setIInsuranceExtensionEhm(Iehm);
//            request.setTXInsuranceRequestEhm(ehm);
//            request.setTXInsuranceRequestExtensionEhm(extensionEhm);

            ConfigUtils.setRequest(stub,request);
            return true;
            //ConfigUtils.setProperties(request);
        }
        return false;
    }

    @Override
    public <T> T dealData(Object domain, T response) {
    	
    	Field[] fields = domain.getClass().getDeclaredFields();
    	String operator=null;
    	for(Field field : fields){
    		String varName = field.getName();
    		if(varName.equals("Operator")){
    			try {
					Method m = domain.getClass().getMethod("get"+varName);
					operator = (String)m.invoke(domain);
				} catch (SecurityException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (NoSuchMethodException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			break;
    		}


    	}
    	
        VehicleModelQueryServiceV1XStub.VehicleModelQueryRequest request = new VehicleModelQueryServiceV1XStub.VehicleModelQueryRequest();
        request = ConfigUtils.simpleBeanConvert(domain, request.getClass());
        try {
            stub = new VehicleModelQueryServiceV1XStub();
        } catch (AxisFault e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
            return null;
        }

        //request.setre
        if (checkData(request)) {
            VehicleModelQueryServiceV1XStub.QueryCarModelList query = new VehicleModelQueryServiceV1XStub.QueryCarModelList();
              query.setRequest(request);
//            System.out.println(request.getBrandName()+"(request):"+ JSON.toJSONString(request));
            logger.info(request.getBrandName()+"(request):"+ JSON.toJSONString(request));
            LogDTO logDTO = new LogDTO();
            logDTO.setServiceNme("车型查询");
            logDTO.setCrtUsr(operator);
            try {
                int timeOutInMilliSeconds = 30000;
                Options options = stub._getServiceClient().getOptions();
                options.setTimeOutInMilliSeconds(timeOutInMilliSeconds);
                options.setProperty(HTTPConstants.SO_TIMEOUT, timeOutInMilliSeconds);
                options.setProperty(HTTPConstants.CONNECTION_TIMEOUT,timeOutInMilliSeconds);
                stub._getServiceClient().setOptions(options);
                logDTO.setReqTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                    String reqXml = LogUtils.writeObject2String(request);
                    logDTO.setReqXml(reqXml);
                VehicleModelQueryServiceV1XStub.VehicleModelQueryResponse VehicleModelQueryResponse = stub.queryCarModelList(query).get_return();
                logDTO.setRespTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                if(VehicleModelQueryResponse!=null){
                    String respXml = LogUtils.writeObject2String(VehicleModelQueryResponse);
                    logDTO.setRespXml(respXml);
                }
                VehicleModelQueryServiceV1XStub.TransResultEhm result = VehicleModelQueryResponse.getTXInsuranceResponseEhm().getTransResultEhm();

                if (result.getResultCode().equals("1")) {
                    VehicleModelQueryServiceV1XStub.VehicleModelData[] vehicleModelDataArr = VehicleModelQueryResponse.getVehicleModelDataArr();
                    vehicleModelDataArr = sortVehicleModelArr(vehicleModelDataArr);
                    VehicleModelQueryResponse.setVehicleModelDataArr(vehicleModelDataArr);
                    response = (T) ConfigUtils.simpleBeanConvert(VehicleModelQueryResponse, response.getClass());
                    TransResultEhm resultEhm = new TransResultEhm();
                    resultEhm = ConfigUtils.simpleBeanConvert(result, resultEhm.getClass());
                    ConfigUtils.setSingleProperties(response, resultEhm);
                    logger.info("车型查询返回值:"+JSON.toJSONString(VehicleModelQueryResponse));
                    logDTO.setLogType("success");
                    asynWtireLog(logDTO);
                    return response;


                } else {
                    TransResultEhm resultEhm = new TransResultEhm();
                    resultEhm = ConfigUtils.simpleBeanConvert(result, resultEhm.getClass());
                    ConfigUtils.setSingleProperties(response, resultEhm);
                    logDTO.setLogType("fail");
                    logDTO.setErrMsg(result.getResultInfoDesc());
                    asynWtireLog(logDTO);
                    return response;
                }
            } catch (Exception e) {
                e.printStackTrace();
                logger.error(e.getMessage(),e);
//                asynWtireLog(logDTO);
                return null;
            }
        }
        return null;
    }

    public VehicleModelQueryServiceV1XStub getStub() {
        return stub;
    }

    public void setStub(VehicleModelQueryServiceV1XStub stub) {
        this.stub = stub;
    }



//车型排序
    private VehicleModelQueryServiceV1XStub.VehicleModelData[] sortVehicleModelArr(VehicleModelQueryServiceV1XStub.VehicleModelData[] vehicleModelDataArr) {
        if (vehicleModelDataArr.length > 1) {
            for (int i = 0; i < vehicleModelDataArr.length - 1; i++) {
                for (int j = 0; j < vehicleModelDataArr.length-i - 1; j++) {
                    if (vehicleModelDataArr[i].getPurchasePrice() > vehicleModelDataArr[i + 1].getPurchasePrice()) {
                        VehicleModelQueryServiceV1XStub.VehicleModelData temp;
                        temp = vehicleModelDataArr[i];
                        vehicleModelDataArr[i] = vehicleModelDataArr[i + 1];
                        vehicleModelDataArr[i + 1] = temp;

                    }
                }

            }
            return vehicleModelDataArr;
        } else {
            return vehicleModelDataArr;
        }

    }
//   异步写日志
    public void asynWtireLog(final LogDTO logDTO){
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
//        logDTO.setReqTm(new SimpleDateFormat("yyyy-mm-dd").format(new Date()));



    }

}
