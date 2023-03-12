package com.efreiproject.gift.students.data;

import com.efreiproject.gift.tutors.data.TutorEntity;

import java.util.List;


public interface StudentRepositoryCustom {
	List<StudentEntity> getStudentsByTutorId(TutorEntity tutorId);
	StudentEntity getStudentByIdAndTutorId(long id, TutorEntity tutorId);

	void deleteByIdAndTutorId(Long id, TutorEntity entity);

}
