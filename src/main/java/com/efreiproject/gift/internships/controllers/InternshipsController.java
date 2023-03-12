package com.efreiproject.gift.internships.controllers;

import java.util.List;
import java.util.UUID;

import com.efreiproject.gift.internships.model.Internship;
import com.efreiproject.gift.internships.service.InternshipService;
import com.efreiproject.gift.internships.shared.InternshipDto;
import com.efreiproject.gift.students.model.Student;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping
public class InternshipsController {


	@Autowired
	private InternshipService internshipService;
	
	@GetMapping("/students/{studentId}/internships")
	public ResponseEntity<List<InternshipDto>> getIntershipsByStudentId(@PathVariable Long studentId){
		List<InternshipDto> internships = internshipService.getInternshipsStudentId(studentId);
		return new ResponseEntity<List<InternshipDto>>(internships,HttpStatus.OK);
		
	}
	
	@GetMapping("/students/{studentId}/internships/{intershipId}")
	public ResponseEntity<InternshipDto> getInternshipById(@PathVariable Long studentId, @PathVariable Long internshipId){
		InternshipDto internship = internshipService.getInternshipById(studentId, internshipId);
		return new ResponseEntity<InternshipDto>(internship,HttpStatus.OK);
	}
	
	@PostMapping("/students/{studentId}/internships/")
	public ResponseEntity<InternshipDto> createInternship(@PathVariable Long studentId, @Valid @RequestBody Internship internship){
		InternshipDto createdInternship = internshipService.createInternship(new ModelMapper().map(internship, InternshipDto.class));
		return new ResponseEntity<InternshipDto>(createdInternship,HttpStatus.OK);
	}
	
	@PutMapping("/students/{studentId}/internships/{intershipId}")
	public ResponseEntity<InternshipDto> updateIntership(@PathVariable Long studentId, @PathVariable Long internshipId,@Valid @RequestBody Internship internship){
		InternshipDto updatedIntership = internshipService.updateIntership(studentId, internshipId, new ModelMapper().map(internship, InternshipDto.class));
		return new ResponseEntity<InternshipDto>(updatedIntership,HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{studentId}/internships/{intershipId}")
	public ResponseEntity<Void> deleteInternship(@PathVariable Long studentId, @PathVariable Long internshipId){
		internshipService.deleteInternship(studentId,internshipId);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	

}
