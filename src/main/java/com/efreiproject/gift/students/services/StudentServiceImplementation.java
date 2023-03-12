package com.efreiproject.gift.students.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import com.efreiproject.gift.tutors.data.TutorEntity;
import com.efreiproject.gift.tutors.service.TutorService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.archivedstudents.data.ArchivedStudentEntity;
import com.efreiproject.gift.archivedstudents.shared.ArchivedStudentDto;
import com.efreiproject.gift.exceptions.StudentAlreadyExistsException;
import com.efreiproject.gift.exceptions.StudentNotFoundException;
import com.efreiproject.gift.exceptions.StudentNullPointerException;
import com.efreiproject.gift.students.data.StudentEntity;
import com.efreiproject.gift.students.data.StudentRepository;
import com.efreiproject.gift.students.shared.StudentDto;

@Transactional
@Service
public class StudentServiceImplementation implements StudentService {
	
	private StudentRepository studentRepository;

	@Autowired
	private TutorService tutorService;
	
	public StudentServiceImplementation(StudentRepository studentRepository, TutorService tutorService) {
		this.studentRepository = studentRepository;
		this.tutorService = tutorService;
	}
	
	
	public List<StudentDto> getStudents() {
		List<StudentDto> students = new ArrayList<>();
		for(StudentEntity studentEntity: studentRepository.findAll()) {
			students.add(new ModelMapper().map(studentEntity, StudentDto.class));
		}
		return students;
	}
	
	public StudentDto getStudent(long id) {
		StudentEntity studentEntity = studentRepository.findById(id).orElseGet(() -> null);
		if(studentEntity == null)
			throw new StudentNotFoundException("There is no student with the id" + id);
		return new ModelMapper().map(studentEntity, StudentDto.class);
	}
	
	public StudentDto updateStudent(long tutorId, long id, StudentDto studentToUpdate) {
		if(studentToUpdate == null)
			throw new StudentNullPointerException("You must provide a student");
		StudentEntity studentEntity = studentRepository.findById(id).orElseGet(() -> null);
		if(studentEntity == null)
			throw new StudentNotFoundException("There is no student with the id" + studentToUpdate.getId());
		if(studentEntity.getSchoolTutor().getId() != tutorId)
			throw new StudentNotFoundException("There is no student with the id" + studentToUpdate.getId());

		studentEntity.setEmail(studentToUpdate.getEmail());
		studentEntity.setFirstName(studentToUpdate.getFirstName());
		studentEntity.setLastName(studentToUpdate.getLastName());
		studentEntity.setPhoneNumber(studentToUpdate.getPhoneNumber());
		studentEntity.setPictureUrl(studentToUpdate.getPictureUrl());
		studentEntity.setCurrentClass(studentToUpdate.getCurrentClass());

		StudentEntity savedStudent = studentRepository.save(studentEntity);
		return new ModelMapper().map(savedStudent, StudentDto.class);
		
	}
	
	public StudentDto createStudent(StudentDto studentToCreate){
		if(studentToCreate == null)
			throw new StudentNullPointerException("You must provide a student");
		StudentEntity savedStudent = studentRepository.save(new ModelMapper().map(studentToCreate, StudentEntity.class));
		return new ModelMapper().map(savedStudent, StudentDto.class);
	}

	@Override
	public StudentDto getStudentsDetailsByIdAndTutorId(Long id, TutorEntity tutor) {
		System.out.println(id);
		System.out.println(tutor.getId());
		StudentEntity student = studentRepository.getStudentByIdAndTutorId(id, tutor);
		if(student == null){
			throw new StudentNotFoundException("Student not found");
		}
		return new ModelMapper().map(student, StudentDto.class);
	}

	@Override
	public boolean deleteStudentById(Long id,TutorEntity tutor) {
		studentRepository.deleteByIdAndTutorId(id,tutor);
		return true;
	}


	@Override
	public List<StudentDto> getStudentsDetailsByTutorId(TutorEntity tutor) {
		List<StudentEntity> studentEntities =  studentRepository.getStudentsByTutorId(tutor);
		return studentEntities.stream().map((student) -> new ModelMapper().map(student, StudentDto.class)).toList();
	}

	@Override
	public StudentDto getStudentDetailsByStudentIdAndTutorId(long studentId, long tutorId) {
		return null;
	}


}
