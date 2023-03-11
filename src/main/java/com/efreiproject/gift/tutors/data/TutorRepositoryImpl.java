package com.efreiproject.gift.tutors.data;

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
public class TutorRepositoryImpl implements TutorRepositoryCustom {
    @PersistenceContext
    EntityManager em;
    @Override
    public TutorEntity getTutorByEmail(String email) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<TutorEntity> cq = cb.createQuery(TutorEntity.class);

        Root<TutorEntity> book = cq.from(TutorEntity.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(cb.equal(book.get("email"), email));
        cq.where(predicates.toArray(new Predicate[0]));
        List<TutorEntity> resultList = em.createQuery(cq).getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }

    @Override
    public TutorEntity getTutorByUsername(String username) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<TutorEntity> cq = cb.createQuery(TutorEntity.class);

        Root<TutorEntity> book = cq.from(TutorEntity.class);
        List<Predicate> predicates = new ArrayList<>();

        predicates.add(cb.equal(book.get("username"), username));
        cq.where(predicates.toArray(new Predicate[0]));
        List<TutorEntity> resultList = em.createQuery(cq).getResultList();
        return resultList.isEmpty() ? null : resultList.get(0);
    }
}
