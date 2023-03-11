package com.efreiproject.gift.archivedstudents.shared;

import java.time.LocalDate;
import java.util.UUID;



public class ArchivedStudentDto {
	
	
	private UUID id;
	private UUID schoolTutorId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private LocalDate creationDate;
	private String description;
	private String pictureUrl;
	private boolean isGraduated;
	
	
	public UUID getId() {
		return id;
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
	public boolean isGraduated() {
		return isGraduated;
	}
	public void setId(UUID id) {
		this.id = id;
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
	public void setGraduated(boolean isGraduated) {
		this.isGraduated = isGraduated;
	}
	
	

}
