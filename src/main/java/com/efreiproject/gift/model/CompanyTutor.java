package com.efreiproject.gift.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name= "company_tutor")
public class CompanyTutor {

	@Id
	@GeneratedValue
	private UUID id;
	
	private String companyTutorFirstName;
	private String companyTutorLastName;
	private String companyTutorProfession;
	private String companyTutorPhoneNumber;
	private String companyTutorEmail;
	
	@OneToMany(mappedBy="companyTutor")
	private List<Internship> internships;
	
	public UUID getId() {
		return id;
	}
	public String getCompanyTutorFirstName() {
		return companyTutorFirstName;
	}
	public String getCompanyTutorLastName() {
		return companyTutorLastName;
	}
	public String getCompanyTutorProfession() {
		return companyTutorProfession;
	}
	public String getCompanyTutorPhoneNumber() {
		return companyTutorPhoneNumber;
	}
	public String getCompanyTutorEmail() {
		return companyTutorEmail;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public void setCompanyTutorFirstName(String companyTutorFirstName) {
		this.companyTutorFirstName = companyTutorFirstName;
	}
	public void setCompanyTutorLastName(String companyTutorLastName) {
		this.companyTutorLastName = companyTutorLastName;
	}
	public void setCompanyTutorProfession(String companyTutorProfession) {
		this.companyTutorProfession = companyTutorProfession;
	}
	public void setCompanyTutorPhoneNumber(String companyTutorPhoneNumber) {
		this.companyTutorPhoneNumber = companyTutorPhoneNumber;
	}
	public void setCompanyTutorEmail(String companyTutorEmail) {
		this.companyTutorEmail = companyTutorEmail;
	}
	public List<Internship> getInternships() {
		return internships;
	}
	public void setInternships(List<Internship> internships) {
		this.internships = internships;
	}
	
	
	
}
