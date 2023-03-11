package com.efreiproject.gift.archivedstudents.model;

public class ArchivedStudent {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String description;
	private String pictureUrl;
	private boolean isGraduated;
	
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

	public String getDescription() {
		return description;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public boolean isGraduated() {
		return isGraduated;
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
