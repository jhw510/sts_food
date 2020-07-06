package com.hw.web.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

import javax.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hw.web.domains.UserDTO;
import com.hw.web.enums.Messenger;
import com.hw.web.services.UserService;
@RestController
@RequestMapping("/user")
@SessionAttributes({"session"})
public class UserController {
	@Autowired UserService userService;
	@Autowired UserDTO user;
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	/*
	 * @PostMapping("/{userid}") public String joinForm(@RequestBody) {
	 * logger.info("---------조인화면진입-------"); return "Join"; }
	 */
	
	@PostMapping("/join/form")
	public @ResponseBody Messenger join(@RequestBody UserDTO user) {

		System.out.println("넘어온 회원정보" + user.toString());
		return Messenger.SUCCESS;
	}

	@PostMapping("/login/form")
	public UserDTO login(HttpSession session,@RequestBody UserDTO user) {
		UserDTO returnUserDTO =userService.findByUseridAndPassword(user);
		session.setAttribute("session", returnUserDTO);
		return returnUserDTO;
	}
	@GetMapping("/userlist")
	public void list(Model model){
		model.addAttribute("users",userService.findAll());
	}
	

}
