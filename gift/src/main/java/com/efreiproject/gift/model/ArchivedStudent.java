package com.efreiproject.gift.model;

import java.time.LocalDate;
import java.util.UUID;

public class ArchivedStudent {
	
	private UUID id;
	private String schoolTutorId;
	private String firstName;
	private String lastName;
	private String pictureUrl;
	private String phoneNumber;
	private String email;
	private LocalDate creationDate;
	private String description;
	private boolean graduationDone;
	public UUID getId() {
		return id;
	}
	public String getSchoolTutorId() {
		return schoolTutorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPictureUrl() {
		return pictureUrl;
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
	public void setSchoolTutorId(String schoolTutorId) {
		this.schoolTutorId = schoolTutorId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
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
	
	@Override
	public String toString() {
		return "ArchivedStudent [id=" + id + ", schoolTutorId=" + schoolTutorId + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", pictureUrl=" + pictureUrl + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", creationDate=" + creationDate + ", description=" + description + ", graduationDone="
				+ graduationDone + "]";
	}

	
}
