package com.hw.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@GetMapping("/")
	public String home() {
		logger.info("홈컨트롤러 진입");
	
		return "main/Home.tiles";
	}
	@GetMapping("/user/home/join")
	public String userJoin() {
		logger.info("회원가입 진입");
		return "user/joinForm.jsp";
	}
	
}
