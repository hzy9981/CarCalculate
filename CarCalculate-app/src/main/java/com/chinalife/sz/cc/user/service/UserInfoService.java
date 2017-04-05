package com.chinalife.sz.cc.user.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.chinalife.sz.cc.model.user.PermissionModel;
import com.chinalife.sz.cc.model.user.RoleModel;
import com.chinalife.sz.cc.model.user.UserInfoDTO;
import com.prs.framework.core.exception.BusinessException;
import com.prs.framework.core.exception.BusinessServiceException;

/**
 * 
 * <p>Title: AccidentFormService</p>
 * <p>Description: 车险报价系统 </p>
 * <p>Company: 中国人寿财产保险股份有限公司深圳市分公司</p>
 * @author liangjihong@sz.chinalife-p.com.cn
 * @date 2016年8月1日
 * @version 1.0
 */

public interface UserInfoService {
	
			//新增用户信息
		public int addUserInfo(UserInfoDTO dto) throws BusinessException;
		
		//新增角色
		public int addRole(RoleModel roleModel);

		//查找用户信息
	    public List<UserInfoDTO> findUserInfo(String userCde, String userNme, String createBegin, String createEnd, String dept, String handler1Cde, String handler1Nme, String[] roleCodes, String[] channelTypeList, String comCode, int startIndex, int pageSize) throws BusinessException;
	    
	    //修改用户信息
	    public int updateUserInfo(UserInfoDTO dto) throws BusinessException;
	    
	    //用户信息失效
	    public int delUserInfoByUserCde(String userCde,String updMan) throws BusinessException;
	    
	    // 用户登录
//	    public Map<String, Object> userLogin(String userName, String password) throws BusinessServiceException;

	    //修改密码
		public int updatePassword(String userCode,
				String md5oldPassword, String md5newPassword);
		//查找分页数
		public int pageCounts(String userCde, String userNme, String createBegin, String createEnd, String dept, String handler1Cde, String handler1Nme, String[] roleCodes, String[] channelTypeList, String comCode) throws BusinessException;

		//按用户编码查找用户信息
		public UserInfoDTO findUserInfoByUserCde(String userCde);

		/**
		 * 重置密码
		 * @param userCode
		 * @param md5newPassword
		 */
		public int resetPassword(String userCode, String md5newPassword);
		
		//获取用户信息
		public UserInfoDTO doUser(String userCode);
		
		//获取用户角色信息
		public List<RoleModel> doRole(String userCode);
		
		//获取角色权限
		public List<PermissionModel> doPermissionModel(String userCode);

}
