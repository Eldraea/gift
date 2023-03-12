package com.efreiproject.gift.students.data;

import java.util.ArrayList;
import java.util.List;


import com.efreiproject.gift.tutors.data.TutorEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRepositoryCustomImplementation implements StudentRepositoryCustom {
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<StudentEntity> getStudentsByTutorId( TutorEntity tutor)   {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<StudentEntity> criteriaQuery = cb.createQuery(StudentEntity.class);

        Root<StudentEntity> filter = criteriaQuery.from(StudentEntity.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(cb.equal(filter.get("tutor_id_id"), tutor.getTutorId()));
        criteriaQuery.where(predicates.toArray(new Predicate[]{}));
        return  em.createQuery(criteriaQuery).getResultList();
	}

    @Override
	public StudentEntity getStudentByIdAndTutorId(long id, TutorEntity tutor) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<StudentEntity> criteriaQuery = cb.createQuery(StudentEntity.class);

        Root<StudentEntity> filter = criteriaQuery.from(StudentEntity.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(cb.equal(filter.get("id"), id));
        predicates.add(cb.equal(filter.get("tutor_id_id"), tutor.getTutorId()));
        criteriaQuery.where(predicates.toArray(new Predicate[]{}));
        List<StudentEntity> resultList = em.createQuery(criteriaQuery).getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
	}

    @Override
    public void deleteByIdAndTutorId(Long id, TutorEntity entity) {
        System.out.println("enter");
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaDelete<StudentEntity> criteriaDelete = criteriaBuilder.createCriteriaDelete(StudentEntity.class);
        Root<StudentEntity> root = criteriaDelete.from(StudentEntity.class);
        Join<StudentEntity, TutorEntity> tutorJoin = root.join("tutorId");
        criteriaDelete.where(criteriaBuilder.equal(tutorJoin.join("id"),entity.getId()));
        criteriaDelete.where(criteriaBuilder.and(criteriaDelete.getRestriction(),
                criteriaBuilder.equal(root.get("id"), id)));
        em.createQuery(criteriaDelete).executeUpdate();
    }

}
