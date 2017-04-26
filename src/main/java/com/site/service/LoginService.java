package com.site.service;

import com.site.dto.UserLoginRequest;
import com.site.dto.UserLoginResponse;

/**
 * 登录业务接口
 * 
 * @author al.wang
 * @date 2017年4月26日
 */
public interface LoginService {

	/**
	 * 用户登录
	 * 
	 * @param req
	 * @return
	 */
	UserLoginResponse login(UserLoginRequest req);

}
