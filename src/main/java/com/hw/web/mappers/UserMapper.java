package com.hw.web.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hw.web.domains.UserDTO;

@Repository
public interface UserMapper {
	public void insertUser(UserDTO user);
	public int count ();
	public UserDTO selectUser(String seq);
	  public List<UserDTO> selectAll();
}
