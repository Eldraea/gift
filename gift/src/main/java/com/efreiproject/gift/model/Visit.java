package com.efreiproject.gift.model;

import java.time.LocalDate;
import java.util.UUID;

public class Visit {
	
	private UUID id;
	private UUID schoolTutorId;
	private UUID companyId;
	private LocalDate dateOfVisit;
	private boolean webSurveyDone;
	private boolean visitDone;
	private float technicalMark;
	private float communicationMark;
	private float schoolTutorNote;
	private float companyTutorNote;
	private float studentNote;
	public UUID getId() {
		return id;
	}
	public UUID getSchoolTutorId() {
		return schoolTutorId;
	}
	public UUID getCompanyId() {
		return companyId;
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
	public float getTechnicalMark() {
		return technicalMark;
	}
	public float getCommunicationMark() {
		return communicationMark;
	}
	public float getSchoolTutorNote() {
		return schoolTutorNote;
	}
	public float getCompanyTutorNote() {
		return companyTutorNote;
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
	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
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
	public void setTechnicalMark(float technicalMark) {
		this.technicalMark = technicalMark;
	}
	public void setCommunicationMark(float communicationMark) {
		this.communicationMark = communicationMark;
	}
	public void setSchoolTutorNote(float schoolTutorNote) {
		this.schoolTutorNote = schoolTutorNote;
	}
	public void setCompanyTutorNote(float companyTutorNote) {
		this.companyTutorNote = companyTutorNote;
	}
	public void setStudentNote(float studentNote) {
		this.studentNote = studentNote;
	}
	@Override
	public String toString() {
		return "Visit [id=" + id + ", schoolTutorId=" + schoolTutorId + ", companyId=" + companyId + ", dateOfVisit="
				+ dateOfVisit + ", webSurveyDone=" + webSurveyDone + ", visitDone=" + visitDone + ", technicalMark="
				+ technicalMark + ", communicationMark=" + communicationMark + ", schoolTutorNote=" + schoolTutorNote
				+ ", companyTutorNote=" + companyTutorNote + ", studentNote=" + studentNote + "]";
	}
	
	

}
