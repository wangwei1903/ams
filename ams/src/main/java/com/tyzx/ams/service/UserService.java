package com.tyzx.ams.service;

import com.tyzx.ams.bo.User;

public interface UserService {

	//登录验证
	public User selectUser(User user);
}
