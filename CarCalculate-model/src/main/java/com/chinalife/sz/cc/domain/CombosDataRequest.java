package com.chinalife.sz.cc.domain;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by tianwei on 2016/7/20.
 * 车险套餐情况
 */
public class CombosDataRequest  implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4017336973099131826L;
	private String clauseCode;
	private String CombosCode;
	private String SerialNo;
	private String RiskCode;
	private String SumAmount;
	private String SumBenchMarkPremium;
	private String sumPremium;
	private String SumDiscountPremium;
	private String SumSubPremium;
	private String UuID;
	private String ItemNo;
	private String ComboNature;
	private String CombosType;
	private String busnessSumPremium;
	private String accidentOccurredNumMin;
	private String accidentOccurredNumMax;
	private RatioInfoRequest RatioInfo;
	private RatioDetailInfoRequest[] ratioDetailInfoList;
	private EngageDataRequest[] engageList;
	private ItemKindDataRequest[] itemKindList;
    private String sumDiscount;

	@Override
	public String toString() {
		return "CombosDataRequest{" +
				"clauseCode='" + clauseCode + '\'' +
				", CombosCode='" + CombosCode + '\'' +
				", SerialNo='" + SerialNo + '\'' +
				", RiskCode='" + RiskCode + '\'' +
				", SumAmount='" + SumAmount + '\'' +
				", SumBenchMarkPremium='" + SumBenchMarkPremium + '\'' +
				", sumPremium='" + sumPremium + '\'' +
				", SumDiscountPremium='" + SumDiscountPremium + '\'' +
				", SumSubPremium='" + SumSubPremium + '\'' +
				", UuID='" + UuID + '\'' +
				", ItemNo='" + ItemNo + '\'' +
				", ComboNature='" + ComboNature + '\'' +
				", CombosType='" + CombosType + '\'' +
				", busnessSumPremium='" + busnessSumPremium + '\'' +
				", accidentOccurredNumMin='" + accidentOccurredNumMin + '\'' +
				", accidentOccurredNumMax='" + accidentOccurredNumMax + '\'' +
				", RatioInfo=" + RatioInfo +
				", ratioDetailInfoList=" + Arrays.toString(ratioDetailInfoList) +
				", engageList=" + Arrays.toString(engageList) +
				", itemKindList=" + Arrays.toString(itemKindList) +
				", sumDiscount='" + sumDiscount + '\'' +
				'}';
	}

	public String getSumDiscount() {
		return sumDiscount;
	}

	public void setSumDiscount(String sumDiscount) {
		this.sumDiscount = sumDiscount;
	}

	public String getClauseCode() {
		return clauseCode;
	}

	public void setClauseCode(String clauseCode) {
		this.clauseCode = clauseCode;
	}

	public String getCombosCode() {
		return CombosCode;
	}

	public void setCombosCode(String combosCode) {
		CombosCode = combosCode;
	}

	public String getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(String serialNo) {
		SerialNo = serialNo;
	}

	public String getRiskCode() {
		return RiskCode;
	}

	public void setRiskCode(String riskCode) {
		RiskCode = riskCode;
	}

	public String getSumAmount() {
		return SumAmount;
	}

	public void setSumAmount(String sumAmount) {
		SumAmount = sumAmount;
	}

	public String getSumBenchMarkPremium() {
		return SumBenchMarkPremium;
	}

	public void setSumBenchMarkPremium(String sumBenchMarkPremium) {
		SumBenchMarkPremium = sumBenchMarkPremium;
	}

	public String getSumPremium() {
		return sumPremium;
	}

	public void setSumPremium(String sumPremium) {
		this.sumPremium = sumPremium;
	}

	public String getSumDiscountPremium() {
		return SumDiscountPremium;
	}

	public void setSumDiscountPremium(String sumDiscountPremium) {
		SumDiscountPremium = sumDiscountPremium;
	}

	public String getSumSubPremium() {
		return SumSubPremium;
	}

	public void setSumSubPremium(String sumSubPremium) {
		SumSubPremium = sumSubPremium;
	}

	public String getUuID() {
		return UuID;
	}

	public void setUuID(String uuID) {
		UuID = uuID;
	}

	public String getItemNo() {
		return ItemNo;
	}

	public void setItemNo(String itemNo) {
		ItemNo = itemNo;
	}

	public String getComboNature() {
		return ComboNature;
	}

	public void setComboNature(String comboNature) {
		ComboNature = comboNature;
	}

	public String getCombosType() {
		return CombosType;
	}

	public void setCombosType(String combosType) {
		CombosType = combosType;
	}

	public String getBusnessSumPremium() {
		return busnessSumPremium;
	}

	public void setBusnessSumPremium(String busnessSumPremium) {
		this.busnessSumPremium = busnessSumPremium;
	}

	public String getAccidentOccurredNumMin() {
		return accidentOccurredNumMin;
	}

	public void setAccidentOccurredNumMin(String accidentOccurredNumMin) {
		this.accidentOccurredNumMin = accidentOccurredNumMin;
	}

	public String getAccidentOccurredNumMax() {
		return accidentOccurredNumMax;
	}

	public void setAccidentOccurredNumMax(String accidentOccurredNumMax) {
		this.accidentOccurredNumMax = accidentOccurredNumMax;
	}

	public RatioInfoRequest getRatioInfo() {
		return RatioInfo;
	}

	public void setRatioInfo(RatioInfoRequest ratioInfo) {
		RatioInfo = ratioInfo;
	}

	public RatioDetailInfoRequest[] getRatioDetailInfoList() {
		return ratioDetailInfoList;
	}

	public void setRatioDetailInfoList(RatioDetailInfoRequest[] ratioDetailInfoList) {
		this.ratioDetailInfoList = ratioDetailInfoList;
	}

	public EngageDataRequest[] getEngageList() {
		return engageList;
	}

	public void setEngageList(EngageDataRequest[] engageList) {
		this.engageList = engageList;
	}

	public ItemKindDataRequest[] getItemKindList() {
		return itemKindList;
	}

	public void setItemKindList(ItemKindDataRequest[] itemKindList) {
		this.itemKindList = itemKindList;
	}
}
