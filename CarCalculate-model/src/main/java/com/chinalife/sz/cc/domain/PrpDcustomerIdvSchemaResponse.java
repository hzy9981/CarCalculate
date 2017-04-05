package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/22.
 * 个人客户信息
 */
public class PrpDcustomerIdvSchemaResponse implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1298412586590442461L;
	private String CustomerCode;
	private String CustomerCName;
	private String CustomerEName;
	private String AddressCName;
	private String AddressEName;
	private String IdentifyType;
	private String IdentifyNumber;
	private String Sex;
	private String Age;
	private String BirthDate;
	private String OccupationCode;
	private String EducationCode;
	private String Unit;
	private String UnitAddress;
	private String CustomerKind;
	private String CustomerFlag;
	private String PhoneNumber;
	private String FaxNumber;
	private String Mobile;
	private String LinkAddress;
	private String PostCode;
	private String Pager;
	private String Email;
	private String NewCustomerCode;
	private String ValidStatus;
	private String Flag;
	private String HandlerCode;
	private String Comcode;
	private String linkerName;
	private String CertificateName;
	private String CertificadeStartDate;
	private String CertificadeEndDate;

	@Override
	public String toString() {
		return "PrpDcustomerIdvSchemaResponse{" +
				"CustomerCode='" + CustomerCode + '\'' +
				", CustomerCName='" + CustomerCName + '\'' +
				", CustomerEName='" + CustomerEName + '\'' +
				", AddressCName='" + AddressCName + '\'' +
				", AddressEName='" + AddressEName + '\'' +
				", IdentifyType='" + IdentifyType + '\'' +
				", IdentifyNumber='" + IdentifyNumber + '\'' +
				", Sex='" + Sex + '\'' +
				", Age='" + Age + '\'' +
				", BirthDate='" + BirthDate + '\'' +
				", OccupationCode='" + OccupationCode + '\'' +
				", EducationCode='" + EducationCode + '\'' +
				", Unit='" + Unit + '\'' +
				", UnitAddress='" + UnitAddress + '\'' +
				", CustomerKind='" + CustomerKind + '\'' +
				", CustomerFlag='" + CustomerFlag + '\'' +
				", PhoneNumber='" + PhoneNumber + '\'' +
				", FaxNumber='" + FaxNumber + '\'' +
				", Mobile='" + Mobile + '\'' +
				", LinkAddress='" + LinkAddress + '\'' +
				", PostCode='" + PostCode + '\'' +
				", Pager='" + Pager + '\'' +
				", Email='" + Email + '\'' +
				", NewCustomerCode='" + NewCustomerCode + '\'' +
				", ValidStatus='" + ValidStatus + '\'' +
				", Flag='" + Flag + '\'' +
				", HandlerCode='" + HandlerCode + '\'' +
				", Comcode='" + Comcode + '\'' +
				", linkerName='" + linkerName + '\'' +
				", CertificateName='" + CertificateName + '\'' +
				", CertificadeStartDate='" + CertificadeStartDate + '\'' +
				", CertificadeEndDate='" + CertificadeEndDate + '\'' +
				'}';
	}

	public String getCustomerCode() {
		return CustomerCode;
	}

	public void setCustomerCode(String customerCode) {
		CustomerCode = customerCode;
	}

	public String getCustomerCName() {
		return CustomerCName;
	}

	public void setCustomerCName(String customerCName) {
		CustomerCName = customerCName;
	}

	public String getCustomerEName() {
		return CustomerEName;
	}

	public void setCustomerEName(String customerEName) {
		CustomerEName = customerEName;
	}

	public String getAddressCName() {
		return AddressCName;
	}

	public void setAddressCName(String addressCName) {
		AddressCName = addressCName;
	}

	public String getAddressEName() {
		return AddressEName;
	}

	public void setAddressEName(String addressEName) {
		AddressEName = addressEName;
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

	public String getBirthDate() {
		return BirthDate;
	}

	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}

	public String getOccupationCode() {
		return OccupationCode;
	}

	public void setOccupationCode(String occupationCode) {
		OccupationCode = occupationCode;
	}

	public String getEducationCode() {
		return EducationCode;
	}

	public void setEducationCode(String educationCode) {
		EducationCode = educationCode;
	}

	public String getUnit() {
		return Unit;
	}

	public void setUnit(String unit) {
		Unit = unit;
	}

	public String getUnitAddress() {
		return UnitAddress;
	}

	public void setUnitAddress(String unitAddress) {
		UnitAddress = unitAddress;
	}

	public String getCustomerKind() {
		return CustomerKind;
	}

	public void setCustomerKind(String customerKind) {
		CustomerKind = customerKind;
	}

	public String getCustomerFlag() {
		return CustomerFlag;
	}

	public void setCustomerFlag(String customerFlag) {
		CustomerFlag = customerFlag;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getFaxNumber() {
		return FaxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		FaxNumber = faxNumber;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public String getLinkAddress() {
		return LinkAddress;
	}

	public void setLinkAddress(String linkAddress) {
		LinkAddress = linkAddress;
	}

	public String getPostCode() {
		return PostCode;
	}

	public void setPostCode(String postCode) {
		PostCode = postCode;
	}

	public String getPager() {
		return Pager;
	}

	public void setPager(String pager) {
		Pager = pager;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getNewCustomerCode() {
		return NewCustomerCode;
	}

	public void setNewCustomerCode(String newCustomerCode) {
		NewCustomerCode = newCustomerCode;
	}

	public String getValidStatus() {
		return ValidStatus;
	}

	public void setValidStatus(String validStatus) {
		ValidStatus = validStatus;
	}

	public String getFlag() {
		return Flag;
	}

	public void setFlag(String flag) {
		Flag = flag;
	}

	public String getHandlerCode() {
		return HandlerCode;
	}

	public void setHandlerCode(String handlerCode) {
		HandlerCode = handlerCode;
	}

	public String getComcode() {
		return Comcode;
	}

	public void setComcode(String comcode) {
		Comcode = comcode;
	}

	public String getLinkerName() {
		return linkerName;
	}

	public void setLinkerName(String linkerName) {
		this.linkerName = linkerName;
	}

	public String getCertificateName() {
		return CertificateName;
	}

	public void setCertificateName(String certificateName) {
		CertificateName = certificateName;
	}

	public String getCertificadeStartDate() {
		return CertificadeStartDate;
	}

	public void setCertificadeStartDate(String certificadeStartDate) {
		CertificadeStartDate = certificadeStartDate;
	}

	public String getCertificadeEndDate() {
		return CertificadeEndDate;
	}

	public void setCertificadeEndDate(String certificadeEndDate) {
		CertificadeEndDate = certificadeEndDate;
	}
}
