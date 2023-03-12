package com.efreiproject.gift.tutors.controller;

import com.efreiproject.gift.tutors.model.LoginRequestModel;
import com.efreiproject.gift.tutors.model.TokenResponse;
import com.efreiproject.gift.tutors.shared.TutorMeDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import com.efreiproject.gift.tutors.model.CreateTutorRequestModel;
import com.efreiproject.gift.tutors.model.CreateTutorResponseModel;
import com.efreiproject.gift.tutors.service.TutorService;
import com.efreiproject.gift.tutors.shared.TutorDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/")
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

	@PostMapping("/login")
	public ResponseEntity<TokenResponse> login(@Valid @RequestBody LoginRequestModel loginRequest) {
		TokenResponse token = tutorService.login(loginRequest);
		if(token == null){
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}else{
			return ResponseEntity.status(HttpStatus.OK).body(token);
		}
	}

	@GetMapping("/me")
	public ResponseEntity<TutorMeDto> me() {

		System.out.println(" oisjàidsjfosdjfoisdjiofjs");
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

		System.out.println(" doiqsos");
		String email = ((UserDetails)authentication.getPrincipal()).getUsername();
		System.out.println(email + " oisjàidsjfosdjfoisdjiofjs");
		return ResponseEntity.status(HttpStatus.OK).body(tutorService.getTutorDetailsByEmail(email));
	}

}
