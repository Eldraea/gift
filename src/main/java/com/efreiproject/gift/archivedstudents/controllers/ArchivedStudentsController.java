package com.efreiproject.gift.archivedstudents.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.archivedstudents.services.ArchivedStudentService;
import com.efreiproject.gift.model.ArchivedStudent;

@RestController
@RequestMapping("/archivedStudents")
public class ArchivedStudentsController {
	
	private ArchivedStudentService archivedStudentService;
	
	@Autowired
	public ArchivedStudentsController(ArchivedStudentService archivedStudentService) {
		this.archivedStudentService = archivedStudentService;
	}
	
	@GetMapping
	public ResponseEntity<List<ArchivedStudent>> getAllArchivedStudents(){
		return new ResponseEntity<List<ArchivedStudent>>(HttpStatus.OK);
	}

}
