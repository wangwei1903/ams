package com.tyzx.ams.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyzx.ams.bo.User;
import com.tyzx.ams.dao.UserMapper;
import com.tyzx.ams.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper dao;
	
	@Override
	public User selectUser(User user) {
		// TODO Auto-generated method stub
		return dao.selectUser(user);
	}

}
