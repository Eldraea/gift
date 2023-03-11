package com.efreiproject.gift.visits.shared;

import java.time.LocalDate;
import java.util.UUID;

public class VisitDto {

	private long id;
	private UUID visitId;
	private LocalDate deadLineForVisit;
	private boolean visitDone;
	private String tutorNote;
	
	
	public long getId() {
		return id;
	}
	public UUID getVisitId() {
		return visitId;
	}
	public LocalDate getDeadLineForVisit() {
		return deadLineForVisit;
	}
	public boolean isVisitDone() {
		return visitDone;
	}
	public String getTutorNote() {
		return tutorNote;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setVisitId(UUID visitId) {
		this.visitId = visitId;
	}
	public void setDeadLineForVisit(LocalDate deadLineForVisit) {
		this.deadLineForVisit = deadLineForVisit;
	}
	public void setVisitDone(boolean visitDone) {
		this.visitDone = visitDone;
	}
	public void setTutorNote(String tutorNote) {
		this.tutorNote = tutorNote;
	}
	

	
}
