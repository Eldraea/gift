package com.efreiproject.gift.archivedstudents.controllers;

import java.util.ArrayList;
import java.util.List;

import com.efreiproject.gift.tutors.shared.TutorMeDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.archivedstudents.services.ArchivedStudentService;
import com.efreiproject.gift.archivedstudents.shared.ArchivedStudentDto;
import com.efreiproject.gift.model.ArchivedStudent;
import com.efreiproject.gift.tutors.service.TutorService;
import com.efreiproject.gift.tutors.shared.TutorDto;

@RestController
@RequestMapping("/archivedStudents")
public class ArchivedStudentsController {
	
	private ArchivedStudentService archivedStudentService;
	private TutorService tutorService;
	@Autowired
	public ArchivedStudentsController(ArchivedStudentService archivedStudentService, TutorService tutorService) {
		this.archivedStudentService = archivedStudentService;
		this.tutorService= tutorService;
	}
	
	@GetMapping
	public ResponseEntity<List<ArchivedStudent>> getAllArchivedStudents(){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String tutorEmail = ((UserDetails)authentication.getPrincipal()).getUsername();
		TutorMeDto tutorDto = tutorService.getTutorDetailsByEmail(tutorEmail);
		List<ArchivedStudentDto> archivedStudentsDtos =archivedStudentService.getArchivedStudentsDetailsByTutorId(tutorDto.getId());
		List<ArchivedStudent> archivedStudents = new ArrayList<ArchivedStudent>();
		for(ArchivedStudentDto archivedStudentDto : archivedStudentsDtos)
			archivedStudents.add(new ModelMapper().map(archivedStudentDto, ArchivedStudent.class));
		return new ResponseEntity<List<ArchivedStudent>>(archivedStudents, HttpStatus.OK);
	}

}
