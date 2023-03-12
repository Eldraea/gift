package com.efreiproject.gift.students.model;



public class Student {
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String description;
	private String pictureUrl;
	
	
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
	
	

}
