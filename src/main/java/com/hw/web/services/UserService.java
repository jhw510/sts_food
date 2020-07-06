package com.hw.web.services;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.hw.web.domains.UserDTO;

@Component
public interface UserService {
	public void save();
	 public void update();
	 public void findOne();
	 public List<UserDTO> findAll();	
	 public void count();
	 public void delete();
	 public UserDTO findByUseridAndPassword(UserDTO user);
	 
	 public void findByEmailOrUserId(String email, String userId);
	 public void findByCreatedAtBetween(Date fromDate, Date toDate);
	 public void findByAgeGraterThanEqual(int age);
	 public void findByNameLike(String name);
	 public void findByAccessCodeIsNull();
	 public void findByGenerLike(String gender);
	 public void findByEmailOrderByNameAsc(String email);
	 
}
