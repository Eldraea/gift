package com.efreiproject.gift.visits.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.model.Visit;

@RestController
public class VisitsController {

	@GetMapping("/students/{studentId}/internships/{intershipId}/visits")
	public ResponseEntity<Visit> getVisitsByInternship(@PathVariable UUID studentId, @PathVariable UUID internshipId){
		return new ResponseEntity<Visit>(HttpStatus.OK);
	}
	
	@PostMapping("/students/{studentId}/internships/{intershipId}/visits")
	public ResponseEntity<Visit> createVisit(@PathVariable UUID studentId, @PathVariable UUID internshipId){
		return new ResponseEntity<Visit>(HttpStatus.OK);
	}
	
	@PutMapping("/students/{studentId}/internships/{intershipId}/soutenances/{visitId}")
	public ResponseEntity<Visit> updateVisit(@PathVariable UUID studentId, @PathVariable UUID internshipId, @PathVariable UUID visitId){
		return new ResponseEntity<Visit>(HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{studentId}/internships/{intershipId}/soutenances/{visitId}")
	public ResponseEntity<Void> deleteVisit(@PathVariable UUID studentId, @PathVariable UUID internshipId, @PathVariable UUID visitId){
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
