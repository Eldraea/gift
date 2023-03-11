package com.efreiproject.gift.companies.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.companies.services.CompanyService;
import com.efreiproject.gift.model.Company;

@RestController
@RequestMapping("/companies")
public class CompaniesController {

	private CompanyService companyService;
	
	public CompaniesController(CompanyService companyService) {
		this.companyService = companyService;
	}
	
	@PostMapping
	public ResponseEntity<Company> createCompany(){
		
		return new ResponseEntity<Company>(HttpStatus.OK);
	}
	
	@PutMapping 
	public ResponseEntity<Company> updateCompany(){
		return new ResponseEntity<Company>(HttpStatus.OK);
		
	}
}
