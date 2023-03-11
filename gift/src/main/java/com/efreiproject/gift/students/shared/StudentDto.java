package com.efreiproject.gift.students.shared;

import java.time.LocalDate;

import java.util.UUID;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public class StudentDto {

	@NotNull
	private long id;
	
	@NotNull(message= "The Identifier of the student cannot be null")
	private UUID studentId;
	
	@NotNull(message= "The Identifier of the schoolTutor cannot be null")
	private UUID schoolTutorId;
	
	@NotNull(message="the firstname cannot be null")
	@Size(min=2, message= "the firstName should have at least 2 characters")
	private String firstName;
	
	@NotNull(message="the lastname cannot be null")
	@Size(min=2, message="the lastName should have at least 2 characters" )
	private String lastName;
	
	@NotNull(message="the phone number cannot be null")
	private String phoneNumber;
	
	@NotNull(message="the email cannot be null")
	@Email
	private String email;
	
	@PastOrPresent(message= "Creation Date should be in the present or in the past")
	private LocalDate creationDate;
	
	private String description;
	
	private String pictureUrl;

	public long getId() {
		return id;
	}

	public UUID getStudentId() {
		return studentId;
	}

	public UUID getSchoolTutorId() {
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

	public String getDescription() {
		return description;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setStudentId(UUID studentId) {
		this.studentId = studentId;
	}

	public void setSchoolTutorId(UUID schoolTutorId) {
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

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	
	
	
	
}
