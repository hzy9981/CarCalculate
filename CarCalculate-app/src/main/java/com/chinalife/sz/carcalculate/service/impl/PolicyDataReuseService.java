package com.chinalife.sz.carcalculate.service.impl;

import com.chinalife.sz.carcalculate.service.WebService;
import com.chinalife.sz.carcalculate.utils.ConfigUtils;
import com.chinalife.sz.carcalculate.utils.LogUtils;
import com.chinalife.sz.carcalculate.webservice.PolicyDataReuseServiceStub;
import com.chinalife.sz.cc.log.service.LogService;
import com.chinalife.sz.cc.model.log.LogDTO;
import com.prs.framework.core.exception.BusinessException;
import org.apache.axis2.AxisFault;
import org.apache.log4j.Logger;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by tianwei on 2016/7/31.
 */
public class PolicyDataReuseService implements WebService {
	private PolicyDataReuseServiceStub stub;
	private Logger logger= Logger.getLogger(this.getClass());
	@Resource
	private LogService logService;
	@Override
	public <T> boolean checkData(T object) {
		if(object instanceof PolicyDataReuseServiceStub.PolicyDataReuseEhmRequest){
			PolicyDataReuseServiceStub.PolicyDataReuseEhmRequest request =(PolicyDataReuseServiceStub.PolicyDataReuseEhmRequest)object;
			request.setRequestType(ConfigUtils.getValue("policyDataReuseService.requestType"));
			request.setComCode(ConfigUtils.getValue("policyDataReuseService.comCode"));
			ConfigUtils.setRequest(stub,request);
			return true;
		}
		return false;
	}

	@Override
	public <T> T dealData(Object domain, T response) {
		try {
			stub =new PolicyDataReuseServiceStub();
		} catch (AxisFault e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			logger.error(e1.getMessage(),e1);
		}
		PolicyDataReuseServiceStub.PolicyDataReuseEhmRequest request = new PolicyDataReuseServiceStub.PolicyDataReuseEhmRequest();
			request=ConfigUtils.simpleBeanConvert(domain,request.getClass());
		if(checkData(request)){
			PolicyDataReuseServiceStub.PolicyDateReuse query = new PolicyDataReuseServiceStub.PolicyDateReuse();
			query.setEhmRequest(request);
			try {
				 LogDTO logDTO = new LogDTO();
				 logDTO.setCrtUsr(request.getOperator());
				logDTO.setServiceNme("历史数据复用");
				logDTO.setReqTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
				String reqXml = LogUtils.writeObject2String(request);
				logDTO.setReqXml(reqXml);
				PolicyDataReuseServiceStub.PolicyDataReuseEhmResponse policyDataReuseEhmResponse = stub.policyDateReuse(query).get_return();
				logDTO.setRespTm(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                if(policyDataReuseEhmResponse!=null){
                   String respXml = LogUtils.writeObject2String(policyDataReuseEhmResponse);
					logDTO.setRespXml(respXml);
				}
				PolicyDataReuseServiceStub.TransResultEhm result = policyDataReuseEhmResponse.getTXInsuranceResponseEhm().getTransResultEhm();
				System.out.println(result.getResultCode());
				if(result.getResultCode().equals("1")){
					//保险期限顺延一年
					//if()
					policyDataReuseEhmResponse.getMainEhm().setStartDate(ConfigUtils.addOneYear(policyDataReuseEhmResponse.getMainEhm().getStartDate()));
					policyDataReuseEhmResponse.getMainEhm().setEndDate(ConfigUtils.addOneYear(policyDataReuseEhmResponse.getMainEhm().getEndDate()));
					PolicyDataReuseServiceStub.ItemKindDataEhm[] itemKindDataEhmArr = policyDataReuseEhmResponse.getItemKindDataEhmArr();

//					PolicyDataReuseServiceStub.ItemKindDataEhm itemKindDataEhm = itemKindDataEhmArr[0];
                     List<PolicyDataReuseServiceStub.ItemKindDataEhm> totalItemKindList=getTotalItemKindList(itemKindDataEhmArr);
					PolicyDataReuseServiceStub.ItemKindDataEhm[] totalItemKindDataEhms = totalItemKindList.toArray(new PolicyDataReuseServiceStub.ItemKindDataEhm[totalItemKindList.size()]);

					policyDataReuseEhmResponse.setItemKindDataEhmArr(totalItemKindDataEhms);
//					System.out.println("保费:"+policyDataReuseEhmResponse.getMainEhm().getSumPremium());
					response= (T) ConfigUtils.simpleBeanConvert(policyDataReuseEhmResponse,response.getClass());
					logDTO.setLogType("success");
					asynWtireLog(logDTO);
//					String jsonResponse = JSON.toJSONString(response);
//					System.out.println(jsonResponse);
					return response;
				}
				else {
					logDTO.setLogType("fail");
					logDTO.setErrMsg(result.getResultInfoDesc());
					asynWtireLog(logDTO);
				}
			} catch (RemoteException e) {
				e.printStackTrace();
				logger.error(e.getMessage(),e);

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

	private List<PolicyDataReuseServiceStub.ItemKindDataEhm> getTotalItemKindList(PolicyDataReuseServiceStub.ItemKindDataEhm[] itemKindList){
		List<PolicyDataReuseServiceStub.ItemKindDataEhm> itemKindDatas = new ArrayList<PolicyDataReuseServiceStub.ItemKindDataEhm>();
		for(int i=0;i<itemKindList.length;i++){
			if(itemKindList[i].getDeductableFlag().equals("1")&&(!itemKindList[i].getKindCode().substring(0,1).equals("3"))){
				//System.out.println(itemKindList[i].getKindCode());
				String deductablekindCode = ConfigUtils.getValue(itemKindList[i].getKindCode());
				double benchMarkPremium = itemKindList[i].getBenchMarkPremium();
				double premium = itemKindList[i].getPremium();
				for(int j=0;j<itemKindList.length;j++){
					if(itemKindList[j].getKindCode().equals(deductablekindCode)){
						BigDecimal newBenchMarkPremiumBigDecimal = new BigDecimal(Double.toString(benchMarkPremium)).add(new BigDecimal(Double.toString(itemKindList[j].getBenchMarkPremium())));
						benchMarkPremium=newBenchMarkPremiumBigDecimal.doubleValue();
						BigDecimal newPremiumBigDecimal = new BigDecimal(Double.toString(premium)).add(new BigDecimal(Double.toString(itemKindList[j].getPremium())));

						premium=newPremiumBigDecimal.doubleValue();
					}
				}
				itemKindList[i].setBenchMarkPremium(benchMarkPremium);
				itemKindList[i].setPremium(premium);
				itemKindDatas.add(itemKindList[i]);
			}
			else {
				if(!itemKindList[i].getKindCode().substring(0,1).equals("3")){
					itemKindDatas.add(itemKindList[i]);
				}
			}
		}
		return itemKindDatas;
	}

	public PolicyDataReuseServiceStub getStub() {
		return stub;
	}

	public void setStub(PolicyDataReuseServiceStub stub) {
		this.stub = stub;
	}
}
