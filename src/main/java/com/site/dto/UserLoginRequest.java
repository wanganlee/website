package com.site.dto;

/**
 * 用户登录请求对象
 * 
 * @author al.wang
 * @date 2017年4月26日
 */
public class UserLoginRequest {

	private String userName;

	private String passWord;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	@Override
	public String toString() {
		return "UserLoginRequest [userName=" + userName + ", passWord=" + passWord + "]";
	}

}
