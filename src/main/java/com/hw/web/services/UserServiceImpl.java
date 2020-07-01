package com.hw.web.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hw.web.mappers.UserMapper;

import com.hw.web.controllers.UserController;
import com.hw.web.domains.UserDTO;

@Service
public class UserServiceImpl implements UserService{
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired UserMapper userMapper;
	
	public UserDTO findUserForAccess(UserDTO user) {
		logger.info(user.toString());
		return userMapper.selectUserByIdPw(user);
	}

	
}
