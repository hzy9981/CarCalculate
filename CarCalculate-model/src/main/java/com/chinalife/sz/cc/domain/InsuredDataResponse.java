package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * 被保险人信息返回
 * @author xinxi4
 *
 */

public class InsuredDataResponse  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3073652598833905043L;
	private String InsuredCode;   
	private String InsuredName;   
	private String InsuredNature; 
	private String IdentifyType;  
	private String IdentifyNumber;
	private String AddressName;   
	private String LinkerName;    
	private String PostAddress;   
	private String PostCode;      
	private String Phone;         
	private String Mobile;        
	private String Email;         
	private String Sex;           
	private String Age;           
	private String Birthday;	
	private String isCheck;
	
	public String getInsuredCode() {
		return InsuredCode;
	}
	public void setInsuredCode(String insuredCode) {
		InsuredCode = insuredCode;
	}
	public String getInsuredName() {
		return InsuredName;
	}
	public void setInsuredName(String insuredName) {
		InsuredName = insuredName;
	}
	public String getInsuredNature() {
		return InsuredNature;
	}
	public void setInsuredNature(String insuredNature) {
		InsuredNature = insuredNature;
	}
	public String getIdentifyType() {
		return IdentifyType;
	}
	public void setIdentifyType(String identifyType) {
		IdentifyType = identifyType;
	}
	public String getIdentifyNumber() {
		return IdentifyNumber;
	}
	public void setIdentifyNumber(String identifyNumber) {
		IdentifyNumber = identifyNumber;
	}
	public String getAddressName() {
		return AddressName;
	}
	public void setAddressName(String addressName) {
		AddressName = addressName;
	}
	public String getLinkerName() {
		return LinkerName;
	}
	public void setLinkerName(String linkerName) {
		LinkerName = linkerName;
	}
	public String getPostAddress() {
		return PostAddress;
	}
	public void setPostAddress(String postAddress) {
		PostAddress = postAddress;
	}
	public String getPostCode() {
		return PostCode;
	}
	public void setPostCode(String postCode) {
		PostCode = postCode;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public String getMobile() {
		return Mobile;
	}
	public void setMobile(String mobile) {
		Mobile = mobile;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public String getIsCheck() {
		return isCheck;
	}
	public void setIsCheck(String isCheck) {
		this.isCheck = isCheck;
	}
	
	

}
