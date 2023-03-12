package com.efreiproject.gift.internships.data;

import java.time.LocalDate;
import java.util.UUID;

import com.efreiproject.gift.companies.data.CompanyEntity;
import com.efreiproject.gift.companyTutors.data.CompanyTutorEntity;
import com.efreiproject.gift.reports.data.ReportEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;
import com.efreiproject.gift.students.data.StudentEntity;
import com.efreiproject.gift.visits.data.VisitEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "internship")
public class InternshipEntity {
	@Id
	@GeneratedValue
	private long id;

	@ManyToOne(fetch= FetchType.LAZY)
	private StudentEntity student;

	@Column(nullable= false)
	private String companyName;

	@Column(nullable= false, unique=true)
	private String companyAddress;
	
	@OneToOne(cascade=CascadeType.ALL, optional = true)
	@JoinColumn(name ="report_id", referencedColumnName="id", nullable = true)
	private ReportEntity report;

	@OneToOne(cascade=CascadeType.ALL, optional = true)
	@JoinColumn(name ="soutenance_id", referencedColumnName="id", nullable = true)
	private SoutenanceEntity soutenance;

	@OneToOne(cascade=CascadeType.ALL, optional = true)
	@JoinColumn(name ="visit_id", referencedColumnName="id", nullable = true)
	private VisitEntity visit;

	@Column(nullable= false)
	private String companyTutorFirstName;

	@Column(nullable= false)
	private String companyTutorLastName;
	
	@Column(nullable= false)
	private LocalDate startingDate;
	
	@Column(nullable= false)
	private LocalDate endingDate;
	
	@Column(nullable= false)
	private boolean specificationsDone;
	
	@Column(nullable= false)
	private boolean webSurvey;

	public InternshipEntity() {
		super();
	}

	public long getId() {
		return id;
	}


	public StudentEntity getStudent() {
		return student;
	}


	public ReportEntity getReport() {
		return report;
	}

	public SoutenanceEntity getSoutenance() {
		return soutenance;
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

	public boolean isWebSurvey() {
		return webSurvey;
	}

	public void setId(long id) {
		this.id = id;
	}


	public void setStudent(StudentEntity student) {
		this.student = student;
	}


	public void setReport(ReportEntity report) {
		this.report = report;
	}

	public void setSoutenance(SoutenanceEntity soutenance) {
		this.soutenance = soutenance;
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

	public void setWebSurvey(boolean webSurvey) {
		this.webSurvey = webSurvey;
	}


	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public VisitEntity getVisit() {
		return visit;
	}

	public void setVisit(VisitEntity visit) {
		this.visit = visit;
	}
}
