package com.efreiproject.gift.tutors.shared;

import com.efreiproject.gift.students.data.StudentEntity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class TutorMeDto implements Serializable {
    private long id;
    private UUID tutorId;
    private String firstName;
    private String lastName;
    private String email;
    private String profession;
    private String phoneNumber;
    private String pictureUrl;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getEmail() {
        return email;
    }
    public String getProfession() {
        return profession;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getPictureUrl() {
        return pictureUrl;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setProfession(String profession) {
        this.profession = profession;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }
    public UUID getTutorId() {
        return tutorId;
    }
    public void setTutorId(UUID tutorId) {
        this.tutorId = tutorId;
    }
}
