package com.efreiproject.gift.archivedstudents.data;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class ArchivedStudentRepositoryCustomImplementation implements ArchivedStudentRepositoryCustom {

	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<ArchivedStudentEntity> getArchivedStudentsByTutorId(long id) {
		CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ArchivedStudentEntity> cq = cb.createQuery(ArchivedStudentEntity.class);

        Root<ArchivedStudentEntity> book = cq.from(ArchivedStudentEntity.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(cb.equal(book.get("tutorId"), id));
        cq.where(predicates.toArray(new Predicate[0]));
        return em.createQuery(cq).getResultList();
	}

}
