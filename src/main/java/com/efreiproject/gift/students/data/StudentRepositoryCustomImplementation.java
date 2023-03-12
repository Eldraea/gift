package com.efreiproject.gift.students.data;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class StudentRepositoryCustomImplementation implements StudentRepositoryCustom {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<StudentEntity> getStudentsByTutorId(long id)   {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);

        Root<StudentEntity> book = cq.from(StudentEntity.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(cb.equal(book.get("tutorId"), id));
        cq.where(predicates.toArray(new Predicate[0]));
        return em.createQuery(cq).getResultList();
	}

	@Override
	public StudentEntity getStudentsByStudentIdAndTutorId(long studentId, long tutorId) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<StudentEntity> cq = cb.createQuery(StudentEntity.class);

        Root<StudentEntity> book = cq.from(StudentEntity.class);
        List<Predicate> predicates = new ArrayList<>();
        
        predicates.add(cb.equal(book.get("id"), studentId));
        predicates.add(cb.equal(book.get("tutorId"), tutorId));
        cq.where(predicates.toArray(new Predicate[1]));
        return em.createQuery(cq).getResultList().get(0);
	}

}
