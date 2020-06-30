package com.hw.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * Handles requests for the application home page.
 */
@Controller
@SessionAttributes({"context","css","javascript","imge"})
public class HomeController {
	@Autowired HttpSession session;
	@Autowired HttpServletRequest request;
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@GetMapping("/")
	public String home(HttpSession session,HttpServletRequest request) {
		session.setAttribute("context", request.getContextPath());
		session.setAttribute("javascript", request.getContextPath()+"/resources/js");
		logger.info("홈컨트롤러 진입");
	
		return "main/Home.tiles";
	}
	
//	@PostMapping("/user/home/join")
//	public String userJoin() {
//		logger.info("회원가입 진입");
//		return "user/joinForm.jsp";
//	}
	@GetMapping("/location/{dir}/{page}")
	public String move(@PathVariable("dir") String dir,@PathVariable("page") String page) {
		return String.format("%s/%s.jsp",dir,page);
	}
	
}
