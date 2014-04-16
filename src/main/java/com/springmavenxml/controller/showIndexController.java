package com.springmavenxml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class showIndexController {

	
	@RequestMapping("/")
	public ModelAndView showMainPage(){
		
		System.out.println("cominggg in home page called by controoller");
		return new ModelAndView("home");
	}
	
}
