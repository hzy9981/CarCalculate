package com.chinalife.sz.cc.user;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chinalife.sz.cc.model.user.UserInfoDTO;
import com.chinalife.sz.cc.user.service.UserInfoService;
import com.prs.framework.core.exception.BusinessException;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:biz/biz-context.xml",
		"classpath*:biz/remote-context.xml" })
public class UserServiceTest {
	@Resource
	private UserInfoService userInfoService;

	// @Test
	// public void test() {
	// UserInfoDTO dto = new UserInfoDTO();
	// dto.setUserCde("sutanwei");
	//
	// try {
	// userInfoService.addUserInfo(dto);
	// } catch (BusinessException e) {
	// e.printStackTrace();
	// }
	// }

	@Test
	public void testUserInfoQuery() throws BusinessException {
		UserInfoDTO dto = userInfoService.findUserInfoByUserCde("root");
		System.out.println(dto.getUserCde());
	}

}
