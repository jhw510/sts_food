package com.hw.web.mappers;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Repository;

import com.hw.web.domains.UserDTO;

@Repository
public interface TxMapper {
	@Insert("insert into users (userid, password) "
			+ "values #{userid}, #{password}")
	public void insertUser(UserDTO user);    //일반유저를 한꺼번에 여러명 집어넣는것 
}
