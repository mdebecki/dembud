package com.dembud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/*
 * author: Crunchify.com
 * 
 */

@Controller
public class WelcomeController {

	@RequestMapping("/welcome")
	public String helloWorld1() {

		return "loginPage";
	}
}