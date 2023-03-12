package com.efreiproject.gift.archivedstudents.data;

import java.util.List;

public interface ArchivedStudentRepositoryCustom {
	List<ArchivedStudentEntity> getArchivedStudentsByTutorId(long id);
}
