package com.efreiproject.gift.model;

import java.time.LocalDate;
import java.util.UUID;

public class StudentDetailed {
	
	private UUID id;
	private UUID companyId;
	private UUID schoolTutorId;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private LocalDate creationDate;
	private String description;
	
	
	
	
	public StudentDetailed(UUID id, UUID companyId, UUID schoolTutorId, String firstName, String lastName,
			String phoneNumber, String email, LocalDate creationDate, String description) {
		super();
		this.id = id;
		this.companyId = companyId;
		this.schoolTutorId = schoolTutorId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.creationDate = creationDate;
		this.description = description;
	}

	public UUID getId() {
		return id;
	}
	
	public UUID getCompanyId() {
		return companyId;
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
	
	public LocalDate getCreationDate() {
		return creationDate;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
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
	
	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "StudentDetailed [id=" + id + ", companyId=" + companyId + ", schoolTutorId=" + schoolTutorId
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", email="
				+ email + ", creationDate=" + creationDate + ", description=" + description + "]";
	}
	
	
	
	

}
