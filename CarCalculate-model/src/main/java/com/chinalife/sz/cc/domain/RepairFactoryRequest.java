package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 */
public class RepairFactoryRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2525588342961349601L;
	private String orderNo;
	private String factoryCode;
	private String factoryName;

	@Override
	public String toString() {
		return "RepairFactoryRequest{" +
				"orderNo='" + orderNo + '\'' +
				", factoryCode='" + factoryCode + '\'' +
				", factoryName='" + factoryName + '\'' +
				'}';
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getFactoryCode() {
		return factoryCode;
	}

	public void setFactoryCode(String factoryCode) {
		this.factoryCode = factoryCode;
	}

	public String getFactoryName() {
		return factoryName;
	}

	public void setFactoryName(String factoryName) {
		this.factoryName = factoryName;
	}
}
