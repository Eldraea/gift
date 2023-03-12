package com.efreiproject.gift.internships.data;

import org.springframework.data.repository.CrudRepository;


public interface InternshipRepository extends CrudRepository<InternshipEntity, Long>, InternshipRepositoryCustom {


}
