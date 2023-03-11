package com.efreiproject.gift.model;

import java.time.LocalDate;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Report {
	
	@Id
	@GeneratedValue
	private UUID id;
	
	@OneToOne(fetch= FetchType.LAZY)
	@JsonIgnore
	private Internship internship;
	
	private LocalDate dateOfReport;
	private boolean reportDone;
	private float technicalMark;
	private float communicationMark;
	private String tutorNote;
	
	public UUID getId() {
		return id;
	}
	public boolean isReportDone() {
		return reportDone;
	}
	public float getTechnicalMark() {
		return technicalMark;
	}
	public float getCommunicationMark() {
		return communicationMark;
	}
	public String getTutorNote() {
		return tutorNote;
	}
	public void setId(UUID id) {
		this.id = id;
	}

	public void setReportDone(boolean reportDone) {
		this.reportDone = reportDone;
	}
	public void setTechnicalMark(float technicalMark) {
		this.technicalMark = technicalMark;
	}
	public void setCommunicationMark(float communicationMark) {
		this.communicationMark = communicationMark;
	}
	public void setTutorNote(String tutorNote) {
		this.tutorNote = tutorNote;
	}
	public LocalDate getDateOfReport() {
		return dateOfReport;
	}
	public void setDateOfReport(LocalDate dateOfReport) {
		this.dateOfReport = dateOfReport;
	}
	public Internship getInternship() {
		return internship;
	}
	public void setInternship(Internship internship) {
		this.internship = internship;
	}
	
	
	
	
	
}
