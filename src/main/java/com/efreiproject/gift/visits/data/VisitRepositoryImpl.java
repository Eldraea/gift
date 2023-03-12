package com.efreiproject.gift.visits.data;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;
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
public class VisitRepositoryImpl implements VisitRepositoryCustom {
    @PersistenceContext
    EntityManager em;

    @Override
    public VisitEntity getVisitByInternshipId(InternshipEntity internshipEntity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<VisitEntity> criteriaQuery = cb.createQuery(VisitEntity.class);

        Root<VisitEntity> filter = criteriaQuery.from(VisitEntity.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(cb.equal(filter.get("internship_id"), internshipEntity.getId()));

        criteriaQuery.where(predicates.toArray(new Predicate[]{}));
        List<VisitEntity> resultList = em.createQuery(criteriaQuery).getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }
}
