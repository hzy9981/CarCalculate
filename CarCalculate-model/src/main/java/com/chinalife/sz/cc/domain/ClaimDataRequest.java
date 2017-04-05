package com.chinalife.sz.cc.domain;

import java.io.Serializable;

/**
 * Created by tianwei on 2016/10/26.
 */
public class ClaimDataRequest  implements Serializable{

    private static final long serialVersionUID = 43471630839785583L;
    private String DemandNo;
    private String CompanyID;
    private String RegisreationNo;
    private String ClaimNo;
    private String AccidentTime;
    private String EndcaseTime;
    private String ClaimType;
    private double TotalAmount;
    private String PolicyNo;
    private String CoverageType;
    private double ClaimAmount;
    private String EffectiveDate;
    private String ExpireDate;
    private String ClaimSequenceNo;


    @Override
    public String toString() {
        return "ClaimDataRequest{" +
                "DemandNo='" + DemandNo + '\'' +
                ", CompanyID='" + CompanyID + '\'' +
                ", RegisreationNo='" + RegisreationNo + '\'' +
                ", ClaimNo='" + ClaimNo + '\'' +
                ", AccidentTime='" + AccidentTime + '\'' +
                ", EndcaseTime='" + EndcaseTime + '\'' +
                ", ClaimType='" + ClaimType + '\'' +
                ", TotalAmount=" + TotalAmount +
                ", PolicyNo='" + PolicyNo + '\'' +
                ", CoverageType='" + CoverageType + '\'' +
                ", ClaimAmount=" + ClaimAmount +
                ", EffectiveDate='" + EffectiveDate + '\'' +
                ", ExpireDate='" + ExpireDate + '\'' +
                ", ClaimSequenceNo='" + ClaimSequenceNo + '\'' +
                '}';
    }

    public String getDemandNo() {
        return DemandNo;
    }

    public void setDemandNo(String demandNo) {
        DemandNo = demandNo;
    }

    public String getCompanyID() {
        return CompanyID;
    }

    public void setCompanyID(String companyID) {
        CompanyID = companyID;
    }

    public String getRegisreationNo() {
        return RegisreationNo;
    }

    public void setRegisreationNo(String regisreationNo) {
        RegisreationNo = regisreationNo;
    }

    public String getClaimNo() {
        return ClaimNo;
    }

    public void setClaimNo(String claimNo) {
        ClaimNo = claimNo;
    }

    public String getAccidentTime() {
        return AccidentTime;
    }

    public void setAccidentTime(String accidentTime) {
        AccidentTime = accidentTime;
    }

    public String getEndcaseTime() {
        return EndcaseTime;
    }

    public void setEndcaseTime(String endcaseTime) {
        EndcaseTime = endcaseTime;
    }

    public String getClaimType() {
        return ClaimType;
    }

    public void setClaimType(String claimType) {
        ClaimType = claimType;
    }

    public double getTotalAmount() {
        return TotalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        TotalAmount = totalAmount;
    }

    public String getPolicyNo() {
        return PolicyNo;
    }

    public void setPolicyNo(String policyNo) {
        PolicyNo = policyNo;
    }

    public String getCoverageType() {
        return CoverageType;
    }

    public void setCoverageType(String coverageType) {
        CoverageType = coverageType;
    }

    public double getClaimAmount() {
        return ClaimAmount;
    }

    public void setClaimAmount(double claimAmount) {
        ClaimAmount = claimAmount;
    }

    public String getEffectiveDate() {
        return EffectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        EffectiveDate = effectiveDate;
    }

    public String getExpireDate() {
        return ExpireDate;
    }

    public void setExpireDate(String expireDate) {
        ExpireDate = expireDate;
    }

    public String getClaimSequenceNo() {
        return ClaimSequenceNo;
    }

    public void setClaimSequenceNo(String claimSequenceNo) {
        ClaimSequenceNo = claimSequenceNo;
    }
}