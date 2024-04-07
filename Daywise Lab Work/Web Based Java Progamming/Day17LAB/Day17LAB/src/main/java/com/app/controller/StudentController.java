package com.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResp;
import com.app.dto.StudentReqDTO;
import com.app.entities.Student;
import com.app.service.StudentService;



@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentService service;

public StudentController() {
	super();
}

@PostMapping
public ResponseEntity<?> addStudent(@RequestBody @Valid StudentReqDTO request) {
	System.out.println("in class of"+getClass());
	
//	try {
//		return new ResponseEntity<>(service.addStudent(request) ,HttpStatus.CREATED);
//	}
//	catch (RuntimeException e) {
//		// TODO: handle exception
//		return new ResponseEntity<>(new ApiResp(e.getMessage()),HttpStatus.INTERNAL_SERVER_ERROR);
//	}
	
	return new ResponseEntity<>(service.addStudent(request) ,HttpStatus.CREATED);
}
}
