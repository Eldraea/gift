package com.efreiproject.gift.archivedstudents.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArchivedStudentRepository extends CrudRepository<ArchivedStudentEntity, Long> {
	

}
