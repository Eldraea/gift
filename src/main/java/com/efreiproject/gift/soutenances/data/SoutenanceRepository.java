package com.efreiproject.gift.soutenances.data;

import org.springframework.data.repository.CrudRepository;

public interface SoutenanceRepository extends CrudRepository<SoutenanceEntity, Long>, SoutenanceRepositoryCustom{
}
