package com.chinalife.sz.cc.user.action;

import com.prs.framework.core.common.model.ServiceRequest;
import com.prs.framework.core.common.model.ServiceResponse;
import com.prs.framework.core.exception.BusinessServiceException;

public interface UserInfoAction {
	//新增用户信息
	ServiceResponse addUserInfo (ServiceRequest serviceRequest) throws BusinessServiceException;
	//查找用户信息
	ServiceResponse findUserInfo(ServiceRequest serviceRequest) throws BusinessServiceException;
    //修改用户信息
	ServiceResponse updateUserInfo(ServiceRequest serviceRequest) throws BusinessServiceException;
    //删除用户信息	
	ServiceResponse delUserInfoByUserCde(ServiceRequest serviceRequest) throws BusinessServiceException;
	//用户登录
//	ServiceResponse userName(ServiceRequest serviceRequest) throws BusinessServiceException;
	//密码修改
	ServiceResponse updatePassword(ServiceRequest serviceRequest) throws BusinessServiceException;
	//密码重置
		ServiceResponse resetPassword(ServiceRequest serviceRequest) throws BusinessServiceException;
	//按用户代码查找用户信息
	ServiceResponse findUserInfoByUserCde(ServiceRequest serviceRequest)
			throws BusinessServiceException;
	//基于shiro的用户登录
	ServiceResponse doLogin(ServiceRequest serviceRequest) throws BusinessServiceException;
	
	//获取角色权限信息
	ServiceResponse getRoles(ServiceRequest serviceRequest)throws BusinessServiceException;
}
