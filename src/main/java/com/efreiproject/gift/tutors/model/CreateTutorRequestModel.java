package com.efreiproject.gift.tutors.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class CreateTutorRequestModel {
	
	@NotNull(message="Firstname cannot be null")
	@Size(min=2, message="Firstname must not be less than two characters")
	private String firstName;
	
	@NotNull(message="Firstname cannot be null")
	@Size(min=2, message="Firstname must not be less than two characters")
	private String lastName;
	
	@NotNull(message="Password must not be null")
	@Size(min=8, max= 16, message="Password must be greater than 8 characters but less than 16 characters")
	private String password;
	
	@Email
	private String email;
	
	@NotNull(message="Phone number cannot be null")
	@Size(min=10, message="Phone number cannot be less than 10 characters")
	private String phoneNumber;
	
	@NotNull(message="Profession cannot be null")
	@Size(min=5, message="Profession must be greater than 5 characters")
	private String profession;
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getProfession() {
		return profession;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	
	
	

}
