package com.app.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.service.PlayerService;

@Controller 
@RequestMapping("/players")
public class PLayerHandler {
	
	
	@Autowired
	private PlayerService pService;
	
	@PostMapping("/add") 
	public String addPlayer(@RequestParam String abbr, 
			@RequestParam String fn,@RequestParam String ln,
			@RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate dob,
			@RequestParam double avg,@RequestParam int wickets,Model map)
	
	
	{
		System.out.println("in add player");
	return null;
	}
	
}
