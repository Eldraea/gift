package com.efreiproject.gift.internships.shared;

import java.time.LocalDate;
import java.util.UUID;


public class InternshipDto {
	
	private UUID id;
	private UUID studentId;
	private UUID companyTutorId;
	private LocalDate startingDate;
	private LocalDate endingDate;
	private boolean specificationsDone;
	private boolean webSurveyDone;
	private UUID reportId;
	private UUID soutenanceId;
	private UUID visitId;
	
	
	public UUID getId() {
		return id;
	}
	public UUID getStudentId() {
		return studentId;
	}
	public UUID getCompanyTutorId() {
		return companyTutorId;
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
	public boolean isWebSurveyDone() {
		return webSurveyDone;
	}
	public UUID getReportId() {
		return reportId;
	}
	public UUID getSoutenanceId() {
		return soutenanceId;
	}
	public UUID getVisitId() {
		return visitId;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public void setStudentId(UUID studentId) {
		this.studentId = studentId;
	}
	public void setCompanyTutorId(UUID companyTutorId) {
		this.companyTutorId = companyTutorId;
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
	public void setWebSurveyDone(boolean webSurveyDone) {
		this.webSurveyDone = webSurveyDone;
	}
	public void setReportId(UUID reportId) {
		this.reportId = reportId;
	}
	public void setSoutenanceId(UUID soutenanceId) {
		this.soutenanceId = soutenanceId;
	}
	public void setVisitId(UUID visitId) {
		this.visitId = visitId;
	}
	
	

}
