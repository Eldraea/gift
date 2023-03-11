package com.efreiproject.gift.auth;

import com.efreiproject.gift.tutors.data.TutorEntity;
import com.efreiproject.gift.tutors.data.TutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    @Autowired
    TutorRepository tutorRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        TutorEntity tutor = tutorRepository.getTutorByEmail(email);
        if (tutor != null) {
            return new User(tutor.getEmail(), tutor.getEncryptedPassword(),
                    new ArrayList<>());
        } else {
            throw new UsernameNotFoundException("User not found with email: " + email);
        }
    }
}