package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 */
public class CarShipTaxInfoResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2189488842345414805L;
	private String TaxActual;
	private String PreviousPay;
	private String LateFee;
	private String PayNo;
	private String TaxFlag;
	private String CalculateMode;
	private String TaxDue;
	private String ComCode;
	private String TaxUnit;
	private String deductionDueProportion;
	private String deduction;
	private String BaseTaxAtion;
	private String KTaxComCode;
	private String KTaxComName;
	private String RelifReason;
	private String TaxPayerName;
	private String TaxpayerCode;
	private String PayLastYear;
	private String HisPolicyEndDate;
	private String TaxStartDate;
	private String TaxEndDate;
	private String TaxItemCode;
	private String TaxItemName;
	private String TaxComCode;
	private String TaxComName;
	private String CompleteKerbMass;
	private String AllMass;
	private String TaxPayerIdentifier;
	private String SumPayTax;
	private String TaxPayerCertiType;
	private String TaxPayerCertiCode;
	private String TaxFlag2008;
	private String DeductionDueType;
	private String DepartmentNonLocal;
	private String FreeNo;
	private String IsCommissionTax;
	private String TaxUseNature;
	private String TaxUseStatus;
	private String TaxPayerAddress;
	private String PlatReqType;
	private String CarOwnerType;
	private String TaxPeriod;
	private String TaxInvoiceType;
	private String TaxInvoiceNo;
	private String CarArea;
	private String OriginLicenseNo;
	private String TransferDate;
	private String AcceptLicenseDate;
	private String ExtendChar1;
	private String taxActual2;
	private String previouspay2;
	private String Vehiclebrand;
	private String Modelcode;
	private String declareid;
	private String ccsid;
	private String ccstypecode;
	private String frametype;
	private String settledate;
	private String gsflag;
	private String ccsstatuscode;
	private String naturecode;
	private String energytype;
	private String jdcrlnyzldm;
	private String bkjdjxh;
	private String singleflag;
	private String levdateend;
	private String taxdjamount;
	private String decideflag;
	private String jmlxdm;
	private String deratebegin;
	private String derateend;
	private String deratetypecode;
	private String taxamount;
	private String idcertypecode;
	private String csrq;
	private String gjhdqszdm;
	private String xb;
	private String adminAreaCode;


	@Override
	public String toString() {
		return "CarShipTaxInfoResponse{" +
				"TaxActual='" + TaxActual + '\'' +
				", PreviousPay='" + PreviousPay + '\'' +
				", LateFee='" + LateFee + '\'' +
				", PayNo='" + PayNo + '\'' +
				", TaxFlag='" + TaxFlag + '\'' +
				", CalculateMode='" + CalculateMode + '\'' +
				", TaxDue='" + TaxDue + '\'' +
				", ComCode='" + ComCode + '\'' +
				", TaxUnit='" + TaxUnit + '\'' +
				", deductionDueProportion='" + deductionDueProportion + '\'' +
				", deduction='" + deduction + '\'' +
				", BaseTaxAtion='" + BaseTaxAtion + '\'' +
				", KTaxComCode='" + KTaxComCode + '\'' +
				", KTaxComName='" + KTaxComName + '\'' +
				", RelifReason='" + RelifReason + '\'' +
				", TaxPayerName='" + TaxPayerName + '\'' +
				", TaxpayerCode='" + TaxpayerCode + '\'' +
				", PayLastYear='" + PayLastYear + '\'' +
				", HisPolicyEndDate='" + HisPolicyEndDate + '\'' +
				", TaxStartDate='" + TaxStartDate + '\'' +
				", TaxEndDate='" + TaxEndDate + '\'' +
				", TaxItemCode='" + TaxItemCode + '\'' +
				", TaxItemName='" + TaxItemName + '\'' +
				", TaxComCode='" + TaxComCode + '\'' +
				", TaxComName='" + TaxComName + '\'' +
				", CompleteKerbMass='" + CompleteKerbMass + '\'' +
				", AllMass='" + AllMass + '\'' +
				", TaxPayerIdentifier='" + TaxPayerIdentifier + '\'' +
				", SumPayTax='" + SumPayTax + '\'' +
				", TaxPayerCertiType='" + TaxPayerCertiType + '\'' +
				", TaxPayerCertiCode='" + TaxPayerCertiCode + '\'' +
				", TaxFlag2008='" + TaxFlag2008 + '\'' +
				", DeductionDueType='" + DeductionDueType + '\'' +
				", DepartmentNonLocal='" + DepartmentNonLocal + '\'' +
				", FreeNo='" + FreeNo + '\'' +
				", IsCommissionTax='" + IsCommissionTax + '\'' +
				", TaxUseNature='" + TaxUseNature + '\'' +
				", TaxUseStatus='" + TaxUseStatus + '\'' +
				", TaxPayerAddress='" + TaxPayerAddress + '\'' +
				", PlatReqType='" + PlatReqType + '\'' +
				", CarOwnerType='" + CarOwnerType + '\'' +
				", TaxPeriod='" + TaxPeriod + '\'' +
				", TaxInvoiceType='" + TaxInvoiceType + '\'' +
				", TaxInvoiceNo='" + TaxInvoiceNo + '\'' +
				", CarArea='" + CarArea + '\'' +
				", OriginLicenseNo='" + OriginLicenseNo + '\'' +
				", TransferDate='" + TransferDate + '\'' +
				", AcceptLicenseDate='" + AcceptLicenseDate + '\'' +
				", ExtendChar1='" + ExtendChar1 + '\'' +
				", taxActual2='" + taxActual2 + '\'' +
				", previouspay2='" + previouspay2 + '\'' +
				", Vehiclebrand='" + Vehiclebrand + '\'' +
				", Modelcode='" + Modelcode + '\'' +
				", declareid='" + declareid + '\'' +
				", ccsid='" + ccsid + '\'' +
				", ccstypecode='" + ccstypecode + '\'' +
				", frametype='" + frametype + '\'' +
				", settledate='" + settledate + '\'' +
				", gsflag='" + gsflag + '\'' +
				", ccsstatuscode='" + ccsstatuscode + '\'' +
				", naturecode='" + naturecode + '\'' +
				", energytype='" + energytype + '\'' +
				", jdcrlnyzldm='" + jdcrlnyzldm + '\'' +
				", bkjdjxh='" + bkjdjxh + '\'' +
				", singleflag='" + singleflag + '\'' +
				", levdateend='" + levdateend + '\'' +
				", taxdjamount='" + taxdjamount + '\'' +
				", decideflag='" + decideflag + '\'' +
				", jmlxdm='" + jmlxdm + '\'' +
				", deratebegin='" + deratebegin + '\'' +
				", derateend='" + derateend + '\'' +
				", deratetypecode='" + deratetypecode + '\'' +
				", taxamount='" + taxamount + '\'' +
				", idcertypecode='" + idcertypecode + '\'' +
				", csrq='" + csrq + '\'' +
				", gjhdqszdm='" + gjhdqszdm + '\'' +
				", xb='" + xb + '\'' +
				", adminAreaCode='" + adminAreaCode + '\'' +
				'}';
	}

	public String getTaxActual() {
		return TaxActual;
	}

	public void setTaxActual(String taxActual) {
		TaxActual = taxActual;
	}

	public String getPreviousPay() {
		return PreviousPay;
	}

	public void setPreviousPay(String previousPay) {
		PreviousPay = previousPay;
	}

	public String getLateFee() {
		return LateFee;
	}

	public void setLateFee(String lateFee) {
		LateFee = lateFee;
	}

	public String getPayNo() {
		return PayNo;
	}

	public void setPayNo(String payNo) {
		PayNo = payNo;
	}

	public String getTaxFlag() {
		return TaxFlag;
	}

	public void setTaxFlag(String taxFlag) {
		TaxFlag = taxFlag;
	}

	public String getCalculateMode() {
		return CalculateMode;
	}

	public void setCalculateMode(String calculateMode) {
		CalculateMode = calculateMode;
	}

	public String getTaxDue() {
		return TaxDue;
	}

	public void setTaxDue(String taxDue) {
		TaxDue = taxDue;
	}

	public String getComCode() {
		return ComCode;
	}

	public void setComCode(String comCode) {
		ComCode = comCode;
	}

	public String getTaxUnit() {
		return TaxUnit;
	}

	public void setTaxUnit(String taxUnit) {
		TaxUnit = taxUnit;
	}

	public String getDeductionDueProportion() {
		return deductionDueProportion;
	}

	public void setDeductionDueProportion(String deductionDueProportion) {
		this.deductionDueProportion = deductionDueProportion;
	}

	public String getDeduction() {
		return deduction;
	}

	public void setDeduction(String deduction) {
		this.deduction = deduction;
	}

	public String getBaseTaxAtion() {
		return BaseTaxAtion;
	}

	public void setBaseTaxAtion(String baseTaxAtion) {
		BaseTaxAtion = baseTaxAtion;
	}

	public String getKTaxComCode() {
		return KTaxComCode;
	}

	public void setKTaxComCode(String KTaxComCode) {
		this.KTaxComCode = KTaxComCode;
	}

	public String getKTaxComName() {
		return KTaxComName;
	}

	public void setKTaxComName(String KTaxComName) {
		this.KTaxComName = KTaxComName;
	}

	public String getRelifReason() {
		return RelifReason;
	}

	public void setRelifReason(String relifReason) {
		RelifReason = relifReason;
	}

	public String getTaxPayerName() {
		return TaxPayerName;
	}

	public void setTaxPayerName(String taxPayerName) {
		TaxPayerName = taxPayerName;
	}

	public String getTaxpayerCode() {
		return TaxpayerCode;
	}

	public void setTaxpayerCode(String taxpayerCode) {
		TaxpayerCode = taxpayerCode;
	}

	public String getPayLastYear() {
		return PayLastYear;
	}

	public void setPayLastYear(String payLastYear) {
		PayLastYear = payLastYear;
	}

	public String getHisPolicyEndDate() {
		return HisPolicyEndDate;
	}

	public void setHisPolicyEndDate(String hisPolicyEndDate) {
		HisPolicyEndDate = hisPolicyEndDate;
	}

	public String getTaxStartDate() {
		return TaxStartDate;
	}

	public void setTaxStartDate(String taxStartDate) {
		TaxStartDate = taxStartDate;
	}

	public String getTaxEndDate() {
		return TaxEndDate;
	}

	public void setTaxEndDate(String taxEndDate) {
		TaxEndDate = taxEndDate;
	}

	public String getTaxItemCode() {
		return TaxItemCode;
	}

	public void setTaxItemCode(String taxItemCode) {
		TaxItemCode = taxItemCode;
	}

	public String getTaxItemName() {
		return TaxItemName;
	}

	public void setTaxItemName(String taxItemName) {
		TaxItemName = taxItemName;
	}

	public String getTaxComCode() {
		return TaxComCode;
	}

	public void setTaxComCode(String taxComCode) {
		TaxComCode = taxComCode;
	}

	public String getTaxComName() {
		return TaxComName;
	}

	public void setTaxComName(String taxComName) {
		TaxComName = taxComName;
	}

	public String getCompleteKerbMass() {
		return CompleteKerbMass;
	}

	public void setCompleteKerbMass(String completeKerbMass) {
		CompleteKerbMass = completeKerbMass;
	}

	public String getAllMass() {
		return AllMass;
	}

	public void setAllMass(String allMass) {
		AllMass = allMass;
	}

	public String getTaxPayerIdentifier() {
		return TaxPayerIdentifier;
	}

	public void setTaxPayerIdentifier(String taxPayerIdentifier) {
		TaxPayerIdentifier = taxPayerIdentifier;
	}

	public String getSumPayTax() {
		return SumPayTax;
	}

	public void setSumPayTax(String sumPayTax) {
		SumPayTax = sumPayTax;
	}

	public String getTaxPayerCertiType() {
		return TaxPayerCertiType;
	}

	public void setTaxPayerCertiType(String taxPayerCertiType) {
		TaxPayerCertiType = taxPayerCertiType;
	}

	public String getTaxPayerCertiCode() {
		return TaxPayerCertiCode;
	}

	public void setTaxPayerCertiCode(String taxPayerCertiCode) {
		TaxPayerCertiCode = taxPayerCertiCode;
	}

	public String getTaxFlag2008() {
		return TaxFlag2008;
	}

	public void setTaxFlag2008(String taxFlag2008) {
		TaxFlag2008 = taxFlag2008;
	}

	public String getDeductionDueType() {
		return DeductionDueType;
	}

	public void setDeductionDueType(String deductionDueType) {
		DeductionDueType = deductionDueType;
	}

	public String getDepartmentNonLocal() {
		return DepartmentNonLocal;
	}

	public void setDepartmentNonLocal(String departmentNonLocal) {
		DepartmentNonLocal = departmentNonLocal;
	}

	public String getFreeNo() {
		return FreeNo;
	}

	public void setFreeNo(String freeNo) {
		FreeNo = freeNo;
	}

	public String getIsCommissionTax() {
		return IsCommissionTax;
	}

	public void setIsCommissionTax(String isCommissionTax) {
		IsCommissionTax = isCommissionTax;
	}

	public String getTaxUseNature() {
		return TaxUseNature;
	}

	public void setTaxUseNature(String taxUseNature) {
		TaxUseNature = taxUseNature;
	}

	public String getTaxUseStatus() {
		return TaxUseStatus;
	}

	public void setTaxUseStatus(String taxUseStatus) {
		TaxUseStatus = taxUseStatus;
	}

	public String getTaxPayerAddress() {
		return TaxPayerAddress;
	}

	public void setTaxPayerAddress(String taxPayerAddress) {
		TaxPayerAddress = taxPayerAddress;
	}

	public String getPlatReqType() {
		return PlatReqType;
	}

	public void setPlatReqType(String platReqType) {
		PlatReqType = platReqType;
	}

	public String getCarOwnerType() {
		return CarOwnerType;
	}

	public void setCarOwnerType(String carOwnerType) {
		CarOwnerType = carOwnerType;
	}

	public String getTaxPeriod() {
		return TaxPeriod;
	}

	public void setTaxPeriod(String taxPeriod) {
		TaxPeriod = taxPeriod;
	}

	public String getTaxInvoiceType() {
		return TaxInvoiceType;
	}

	public void setTaxInvoiceType(String taxInvoiceType) {
		TaxInvoiceType = taxInvoiceType;
	}

	public String getTaxInvoiceNo() {
		return TaxInvoiceNo;
	}

	public void setTaxInvoiceNo(String taxInvoiceNo) {
		TaxInvoiceNo = taxInvoiceNo;
	}

	public String getCarArea() {
		return CarArea;
	}

	public void setCarArea(String carArea) {
		CarArea = carArea;
	}

	public String getOriginLicenseNo() {
		return OriginLicenseNo;
	}

	public void setOriginLicenseNo(String originLicenseNo) {
		OriginLicenseNo = originLicenseNo;
	}

	public String getTransferDate() {
		return TransferDate;
	}

	public void setTransferDate(String transferDate) {
		TransferDate = transferDate;
	}

	public String getAcceptLicenseDate() {
		return AcceptLicenseDate;
	}

	public void setAcceptLicenseDate(String acceptLicenseDate) {
		AcceptLicenseDate = acceptLicenseDate;
	}

	public String getExtendChar1() {
		return ExtendChar1;
	}

	public void setExtendChar1(String extendChar1) {
		ExtendChar1 = extendChar1;
	}

	public String getTaxActual2() {
		return taxActual2;
	}

	public void setTaxActual2(String taxActual2) {
		this.taxActual2 = taxActual2;
	}

	public String getPreviouspay2() {
		return previouspay2;
	}

	public void setPreviouspay2(String previouspay2) {
		this.previouspay2 = previouspay2;
	}

	public String getVehiclebrand() {
		return Vehiclebrand;
	}

	public void setVehiclebrand(String vehiclebrand) {
		Vehiclebrand = vehiclebrand;
	}

	public String getModelcode() {
		return Modelcode;
	}

	public void setModelcode(String modelcode) {
		Modelcode = modelcode;
	}

	public String getDeclareid() {
		return declareid;
	}

	public void setDeclareid(String declareid) {
		this.declareid = declareid;
	}

	public String getCcsid() {
		return ccsid;
	}

	public void setCcsid(String ccsid) {
		this.ccsid = ccsid;
	}

	public String getCcstypecode() {
		return ccstypecode;
	}

	public void setCcstypecode(String ccstypecode) {
		this.ccstypecode = ccstypecode;
	}

	public String getFrametype() {
		return frametype;
	}

	public void setFrametype(String frametype) {
		this.frametype = frametype;
	}

	public String getSettledate() {
		return settledate;
	}

	public void setSettledate(String settledate) {
		this.settledate = settledate;
	}

	public String getGsflag() {
		return gsflag;
	}

	public void setGsflag(String gsflag) {
		this.gsflag = gsflag;
	}

	public String getCcsstatuscode() {
		return ccsstatuscode;
	}

	public void setCcsstatuscode(String ccsstatuscode) {
		this.ccsstatuscode = ccsstatuscode;
	}

	public String getNaturecode() {
		return naturecode;
	}

	public void setNaturecode(String naturecode) {
		this.naturecode = naturecode;
	}

	public String getEnergytype() {
		return energytype;
	}

	public void setEnergytype(String energytype) {
		this.energytype = energytype;
	}

	public String getJdcrlnyzldm() {
		return jdcrlnyzldm;
	}

	public void setJdcrlnyzldm(String jdcrlnyzldm) {
		this.jdcrlnyzldm = jdcrlnyzldm;
	}

	public String getBkjdjxh() {
		return bkjdjxh;
	}

	public void setBkjdjxh(String bkjdjxh) {
		this.bkjdjxh = bkjdjxh;
	}

	public String getSingleflag() {
		return singleflag;
	}

	public void setSingleflag(String singleflag) {
		this.singleflag = singleflag;
	}

	public String getLevdateend() {
		return levdateend;
	}

	public void setLevdateend(String levdateend) {
		this.levdateend = levdateend;
	}

	public String getTaxdjamount() {
		return taxdjamount;
	}

	public void setTaxdjamount(String taxdjamount) {
		this.taxdjamount = taxdjamount;
	}

	public String getDecideflag() {
		return decideflag;
	}

	public void setDecideflag(String decideflag) {
		this.decideflag = decideflag;
	}

	public String getJmlxdm() {
		return jmlxdm;
	}

	public void setJmlxdm(String jmlxdm) {
		this.jmlxdm = jmlxdm;
	}

	public String getDeratebegin() {
		return deratebegin;
	}

	public void setDeratebegin(String deratebegin) {
		this.deratebegin = deratebegin;
	}

	public String getDerateend() {
		return derateend;
	}

	public void setDerateend(String derateend) {
		this.derateend = derateend;
	}

	public String getDeratetypecode() {
		return deratetypecode;
	}

	public void setDeratetypecode(String deratetypecode) {
		this.deratetypecode = deratetypecode;
	}

	public String getTaxamount() {
		return taxamount;
	}

	public void setTaxamount(String taxamount) {
		this.taxamount = taxamount;
	}

	public String getIdcertypecode() {
		return idcertypecode;
	}

	public void setIdcertypecode(String idcertypecode) {
		this.idcertypecode = idcertypecode;
	}

	public String getCsrq() {
		return csrq;
	}

	public void setCsrq(String csrq) {
		this.csrq = csrq;
	}

	public String getGjhdqszdm() {
		return gjhdqszdm;
	}

	public void setGjhdqszdm(String gjhdqszdm) {
		this.gjhdqszdm = gjhdqszdm;
	}

	public String getXb() {
		return xb;
	}

	public void setXb(String xb) {
		this.xb = xb;
	}

	public String getAdminAreaCode() {
		return adminAreaCode;
	}

	public void setAdminAreaCode(String adminAreaCode) {
		this.adminAreaCode = adminAreaCode;
	}
}
