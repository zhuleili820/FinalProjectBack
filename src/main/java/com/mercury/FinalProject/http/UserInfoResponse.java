package com.mercury.FinalProject.http;

import com.mercury.FinalProject.bean.UserProfile;

public class UserInfoResponse extends Response {

	private UserProfile userInfo;

	public UserInfoResponse(boolean success, UserProfile userInfo) {
		super(success);
		this.userInfo = userInfo;
	}

	public UserProfile getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserProfile userInfo) {
		this.userInfo = userInfo;
	}

}
