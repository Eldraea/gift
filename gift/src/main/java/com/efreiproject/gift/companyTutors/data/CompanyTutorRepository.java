package com.efreiproject.gift.companyTutors.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyTutorRepository extends CrudRepository<CompanyTutorEntity, Long> {

}
