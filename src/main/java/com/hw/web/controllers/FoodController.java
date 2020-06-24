package com.hw.web.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hw.web.HomeController;
import com.hw.web.domains.FoodDTO;

import com.hw.web.services.FoodService;


@Controller
@RequestMapping("/food")
public class FoodController {
	private static final Logger logger = LoggerFactory.getLogger(FoodController.class);
	
	
	
//	FoodService foodService;
//	
//	FoodDTO foodDTO;
//	
//	@GetMapping("")
//	public List<FoodDTO> list(){
//		return null;
//	}
}
