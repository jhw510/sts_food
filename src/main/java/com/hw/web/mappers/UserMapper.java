package com.hw.web.mappers;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.hw.web.domains.UserDTO;

@Repository
public interface UserMapper {
	public void insertUser(UserDTO user);
	public int existId(String userid);
	public int countUsers();
	public void createDB(HashMap<String, String> paramMap);
	public void createUser(HashMap<String, String> paramMap);
	public void dropUser(HashMap<String, String> paramMap);
	public void truncateUser(HashMap<String, String> paramMap);
	public UserDTO selectByUseridAndPassword(UserDTO user);

		
	
}
