package com.efreiproject.gift.internships.shared;

import com.efreiproject.gift.model.Soutenance;
import com.efreiproject.gift.reports.shared.ReportDto;
import com.efreiproject.gift.soutenances.shared.SoutenanceDto;
import com.efreiproject.gift.students.shared.StudentDto;
import com.efreiproject.gift.visits.shared.VisitDto;
import jakarta.persistence.Column;

import java.time.LocalDate;
import java.util.UUID;


public class InternshipDto {
	
	private UUID id;
	private StudentDto student;
	private String companyName;

	private ReportDto report;
	private SoutenanceDto soutenance;
	private VisitDto visit;

	private String companyAddress;

	private String companyTutorFirstName;

	private String companyTutorLastName;
	private LocalDate startingDate;
	private LocalDate endingDate;
	private boolean specificationsDone;
	private boolean webSurveyDone;
	
	
	public UUID getId() {
		return id;
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
	public void setId(UUID id) {
		this.id = id;
	}
	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	public void setEndingDate(LocalDate endingDate) {
		this.endingDate = endingDate;
	}
	public void setWebSurveyDone(boolean webSurveyDone) {
		this.webSurveyDone = webSurveyDone;
	}


	public StudentDto getStudent() {
		return student;
	}

	public void setStudent(StudentDto student) {
		this.student = student;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public ReportDto getReport() {
		return report;
	}

	public void setReport(ReportDto report) {
		this.report = report;
	}

	public SoutenanceDto getSoutenance() {
		return soutenance;
	}

	public void setSoutenance(SoutenanceDto soutenance) {
		this.soutenance = soutenance;
	}

	public VisitDto getVisit() {
		return visit;
	}

	public void setVisit(VisitDto visit) {
		this.visit = visit;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyTutorFirstName() {
		return companyTutorFirstName;
	}

	public void setCompanyTutorFirstName(String companyTutorFirstName) {
		this.companyTutorFirstName = companyTutorFirstName;
	}

	public String getCompanyTutorLastName() {
		return companyTutorLastName;
	}

	public void setCompanyTutorLastName(String companyTutorLastName) {
		this.companyTutorLastName = companyTutorLastName;
	}

	public void setSpecificationsDone(boolean specificationsDone) {
		this.specificationsDone = specificationsDone;
	}
}
