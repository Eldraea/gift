package com.efreiproject.gift.tutors.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.efreiproject.gift.auth.JwtUtil;
import com.efreiproject.gift.tutors.model.LoginRequestModel;
import com.efreiproject.gift.tutors.model.TokenResponse;
import com.efreiproject.gift.tutors.shared.TutorMeDto;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.exceptions.StudentNullPointerException;
import com.efreiproject.gift.exceptions.TutorNotFoundException;
import com.efreiproject.gift.students.data.StudentEntity;
import com.efreiproject.gift.students.shared.StudentDto;
import com.efreiproject.gift.tutors.data.TutorEntity;
import com.efreiproject.gift.tutors.data.TutorRepository;
import com.efreiproject.gift.tutors.shared.TutorDto;


@Service
public class TutorServiceImplementation implements TutorService {

	TutorRepository tutorRepository;
	@Autowired
	JwtUtil jwtUtil;

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@Autowired
	public TutorServiceImplementation(TutorRepository tutorRepository) {
		this.tutorRepository = tutorRepository;
		
	}

	@Override
	public TutorDto createTutor(TutorDto tutor) {
		tutor.setEncryptedPassword(passwordEncoder.encode(tutor.getPassword()));
		tutor.setTutorId(UUID.randomUUID());
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		TutorEntity tutorEntity = modelMapper.map(tutor, TutorEntity.class);
		tutorRepository.save(tutorEntity);
		TutorDto tutorReturned = modelMapper.map(tutorEntity, TutorDto.class);
		return tutorReturned;
	}

	@Override
	public TokenResponse login(LoginRequestModel loginRequestModel) {
		TutorEntity tutor = tutorRepository.getTutorByEmail(loginRequestModel.getEmail());
		if(tutor == null)
			throw new TutorNotFoundException(loginRequestModel.getEmail());

		if(passwordEncoder.matches(loginRequestModel.getPassword(),tutor.getEncryptedPassword())){
			Map<String,Object> payload = new HashMap<>();
			payload.put("email",tutor.getEmail());
			payload.put("id", tutor.getId());
			String token = jwtUtil.generateToken(payload, tutor.getEmail());
			return new TokenResponse(token);
		}else{
			return null;
		}
	}

	@Override
	public TutorMeDto getTutorDetailsByEmail(String email) {
		TutorEntity tutorEntity = tutorRepository.getTutorByEmail(email);
		if(tutorEntity == null)
			throw new TutorNotFoundException(email);
		return new ModelMapper().map(tutorEntity, TutorMeDto.class);
	}

	@Override
	public void addStudentToTutorsList(Long tutorId, StudentDto student) {
		if(student == null)
			throw new StudentNullPointerException("There is no student to add");
		StudentEntity studentEntity= new ModelMapper().map(student, StudentEntity.class);
		TutorEntity  tutorEntity = tutorRepository.findById(tutorId).get();
		if(tutorEntity == null)
			throw new TutorNotFoundException("There is no tutor with id" + tutorId);
		tutorEntity.getStudents().add(studentEntity);
	}

	
}
