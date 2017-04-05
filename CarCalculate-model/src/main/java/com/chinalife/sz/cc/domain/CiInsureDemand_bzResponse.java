package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 */
public class CiInsureDemand_bzResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8034186029659090422L;
	private String demandNo;
	private String validNo;
	private String plat_licenseNo;
	private String plat_enginNo;
	private String plat_vinNo;
	private String plat_enrollDate;
	private String plat_licenseType;
	private String plat_carKindCode;
	private String plat_userNatureCode;
	private String plat_carType;
	private String plat_seatCount;
	private String plat_tonCount;
	private String plat_wholeWeght;
	private String plat_model;
	private String plat_brand;
	private String basePremium;
	private String peccancyCoeff;
	private String rateFloatFlag;
	private String floatReason;
	private String lastBillDate;
	private int intJHtimes;
	private int intZJtimes;
	private String noVehicleMessageType;


	@Override
	public String toString() {
		return "CiInsureDemand_bzResponse{" +
				"demandNo='" + demandNo + '\'' +
				", validNo='" + validNo + '\'' +
				", plat_licenseNo='" + plat_licenseNo + '\'' +
				", plat_enginNo='" + plat_enginNo + '\'' +
				", plat_vinNo='" + plat_vinNo + '\'' +
				", plat_enrollDate='" + plat_enrollDate + '\'' +
				", plat_licenseType='" + plat_licenseType + '\'' +
				", plat_carKindCode='" + plat_carKindCode + '\'' +
				", plat_userNatureCode='" + plat_userNatureCode + '\'' +
				", plat_carType='" + plat_carType + '\'' +
				", plat_seatCount='" + plat_seatCount + '\'' +
				", plat_tonCount='" + plat_tonCount + '\'' +
				", plat_wholeWeght='" + plat_wholeWeght + '\'' +
				", plat_model='" + plat_model + '\'' +
				", plat_brand='" + plat_brand + '\'' +
				", basePremium='" + basePremium + '\'' +
				", peccancyCoeff='" + peccancyCoeff + '\'' +
				", rateFloatFlag='" + rateFloatFlag + '\'' +
				", floatReason='" + floatReason + '\'' +
				", lastBillDate='" + lastBillDate + '\'' +
				", intJHtimes=" + intJHtimes +
				", intZJtimes=" + intZJtimes +
				", noVehicleMessageType='" + noVehicleMessageType + '\'' +
				'}';
	}

	public String getDemandNo() {
		return demandNo;
	}

	public void setDemandNo(String demandNo) {
		this.demandNo = demandNo;
	}

	public String getValidNo() {
		return validNo;
	}

	public void setValidNo(String validNo) {
		this.validNo = validNo;
	}

	public String getPlat_licenseNo() {
		return plat_licenseNo;
	}

	public void setPlat_licenseNo(String plat_licenseNo) {
		this.plat_licenseNo = plat_licenseNo;
	}

	public String getPlat_enginNo() {
		return plat_enginNo;
	}

	public void setPlat_enginNo(String plat_enginNo) {
		this.plat_enginNo = plat_enginNo;
	}

	public String getPlat_vinNo() {
		return plat_vinNo;
	}

	public void setPlat_vinNo(String plat_vinNo) {
		this.plat_vinNo = plat_vinNo;
	}

	public String getPlat_enrollDate() {
		return plat_enrollDate;
	}

	public void setPlat_enrollDate(String plat_enrollDate) {
		this.plat_enrollDate = plat_enrollDate;
	}

	public String getPlat_licenseType() {
		return plat_licenseType;
	}

	public void setPlat_licenseType(String plat_licenseType) {
		this.plat_licenseType = plat_licenseType;
	}

	public String getPlat_carKindCode() {
		return plat_carKindCode;
	}

	public void setPlat_carKindCode(String plat_carKindCode) {
		this.plat_carKindCode = plat_carKindCode;
	}

	public String getPlat_userNatureCode() {
		return plat_userNatureCode;
	}

	public void setPlat_userNatureCode(String plat_userNatureCode) {
		this.plat_userNatureCode = plat_userNatureCode;
	}

	public String getPlat_carType() {
		return plat_carType;
	}

	public void setPlat_carType(String plat_carType) {
		this.plat_carType = plat_carType;
	}

	public String getPlat_seatCount() {
		return plat_seatCount;
	}

	public void setPlat_seatCount(String plat_seatCount) {
		this.plat_seatCount = plat_seatCount;
	}

	public String getPlat_tonCount() {
		return plat_tonCount;
	}

	public void setPlat_tonCount(String plat_tonCount) {
		this.plat_tonCount = plat_tonCount;
	}

	public String getPlat_wholeWeght() {
		return plat_wholeWeght;
	}

	public void setPlat_wholeWeght(String plat_wholeWeght) {
		this.plat_wholeWeght = plat_wholeWeght;
	}

	public String getPlat_model() {
		return plat_model;
	}

	public void setPlat_model(String plat_model) {
		this.plat_model = plat_model;
	}

	public String getPlat_brand() {
		return plat_brand;
	}

	public void setPlat_brand(String plat_brand) {
		this.plat_brand = plat_brand;
	}

	public String getBasePremium() {
		return basePremium;
	}

	public void setBasePremium(String basePremium) {
		this.basePremium = basePremium;
	}

	public String getPeccancyCoeff() {
		return peccancyCoeff;
	}

	public void setPeccancyCoeff(String peccancyCoeff) {
		this.peccancyCoeff = peccancyCoeff;
	}

	public String getRateFloatFlag() {
		return rateFloatFlag;
	}

	public void setRateFloatFlag(String rateFloatFlag) {
		this.rateFloatFlag = rateFloatFlag;
	}

	public String getFloatReason() {
		return floatReason;
	}

	public void setFloatReason(String floatReason) {
		this.floatReason = floatReason;
	}

	public String getLastBillDate() {
		return lastBillDate;
	}

	public void setLastBillDate(String lastBillDate) {
		this.lastBillDate = lastBillDate;
	}

	public int getIntJHtimes() {
		return intJHtimes;
	}

	public void setIntJHtimes(int intJHtimes) {
		this.intJHtimes = intJHtimes;
	}

	public int getIntZJtimes() {
		return intZJtimes;
	}

	public void setIntZJtimes(int intZJtimes) {
		this.intZJtimes = intZJtimes;
	}

	public String getNoVehicleMessageType() {
		return noVehicleMessageType;
	}

	public void setNoVehicleMessageType(String noVehicleMessageType) {
		this.noVehicleMessageType = noVehicleMessageType;
	}
}
