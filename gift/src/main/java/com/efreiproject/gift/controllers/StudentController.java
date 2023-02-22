package com.efreiproject.gift.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.model.StudentDetailed;
import com.efreiproject.gift.services.StudentServices;

@RestController
public class StudentController {
	
	private StudentServices studentService;
	
	public StudentController(StudentServices studentService) {
		this.studentService = studentService;
	}
	
	@GetMapping(path="/students")
	public List<StudentDetailed> getAllStudents() {
		return studentService.getStudents();
	}
	
	@GetMapping(path="/students/{id}")
	public StudentDetailed getStudent(@PathVariable UUID id) {
		return studentService.getUser(id);
		
	}
	

}
