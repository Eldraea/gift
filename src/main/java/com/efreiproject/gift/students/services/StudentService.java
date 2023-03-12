package com.efreiproject.gift.students.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.efreiproject.gift.students.shared.StudentDto;

@Service
public interface StudentService {
	List<StudentDto> getStudentsDetailsByTutorId(long id);
	StudentDto getStudentDetailsByStudentIdAndTutorId(long studentId, long tutorId);
	StudentDto createStudent(StudentDto studentToCreate);
	StudentDto updateStudent(long id, StudentDto studentToUpdate);
	void deleteStudentById(long tutorId, long id);

}
