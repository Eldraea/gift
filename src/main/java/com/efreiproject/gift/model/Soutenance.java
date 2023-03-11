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
public class Soutenance {
	@Id
	@GeneratedValue
	private UUID id;
	
	private LocalDate dateOfSoutenance;
	
	@OneToOne(fetch= FetchType.LAZY)
	@JsonIgnore
	private Internship internship;
	private boolean soutenanceDone;
	private float technicalMark;
	private float communicationMark;
	private String tutorNote;
	
	
	public UUID getId() {
		return id;
	}

	public LocalDate getDateOfSoutenance() {
		return dateOfSoutenance;
	}
	public boolean isSoutenanceDone() {
		return soutenanceDone;
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

	public void setDateOfSoutenance(LocalDate dateOfSoutenance) {
		this.dateOfSoutenance = dateOfSoutenance;
	}
	public void setSoutenanceDone(boolean soutenanceDone) {
		this.soutenanceDone = soutenanceDone;
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

	public Internship getInternship() {
		return internship;
	}

	public void setInternship(Internship internship) {
		this.internship = internship;
	}


	

}
