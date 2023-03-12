package com.efreiproject.gift.archivedstudents.services;

import java.util.List;

import com.efreiproject.gift.archivedstudents.shared.ArchivedStudentDto;


public interface ArchivedStudentService {
	List<ArchivedStudentDto> getArchivedStudentsDetailsByTutorId(long id);
}
