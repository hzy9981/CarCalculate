package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 优惠明细因子
 */
public class RatioDetailInfoRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 188416613354358944L;
	private String ratioTypeCode;
	private String factorTypeCode;
	private double FactorValue;
	private String factorValueDesc;
	private String Flag;
	private String ratioId;

	@Override
	public String toString() {
		return "RatioDetailInfoRequest{" +
				"ratioTypeCode='" + ratioTypeCode + '\'' +
				", factorTypeCode='" + factorTypeCode + '\'' +
				", FactorValue=" + FactorValue +
				", factorValueDesc='" + factorValueDesc + '\'' +
				", Flag='" + Flag + '\'' +
				", ratioId='" + ratioId + '\'' +
				'}';
	}

	public String getRatioTypeCode() {
		return ratioTypeCode;
	}

	public void setRatioTypeCode(String ratioTypeCode) {
		this.ratioTypeCode = ratioTypeCode;
	}

	public String getFactorTypeCode() {
		return factorTypeCode;
	}

	public void setFactorTypeCode(String factorTypeCode) {
		this.factorTypeCode = factorTypeCode;
	}

	public double getFactorValue() {
		return FactorValue;
	}

	public void setFactorValue(double factorValue) {
		FactorValue = factorValue;
	}

	public String getFactorValueDesc() {
		return factorValueDesc;
	}

	public void setFactorValueDesc(String factorValueDesc) {
		this.factorValueDesc = factorValueDesc;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

	public String getRatioId() {
		return ratioId;
	}

	public void setRatioId(String ratioId) {
		this.ratioId = ratioId;
	}
}
