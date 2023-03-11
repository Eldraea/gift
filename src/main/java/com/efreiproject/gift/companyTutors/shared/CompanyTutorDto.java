package com.efreiproject.gift.companyTutors.shared;

import java.util.List;
import java.util.UUID;

import com.efreiproject.gift.model.Internship;


public class CompanyTutorDto {
	
	private static final long serialUUID = 4566456161618L;
	private long id;
	private UUID companyTutorId;
	private String firstName;
	private String lastName;
	private String profession;
	private String phoneNumber;
	private String email;
	
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public UUID getCompanyTutorId() {
		return companyTutorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getProfession() {
		return profession;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public List<Internship> getInternships() {
		return internships;
	}
	public void setCompanyTutorId(UUID companyTutorId) {
		this.companyTutorId = companyTutorId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setInternships(List<Internship> internships) {
		this.internships = internships;
	}
	private List<Internship> internships;

}
