/**
 * @author MarsCheng
 * @email chengjie@sz.chinalife-p.com.cn
 * 2016年9月1日
 */
package com.chinalife.sz.carcalculate.service.impl;

import com.alibaba.fastjson.JSON;
import com.chinalife.sz.carcalculate.service.WebService;
import com.chinalife.sz.cc.domain.MainInfoRequest;
import com.chinalife.sz.cc.domain.MainResponse;
import com.chinalife.sz.cc.model.log.LogDTO;
import com.chinalife.sz.cc.model.user.UserInfoDTO;
import com.chinalife.sz.cc.user.service.UserInfoService;
import org.springframework.beans.BeanUtils;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author MarsCheng
 * @email chengjie@sz.chinalife-p.com.cn
 * 2016年9月1日
 */
public class MainInfoQueryService implements WebService {

	@Resource
	private UserInfoService userInfoService;
//	@Resource
//	private MainResponse mainResponse;
	/* (non-Javadoc)
	 * @see com.chinalife.sz.carcalculate.service.WebService#checkData(java.lang.Object)
	 */
	@Override
	public <T> boolean checkData(T object) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.chinalife.sz.carcalculate.service.WebService#dealData(java.lang.Object, java.lang.Object)
	 */
	@Override
	public <T> T dealData(Object domain, T mainEhm) {
		String domainString=JSON.toJSONString(domain);
//		MainInfoRequest domainJson=(MainInfoRequest)JSON.parseObject(domainString);
		MainInfoRequest domainJson =JSON.parseObject(domainString, MainInfoRequest.class);
//		if(domain instanceof MainInfoRequest){
		
			MainInfoRequest mainRequest = domainJson;
		UserInfoDTO dto= null;

			dto = userInfoService.findUserInfoByUserCde(mainRequest.getUserCde());

		if(dto!=null){
//			ConfigUtils.simpleBeanConvert(t1, c2)
			
//			if(mainEhm instanceof MainResponse){
			   
				MainResponse mainResponse=new MainResponse();
				mainResponse.setOperateType("SAVE");
				mainResponse.setPolicySort("SZ0");
				// 电销标识
				mainResponse.setTmkFlag("1");
				// 险类标识，默认"05"
				mainResponse.setClassCode("05");
				//业务来源
					mainResponse.setBusinessNature(dto.getBusinessNatureCde());
					mainResponse.setBusinessNatureName(dto.getBusinessNatureNme());

				
				// 是否同步投保交强险,0 否 1是
				mainResponse.setbZRealationFlag(mainRequest.getBZRealationFlag());
				// 选中自选及套餐列表，自由套餐，需要再确认************************
				mainResponse.setCombosFlag("GP00000000");
				// 是否重新计算保费标志,0 否 1 是
				mainResponse.setPremiumCalAgain("1");
				
				// 计算方式，传统产品CalculateMode传1；电销CalculateMode传3；门店产品CalculateMode传2
				mainResponse.setCalculateMode(mainRequest.getCalculateMode());
				//起保终保时间
				mainResponse.setStartHour("0");
				// 终保小时，默认24时
				mainResponse.setEndHour("24");
				
				//获取系统当前时间
				Date date = new Date();
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				String dateString = sdf.format(date);
				// 录单日期
				mainResponse.setInputDate(dateString);
				mainResponse.setOperateDate(dateString);
				// 险种代码
				mainResponse.setRiskCode("0511");
				
				mainResponse.setComCode(dto.getDept());
				
				
				//销售渠道代码
				mainResponse.setChannelCode(dto.getChannelType());
				//销售渠道名称
				mainResponse.setChannelName(dto.getChannelName());
				
				//代理人信息
				mainResponse.setAgentCode(dto.getAgentCde());
				mainResponse.setAgentName(dto.getAgentNme());
				mainResponse.setAgreementNo(dto.getAgreementNo());
				
				//操作人员
				mainResponse.setOperatorCode(dto.getHandler1Cde());
				mainResponse.setOperatorName(dto.getHandler1Nme());
				
				mainResponse.setAreaCode("4403061003");
				// 保存类型,Save保存【正常保费计算或试算单修改进行保费计算】
				   // AdditionalSave 附加保存【单商业保费计算后选择“继续投保交强险”
				   // 或单交强保费计算后选择“继续投保商业险”】ConfirmCombos确定套餐类型
				mainResponse.setSaveType("Save");
				// 是否保存套餐0 否 1 是
				mainResponse.setIsSaveCombo("1");
				// 是否保存试算单0 否 1 是
				mainResponse.setIsSaveSSProposal("1");
				
				//归属业务员
				mainResponse.setHandler1Code(dto.getHandler1Cde());
				mainResponse.setHandler1Name(dto.getHandler1Nme());
				// 商业险即时生效标识
				mainResponse.setIsEffectFlag("N");
				
				 // 制单机构代码
				mainResponse.setMakeCom("44039980");
				mainResponse.setMakeComName("深圳市分公司出单中心");
				
				mainResponse.setIlogRequestFlag("OY");// 是否规则引擎交互标示：N否，OY 是
				// 默认车牌号码首位
				mainResponse.setLicense_no(dto.getLicenseNo());
				BeanUtils.copyProperties(mainResponse,mainEhm);
			
			
			
			
			return mainEhm;
		}
		else{
			return null;
		}	
			
//		}
//		return null;
	}

	@Override
	public void asynWtireLog(LogDTO logDTO) {

	}

}
