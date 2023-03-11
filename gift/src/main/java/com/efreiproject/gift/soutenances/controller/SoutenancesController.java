package com.efreiproject.gift.soutenances.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.model.Soutenance;

@RestController
public class SoutenancesController {
	
	@GetMapping("/students/{studentId}/internships/{intershipId}/soutenances")
	public ResponseEntity<Soutenance> getSoutenanceByInternship(@PathVariable UUID studentId, @PathVariable UUID internshipId){
		return new ResponseEntity<Soutenance>(HttpStatus.OK);
	}
	
	@PostMapping("/students/{studentId}/internships/{intershipId}/soutenances")
	public ResponseEntity<Soutenance> createSoutenance(@PathVariable UUID studentId, @PathVariable UUID internshipId){
		return new ResponseEntity<Soutenance>(HttpStatus.OK);
	}
	
	@PutMapping("/students/{studentId}/internships/{intershipId}/soutenances/{soutenanceId}")
	public ResponseEntity<Soutenance> updateSoutenance(@PathVariable UUID studentId, @PathVariable UUID internshipId, @PathVariable UUID soutenanceId){
		return new ResponseEntity<Soutenance>(HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{studentId}/internships/{intershipId}/soutenances/{soutenanceId}")
	public ResponseEntity<Void> deleteSoutenance(@PathVariable UUID studentId, @PathVariable UUID internshipId, @PathVariable UUID soutenanceId){
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
