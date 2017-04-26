package com.site.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.site.dto.UserLoginRequest;
import com.site.dto.UserLoginResponse;
import com.site.service.LoginService;

/**
 * 登录业务接口实现类
 * 
 * @author al.wang
 * @date 2017年4月26日
 */
@Service("login")
public class LoginServiceImpl implements LoginService {

	private static final Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);

	/**
	 * 用户登录
	 */
	@Override
	public UserLoginResponse login(UserLoginRequest req) {
		log.info("用户开始登录了...");
		UserLoginResponse resp = new UserLoginResponse();
		resp.setSuccess(true);
		resp.setLoginInfo("用户登录成功！");
		return resp;
	}

}
