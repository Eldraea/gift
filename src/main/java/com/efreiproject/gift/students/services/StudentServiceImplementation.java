package com.efreiproject.gift.students.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.archivedstudents.data.ArchivedStudentEntity;
import com.efreiproject.gift.archivedstudents.shared.ArchivedStudentDto;
import com.efreiproject.gift.exceptions.StudentAlreadyExistsException;
import com.efreiproject.gift.exceptions.StudentNotFoundException;
import com.efreiproject.gift.exceptions.StudentNullPointerException;
import com.efreiproject.gift.students.data.StudentEntity;
import com.efreiproject.gift.students.data.StudentRepository;
import com.efreiproject.gift.students.shared.StudentDto;

@Service
public class StudentServiceImplementation implements StudentService {
	
	private StudentRepository studentRepository;
	
	public StudentServiceImplementation(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	
	public List<StudentDto> getStudents() {
		List<StudentDto> students = new ArrayList<>();
		for(StudentEntity studentEntity: studentRepository.findAll()) {
			students.add(new ModelMapper().map(studentEntity, StudentDto.class));
		}
		return students;
	}
	
	public StudentDto getStudent(long id) {
		StudentEntity studentEntity = studentRepository.findById(id).get();
		if(studentEntity == null)
			throw new StudentNotFoundException("There is no student with the id" + id);
		return new ModelMapper().map(studentEntity, StudentDto.class);
	}
	
	public StudentDto updateStudent(long id, StudentDto studentToUpdate) {
		if(studentToUpdate == null)
			throw new StudentNullPointerException("You must provide a student");
		StudentEntity studentEntity = studentRepository.findById(studentToUpdate.getId()).get();
		if(studentEntity == null)
			throw new StudentNotFoundException("There is no student with the id" + studentToUpdate.getId());
		studentToUpdate.setId(id);
		studentToUpdate.setCreationDate(studentEntity.getCreationDate());
		studentToUpdate.setSchoolTutorId(studentEntity.getSchoolTutor().getTutorId());
		studentRepository.save(studentEntity);
		return studentToUpdate;
		
	}
	
	public StudentDto createStudent(StudentDto studentToCreate){
		if(studentToCreate == null) {
			throw new StudentNullPointerException("You must provide a student");
		}
			
		StudentEntity studentEntity = studentRepository.findById(studentToCreate.getId()).get();
		if(studentEntity != null)
			throw new StudentAlreadyExistsException("The student with the id" + studentToCreate.getId() + " already exists");
		System.out.println("erreur là");
		studentRepository.save(new ModelMapper().map(studentToCreate, StudentEntity.class));
		System.out.println("erreur ici");
		return studentToCreate;
	}
	
	public void deleteStudentById(long id, long tutorId) {
		List<StudentEntity> studentEntities =  studentRepository.getStudentsByTutorId(id);
		StudentEntity studentEntity = studentEntities.stream().filter(student -> student.getSchoolTutor().getId() == tutorId).toList().get(0);
		if(studentEntity == null)
			throw new StudentNotFoundException("There is no student with the id" + id);
		studentRepository.delete(studentEntity);
	}


	@Override
	public List<StudentDto> getStudentsDetailsByTutorId(long id) {
		List<StudentEntity> studentEntities =  studentRepository.getStudentsByTutorId(id);
		List<StudentDto> studentDtos = new ArrayList<StudentDto>();
		if(studentEntities.isEmpty())
			return new ArrayList<StudentDto>();
		for(StudentEntity studentEntity : studentEntities)
		  studentDtos.add(new ModelMapper().map(studentEntity, StudentDto.class));
		return studentDtos;
	}

	


	

}
