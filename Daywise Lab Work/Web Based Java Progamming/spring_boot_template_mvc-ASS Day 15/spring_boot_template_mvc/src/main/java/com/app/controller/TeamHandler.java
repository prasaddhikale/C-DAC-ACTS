package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.service.TeamService;

@Controller 


//@RequestMapping("/players")
public class TeamHandler {

	@Autowired
	TeamService tService;
	
	
	public TeamHandler() {
		System.out.println("In team handler controller ");
	}

	@GetMapping("/")
	public String getTeamList(Model map) {
		
		System.out.println("in controller getTeamList method");
		map.addAttribute("teamList",tService.getTeamsAbbreviations() );
		return "/teams/add_player_form";
	}
	
}
