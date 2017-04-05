package com.chinalife.sz.carcalculate.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJacksonJsonView;

import com.chinalife.sz.carcalculate.security.UsernamePasswordToken;
import com.chinalife.sz.cc.model.common.Constants;
import com.chinalife.sz.cc.model.common.ResponseCode;
import com.chinalife.sz.cc.model.common.ServiceRequestID;
import com.chinalife.sz.cc.model.menu.MenuDTO;
import com.chinalife.sz.cc.model.user.UserInfoDTO;
import com.lowagie.tools.concat_pdf;
import com.prs.framework.core.biz.action.support.annotation.ActionHandler;
import com.prs.framework.core.exception.BusinessServiceException;
import com.prs.framework.core.exception.WebControllerException;
import com.prs.framework.core.web.controller.util.WebUtils;
import com.sun.jndi.toolkit.ctx.StringHeadTail;

/**
 * 
 * <p>Title: MainPageDispatcherController</p>
 * <p>Description: controller </p>
 * <p>Company: 紫川软件有限公司</p>
 * @author sutanwei@purple-river.com
 * @date 2016年1月16日
 * @version 1.0
 */
@Controller
public class UserManagerController {

	/**
	 * 日志管理
	 */
	private static Log logger = LogFactory.getLog(UserManagerController.class);
	
	/**
	 * @Title: 登陆页面
	 * @param request
	 * @param response
	 * @author MarsCheng
	 * @return
	 * @throws WebControllerException
	 */
	/*@RequestMapping(value="user.login.action", method=RequestMethod.POST)
	public  ModelAndView userLogin (HttpServletRequest request, HttpServletResponse response) throws WebControllerException {
		Map<String, Object> model = new HashMap<String, Object>();
		String userName = request.getParameter(Constants.USER_NAME);
		String passWord = request.getParameter(Constants.PASS_WORD);
		String verifycode = request.getParameter("verifycode");
		logger.info("===============" + verifycode);
		try {
			HttpSession session = request.getSession();
			String validateC = (String) session.getAttribute("validateCode");
			logger.info(verifycode + "=============" + validateC);
			if(StringUtils.isNotEmpty(userName) && StringUtils.isNotEmpty(verifycode) 
					&& validateC.equals(verifycode.toUpperCase())) {
				model.put(Constants.USER_NAME, userName);
				model.put(Constants.PASS_WORD, passWord);
				model = WebUtils.getResponseModel(model, ServiceRequestID.USER_LOGIN);	// 登陆返回结果
				int status = (Integer)model.get(Constants.STATUS);
//				request.getSession().setAttribute(Constants.STATUS,status);
				if(status == 0){					// 登陆成功
					UserInfoDTO dto = (UserInfoDTO)model.get(Constants.PARAM_DTO);	
					//菜单设置
					MenuDTO dto2;
					
					model2 = WebUtils.getResponseModel(model2, ServiceRequestID.MENU_FIND);
					if(dto.getUserType()=='1'){
						dto2 = (MenuDTO)model2.get(Constants.INMENU_TEMPLATE);
					}
					else{
						dto2 = (MenuDTO)model2.get(Constants.OUTMENU_TEMPLATE);
					}
					String template = dto2.getTemplate();
					String pathString = this.getClass().getClassLoader().getResource("/").getPath();
//					System.out.println(pathString);
					String new_pathString=pathString.replaceAll("target/classes/", "src/main/webapp/json/menuList.json");
//					System.out.println(new_pathString);
 
					//获取到前端文件的地址
					String webPath = System.getProperty("webapp.root");
					String path = webPath +"json\\menuList.json";
					System.out.println(path);
					File menu = new File(path);
					if(!menu.exists()){
						menu.createNewFile();
					}
					FileWriter fw = new FileWriter(menu);
					fw.write(template);
					fw.close();
					
					//登陆查询到的信息加入cookie
					Cookie userNme = new Cookie("userName", URLEncoder.encode(dto.getUserNme(), "utf-8"));
					Cookie userCd = new Cookie("userCode",URLEncoder.encode(dto.getUserCde(), "utf-8"));
					response.addCookie(userNme);
					response.addCookie(userCd);
					
					char usertype =  dto.getUserType();
					String userType = String.valueOf(usertype);
					session.setAttribute("login", "success");
					session.setAttribute("userType",userType);
					Cookie userTypeCookie = new Cookie("userType", userType);
					response.addCookie(userTypeCookie);
					//设置session过期时间
					session.setMaxInactiveInterval(3600);
					System.out.println("========登陸成功=========");
//					return new ModelAndView("/index");
//					response.sendRedirect(response.encodeURL("main.action"));
				}
				else {
					//清空cookie
				Cookie[] cookies=request.getCookies();
				if(cookies!=null){
					for(int i=0;i<cookies.length;i++){
						Cookie cookie=new Cookie(cookies[i].getName(), null);
						cookie.setMaxAge(0);
						response.addCookie(cookie);
					}
				}
				}
			} else {								// 验证失败
				logger.info("===============VALIDATE_CODE == " + verifycode + "=============" + validateC);
				model.put(Constants.STATUS, 5);
//				response.sendRedirect(response.encodeURL("login.action"));
			}
		} catch (Exception e) {
//			System.out.println(e);	
			throw new WebControllerException();
 
		}
		return new ModelAndView(new MappingJacksonJsonView(),model);
		
	}	*/
	
	/**
	 * shiro 登录
	 * @param request
	 * @return
	 */
	@RequestMapping(value="doLogin",method=RequestMethod.POST)
	public ModelAndView doLogin(HttpServletRequest request,HttpServletResponse response){
		Map<String, Object> model = new HashMap<String, Object>();
		String userCode = request.getParameter(Constants.USER_NAME);
		String pwd = request.getParameter(Constants.PASS_WORD);
		String captcha = request.getParameter(Constants.VALIDATE_CODE);
		UsernamePasswordToken token = new UsernamePasswordToken(userCode, pwd, captcha); 
		Subject currentUser = SecurityUtils.getSubject(); 
		try {
			currentUser.login(token); 
			model.put(Constants.STATUS,0);
			model.put(Constants.LOGIN_MESSAGE, "登陆成功");
			Session session = currentUser.getSession();
			if(currentUser.hasRole("000")){
				session.setAttribute(Constants.ROLE_CODE, "000");
				Cookie roleCookie = new Cookie(Constants.ROLE_CODE, "000");
				response.addCookie(roleCookie);			
			}
			else if(currentUser.hasRole("001")){
				session.setAttribute(Constants.ROLE_CODE, "001");
				Cookie roleCookie = new Cookie(Constants.ROLE_CODE, "001");
				response.addCookie(roleCookie);
				Cookie comCookie = new Cookie(Constants.COM_CODE,(String)session.getAttribute(Constants.COM_CODE) );
				Cookie comNmeCookie = new Cookie(Constants.COM_CODE_NME, URLEncoder.encode((String)session.getAttribute(Constants.COM_CODE_NME),"utf-8"));
				response.addCookie(comCookie);
				response.addCookie(comNmeCookie);
			}
			else if(currentUser.hasRole("002")){
				session.setAttribute(Constants.ROLE_CODE, "002");
				Cookie roleCookie = new Cookie(Constants.ROLE_CODE, "002");
				response.addCookie(roleCookie);
				
			}
			else if(currentUser.hasRole("003")){
				session.setAttribute(Constants.ROLE_CODE, "003");
				Cookie roleCookie = new Cookie(Constants.ROLE_CODE, "003");
				response.addCookie(roleCookie);
			}
			
			String userName = (String)session.getAttribute(Constants.CURRENT_USER);
			Cookie userNamecCookie = new Cookie(Constants.USER_NAME, URLEncoder.encode(userName,"utf-8"));
			Cookie userCodeCookie = new Cookie(Constants.USER_CODE, URLEncoder.encode(userCode,"utf-8"));
			response.addCookie(userCodeCookie);
			response.addCookie(userNamecCookie);
		} catch (IncorrectCredentialsException ex) { //密码错误
			model.put(Constants.STATUS, 1); 
			model.put(Constants.LOGIN_MESSAGE, "密码错误");
		}catch (UnknownAccountException ex) { //账号错误
			model.put(Constants.STATUS, 2);
			model.put(Constants.LOGIN_MESSAGE, "账号错误");
		}catch (AuthenticationException e) { //其它错误
			model.put(Constants.STATUS, 3);
			model.put(Constants.LOGIN_MESSAGE, e.getMessage());
		} catch (UnsupportedEncodingException e) {
			model.put(Constants.STATUS, 4);
			model.put(Constants.LOGIN_MESSAGE, "系统异常");
		}
		
		return new ModelAndView(new MappingJacksonJsonView(),model);
	}
	
	
	/**
	 * 新增用户
	 * @param userInfoDTO
	 * @author MarsCheng
	 * @return
	 * @throws WebControllerException
	 */
	@RequestMapping(value="user.add.action", method=RequestMethod.POST)
	public @ResponseBody ModelAndView userAdd(UserInfoDTO userInfoDTO) throws WebControllerException {
		Map<String, Object> model = new HashMap<String, Object>();
		Subject subject = SecurityUtils.getSubject();
		try{
		Session session = subject.getSession();
		String role = (String) session.getAttribute(Constants.ROLE_CODE);
		if(role.equals("001")||role.equals("002")){
			String comCode = (String)session.getAttribute(Constants.COM_CODE);
			String comCodeNme = (String)session.getAttribute(Constants.COM_CODE_NME);
			userInfoDTO.setComcode(comCode);
			userInfoDTO.setComcodeNme(comCodeNme);
		}
		model.put(Constants.ADD_USER, userInfoDTO);
		//新增用户返回结果
		model=WebUtils.getResponseModel(model, ServiceRequestID.USER_ADD);
		
		}
		catch (Exception e) {
//			System.out.println(e);
			model.clear();
			model.put(ResponseCode.RESPONSE_CODE, ResponseCode.ADD_FAILURE);
		}
		return new ModelAndView(new MappingJacksonJsonView(),model);	
	
	}
	
	/**
	 * 检测用户是否存在
	 * @param request
	 * @return
	 */
	@RequestMapping(value="user.check.action", method=RequestMethod.POST)
	public @ResponseBody ModelAndView userCheck(HttpServletRequest request){
		 Map<String, Object> model = new HashMap<String, Object>();
		 String userCde = request.getParameter(Constants.USER_CODE);
		 model.put(Constants.USER_CODE, userCde);
		 
		 try { 
			model = WebUtils.getResponseModel(model, ServiceRequestID.USERINFO_FIND_BY_USERCDE);
			UserInfoDTO userInfoDTO = (UserInfoDTO) model.get(Constants.PARAM_DTO);
			if(userInfoDTO !=null){
				model.clear();
				model.put(Constants.CHECK_INFO,"true");
			}else{
				model.clear();
				model.put(Constants.CHECK_INFO, "false");
			}
		} catch (WebControllerException e) {
			
			e.printStackTrace();
		}
		 
		 return new ModelAndView(new MappingJacksonJsonView(),model);
		
	}
	
	/**
	 * 修改密码
	 * @param request
	 * @param response
	 * @author MarsCheng
	 * @return
	 * @throws WebControllerException
	 */
	@RequestMapping(value="passWord.edit.action", method=RequestMethod.POST)
	public ModelAndView passWordEdit(HttpServletRequest request, HttpServletResponse response) throws WebControllerException{
		Map<String, Object> model = new HashMap<String, Object>();
		String userCode = request.getParameter(Constants.USER_CODE);
		String newPassword = request.getParameter(Constants.NEW_PASSWORD);
		String oldPassword = request.getParameter(Constants.OLD_PASSWORD);
		
		try {
		model.put(Constants.NEW_PASSWORD, newPassword);
		model.put(Constants.OLD_PASSWORD,oldPassword );
		model.put(Constants.USER_CODE, userCode);
		
		model=WebUtils.getResponseModel(model, ServiceRequestID.PASSWORD_EDIT);
		
		
		} catch (Exception e) {
			model.clear();
			model.put(ResponseCode.RESPONSE_CODE, ResponseCode.UPDATE_FAILURE);
			throw new WebControllerException();
		}
		
//		System.out.println("====new==="+newPassword+"====old===="+oldPassword);
		return new ModelAndView(new MappingJacksonJsonView(),model);
	}
	
	/**
	 * 重置密码
	 * @param request
	 * @param response
	 * @author MarsCheng
	 * @return
	 * @throws WebControllerException
	 */
	@RequestMapping(value="passWord.reset.action", method=RequestMethod.POST)
	public ModelAndView passWordReset(HttpServletRequest request, HttpServletResponse response) throws WebControllerException{
		Map<String, Object> model = new HashMap<String, Object>();
		String userCode = request.getParameter(Constants.USER_CODE);
		String newPassword = request.getParameter(Constants.NEW_PASSWORD);
		
		try {
		model.put(Constants.NEW_PASSWORD, newPassword);
		model.put(Constants.USER_CODE, userCode);
		
		model=WebUtils.getResponseModel(model, ServiceRequestID.PASSWORD_RESET);
		
		
		} catch (Exception e) {
			model.clear();
			model.put(ResponseCode.RESPONSE_CODE, ResponseCode.UPDATE_FAILURE);
			throw new WebControllerException();
		}
		
//		System.out.println("====new==="+newPassword+"====old===="+oldPassword);
		return new ModelAndView(new MappingJacksonJsonView(),model);
	}
	
	/**
	 * 用户信息查询
	 * @author MarsCheng
	 * @param request
	 * @param response
	 * @return
	 * @throws WebControllerException
	 */
	@RequestMapping(value="userInfo.find.action", method=RequestMethod.POST)
	public ModelAndView userInfoFind(HttpServletRequest request, HttpServletResponse response) throws WebControllerException{
		Map<String, Object> model = new HashMap<String, Object>();
		String userCode = request.getParameter(Constants.USER_CODE);
		String userName = request.getParameter(Constants.USER_NAME);
		String createBegin = request.getParameter(Constants.CREATE_BEGIN);
		String createEnd = request.getParameter(Constants.CREATE_END);
		String dept = request.getParameter(Constants.DEPT);
		String handler1Cde = request.getParameter(Constants.HANDLER1CDE);
		String handler1Nme = request.getParameter(Constants.HANDLER1NME);
		String roleCode = request.getParameter(Constants.ROLE_CODE);
		int page = Integer.parseInt(request.getParameter(Constants.CURRENT_PAGE));
		
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		String role = (String) session.getAttribute(Constants.ROLE_CODE);
		if(role.equals("002")){
			String[] channelTypeLists=(String[])session.getAttribute(Constants.CHANNEL_TYPE_LIST);
			model.put(Constants.CHANNEL_TYPE_LIST, channelTypeLists);
			model.put(Constants.COM_CODE, (String)session.getAttribute(Constants.COM_CODE));
		}
		if(role.equals("001")){
			model.put(Constants.COM_CODE, (String)session.getAttribute(Constants.COM_CODE));
		}
		
		model.put(Constants.USER_CODE, userCode);
		model.put(Constants.USER_NAME, userName);
		model.put(Constants.CREATE_BEGIN, createBegin);
		model.put(Constants.CREATE_END, createEnd);
		model.put(Constants.DEPT,dept);
		model.put(Constants.HANDLER1CDE,handler1Cde );
		model.put(Constants.HANDLER1NME,handler1Nme);
		model.put(Constants.ROLE_CODE, roleCode);
		model.put(Constants.CURRENT_PAGE, page);
		model=WebUtils.getResponseModel(model, ServiceRequestID.USERINFO_FIND);
		
		
		return new ModelAndView(new MappingJacksonJsonView(),model);
	}
	
	/**
	 * 根据用户Id查找用户信息
	 * @param request
	 * @param response
	 * @return
	 * @throws WebControllerException
	 */
	@RequestMapping(value="userInfo.findByUsercde.action", method=RequestMethod.POST)
	public ModelAndView userInfoFindByUserCde(HttpServletRequest request, HttpServletResponse response) throws WebControllerException{
		Map<String, Object> model = new HashMap<String, Object>();
		String userCode = request.getParameter(Constants.USER_CODE);
		model.put(Constants.USER_CODE, userCode);
		model=WebUtils.getResponseModel(model, ServiceRequestID.USERINFO_FIND_BY_USERCDE);
		
		return new ModelAndView(new MappingJacksonJsonView(),model);
		
		
	}
	
	/**
	 * 更新用户信息
	 * @param dto
	 * @return
	 * @throws WebControllerException
	 */
	@RequestMapping(value="userInfo.update.action", method=RequestMethod.POST)
	public ModelAndView updateUserInfo(UserInfoDTO dto) throws WebControllerException{
		Map<String, Object> model = new HashMap<String, Object>();
		try{
			model.put(Constants.UPDATE_USER, dto);
			//更新用户返回结果
			model=WebUtils.getResponseModel(model, ServiceRequestID.USERINFO_UPDATE);
			
			}catch (Exception e) {
//				System.out.println(e);
				model.clear();
				model.put(ResponseCode.RESPONSE_CODE, ResponseCode.UPDATE_FAILURE);
				throw new WebControllerException();
			}
			return new ModelAndView(new MappingJacksonJsonView(),model);
		
		
	}
	
	
	@RequestMapping(value="session.update.action", method=RequestMethod.POST)
	public ModelAndView deleteSession(HttpServletRequest request, HttpServletResponse response) throws WebControllerException{
		Map<String, Object> model = new HashMap<String, Object>();
		try{
			Subject subject = SecurityUtils.getSubject();
			subject.logout();
			logger.info("=========session清空成功===========");
			model.put(Constants.MESSAGE, "success");
			}catch (Exception e) {
			model.put(Constants.MESSAGE, "fail");	
			}
			return new ModelAndView(new MappingJacksonJsonView(),model);
		
		
	}
	
	@RequestMapping(value="getChannelType",method=RequestMethod.POST)
	public ModelAndView getChannelType(HttpServletRequest request){
		Map<String, Object> model = new HashMap<String, Object>();
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		String role = (String) session.getAttribute(Constants.ROLE_CODE);
		//获取配置渠道文件
		Properties properties = new Properties();
		String filePath = UserManagerController.class.getClassLoader().getResource("/web/ChannelType.properties").getPath();
		try {
			FileInputStream in = new FileInputStream(filePath);
			
			properties.load(in);
			if(role.equals("002")){
				String[] channelTypeList = (String[]) session.getAttribute(Constants.CHANNEL_TYPE_LIST);
				for(String channelType : channelTypeList){
					String key = properties.getProperty(channelType);
					String channelTypeNme = key.split(":")[1];
					model.put(key, channelTypeNme);
				}
			}else{
				Iterator<String> iterator = properties.stringPropertyNames().iterator();
				while(iterator.hasNext()){
					String key = iterator.next();
					String channelType = properties.getProperty(key);
					String channelTypeNme = channelType.split(":")[1];
					model.put(channelType, channelTypeNme);
				}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		return new ModelAndView(new MappingJacksonJsonView(),model);
	}
	

	
}
