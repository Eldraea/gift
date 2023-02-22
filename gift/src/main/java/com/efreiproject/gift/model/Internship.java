package com.efreiproject.gift.model;

import java.time.LocalDate;
import java.util.UUID;

public class Internship {
	private UUID id;
	private UUID studentId;
	private String companyName;
	private String companyTutorFirstName;
	private String companyTutorLastName;
	private String companyTutorProfession;
	private String companyTutorPhoenNumber;
	private String companyTutorEmail;
	private LocalDate startingDate;
	private LocalDate endingDate;
	private boolean specificationsDone;
	
	public UUID getId() {
		return id;
	}
	public UUID getStudentId() {
		return studentId;
	}
	public String getCompanyName() {
		return companyName;
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
	public String getCompanyTutorPhoenNumber() {
		return companyTutorPhoenNumber;
	}
	public String getCompanyTutorEmail() {
		return companyTutorEmail;
	}
	public LocalDate getStartingDate() {
		return startingDate;
	}
	public LocalDate getEndingDate() {
		return endingDate;
	}
	public boolean isSpecificationsDone() {
		return specificationsDone;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public void setStudentId(UUID studentId) {
		this.studentId = studentId;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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
	public void setCompanyTutorPhoenNumber(String companyTutorPhoenNumber) {
		this.companyTutorPhoenNumber = companyTutorPhoenNumber;
	}
	public void setCompanyTutorEmail(String companyTutorEmail) {
		this.companyTutorEmail = companyTutorEmail;
	}
	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}
	public void setSpecificationsDone(boolean specificationsDone) {
		this.specificationsDone = specificationsDone;
	}
	
	@Override
	public String toString() {
		return "Internship [id=" + id + ", studentId=" + studentId + ", companyName=" + companyName
				+ ", companyTutorFirstName=" + companyTutorFirstName + ", companyTutorLastName=" + companyTutorLastName
				+ ", companyTutorProfession=" + companyTutorProfession + ", companyTutorPhoenNumber="
				+ companyTutorPhoenNumber + ", companyTutorEmail=" + companyTutorEmail + ", startingDate="
				+ startingDate + ", endingDate=" + endingDate + ", specificationsDone=" + specificationsDone + "]";
	}
	
	

}
