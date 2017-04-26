package com.site.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.site.dto.UserLoginRequest;
import com.site.dto.UserLoginResponse;
import com.site.service.LoginService;

/**
 * 登录控制器
 * 
 * @author al.wang
 * @date 2017年4月26日
 */
@Controller
@RequestMapping("/login/")
public class LoginController {

	@Autowired
	private LoginService loginService;

	/**
	 * 用户登录
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "userLogin", method = RequestMethod.POST)
	public UserLoginResponse login(UserLoginRequest req) {
		UserLoginResponse resp = loginService.login(req);
		return resp;
	}
}
