package com.efreiproject.gift.model;

import java.time.LocalDate;
import java.util.UUID;

public class Soutenance {
	private UUID id;
	private UUID schoolTutorId;
	private LocalDate dateOfSoutenance;
	private boolean soutenanceDone;
	private float technicalMark;
	private float communicationMark;
	private float tutorNote;
	private float studentNote;
	public UUID getId() {
		return id;
	}
	public UUID getSchoolTutorId() {
		return schoolTutorId;
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
	public float getTutorNote() {
		return tutorNote;
	}
	public float getStudentNote() {
		return studentNote;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public void setSchoolTutorId(UUID schoolTutorId) {
		this.schoolTutorId = schoolTutorId;
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
	public void setTutorNote(float tutorNote) {
		this.tutorNote = tutorNote;
	}
	public void setStudentNote(float studentNote) {
		this.studentNote = studentNote;
	}
	@Override
	public String toString() {
		return "Soutenance [id=" + id + ", schoolTutorId=" + schoolTutorId + ", dateOfSoutenance=" + dateOfSoutenance
				+ ", soutenanceDone=" + soutenanceDone + ", technicalMark=" + technicalMark + ", communicationMark="
				+ communicationMark + ", tutorNote=" + tutorNote + ", studentNote=" + studentNote + "]";
	}
	
	

}
