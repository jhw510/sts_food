package com.hw.web.controllers;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hw.web.domains.UserDTO;
import com.hw.web.enums.Messenger;
import com.hw.web.services.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired UserService userService;
	@PostMapping("/{userid}")
	public String joinForm() {
		logger.info("---------조인화면진입-------");
		return "Join";
	}
	
	@PostMapping("/join/form")
	public Messenger login(@RequestBody UserDTO user) {
		System.out.println("넘어온 회원정보" + user.toString());
		return Messenger.SUCCESS;
	}

}
