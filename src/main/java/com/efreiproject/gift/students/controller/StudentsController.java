package com.efreiproject.gift.students.controller;

import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.students.data.StudentRepository;

@RestController
public class StudentsController {
	
private StudentRepository studentRepository;
	
	public StudentsController(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	

		
	

}
