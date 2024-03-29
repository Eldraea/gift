package com.efreiproject.gift.tutors.service;



import com.efreiproject.gift.students.shared.StudentDto;
import com.efreiproject.gift.tutors.model.LoginRequestModel;
import com.efreiproject.gift.tutors.model.TokenResponse;
import com.efreiproject.gift.tutors.shared.TutorDto;
import com.efreiproject.gift.tutors.shared.TutorMeDto;

public interface TutorService {

	TutorDto createTutor(TutorDto tutor);

	TokenResponse login(LoginRequestModel loginRequestModel);
	TutorMeDto getTutorDetailsByEmail(String email);
	void addStudentToTutorsList(Long tutorId, StudentDto student);
}
