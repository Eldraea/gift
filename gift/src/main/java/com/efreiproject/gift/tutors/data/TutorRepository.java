package com.efreiproject.gift.tutors.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TutorRepository extends JpaRepository<TutorEntity, Long>, TutorRepositoryCustom {


}
