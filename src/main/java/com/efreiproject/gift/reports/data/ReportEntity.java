package com.efreiproject.gift.reports.data;

import java.time.LocalDate;
import java.util.UUID;

import com.efreiproject.gift.internships.data.InternshipEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "report")
public class ReportEntity {

	@Id
	@GeneratedValue
	private long id;

	
	@Column(nullable= false)
	private LocalDate deadLineForReport;
	
	@Column(nullable= false)
	private boolean reportDone;
	
	@Column(nullable= false)
	private float technicalMark;
	
	@Column(nullable= false)
	private float communicationMark;
	
	@Column
	private String tutorNote;
	
	@OneToOne(mappedBy="report")
	private InternshipEntity internship;
	
	
	

	public ReportEntity() {
		super();
	}
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
	public InternshipEntity getInternship() {
		return internship;
	}
	public void setInternship(InternshipEntity internship) {
		this.internship = internship;
	}
	
	
	
}
