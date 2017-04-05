package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 车型查询接口返回的交管车辆信息
 */
public class TMBVehicleInfoResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2278029409333620156L;
	private String SearchSequenceNo;
	private String LicenseNo;
	private String LicenseType;
	private String FrameNo;
	private String EnginNo;
	private String CarOwner;
	private String EnrollDate;

	public String getSearchSequenceNo() {
		return SearchSequenceNo;
	}

	public void setSearchSequenceNo(String searchSequenceNo) {
		SearchSequenceNo = searchSequenceNo;
	}

	public String getLicenseNo() {
		return LicenseNo;
	}

	public void setLicenseNo(String licenseNo) {
		LicenseNo = licenseNo;
	}

	public String getLicenseType() {
		return LicenseType;
	}

	public void setLicenseType(String licenseType) {
		LicenseType = licenseType;
	}

	public String getFrameNo() {
		return FrameNo;
	}

	public void setFrameNo(String frameNo) {
		FrameNo = frameNo;
	}

	public String getEnginNo() {
		return EnginNo;
	}

	public void setEnginNo(String enginNo) {
		EnginNo = enginNo;
	}

	public String getCarOwner() {
		return CarOwner;
	}

	public void setCarOwner(String carOwner) {
		CarOwner = carOwner;
	}

	public String getEnrollDate() {
		return EnrollDate;
	}

	public void setEnrollDate(String enrollDate) {
		EnrollDate = enrollDate;
	}

	@Override
	public String toString() {
		return "TMBVehicleInfoResponse{" +
				"SearchSequenceNo='" + SearchSequenceNo + '\'' +
				", LicenseNo='" + LicenseNo + '\'' +
				", LicenseType='" + LicenseType + '\'' +
				", FrameNo='" + FrameNo + '\'' +
				", EnginNo='" + EnginNo + '\'' +
				", CarOwner='" + CarOwner + '\'' +
				", EnrollDate='" + EnrollDate + '\'' +
				'}';
	}
}
