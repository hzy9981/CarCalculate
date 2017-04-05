package com.chinalife.sz.cc.model.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.support.StaticApplicationContext;

/**
 * 
 * <p>Title: Constants</p>
 * <p>Description: TODO </p>
 * <p>Company: 紫川软件有限公司</p>
 * @author sutanwei@purple-river.com
 * @date 2015年5月28日
 * @version 1.0
 */
public interface Constants {
	
	public static final Map<String, Object> CACHE = new HashMap<String, Object>();
	
	public static final String ERROR = "ERROR";

	public static final String PARAM_DTO = "dto";
	
	public static final String PARAM_MAIN_DTO = "maindto";
	
	public static final String PARAM_DTO_LIST = "dtoList";
	
	public static final String PARAM_DTO_MAP = "dtoMap";
	
	public static final String PARAM_RESULTLIST = "pagingDTO.resultList";
	
	public static final String PARAM_ID = "id";
	
	public static final String PARAM_ID2 = "id2";
	
	public static final String PARAM_PAGING = "pagingDTO";
	
	public static final String SESSION_USER_INFO = "sessionInfo";
	
	public static final String SESSION_CLIENT_USER = "sessionClentUser";
	
	public static final String SESSION_CLIENT_DEPT = "sessionClentDEPT";
	
	public static final String CODING = "coding"; 
	
	public static final String USER_NAME = "userName";
	//用户代码
	public static final String USER_CODE = "userCode";
	
	public static final String PASS_WORD = "passWord";
	
	//用户创建开始时间--用于用户信息查询
	public static final String CREATE_BEGIN = "createBegin";
	//用户创建结束时间--用于用户信息查询
	public  static final String CREATE_END = "createEnd";
	
	public static final String DEPT = "dept";
	
	public static final String HANDLERCDE = "handlerCde";
	
	public static final String HANDLERNME = "handlerNme";
	
	
	public static final String OLD_PASSWORD = "old_password";
	
	public static final String NEW_PASSWORD = "new_password";
	
	public static final String MESSAGE = "message";
	
	//每页现实的用户数
	public static final int USER_PAGE_SIZE = 11;
	
	//登陆成功标志
	public static final String STATUS = "status";
	
	//最大连接次数
	public static final int  PERMITLOGINCOUNT = 5;
	
	//再次登录间隔时间
	public static final long INTERVALMINUTE = 120;
	//添加用户
	public static final String ADD_USER = "carCalculate.add.user";
	//更新用户
	public static final String UPDATE_USER = "carCalculate.update.user";
	//添加日志主表
	public static final String ADD_LOG_MAIN = "carCalculate.log.main";
	//获取菜单信息
	public static final String MENU_LIST = "carCalculate.menu.list";

	public static final String CURRENT_PAGE = "page";

	//总页数
	public static final String TOTAL_PAGES = "totalPages";

	public static final String MENU_TEMPLATE = "menu_template";
	//内部人员菜单
	public static final String INMENU_TEMPLATE = "inMenu_template";
	//外部人员菜单
	public static final String OUTMENU_TEMPLATE = "outMenu_template";
	//业务员信息校验结果
	public static final String SALESAGENTINFO_CHECK = "salesAgentInfo_check";
	
	//代理人信息
	public static final String AGENT_INFO_LIST = "agent_info_list";

	public static final String HANDLER1CDE = "handler1Cde";
	
	public static final String HANDLER1NME = "handler1Nme";

	public static final String USERS = "users";
	
	public static final String ROLE_MODLE = "role_model";
	
	public static final String PERMISSION_MODEL = "permission_model";

	//验证码
	public static final String VALIDATE_CODE = "validateCode";

	//用户资料
	public static final String USER_INFO = "userInfo";

	//异常信息
	public static final String LOGIN_MESSAGE =  "loginMessage";

	//用户角色
	public static final String ROLE_CODE = "roleCode";

	//当前登录用户
	public static final String CURRENT_USER = "currentUser";

	//信息检测结果
	public static final String CHECK_INFO = "checkInfo";

	//销售人员附加信息
	public static final String SALES_ASSISTANT_INFO = "salesAssistantInfo";

	//寿险销售人员信息
	public static final String HANDLER_QUERY_INFO = "handleQueryInfo";

	//可管理的销售渠道范围
	public static final String CHANNEL_TYPE_LIST = "channelTypeList";

	//分公司代码
	public static final String COM_CODE = "comCode";
	
	//分公司名称
	public static final String COM_CODE_NME = "comCodeNme";
	
	
	
	
	



	

	
	
}
