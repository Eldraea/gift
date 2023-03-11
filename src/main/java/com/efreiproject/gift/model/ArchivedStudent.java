package com.efreiproject.gift.model;

import java.time.LocalDate;
import java.util.UUID;

import com.efreiproject.gift.tutors.data.TutorEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

@Entity(name="archived_student")
public class ArchivedStudent {
	
    @Id
	private UUID id;
	
	@ManyToOne(fetch= FetchType.LAZY)
	private TutorEntity schoolTutor;
	
	@Size(min=2, message= "the firstName should have at least 2 characters")
	private String firstName;
	
	@Size(min=2, message="the lastName should have at least 2 characters" )
	private String lastName;
	private String phoneNumber;
	
	@Email
	private String email;
	
	@PastOrPresent(message= "Creation Date should be in the present or in the past")
	private LocalDate creationDate;
	private String description;
	private String pictureUrl;
	private boolean graduationDone;
	public UUID getId() {
		return id;
	}
	public TutorEntity getSchoolTutorId() {
		return schoolTutor;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public LocalDate getCreationDate() {
		return creationDate;
	}
	public String getDescription() {
		return description;
	}
	public boolean isGraduationDone() {
		return graduationDone;
	}
	public void setId(UUID id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setGraduationDone(boolean graduationDone) {
		this.graduationDone = graduationDone;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	
	
}
