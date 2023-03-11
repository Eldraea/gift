package com.efreiproject.gift.historical.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoricalRepository extends CrudRepository<HistoricalEntity, Long> {

}
