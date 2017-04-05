package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 上年保单信息
 */
public class CiLastPolicyResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5189272076800696032L;
	private String lastPolicyQueryDate;
	private String lastPolicyBillDate;
	private String lastPolicyEffectiveDate;
	private String lastPolicyExpireDate;
	private String lastPolicyTotalPremium;
	private String lastProducerCode;
	private String lastModelCode;
	private String lastModel;
	private String lastReplacementValue;

	@Override
	public String toString() {
		return "CiLastPolicyResponse{" +
				"lastPolicyQueryDate='" + lastPolicyQueryDate + '\'' +
				", lastPolicyBillDate='" + lastPolicyBillDate + '\'' +
				", lastPolicyEffectiveDate='" + lastPolicyEffectiveDate + '\'' +
				", lastPolicyExpireDate='" + lastPolicyExpireDate + '\'' +
				", lastPolicyTotalPremium='" + lastPolicyTotalPremium + '\'' +
				", lastProducerCode='" + lastProducerCode + '\'' +
				", lastModelCode='" + lastModelCode + '\'' +
				", lastModel='" + lastModel + '\'' +
				", lastReplacementValue='" + lastReplacementValue + '\'' +
				'}';
	}

	public String getLastPolicyQueryDate() {
		return lastPolicyQueryDate;
	}

	public void setLastPolicyQueryDate(String lastPolicyQueryDate) {
		this.lastPolicyQueryDate = lastPolicyQueryDate;
	}

	public String getLastPolicyBillDate() {
		return lastPolicyBillDate;
	}

	public void setLastPolicyBillDate(String lastPolicyBillDate) {
		this.lastPolicyBillDate = lastPolicyBillDate;
	}

	public String getLastPolicyEffectiveDate() {
		return lastPolicyEffectiveDate;
	}

	public void setLastPolicyEffectiveDate(String lastPolicyEffectiveDate) {
		this.lastPolicyEffectiveDate = lastPolicyEffectiveDate;
	}

	public String getLastPolicyExpireDate() {
		return lastPolicyExpireDate;
	}

	public void setLastPolicyExpireDate(String lastPolicyExpireDate) {
		this.lastPolicyExpireDate = lastPolicyExpireDate;
	}

	public String getLastPolicyTotalPremium() {
		return lastPolicyTotalPremium;
	}

	public void setLastPolicyTotalPremium(String lastPolicyTotalPremium) {
		this.lastPolicyTotalPremium = lastPolicyTotalPremium;
	}

	public String getLastProducerCode() {
		return lastProducerCode;
	}

	public void setLastProducerCode(String lastProducerCode) {
		this.lastProducerCode = lastProducerCode;
	}

	public String getLastModelCode() {
		return lastModelCode;
	}

	public void setLastModelCode(String lastModelCode) {
		this.lastModelCode = lastModelCode;
	}

	public String getLastModel() {
		return lastModel;
	}

	public void setLastModel(String lastModel) {
		this.lastModel = lastModel;
	}

	public String getLastReplacementValue() {
		return lastReplacementValue;
	}

	public void setLastReplacementValue(String lastReplacementValue) {
		this.lastReplacementValue = lastReplacementValue;
	}
}