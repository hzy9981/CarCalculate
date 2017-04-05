package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/7/20.
 * 险别信息
 */
public class ItemKindDataRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3613480435226049455L;
	private String Amount;
	private String StartDate;
	private String StartHour;
	private String EndDate;
	private String EndHour;
	private String AmountCNY;
	private String PremiumCNY;
	private String DiscountPremiumCNY;
	private String ItemCode;
	private String ItemDetailName;
	private String UnitAmount;
	private String BenchMarkPremium;
	private String AdjustRate;
	private String ShortRate;
	private String ShortRateFlag;
	private String BasePremium;
	private String Rate;
	private String ActuaryPremium;
	private String UnderWritePremium;
	private String Premium;
	private String DeductableFlag;
	private String Quantity;
	private String Currency;
	private String ModeCode;
	private String ModeName;
	private String KindCode;
	private String KindName;
	private String Discount;
	private String DiscountPremium;
	private String OptionalFlag;
	private String RateFactor;
	private String SerialNo;
	private String flag;
	private String CalculateFlag;
	private String newDiscount;
	private String newPremium;
	private String kindPremiumM;
	private String m1Value;
	private String m1Premium;
	private String rPremium;
	private String guestamount;
	private String driveramount;
	private String thirdPeopleamount;
	private String kindBenchmarkPremiumm;


	@Override
	public String toString() {
		return "ItemKindDataRequest{" +
				"Amount='" + Amount + '\'' +
				", StartDate='" + StartDate + '\'' +
				", StartHour='" + StartHour + '\'' +
				", EndDate='" + EndDate + '\'' +
				", EndHour='" + EndHour + '\'' +
				", AmountCNY='" + AmountCNY + '\'' +
				", PremiumCNY='" + PremiumCNY + '\'' +
				", DiscountPremiumCNY='" + DiscountPremiumCNY + '\'' +
				", ItemCode='" + ItemCode + '\'' +
				", ItemDetailName='" + ItemDetailName + '\'' +
				", UnitAmount='" + UnitAmount + '\'' +
				", BenchMarkPremium='" + BenchMarkPremium + '\'' +
				", AdjustRate='" + AdjustRate + '\'' +
				", ShortRate='" + ShortRate + '\'' +
				", ShortRateFlag='" + ShortRateFlag + '\'' +
				", BasePremium='" + BasePremium + '\'' +
				", Rate='" + Rate + '\'' +
				", ActuaryPremium='" + ActuaryPremium + '\'' +
				", UnderWritePremium='" + UnderWritePremium + '\'' +
				", Premium='" + Premium + '\'' +
				", DeductableFlag='" + DeductableFlag + '\'' +
				", Quantity='" + Quantity + '\'' +
				", Currency='" + Currency + '\'' +
				", ModeCode='" + ModeCode + '\'' +
				", ModeName='" + ModeName + '\'' +
				", KindCode='" + KindCode + '\'' +
				", KindName='" + KindName + '\'' +
				", Discount='" + Discount + '\'' +
				", DiscountPremium='" + DiscountPremium + '\'' +
				", OptionalFlag='" + OptionalFlag + '\'' +
				", RateFactor='" + RateFactor + '\'' +
				", SerialNo='" + SerialNo + '\'' +
				", flag='" + flag + '\'' +
				", CalculateFlag='" + CalculateFlag + '\'' +
				", newDiscount='" + newDiscount + '\'' +
				", newPremium='" + newPremium + '\'' +
				", kindPremiumM='" + kindPremiumM + '\'' +
				", m1Value='" + m1Value + '\'' +
				", m1Premium='" + m1Premium + '\'' +
				", rPremium='" + rPremium + '\'' +
				", guestamount='" + guestamount + '\'' +
				", driveramount='" + driveramount + '\'' +
				", thirdPeopleamount='" + thirdPeopleamount + '\'' +
				", kindBenchmarkPremiumm='" + kindBenchmarkPremiumm + '\'' +
				'}';
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public String getStartDate() {
		return StartDate;
	}

	public void setStartDate(String startDate) {
		StartDate = startDate;
	}

	public String getStartHour() {
		return StartHour;
	}

	public void setStartHour(String startHour) {
		StartHour = startHour;
	}

	public String getEndDate() {
		return EndDate;
	}

	public void setEndDate(String endDate) {
		EndDate = endDate;
	}

	public String getEndHour() {
		return EndHour;
	}

	public void setEndHour(String endHour) {
		EndHour = endHour;
	}

	public String getAmountCNY() {
		return AmountCNY;
	}

	public void setAmountCNY(String amountCNY) {
		AmountCNY = amountCNY;
	}

	public String getPremiumCNY() {
		return PremiumCNY;
	}

	public void setPremiumCNY(String premiumCNY) {
		PremiumCNY = premiumCNY;
	}

	public String getDiscountPremiumCNY() {
		return DiscountPremiumCNY;
	}

	public void setDiscountPremiumCNY(String discountPremiumCNY) {
		DiscountPremiumCNY = discountPremiumCNY;
	}

	public String getItemCode() {
		return ItemCode;
	}

	public void setItemCode(String itemCode) {
		ItemCode = itemCode;
	}

	public String getItemDetailName() {
		return ItemDetailName;
	}

	public void setItemDetailName(String itemDetailName) {
		ItemDetailName = itemDetailName;
	}

	public String getUnitAmount() {
		return UnitAmount;
	}

	public void setUnitAmount(String unitAmount) {
		UnitAmount = unitAmount;
	}

	public String getBenchMarkPremium() {
		return BenchMarkPremium;
	}

	public void setBenchMarkPremium(String benchMarkPremium) {
		BenchMarkPremium = benchMarkPremium;
	}

	public String getAdjustRate() {
		return AdjustRate;
	}

	public void setAdjustRate(String adjustRate) {
		AdjustRate = adjustRate;
	}

	public String getShortRate() {
		return ShortRate;
	}

	public void setShortRate(String shortRate) {
		ShortRate = shortRate;
	}

	public String getShortRateFlag() {
		return ShortRateFlag;
	}

	public void setShortRateFlag(String shortRateFlag) {
		ShortRateFlag = shortRateFlag;
	}

	public String getBasePremium() {
		return BasePremium;
	}

	public void setBasePremium(String basePremium) {
		BasePremium = basePremium;
	}

	public String getRate() {
		return Rate;
	}

	public void setRate(String rate) {
		Rate = rate;
	}

	public String getActuaryPremium() {
		return ActuaryPremium;
	}

	public void setActuaryPremium(String actuaryPremium) {
		ActuaryPremium = actuaryPremium;
	}

	public String getUnderWritePremium() {
		return UnderWritePremium;
	}

	public void setUnderWritePremium(String underWritePremium) {
		UnderWritePremium = underWritePremium;
	}

	public String getPremium() {
		return Premium;
	}

	public void setPremium(String premium) {
		Premium = premium;
	}

	public String getDeductableFlag() {
		return DeductableFlag;
	}

	public void setDeductableFlag(String deductableFlag) {
		DeductableFlag = deductableFlag;
	}

	public String getQuantity() {
		return Quantity;
	}

	public void setQuantity(String quantity) {
		Quantity = quantity;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getModeCode() {
		return ModeCode;
	}

	public void setModeCode(String modeCode) {
		ModeCode = modeCode;
	}

	public String getModeName() {
		return ModeName;
	}

	public void setModeName(String modeName) {
		ModeName = modeName;
	}

	public String getKindCode() {
		return KindCode;
	}

	public void setKindCode(String kindCode) {
		KindCode = kindCode;
	}

	public String getKindName() {
		return KindName;
	}

	public void setKindName(String kindName) {
		KindName = kindName;
	}

	public String getDiscount() {
		return Discount;
	}

	public void setDiscount(String discount) {
		Discount = discount;
	}

	public String getDiscountPremium() {
		return DiscountPremium;
	}

	public void setDiscountPremium(String discountPremium) {
		DiscountPremium = discountPremium;
	}

	public String getOptionalFlag() {
		return OptionalFlag;
	}

	public void setOptionalFlag(String optionalFlag) {
		OptionalFlag = optionalFlag;
	}

	public String getRateFactor() {
		return RateFactor;
	}

	public void setRateFactor(String rateFactor) {
		RateFactor = rateFactor;
	}

	public String getSerialNo() {
		return SerialNo;
	}

	public void setSerialNo(String serialNo) {
		SerialNo = serialNo;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public String getCalculateFlag() {
		return CalculateFlag;
	}

	public void setCalculateFlag(String calculateFlag) {
		CalculateFlag = calculateFlag;
	}

	public String getNewDiscount() {
		return newDiscount;
	}

	public void setNewDiscount(String newDiscount) {
		this.newDiscount = newDiscount;
	}

	public String getNewPremium() {
		return newPremium;
	}

	public void setNewPremium(String newPremium) {
		this.newPremium = newPremium;
	}

	public String getKindPremiumM() {
		return kindPremiumM;
	}

	public void setKindPremiumM(String kindPremiumM) {
		this.kindPremiumM = kindPremiumM;
	}

	public String getM1Value() {
		return m1Value;
	}

	public void setM1Value(String m1Value) {
		this.m1Value = m1Value;
	}

	public String getM1Premium() {
		return m1Premium;
	}

	public void setM1Premium(String m1Premium) {
		this.m1Premium = m1Premium;
	}

	public String getrPremium() {
		return rPremium;
	}

	public void setrPremium(String rPremium) {
		this.rPremium = rPremium;
	}

	public String getGuestamount() {
		return guestamount;
	}

	public void setGuestamount(String guestamount) {
		this.guestamount = guestamount;
	}

	public String getDriveramount() {
		return driveramount;
	}

	public void setDriveramount(String driveramount) {
		this.driveramount = driveramount;
	}

	public String getThirdPeopleamount() {
		return thirdPeopleamount;
	}

	public void setThirdPeopleamount(String thirdPeopleamount) {
		this.thirdPeopleamount = thirdPeopleamount;
	}

	public String getKindBenchmarkPremiumm() {
		return kindBenchmarkPremiumm;
	}

	public void setKindBenchmarkPremiumm(String kindBenchmarkPremiumm) {
		this.kindBenchmarkPremiumm = kindBenchmarkPremiumm;
	}
}
