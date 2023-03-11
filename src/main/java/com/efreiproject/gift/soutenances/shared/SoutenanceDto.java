package com.efreiproject.gift.soutenances.shared;

import java.time.LocalDate;
import java.util.UUID;

public class SoutenanceDto {
	
	private long id;
	private UUID soutenanceId;
	private LocalDate deadLineForSoutenance;
	private boolean soutenanceDone;
	private float technicalMark;
	private float communicationMark;
	private String tutorNote;
	
	
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
	
}
