package com.hw.web.services;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hw.web.controllers.UserController;
import com.hw.web.domains.UserDTO;
import com.hw.web.mappers.UserMapper;

@Service
public class UserServiceImpl implements UserService{
	private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired UserMapper userMapper;
	@Autowired UserDTO user;
	/* (non-Javadoc)
	 * @see kr.co.bitcamp.services.PersonService#save()
	 */
	
	public UserDTO findByUseridAndPassword(UserDTO param) {
		logger.info(param.toString());
		return userMapper.selectByUseridAndPassword(param);
	}
	@Override
	public void save() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findOne() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public List<UserDTO> findAll() {
		return userMapper.selectAll();
		// TODO Auto-generated method stub
		
	}
	@Override
	public void count() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByEmailOrUserId(String email, String userId) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByCreatedAtBetween(Date fromDate, Date toDate) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByAgeGraterThanEqual(int age) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByNameLike(String name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByAccessCodeIsNull() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByGenerLike(String gender) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void findByEmailOrderByNameAsc(String email) {
		// TODO Auto-generated method stub
		
	}

	
	
}
