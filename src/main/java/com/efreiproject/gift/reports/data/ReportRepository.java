package com.efreiproject.gift.reports.data;

import org.springframework.data.repository.CrudRepository;

public interface ReportRepository extends CrudRepository<ReportEntity, Long>, ReportRepositoryCustom{
}
