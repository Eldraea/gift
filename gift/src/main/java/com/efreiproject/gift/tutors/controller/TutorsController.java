package com.efreiproject.gift.tutors.controller;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.tutors.model.CreateTutorRequestModel;
import com.efreiproject.gift.tutors.model.CreateTutorResponseModel;
import com.efreiproject.gift.tutors.service.TutorService;
import com.efreiproject.gift.tutors.shared.TutorDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("giftapi/v1")
public class TutorsController {
	
	@Autowired
	private TutorService tutorService;
	
	@PostMapping("/register")
	public ResponseEntity<CreateTutorResponseModel> createTutor(@Valid @RequestBody CreateTutorRequestModel tutorFromRequest) {
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		TutorDto tutorDto = modelMapper.map(tutorFromRequest, TutorDto.class);
		TutorDto newTutor = tutorService.createTutor(tutorDto);
		CreateTutorResponseModel tutorToReturn = modelMapper.map(newTutor, CreateTutorResponseModel.class);
		return ResponseEntity.status(HttpStatus.CREATED).body(tutorToReturn);
	}

}
