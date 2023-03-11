package com.efreiproject.gift.soutenances.data;

import java.time.LocalDate;
import java.util.UUID;

import com.efreiproject.gift.internships.controllers.InternshipEntity;

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
	
	@Column(nullable= false, unique = true)
	private UUID soutenanceId;
	
	@Column(nullable= false)
	private LocalDate deadLineForSoutenance;
	
	@Column(nullable= false)
	private boolean soutenanceDone;
	
	@OneToOne(mappedBy="soutenance")
	private InternshipEntity internship;
	
	
	
	public SoutenanceEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public UUID getSoutenanceId() {
		return soutenanceId;
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

	public String getTutorNote() {
		return tutorNote;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setSoutenanceId(UUID soutenanceId) {
		this.soutenanceId = soutenanceId;
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

	public void setTutorNote(String tutorNote) {
		this.tutorNote = tutorNote;
	}

	@Column(nullable= false)
	private float technicalMark;
	
	@Column(nullable= false)
	private float communicationMark;
	
	@Column
	private String tutorNote;
	

}
