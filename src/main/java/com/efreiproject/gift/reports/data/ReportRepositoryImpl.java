package com.efreiproject.gift.reports.data;

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
public class ReportRepositoryImpl implements ReportRepositoryCustom {
    @PersistenceContext
    EntityManager em;

    @Override
    public ReportEntity getReportByInternshipId(InternshipEntity internshipEntity) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ReportEntity> criteriaQuery = cb.createQuery(ReportEntity.class);

        Root<ReportEntity> filter = criteriaQuery.from(ReportEntity.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(cb.equal(filter.get("internshipId"), internshipEntity.getId()));

        criteriaQuery.where(predicates.toArray(new Predicate[]{}));
        List<ReportEntity> resultList = em.createQuery(criteriaQuery).getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }
}
