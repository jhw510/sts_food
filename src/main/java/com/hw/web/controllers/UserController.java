package com.hw.web.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hw.web.services.UserService;
@Controller
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired UserService userService;
	@GetMapping("/join/form")
	public String joinForm() {
		logger.info("---------����ȭ������-------");
		return "Join";
	}
	
//	@PostMapping("/{userid}")
//	public Messnger login(@PathVariable) {
//		return null;
//	}

}
