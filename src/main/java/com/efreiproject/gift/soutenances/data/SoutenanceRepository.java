package com.efreiproject.gift.soutenances.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoutenanceRepository extends CrudRepository<SoutenanceEntity, Long> {

}
