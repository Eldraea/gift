package com.efreiproject.gift.soutenances.data;

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
@Table(name="soutenance")
public class SoutenanceEntity {
	
	@Id
	@GeneratedValue
	private long id;
	@Column
	private LocalDate deadLineForSoutenance;
	
	@Column(nullable= false)
	private boolean soutenanceDone;
	
	@OneToOne(mappedBy="soutenance")
	private InternshipEntity internship;


	@Column
	private float technicalMark;

	@Column
	private float communicationMark;
	
	
	public SoutenanceEntity() {
		super();
	}

	public long getId() {
		return id;
	}


	public LocalDate getDeadLineForSoutenance() {
		return deadLineForSoutenance;
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


	public void setId(long id) {
		this.id = id;
	}


	public void setDeadLineForSoutenance(LocalDate deadLineForSoutenance) {
		this.deadLineForSoutenance = deadLineForSoutenance;
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

	public InternshipEntity getInternship() {
		return internship;
	}

	public void setInternship(InternshipEntity internship) {
		this.internship = internship;
	}
}
