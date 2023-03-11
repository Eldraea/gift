package com.efreiproject.gift.model;

import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity(name="visit")
public class Visit {
	
	@Id
	@GeneratedValue
	private UUID id;
	private LocalDate dateOfVisit;
	
	@OneToOne(fetch= FetchType.LAZY)
	@JsonIgnore
	private Internship internship;
	
	private boolean webSurveyDone;
	private boolean visitDone;
	private String schoolTutorNote;

	public UUID getId() {
		return id;
	}
	
	public Internship getInternship() {
		return internship;
	}

	public void setInternship(Internship internship) {
		this.internship = internship;
	}

	public LocalDate getDateOfVisit() {
		return dateOfVisit;
	}
	public boolean isWebSurveyDone() {
		return webSurveyDone;
	}
	public boolean isVisitDone() {
		return visitDone;
	}
	
	public String getSchoolTutorNote() {
		return schoolTutorNote;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public void setDateOfVisit(LocalDate dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public void setWebSurveyDone(boolean webSurveyDone) {
		this.webSurveyDone = webSurveyDone;
	}
	public void setVisitDone(boolean visitDone) {
		this.visitDone = visitDone;
	}
	
	public void setSchoolTutorNote(String schoolTutorNote) {
		this.schoolTutorNote = schoolTutorNote;
	}
		

}
