package com.efreiproject.gift.soutenances.data;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.students.data.StudentEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class SoutenanceRepositoryImpl implements SoutenanceRepositoryCustom {
    @PersistenceContext
    EntityManager em;


    @Override
    public SoutenanceEntity getSoutenanceByInternshipId(InternshipEntity internshipEntity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SoutenanceEntity> criteriaQuery = cb.createQuery(SoutenanceEntity.class);

        Root<SoutenanceEntity> filter = criteriaQuery.from(SoutenanceEntity.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(cb.equal(filter.get("internship_id"), internshipEntity.getId()));

        criteriaQuery.where(predicates.toArray(new Predicate[]{}));
        List<SoutenanceEntity> resultList = em.createQuery(criteriaQuery).getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }
}
