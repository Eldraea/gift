package com.efreiproject.gift.internships.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.model.Internship;

@RestController
@RequestMapping
public class InternshipsController {
	
	@GetMapping("/students/{studentId}/internships")
	public ResponseEntity<List<Internship>> getIntershipsByStudentId(@PathVariable UUID studentId){
		return new ResponseEntity<List<Internship>>(HttpStatus.OK);
		
	}
	
	@GetMapping("/students/{studentId}/internships/{intershipId}")
	public ResponseEntity<Internship> getInternshipById(@PathVariable UUID studentId, @PathVariable UUID internshipId){
		return new ResponseEntity<Internship>(HttpStatus.OK);
	}
	
	@PostMapping("/students/{studentId}/internships/")
	public ResponseEntity<Internship> createInternship(@PathVariable UUID studentId){
		return new ResponseEntity<Internship>(HttpStatus.OK);
	}
	
	@PutMapping("/students/{studentId}/internships/{intershipId}")
	public ResponseEntity<Internship> updateIntership(@PathVariable UUID studentId, @PathVariable UUID internshipId){
		return new ResponseEntity<Internship>(HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{studentId}/internships/{intershipId}")
	public ResponseEntity<Void> deleteInternship(@PathVariable UUID studentId, @PathVariable UUID internshipId){
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	

}
