package com.chinalife.sz.cc.domain;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Created by tianwei on 2016/7/20.
 * 费改保费计算请求信息
 */
public class PremiumCalculateRequest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6184101711724708226L;
	//主信息
	private MainRequest main;
	//投保人
	private ApplicantRequest applicant;
	//被保人信息
	private InsuredDataRequest[] insuredList;
	//车辆信息
	private CarInfoRequest carInfo;
	//新增设备
	private CarDeviceDataRequest[] carDeviceList;
	//驾驶员列表
	private CarDriverDataRequest[] carDriverList;
	//车船税信息
	private CarShipTaxInfoRequest carShipTaxInfo;
	//险种套餐信息
	private CombosDataRequest[] combosList;
	//关联交强险信息
	private BzRelationMainRequest bzRelationMain;
	//中介认证设备信息
	private MainICCardSubRequest mainICCardSub;
	//修理厂信息
	private  RepairFactoryRequest repairFactory;


	@Override
	public String toString() {
		return "PremiumCalculateRequest{" +
				"main=" + main +
				", applicant=" + applicant +
				", insuredList=" + Arrays.toString(insuredList) +
				", carInfo=" + carInfo +
				", carDeviceList=" + Arrays.toString(carDeviceList) +
				", carDriverList=" + Arrays.toString(carDriverList) +
				", carShipTaxInfo=" + carShipTaxInfo +
				", combosList=" + Arrays.toString(combosList) +
				", bzRelationMain=" + bzRelationMain +
				", mainICCardSub=" + mainICCardSub +
				", repairFactory=" + repairFactory +
				'}';
	}

	public MainRequest getMain() {
		return main;
	}

	public void setMain(MainRequest main) {
		this.main = main;
	}

	public ApplicantRequest getApplicant() {
		return applicant;
	}

	public void setApplicant(ApplicantRequest applicant) {
		this.applicant = applicant;
	}

	public CarInfoRequest getCarInfo() {
		return carInfo;
	}

	public void setCarInfo(CarInfoRequest carInfo) {
		this.carInfo = carInfo;
	}

	public CarDeviceDataRequest[] getCarDeviceList() {
		return carDeviceList;
	}

	public void setCarDeviceList(CarDeviceDataRequest[] carDeviceList) {
		this.carDeviceList = carDeviceList;
	}

	public CarShipTaxInfoRequest getCarShipTaxInfo() {
		return carShipTaxInfo;
	}

	public void setCarShipTaxInfo(CarShipTaxInfoRequest carShipTaxInfo) {
		this.carShipTaxInfo = carShipTaxInfo;
	}

	public InsuredDataRequest[] getInsuredList() {
		return insuredList;
	}

	public void setInsuredList(InsuredDataRequest[] insuredList) {
		this.insuredList = insuredList;
	}

	public CombosDataRequest[] getCombosList() {
		return combosList;
	}

	public void setCombosList(CombosDataRequest[] combosList) {
		this.combosList = combosList;
	}

	public CarDriverDataRequest[] getCarDriverList() {
		return carDriverList;
	}

	public void setCarDriverList(CarDriverDataRequest[] carDriverList) {
		this.carDriverList = carDriverList;
	}

	public BzRelationMainRequest getBzRelationMain() {
		return bzRelationMain;
	}

	public void setBzRelationMain(BzRelationMainRequest bzRelationMain) {
		this.bzRelationMain = bzRelationMain;
	}

	public MainICCardSubRequest getMainICCardSub() {
		return mainICCardSub;
	}

	public void setMainICCardSub(MainICCardSubRequest mainICCardSub) {
		this.mainICCardSub = mainICCardSub;
	}

	public RepairFactoryRequest getRepairFactory() {
		return repairFactory;
	}

	public void setRepairFactory(RepairFactoryRequest repairFactory) {
		this.repairFactory = repairFactory;
	}
}
