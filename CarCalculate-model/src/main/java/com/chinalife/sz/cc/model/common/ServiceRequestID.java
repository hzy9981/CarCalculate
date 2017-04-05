package com.chinalife.sz.cc.model.common;

/**
 * <p>Title: ServiceRequestID</p>
 * <p>Description: TODO </p>
 * <p>Company: 紫川软件有限公司</p>
 *
 * @author sutanwei@purple-river.com
 * @version 1.0
 * @date 2016年8月16日
 */
public class ServiceRequestID {


    // 用户登录
    public static final String USER_LOGIN = "user.login";
    //新增用户
    public static final String USER_ADD = "user.add";
    //修改密码
    public static final String PASSWORD_EDIT = "password_edit";
    //用户查找
    public static final String USERINFO_FIND = "userInfo_find";
    //根据用户Id查找用户信息
    public static final String USERINFO_FIND_BY_USERCDE = "userInfo_findByUserCde";
    //更新用户信息
    public static final String USERINFO_UPDATE = "user.update";
    public static final String MENU_FIND = "menu.find";
    //密码重置
    public static final String PASSWORD_RESET = "password_reset";
    //shiro 用户登录
    public static final String LOGIN = "doLogin";

    //	查找订单
    public static final String FIND_ORDERS = "findOrders";
    //	保存商业险套餐
    public static final String SAVE_COMBOS = "save_combos";
    //	查找商业险套餐
    public static final String FIND_COMBOS = "find_combos";
    //	更新商业险套餐
    public static final String UPDATE_COMBOS = "update_combos";
    //	删除商业险套餐
    public static final String DELETE_COMBOS = "delete_combos";

  //获取角色权限
  	public static final String ROLE = "getRoles";

	


}
