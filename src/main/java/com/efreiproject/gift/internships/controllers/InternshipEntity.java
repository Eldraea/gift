package com.efreiproject.gift.internships.controllers;

import java.time.LocalDate;
import java.util.UUID;

import com.efreiproject.gift.companies.data.CompanyEntity;
import com.efreiproject.gift.companyTutors.data.CompanyTutorEntity;
import com.efreiproject.gift.reports.data.ReportEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;
import com.efreiproject.gift.students.data.StudentEntity;
import com.efreiproject.gift.visits.data.VisitEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "internship")
public class InternshipEntity {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable= false, unique = true)
	private UUID internshipId;
	
	@ManyToOne(fetch= FetchType.LAZY)
	private StudentEntity student;
	
	@ManyToOne(fetch= FetchType.LAZY)
	private CompanyEntity company;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="report_id", referencedColumnName="id")
	private ReportEntity report;

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name ="soutenance_id", referencedColumnName="id")
	private SoutenanceEntity soutenance;
	
	@OneToOne @MapsId
	private VisitEntity visite;
	
	@ManyToOne(fetch= FetchType.LAZY)
	private CompanyTutorEntity companyTutor;
	
	@Column(nullable= false)
	private LocalDate startingDate;
	
	@Column(nullable= false)
	private LocalDate endingDate;
	
	@Column(nullable= false)
	private boolean specificationsDone;
	
	@Column(nullable= false)
	private boolean webSurvey;

	public InternshipEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public UUID getInternshipId() {
		return internshipId;
	}

	public StudentEntity getStudent() {
		return student;
	}

	public CompanyEntity getCompany() {
		return company;
	}

	public ReportEntity getReport() {
		return report;
	}

	public SoutenanceEntity getSoutenance() {
		return soutenance;
	}

	public VisitEntity getVisite() {
		return visite;
	}

	public CompanyTutorEntity getCompanyTutor() {
		return companyTutor;
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

	public boolean isWebSurvey() {
		return webSurvey;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setInternshipId(UUID internshipId) {
		this.internshipId = internshipId;
	}

	public void setStudent(StudentEntity student) {
		this.student = student;
	}

	public void setCompany(CompanyEntity company) {
		this.company = company;
	}

	public void setReport(ReportEntity report) {
		this.report = report;
	}

	public void setSoutenance(SoutenanceEntity soutenance) {
		this.soutenance = soutenance;
	}

	public void setVisite(VisitEntity visite) {
		this.visite = visite;
	}

	public void setCompanyTutor(CompanyTutorEntity companyTutor) {
		this.companyTutor = companyTutor;
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

	public void setWebSurvey(boolean webSurvey) {
		this.webSurvey = webSurvey;
	}
	
	
	
	

}
