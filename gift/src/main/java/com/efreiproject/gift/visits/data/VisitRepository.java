package com.efreiproject.gift.visits.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<VisitEntity, Long> {

}
