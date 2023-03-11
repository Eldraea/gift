package com.efreiproject.gift.tutors.service;



import com.efreiproject.gift.students.shared.StudentDto;
import com.efreiproject.gift.tutors.shared.TutorDto;

public interface TutorService {

	TutorDto createTutor(TutorDto tutor);
	TutorDto getTutorDetailsByEmail(String email);
	void addStudentToTutorsList(Long tutorId, StudentDto student);
}
