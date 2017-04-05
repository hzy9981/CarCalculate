package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 新增设备
 */

public class CarDeviceDataRequest  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1708699744787869616L;
	private String DeviceName;
	private int Count;
	private String Price;
	private String PurchaseDate;
	private String ActualValue;

	@Override
	public String toString() {
		return "CarDeviceDataRequest{" +
				"DeviceName='" + DeviceName + '\'' +
				", Count=" + Count +
				", Price=" + Price +
				", PurchaseDate='" + PurchaseDate + '\'' +
				", ActualValue=" + ActualValue +
				'}';
	}

	public String getDeviceName() {
		return DeviceName;
	}

	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}

	public String getPrice() {
		return Price;
	}

	public void setPrice(String price) {
		Price = price;
	}

	public String getPurchaseDate() {
		return PurchaseDate;
	}

	public void setPurchaseDate(String purchaseDate) {
		PurchaseDate = purchaseDate;
	}

	public String getActualValue() {
		return ActualValue;
	}

	public void setActualValue(String actualValue) {
		ActualValue = actualValue;
	}
}
