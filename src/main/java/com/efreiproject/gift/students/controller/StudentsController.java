package com.efreiproject.gift.students.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.efreiproject.gift.tutors.shared.TutorMeDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.efreiproject.gift.students.model.Student;
import com.efreiproject.gift.students.services.StudentService;
import com.efreiproject.gift.students.shared.StudentDto;
import com.efreiproject.gift.tutors.service.TutorService;
import com.efreiproject.gift.tutors.shared.TutorDto;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/students")
public class StudentsController {
	
	private StudentService studentService;
	private TutorService tutorService;
	
	@Autowired
	public StudentsController(StudentService studentService,TutorService tutorService) {
		this.studentService = studentService;
		this.tutorService= tutorService;
	}
	
	@GetMapping
	public ResponseEntity<List<Student>> getStudents(){
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String tutorEmail = ((UserDetails)authentication.getPrincipal()).getUsername();
		TutorMeDto tutorDto = tutorService.getTutorDetailsByEmail(tutorEmail);
		List<StudentDto> studentsDtos =studentService.getStudentsDetailsByTutorId(tutorDto.getId());
		List<Student> students = new ArrayList<Student>();
		for(StudentDto studentDto : studentsDtos)
			students.add(new ModelMapper().map(studentDto, Student.class));
		
		return new ResponseEntity<List<Student>>(students, HttpStatus.OK);
	}

	
	@PostMapping
	public ResponseEntity<Student> createStudent(@Valid @RequestBody Student student){
		
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String tutorEmail = ((UserDetails)authentication.getPrincipal()).getUsername();
		TutorMeDto tutorDto = tutorService.getTutorDetailsByEmail(tutorEmail);
		StudentDto studentDto = new ModelMapper().map(student, StudentDto.class);
		studentDto.setCreationDate(LocalDate.now());
		studentDto.setSchoolTutorId(tutorDto.getTutorId());
		studentDto.setStudentId(UUID.randomUUID());
		studentService.createStudent(studentDto);
		
		return new ResponseEntity<Student>(student, HttpStatus.CREATED);
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable long id, @Valid @RequestBody Student student){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String tutorEmail = ((UserDetails)authentication.getPrincipal()).getUsername();
		TutorMeDto tutorDto = tutorService.getTutorDetailsByEmail(tutorEmail);
		StudentDto studentDto = new ModelMapper().map(student, StudentDto.class);
		studentService.updateStudent(id, studentDto);
		return new ResponseEntity<Student>(student, HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable long id){
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String tutorEmail = ((UserDetails)authentication.getPrincipal()).getUsername();
		TutorMeDto tutorDto = tutorService.getTutorDetailsByEmail(tutorEmail);
		studentService.deleteStudentById(id, tutorDto.getId());
		return new ResponseEntity<Void>( HttpStatus.OK);
	}

		
	

}
