package com.efreiproject.gift.companyTutors.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.model.CompanyTutor;

@RestController
@RequestMapping("/companyTutors")
public class CompanyTutorsController {
	
	
	@GetMapping("/companyTutors/{tutorId}")
	public ResponseEntity<CompanyTutor> getCompanyTutorById(@PathVariable UUID tutorId){
		
		return new ResponseEntity<CompanyTutor>(HttpStatus.OK);
		
	}
	
	@PostMapping
	public ResponseEntity<CompanyTutor>  createCompanyTutor(){
		
		return new ResponseEntity<CompanyTutor>(HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<CompanyTutor> updateCompanyTutor(){
		return new ResponseEntity<CompanyTutor>(HttpStatus.OK);
	}

}
