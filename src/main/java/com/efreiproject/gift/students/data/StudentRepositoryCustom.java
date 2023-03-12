package com.efreiproject.gift.students.data;

import java.util.List;


public interface StudentRepositoryCustom {
	List<StudentEntity> getStudentsByTutorId(long id);
	StudentEntity getStudentsByStudentIdAndTutorId(long studentId, long tutorId);
}
