package com.efreiproject.gift.internships.data;

import com.efreiproject.gift.internships.shared.InternshipDto;
import com.efreiproject.gift.students.data.StudentEntity;
import com.efreiproject.gift.tutors.data.TutorEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InternshipRepositoryImpl implements InternshipRepositoryCustom {
    @PersistenceContext
    EntityManager em;

    @Override
    public List<InternshipEntity> getInternshipsStudentId(Long studentId) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<InternshipEntity> criteriaQuery = cb.createQuery(InternshipEntity.class);

        Root<InternshipEntity> filter = criteriaQuery.from(InternshipEntity.class);
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.equal(filter.get("student_id"), studentId));
        criteriaQuery.where(predicates.toArray(new Predicate[]{}));
        return  em.createQuery(criteriaQuery).getResultList();
    }

    @Override
    public InternshipEntity getInternshipById(Long id) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<InternshipEntity> criteriaQuery = cb.createQuery(InternshipEntity.class);

        Root<InternshipEntity> filter = criteriaQuery.from(InternshipEntity.class);
        List<Predicate> predicates = new ArrayList<>();
        predicates.add(cb.equal(filter.get("id"), id));
        criteriaQuery.where(predicates.toArray(new Predicate[]{}));
        List<InternshipEntity> resultList = em.createQuery(criteriaQuery).getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }


    @Override
    public void deleteInternshipByIdAndStudentId(Long id, Long studentId) {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaDelete<InternshipEntity> criteriaDelete = criteriaBuilder.createCriteriaDelete(InternshipEntity.class);
        Root<InternshipEntity> root = criteriaDelete.from(InternshipEntity.class);
        Join<InternshipEntity, StudentEntity> tutorJoin = root.join("student");
        criteriaDelete.where(criteriaBuilder.equal(tutorJoin.join("id"),studentId));
        criteriaDelete.where(criteriaBuilder.and(criteriaDelete.getRestriction(),
                criteriaBuilder.equal(root.get("id"), id)));
        em.createQuery(criteriaDelete).executeUpdate();
    }
}
