package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 手续费计算
 */
public class PoundageCalculateRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1223895524926370143L;
	private String ProvisionalNo;
	private String IsPoundageFlag;
	private double DisRate;
	private double policySort;

	@Override
	public String toString() {
		return "PoundageCalculateRequest{" +
				"ProvisionalNo='" + ProvisionalNo + '\'' +
				", IsPoundageFlag='" + IsPoundageFlag + '\'' +
				", DisRate=" + DisRate +
				", policySort=" + policySort +
				'}';
	}

	public String getProvisionalNo() {
		return ProvisionalNo;
	}

	public void setProvisionalNo(String provisionalNo) {
		ProvisionalNo = provisionalNo;
	}

	public String getIsPoundageFlag() {
		return IsPoundageFlag;
	}

	public void setIsPoundageFlag(String isPoundageFlag) {
		IsPoundageFlag = isPoundageFlag;
	}

	public double getDisRate() {
		return DisRate;
	}

	public void setDisRate(double disRate) {
		DisRate = disRate;
	}

	public double getPolicySort() {
		return policySort;
	}

	public void setPolicySort(double policySort) {
		this.policySort = policySort;
	}
}