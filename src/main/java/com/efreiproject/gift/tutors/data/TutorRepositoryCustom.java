package com.efreiproject.gift.tutors.data;

public interface TutorRepositoryCustom {
    TutorEntity getTutorByEmail(String email);
    TutorEntity getTutorByUsername(String username);
}
