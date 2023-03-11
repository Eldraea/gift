package com.efreiproject.gift.tutors.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class LoginRequestModel {
	@Email
	private String email;

	@NotNull(message="Password must not be null")
	@Size(min=8, max= 16, message="Password must be greater than 8 characters but less than 16 characters")
	private String password;
	
	
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
