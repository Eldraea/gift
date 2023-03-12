package com.efreiproject.gift.visits.shared;

import java.time.LocalDate;
import java.util.UUID;

public class VisitDto {

	private long id;
	private long internshipId;
	private LocalDate deadLineForVisit;
	private boolean visitDone;
	private String tutorNote;
	
	
	public long getId() {
		return id;
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
	public void setDeadLineForVisit(LocalDate deadLineForVisit) {
		this.deadLineForVisit = deadLineForVisit;
	}
	public void setVisitDone(boolean visitDone) {
		this.visitDone = visitDone;
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
