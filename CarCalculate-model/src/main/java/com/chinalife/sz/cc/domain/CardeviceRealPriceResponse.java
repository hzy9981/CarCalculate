package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 新增设备实际使用价值接口返回信息
 */
public class CardeviceRealPriceResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3742174647868531473L;
	private String RequestType;
	private String RealPurchasePrice;
	private String SumDepreciationRate;

	public String getRequestType() {
		return RequestType;
	}

	public void setRequestType(String requestType) {
		RequestType = requestType;
	}

	public String getRealPurchasePrice() {
		return RealPurchasePrice;
	}

	@Override
	public String toString() {
		return "CardeviceRealPriceResponse{" +
				"RequestType='" + RequestType + '\'' +
				", RealPurchasePrice='" + RealPurchasePrice + '\'' +
				", SumDepreciationRate='" + SumDepreciationRate + '\'' +
				'}';
	}

	public void setRealPurchasePrice(String realPurchasePrice) {
		RealPurchasePrice = realPurchasePrice;
	}

	public String getSumDepreciationRate() {
		return SumDepreciationRate;
	}

	public void setSumDepreciationRate(String sumDepreciationRate) {
		SumDepreciationRate = sumDepreciationRate;
	}
}
