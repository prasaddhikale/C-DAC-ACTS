package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // mandatory Annotation of class level to Specify Spring bean class : For Client
			// Req. Handling Controller(=Handler)

public class TestController {

	public TestController() {
		System.out.println("In default ctor " + getClass());
		// TODO Auto-generated constructor stub
	}

	// add a request handling method to display msg to client
	@RequestMapping("/test1") // Equivalent to serivce method
	// Its a mandatory annotation --- which can intercept ANY http request
	// HandlingMapping bean: key=url_pattern(/test1)
	// value : FullyQualified cls Name+method name:
	// com.app.controller.TestController.testMe1
	public String testMe1() {
		System.out.println("In testme1");
		return "/display";	//LVN( Logical View Name ) to D.S. then D.S. send to ViewResolver
		//ViewResolver translate it in AVN(/WEB-INF/views/display.jsp) & send back to D.S
	}
}
