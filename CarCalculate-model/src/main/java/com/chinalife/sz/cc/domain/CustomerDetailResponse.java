package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/22.
 * 客户查询返回信息
 */
public class CustomerDetailResponse implements Serializable {
	private static final long serialVersionUID = -2550902195362687789L;
	private String RequestType;
	private PrpDcustomerIdvSchema[] prpDcustomerIdvSchema;
	private PrpDcustomerUnitSchema[] prpDcustomerUnitSchema;

	public String getRequestType() {
		return RequestType;
	}

	public void setRequestType(String requestType) {
		RequestType = requestType;
	}

	public PrpDcustomerIdvSchema[] getPrpDcustomerIdvSchema() {
		return prpDcustomerIdvSchema;
	}

	public void setPrpDcustomerIdvSchema(PrpDcustomerIdvSchema[] prpDcustomerIdvSchema) {
		this.prpDcustomerIdvSchema = prpDcustomerIdvSchema;
	}

	public PrpDcustomerUnitSchema[] getPrpDcustomerUnitSchema() {
		return prpDcustomerUnitSchema;
	}

	public void setPrpDcustomerUnitSchema(PrpDcustomerUnitSchema[] prpDcustomerUnitSchema) {
		this.prpDcustomerUnitSchema = prpDcustomerUnitSchema;
	}
}
