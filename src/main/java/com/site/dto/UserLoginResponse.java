package com.site.dto;

/**
 * 用户登录响应对象
 * 
 * @author al.wang
 * @date 2017年4月26日
 */
public class UserLoginResponse {

	private boolean isSuccess;

	private String loginInfo;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getLoginInfo() {
		return loginInfo;
	}

	public void setLoginInfo(String loginInfo) {
		this.loginInfo = loginInfo;
	}

	@Override
	public String toString() {
		return "UserLoginResponse [isSuccess=" + isSuccess + ", loginInfo=" + loginInfo + "]";
	}

}
