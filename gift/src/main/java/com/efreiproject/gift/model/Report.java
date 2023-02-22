package com.efreiproject.gift.model;

import java.util.UUID;

public class Report {
	
	private UUID id;
	private UUID schoolTutorId;
	private boolean reportDone;
	private float technicalMark;
	private float communicationMark;
	private float tutorNote;
	public UUID getId() {
		return id;
	}
	public UUID getSchoolTutorId() {
		return schoolTutorId;
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
	public float getTutorNote() {
		return tutorNote;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public void setSchoolTutorId(UUID schoolTutorId) {
		this.schoolTutorId = schoolTutorId;
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
	public void setTutorNote(float tutorNote) {
		this.tutorNote = tutorNote;
	}
	@Override
	public String toString() {
		return "Report [id=" + id + ", schoolTutorId=" + schoolTutorId + ", reportDone=" + reportDone
				+ ", technicalMark=" + technicalMark + ", communicationMark=" + communicationMark + ", tutorNote="
				+ tutorNote + "]";
	}
	
	
}
