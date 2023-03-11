package com.efreiproject.gift.model;

import java.time.LocalDate;
import java.util.UUID;

import com.efreiproject.gift.students.data.StudentEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity(name="internship")
public class Internship {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JsonIgnore
	private StudentEntity student;
	
	@ManyToOne(fetch= FetchType.LAZY)
	@JsonIgnore
	private Company company;
	
	@OneToOne(mappedBy="internship")
	private Report report;

	@OneToOne(mappedBy="internship")
	private Soutenance soutenance;
	
	@OneToOne(mappedBy="internship")
	private Visit visite;
	
	@ManyToOne(fetch= FetchType.LAZY)
	private CompanyTutor companyTutor;
	
	
	private LocalDate startingDate;
	private LocalDate endingDate;
	private boolean specificationsDone;
	
	public UUID getId() {
		return id;
	}
	public StudentEntity getStudent() {
		return student;
	}
	public Company getCompany() {
		return company;
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
	public void setStudent(StudentEntity student) {
		this.student = student;
	}
	public void setCompanyName(Company company) {
		this.company = company;
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
	public Report getReport() {
		return report;
	}
	public Soutenance getSoutenance() {
		return soutenance;
	}
	public Visit getVisite() {
		return visite;
	}
	public CompanyTutor getCompanyTutor() {
		return companyTutor;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public void setReport(Report report) {
		this.report = report;
	}
	public void setSoutenance(Soutenance soutenance) {
		this.soutenance = soutenance;
	}
	public void setVisite(Visit visite) {
		this.visite = visite;
	}
	public void setCompanyTutor(CompanyTutor companyTutor) {
		this.companyTutor = companyTutor;
	}
	
	
	

	
	

}
