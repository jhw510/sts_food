package com.hw.web.domains;

import org.springframework.stereotype.Component;


@Component
public class UserDTO {
	
	private String userid,userName,password,addr;
	public String getUserId() {
		return userid;
	}

	public void setUserId(String userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswd() {
		return password;
	}

	public void setPasswd(String password) {
		this.password = password;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	@Override
	public String toString() {
		return "UserDTO [userid=" + userid + ", userName=" + userName + ", password=" + password + ", addr=" + addr
				+ "]";
	}
	

}
