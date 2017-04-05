package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * 新增设备信息
 * @author MarsCheng
 *
 */
public class CarDeviceDataResponse  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3384702265970070080L;
	private String DeviceName;
	private String Count;
	private String Price;
	private String PurchaseDate;
	private String ActualValue;
	public String getDeviceName() {
		return DeviceName;
	}
	public void setDeviceName(String deviceName) {
		DeviceName = deviceName;
	}
	public String getCount() {
		return Count;
	}
	public void setCount(String count) {
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
