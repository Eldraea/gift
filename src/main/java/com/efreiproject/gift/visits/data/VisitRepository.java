package com.efreiproject.gift.visits.data;

import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<VisitEntity, Long>, VisitRepositoryCustom{
}
