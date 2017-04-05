package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 中介设备认证信息
 */
public class MainICCardSubCmbcResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4366266983954770417L;
	private String cardFlag;
	private String cardSucFlag;
	private String cardNo;
	private String companyCode;
	private String agentName;
	private String agentLicNo;
	private String chuDanDianName;
	private String chuDanDianAddr;
	private String validBeginYear;
	private String validBeginMonth;
	private String validBeginDay;
	private String validEndYear;
	private String validEndMonth;
	private String validEndDay;
	private String cardProTime;

	@Override
	public String toString() {
		return "MainICCardSubCmbcResponse{" +
				"cardFlag='" + cardFlag + '\'' +
				", cardSucFlag='" + cardSucFlag + '\'' +
				", cardNo='" + cardNo + '\'' +
				", companyCode='" + companyCode + '\'' +
				", agentName='" + agentName + '\'' +
				", agentLicNo='" + agentLicNo + '\'' +
				", chuDanDianName='" + chuDanDianName + '\'' +
				", chuDanDianAddr='" + chuDanDianAddr + '\'' +
				", validBeginYear='" + validBeginYear + '\'' +
				", validBeginMonth='" + validBeginMonth + '\'' +
				", validBeginDay='" + validBeginDay + '\'' +
				", validEndYear='" + validEndYear + '\'' +
				", validEndMonth='" + validEndMonth + '\'' +
				", validEndDay='" + validEndDay + '\'' +
				", cardProTime='" + cardProTime + '\'' +
				'}';
	}

	public String getCardFlag() {
		return cardFlag;
	}

	public void setCardFlag(String cardFlag) {
		this.cardFlag = cardFlag;
	}

	public String getCardSucFlag() {
		return cardSucFlag;
	}

	public void setCardSucFlag(String cardSucFlag) {
		this.cardSucFlag = cardSucFlag;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentLicNo() {
		return agentLicNo;
	}

	public void setAgentLicNo(String agentLicNo) {
		this.agentLicNo = agentLicNo;
	}

	public String getChuDanDianName() {
		return chuDanDianName;
	}

	public void setChuDanDianName(String chuDanDianName) {
		this.chuDanDianName = chuDanDianName;
	}

	public String getChuDanDianAddr() {
		return chuDanDianAddr;
	}

	public void setChuDanDianAddr(String chuDanDianAddr) {
		this.chuDanDianAddr = chuDanDianAddr;
	}

	public String getValidBeginYear() {
		return validBeginYear;
	}

	public void setValidBeginYear(String validBeginYear) {
		this.validBeginYear = validBeginYear;
	}

	public String getValidBeginMonth() {
		return validBeginMonth;
	}

	public void setValidBeginMonth(String validBeginMonth) {
		this.validBeginMonth = validBeginMonth;
	}

	public String getValidBeginDay() {
		return validBeginDay;
	}

	public void setValidBeginDay(String validBeginDay) {
		this.validBeginDay = validBeginDay;
	}

	public String getValidEndYear() {
		return validEndYear;
	}

	public void setValidEndYear(String validEndYear) {
		this.validEndYear = validEndYear;
	}

	public String getValidEndMonth() {
		return validEndMonth;
	}

	public void setValidEndMonth(String validEndMonth) {
		this.validEndMonth = validEndMonth;
	}

	public String getValidEndDay() {
		return validEndDay;
	}

	public void setValidEndDay(String validEndDay) {
		this.validEndDay = validEndDay;
	}

	public String getCardProTime() {
		return cardProTime;
	}

	public void setCardProTime(String cardProTime) {
		this.cardProTime = cardProTime;
	}
}
