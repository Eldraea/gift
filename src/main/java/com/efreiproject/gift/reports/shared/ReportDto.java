package com.efreiproject.gift.reports.shared;

import java.time.LocalDate;
import java.util.UUID;


public class ReportDto {
	
	
	private long id;
	private long internshipId;
	private LocalDate deadLineForReport;
	private boolean reportDone;
	private float technicalMark;
	private float communicationMark;
	private String tutorNote;


	
	
	public long getId() {
		return id;
	}
	public LocalDate getDeadLineForReport() {
		return deadLineForReport;
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
	public void setId(long id) {
		this.id = id;
	}
	public void setDeadLineForReport(LocalDate deadLineForReport) {
		this.deadLineForReport = deadLineForReport;
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


	public long getInternshipId() {
		return internshipId;
	}

	public void setInternshipId(long internshipId) {
		this.internshipId = internshipId;
	}
}
