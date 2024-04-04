package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	public HomeController() {
	System.out.println("in home ");
		// TODO Auto-generated constructor stub
	}
	@RequestMapping("/")
	public String myHome() {
		System.out.println("in method");
		return "/index";
	}
}
