package com.efreiproject.gift.tutors.data;

import org.springframework.data.repository.CrudRepository;

public interface TutorRepository extends CrudRepository<TutorEntity, Long>, TutorRepositoryCustom {


}
