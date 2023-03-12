package com.efreiproject.gift.students.services;

import java.util.List;

import com.efreiproject.gift.tutors.data.TutorEntity;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.students.shared.StudentDto;

@Service
public interface StudentService {
	List<StudentDto> getStudentsDetailsByTutorId(TutorEntity tutor);
	StudentDto getStudentDetailsByStudentIdAndTutorId(long studentId, long tutorId);
	StudentDto createStudent(StudentDto studentToCreate);

	StudentDto getStudentsDetailsByIdAndTutorId(Long id,TutorEntity tutor);
	StudentDto updateStudent(long tutorId ,long id, StudentDto studentToUpdate);
	boolean deleteStudentById(Long id,TutorEntity tutor);

}
