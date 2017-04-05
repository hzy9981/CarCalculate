package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 关联交强险信息
 */
public class BzRelationMainRequest  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4176173533631733544L;
	private String CiInsurerType;
	private String CiInsurerBizNo;
	private String CiInsurerCompany;
	private String LastPolicyNo_bz;
	private String StartDate_bz;
	private String EndDate_bz;
	private String CarShipTaxFlag;
	private String Peccancy_adjust_value;
	private String Claim_adjust_value;
	private String Premium_bz;
	private String StartHour_bz;
	private String EndHour_bz;
	private String IsEffectFlag;

	@Override
	public String toString() {
		return "BzRelationMainRequest{" +
				"CiInsurerType='" + CiInsurerType + '\'' +
				", CiInsurerBizNo='" + CiInsurerBizNo + '\'' +
				", CiInsurerCompany='" + CiInsurerCompany + '\'' +
				", LastPolicyNo_bz='" + LastPolicyNo_bz + '\'' +
				", StartDate_bz='" + StartDate_bz + '\'' +
				", EndDate_bz='" + EndDate_bz + '\'' +
				", CarShipTaxFlag='" + CarShipTaxFlag + '\'' +
				", Peccancy_adjust_value='" + Peccancy_adjust_value + '\'' +
				", Claim_adjust_value='" + Claim_adjust_value + '\'' +
				", Premium_bz='" + Premium_bz + '\'' +
				", StartHour_bz='" + StartHour_bz + '\'' +
				", EndHour_bz='" + EndHour_bz + '\'' +
				", IsEffectFlag='" + IsEffectFlag + '\'' +
				'}';
	}

	public String getCiInsurerType() {
		return CiInsurerType;
	}

	public void setCiInsurerType(String ciInsurerType) {
		CiInsurerType = ciInsurerType;
	}

	public String getCiInsurerBizNo() {
		return CiInsurerBizNo;
	}

	public void setCiInsurerBizNo(String ciInsurerBizNo) {
		CiInsurerBizNo = ciInsurerBizNo;
	}

	public String getCiInsurerCompany() {
		return CiInsurerCompany;
	}

	public void setCiInsurerCompany(String ciInsurerCompany) {
		CiInsurerCompany = ciInsurerCompany;
	}

	public String getLastPolicyNo_bz() {
		return LastPolicyNo_bz;
	}

	public void setLastPolicyNo_bz(String lastPolicyNo_bz) {
		LastPolicyNo_bz = lastPolicyNo_bz;
	}

	public String getStartDate_bz() {
		return StartDate_bz;
	}

	public void setStartDate_bz(String startDate_bz) {
		StartDate_bz = startDate_bz;
	}

	public String getEndDate_bz() {
		return EndDate_bz;
	}

	public void setEndDate_bz(String endDate_bz) {
		EndDate_bz = endDate_bz;
	}

	public String getCarShipTaxFlag() {
		return CarShipTaxFlag;
	}

	public void setCarShipTaxFlag(String carShipTaxFlag) {
		CarShipTaxFlag = carShipTaxFlag;
	}

	public String getPeccancy_adjust_value() {
		return Peccancy_adjust_value;
	}

	public void setPeccancy_adjust_value(String peccancy_adjust_value) {
		Peccancy_adjust_value = peccancy_adjust_value;
	}

	public String getClaim_adjust_value() {
		return Claim_adjust_value;
	}

	public void setClaim_adjust_value(String claim_adjust_value) {
		Claim_adjust_value = claim_adjust_value;
	}

	public String getPremium_bz() {
		return Premium_bz;
	}

	public void setPremium_bz(String premium_bz) {
		Premium_bz = premium_bz;
	}

	public String getStartHour_bz() {
		return StartHour_bz;
	}

	public void setStartHour_bz(String startHour_bz) {
		StartHour_bz = startHour_bz;
	}

	public String getEndHour_bz() {
		return EndHour_bz;
	}

	public void setEndHour_bz(String endHour_bz) {
		EndHour_bz = endHour_bz;
	}

	public String getIsEffectFlag() {
		return IsEffectFlag;
	}

	public void setIsEffectFlag(String isEffectFlag) {
		IsEffectFlag = isEffectFlag;
	}
}
