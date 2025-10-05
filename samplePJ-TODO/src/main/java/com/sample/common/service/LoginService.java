package com.sample.common.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.common.dao.entity.Login;
import com.sample.common.dao.entity.User;
import com.sample.common.dao.mapper.LoginMapper;
import com.sample.common.dao.mapper.UserMapper;

@Service
public class LoginService {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private LoginMapper loginMapper;
	
	//ユーザー名の重複チェック
	public boolean isUsernameTaken(String username) {
		return userMapper.findByUserName(username) != null;
		
	}

	public void register (User user) {
		userMapper.insertUser(user);
	};

	public Login login (String username) {
		return loginMapper.findByUserName(username);
	}
}