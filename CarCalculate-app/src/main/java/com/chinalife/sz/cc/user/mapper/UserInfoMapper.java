package com.chinalife.sz.cc.user.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.chinalife.sz.cc.model.user.PermissionModel;
import com.chinalife.sz.cc.model.user.RoleModel;
import com.chinalife.sz.cc.model.user.UserInfoDTO;
import com.prs.framework.core.biz.mapper.RepositoryMapper;

@RepositoryMapper
public interface UserInfoMapper {

	//新增用户信息
	public int addUserInfo(UserInfoDTO dto);
	
	//新增角色信息
	public int addRole(RoleModel roleModel);

	//按用户代码查找用户信息
    public UserInfoDTO findUserInfoByUserCde(@Param("userCde") String userCde);
    
    //修改用户信息
    public int updateUserInfo(UserInfoDTO dto);
    
    //删除用户信息(仅更新用户状态)
    public int delUserInfoByUserCde(@Param("userCde") String userCde,@Param("updMan") String updMan);

    //根据用户名查找用户信息
	public  UserInfoDTO userNameLogin(@Param("userCde") String userName,@Param("password") String password);

	//修改密码
	public int updatePassword(@Param("userCde") String userCode,
			@Param("password") String md5oldPassword,@Param("newpassword")  String md5newPassword);

	/**
	 * 查找用户信息
	 * @param userCde
	 * @param userNme
	 * @param createBegin
	 * @param createEnd
	 * @param dept
	 * @param roleCodes 
	 * @param channelTypeList 
	 * @param comCode 
	 * @param handlerCde
	 * @param handlerNme
	 * @return
	 */
	public List<UserInfoDTO> findUserInfo(@Param("userCde")String userCde,@Param("userNme") String userNme,
			@Param("createBegin")String createBegin, @Param("createEnd")String createEnd, @Param("dept")String dept,
			@Param("handler1Cde")String handler1Cde, @Param("handler1Nme")String handler1Nme,@Param("roleCodes")String[] roleCodes, @Param("channelTypeList")String[] channelTypeList,@Param("comCode") String comCode, @Param("startIndex")int startIndex,@Param("pageSize")int pageSize);
	
	/**
	 * 查找分页数
	 * @param userCde
	 * @param userNme
	 * @param createBegin
	 * @param createEnd
	 * @param dept
	 * @param roleCodes 
	 * @param channelTypeList 
	 * @param comCode 
	 * @param handlerCde
	 * @param handlerNme
	 * @return
	 */
	public int pageCounts(@Param("userCde")String userCde,@Param("userNme") String userNme,
			@Param("createBegin")String createBegin, @Param("createEnd")String createEnd, @Param("dept")String dept,
			@Param("handler1Cde")String handler1Cde, @Param("handler1Nme")String handler1Nme, @Param("roleCodes")String[] roleCodes, @Param("channelTypeList")String[] channelTypeList, @Param("comCode")String comCode);

	/**
	 * 重置密码
	 * @param userCode
	 * @param md5newPassword
	 * @return
	 */
	public int resetPassword(@Param("userCde")String userCode, @Param("newpassword")String md5newPassword);

	//获取用户信息
	public UserInfoDTO doUser(@Param("userCde")String userCode);

	//获取用户角色信息
	public List<RoleModel> doRole(@Param("userCde")String userCode);
	
	//获取用户权限
	public List<PermissionModel> doPermissionModel(@Param("roleCode")String roleCode);
    
    
    
    
    
}
