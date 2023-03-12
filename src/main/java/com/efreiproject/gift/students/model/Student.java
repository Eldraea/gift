package com.efreiproject.gift.students.model;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Student {

	@NotNull(message="the id cannot be null")
	private long id;
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
	@NotNull(message="the pictureUrl cannot be null")
	private String pictureUrl;

	@NotNull(message="the currentClass cannot be null")
	private String currentClass;
	
	
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
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}


	public String getCurrentClass() {
		return currentClass;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
}
