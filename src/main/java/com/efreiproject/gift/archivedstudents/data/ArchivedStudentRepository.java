package com.efreiproject.gift.archivedstudents.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.efreiproject.gift.tutors.data.TutorRepositoryCustom;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@Repository
public interface ArchivedStudentRepository extends CrudRepository<ArchivedStudentEntity, Long> , ArchivedStudentRepositoryCustom {
	
	
	
	
}
