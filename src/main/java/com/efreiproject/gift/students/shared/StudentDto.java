package com.efreiproject.gift.students.shared;

import java.time.LocalDate;

import java.util.UUID;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public class StudentDto {

	private long id;
	
	private long schoolTutorId;
	
	private String firstName;
	
	private String lastName;
	
	private String phoneNumber;
	
	private String email;
	
	private LocalDate creationDate;

	
	private String pictureUrl;

	private String currentClass;

	public long getId() {
		return id;
	}



	public long getSchoolTutorId() {
		return schoolTutorId;
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


	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setId(long id) {
		this.id = id;
	}


	public void setSchoolTutorId(long schoolTutorId) {
		this.schoolTutorId = schoolTutorId;
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


	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}


	public String getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}
}
