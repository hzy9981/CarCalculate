package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/31.
 * 保单列表
 */
public class CarPolicyQueryResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1043975732177927524L;
	//号牌号码
	private String licenseNo;
	//发动机号
	private String engineNo;
	//车架号
	private String frameNo;
	//厂牌型号
	private String brandName;
	//车辆种类
	private String carKindCode;
	//车主名称
	private String carOwner;
	//初登日期
	private String enrollDate;
	//保单号码
	private String policyNo;
	//险种代码
	private String riskCode;
	//险种名称
	private String riskName;
	//保险起期
	private String startDate;
	//保险止期
	private String endDate;
	//销售渠道
	private String channelType;
	//财险销售人员
	private String handler1Code;
	//财险销售名称
	private String handler1Name;
	//寿险销售人员
	private String handlerCode;
	//寿险销售名称
	private String handlerName;
	//服务人员名称
	private String serviceName;
	//服务人员代码
	private String serviceCode;

	@Override
	public String toString() {
		return "CarPolicyQueryResponse{" +
				"licenseNo='" + licenseNo + '\'' +
				", engineNo='" + engineNo + '\'' +
				", frameNo='" + frameNo + '\'' +
				", brandName='" + brandName + '\'' +
				", carKindCode='" + carKindCode + '\'' +
				", carOwner='" + carOwner + '\'' +
				", enrollDate='" + enrollDate + '\'' +
				", policyNo='" + policyNo + '\'' +
				", riskCode='" + riskCode + '\'' +
				", riskName='" + riskName + '\'' +
				", startDate='" + startDate + '\'' +
				", endDate='" + endDate + '\'' +
				", channelType='" + channelType + '\'' +
				", handler1Code='" + handler1Code + '\'' +
				", handler1Name='" + handler1Name + '\'' +
				", handlerCode='" + handlerCode + '\'' +
				", handlerName='" + handlerName + '\'' +
				", serviceName='" + serviceName + '\'' +
				", serviceCode='" + serviceCode + '\'' +
				'}';
	}

	public String getLicenseNo() {
		return licenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		this.licenseNo = licenseNo;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public String getCarKindCode() {
		return carKindCode;
	}

	public void setCarKindCode(String carKindCode) {
		this.carKindCode = carKindCode;
	}

	public String getCarOwner() {
		return carOwner;
	}

	public void setCarOwner(String carOwner) {
		this.carOwner = carOwner;
	}

	public String getEnrollDate() {
		return enrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getPolicyNo() {
		return policyNo;
	}

	public void setPolicyNo(String policyNo) {
		this.policyNo = policyNo;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getRiskName() {
		return riskName;
	}

	public void setRiskName(String riskName) {
		this.riskName = riskName;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getHandler1Code() {
		return handler1Code;
	}

	public void setHandler1Code(String handler1Code) {
		this.handler1Code = handler1Code;
	}

	public String getHandler1Name() {
		return handler1Name;
	}

	public void setHandler1Name(String handler1Name) {
		this.handler1Name = handler1Name;
	}

	public String getHandlerCode() {
		return handlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		this.handlerCode = handlerCode;
	}

	public String getHandlerName() {
		return handlerName;
	}

	public void setHandlerName(String handlerName) {
		this.handlerName = handlerName;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
}
