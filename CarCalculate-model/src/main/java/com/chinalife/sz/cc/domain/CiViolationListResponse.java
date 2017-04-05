package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 商业险违法信息
 */
public class CiViolationListResponse  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5678222058678381091L;
	private String demandno;
	private String serialno;
	private String violationcode;
	private String violationrecordtypecode;
	private String decisioncode;
	private String decisiontypecode;
	private String violationsequence;
	private String driverlicenseno;
	private String licenseplateno;
	private String licenseplatetypecode;
	private String violationplace;
	private String violationtime;
	private String recognitiondate;
	private String jurisdictionagencycode;
	private String violationrecordtypename;
	private String vouchcode;
	private String sanctionperson;
	private String sanctiondate;
	private String administrationArea;

	@Override
	public String toString() {
		return "CiViolationListResponse{" +
				"demandno='" + demandno + '\'' +
				", serialno='" + serialno + '\'' +
				", violationcode='" + violationcode + '\'' +
				", violationrecordtypecode='" + violationrecordtypecode + '\'' +
				", decisioncode='" + decisioncode + '\'' +
				", decisiontypecode='" + decisiontypecode + '\'' +
				", violationsequence='" + violationsequence + '\'' +
				", driverlicenseno='" + driverlicenseno + '\'' +
				", licenseplateno='" + licenseplateno + '\'' +
				", licenseplatetypecode='" + licenseplatetypecode + '\'' +
				", violationplace='" + violationplace + '\'' +
				", violationtime='" + violationtime + '\'' +
				", recognitiondate='" + recognitiondate + '\'' +
				", jurisdictionagencycode='" + jurisdictionagencycode + '\'' +
				", violationrecordtypename='" + violationrecordtypename + '\'' +
				", vouchcode='" + vouchcode + '\'' +
				", sanctionperson='" + sanctionperson + '\'' +
				", sanctiondate='" + sanctiondate + '\'' +
				", administrationArea='" + administrationArea + '\'' +
				'}';
	}

	public String getDemandno() {
		return demandno;
	}

	public void setDemandno(String demandno) {
		this.demandno = demandno;
	}

	public String getSerialno() {
		return serialno;
	}

	public void setSerialno(String serialno) {
		this.serialno = serialno;
	}

	public String getViolationcode() {
		return violationcode;
	}

	public void setViolationcode(String violationcode) {
		this.violationcode = violationcode;
	}

	public String getViolationrecordtypecode() {
		return violationrecordtypecode;
	}

	public void setViolationrecordtypecode(String violationrecordtypecode) {
		this.violationrecordtypecode = violationrecordtypecode;
	}

	public String getDecisioncode() {
		return decisioncode;
	}

	public void setDecisioncode(String decisioncode) {
		this.decisioncode = decisioncode;
	}

	public String getDecisiontypecode() {
		return decisiontypecode;
	}

	public void setDecisiontypecode(String decisiontypecode) {
		this.decisiontypecode = decisiontypecode;
	}

	public String getViolationsequence() {
		return violationsequence;
	}

	public void setViolationsequence(String violationsequence) {
		this.violationsequence = violationsequence;
	}

	public String getDriverlicenseno() {
		return driverlicenseno;
	}

	public void setDriverlicenseno(String driverlicenseno) {
		this.driverlicenseno = driverlicenseno;
	}

	public String getLicenseplateno() {
		return licenseplateno;
	}

	public void setLicenseplateno(String licenseplateno) {
		this.licenseplateno = licenseplateno;
	}

	public String getLicenseplatetypecode() {
		return licenseplatetypecode;
	}

	public void setLicenseplatetypecode(String licenseplatetypecode) {
		this.licenseplatetypecode = licenseplatetypecode;
	}

	public String getViolationplace() {
		return violationplace;
	}

	public void setViolationplace(String violationplace) {
		this.violationplace = violationplace;
	}

	public String getViolationtime() {
		return violationtime;
	}

	public void setViolationtime(String violationtime) {
		this.violationtime = violationtime;
	}

	public String getRecognitiondate() {
		return recognitiondate;
	}

	public void setRecognitiondate(String recognitiondate) {
		this.recognitiondate = recognitiondate;
	}

	public String getJurisdictionagencycode() {
		return jurisdictionagencycode;
	}

	public void setJurisdictionagencycode(String jurisdictionagencycode) {
		this.jurisdictionagencycode = jurisdictionagencycode;
	}

	public String getViolationrecordtypename() {
		return violationrecordtypename;
	}

	public void setViolationrecordtypename(String violationrecordtypename) {
		this.violationrecordtypename = violationrecordtypename;
	}

	public String getVouchcode() {
		return vouchcode;
	}

	public void setVouchcode(String vouchcode) {
		this.vouchcode = vouchcode;
	}

	public String getSanctionperson() {
		return sanctionperson;
	}

	public void setSanctionperson(String sanctionperson) {
		this.sanctionperson = sanctionperson;
	}

	public String getSanctiondate() {
		return sanctiondate;
	}

	public void setSanctiondate(String sanctiondate) {
		this.sanctiondate = sanctiondate;
	}

	public String getAdministrationArea() {
		return administrationArea;
	}

	public void setAdministrationArea(String administrationArea) {
		this.administrationArea = administrationArea;
	}
}