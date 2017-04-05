package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 特殊风险客户信息
 */
public class GrayBlackListResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4278897204799270106L;
	private String carBlackFlag;
	private String carGrayFlag;

	@Override
	public String toString() {
		return "GrayBlackListResponse{" +
				"carGrayFlag='" + carGrayFlag + '\'' +
				", carBlackFlag='" + carBlackFlag + '\'' +
				'}';
	}

	public String getCarBlackFlag() {
		return carBlackFlag;
	}

	public void setCarBlackFlag(String carBlackFlag) {
		this.carBlackFlag = carBlackFlag;
	}

	public String getCarGrayFlag() {
		return carGrayFlag;
	}

	public void setCarGrayFlag(String carGrayFlag) {
		this.carGrayFlag = carGrayFlag;
	}
}
