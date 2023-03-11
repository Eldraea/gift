package com.efreiproject.gift.reports.controllers;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.model.Report;

@RestController
public class ReportsController {
	
	@GetMapping("/students/{studentId}/internships/{intershipId}/reports")
	public ResponseEntity<Report> getReportByInternship(@PathVariable UUID studentId, @PathVariable UUID internshipId){
		return new ResponseEntity<Report>(HttpStatus.OK);
	}
	
	@PostMapping("/students/{studentId}/internships/{intershipId}/reports")
	public ResponseEntity<Report> createReport(@PathVariable UUID studentId, @PathVariable UUID internshipId){
		return new ResponseEntity<Report>(HttpStatus.OK);
	}
	
	@PutMapping("/students/{studentId}/internships/{intershipId}/reports/{reportId}")
	public ResponseEntity<Report> updateReport(@PathVariable UUID studentId, @PathVariable UUID internshipId, @PathVariable UUID reportId){
		return new ResponseEntity<Report>(HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{studentId}/internships/{intershipId}/reports/{reportId}")
	public ResponseEntity<Void> deleteReport(@PathVariable UUID studentId, @PathVariable UUID internshipId, @PathVariable UUID reportId){
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
