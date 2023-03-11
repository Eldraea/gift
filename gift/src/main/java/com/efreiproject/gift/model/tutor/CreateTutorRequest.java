package com.efreiproject.gift.model.tutor;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

public class CreateTutorRequest {
	
	@NotNull(message= "Email must not be null")
	@Email
	private String email;
	
	@NotNull(message= "Password should not be null")
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
