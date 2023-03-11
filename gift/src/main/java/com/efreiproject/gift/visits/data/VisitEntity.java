package com.efreiproject.gift.visits.data;

import java.time.LocalDate;
import java.util.UUID;

import com.efreiproject.gift.internships.controllers.InternshipEntity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="visit")
public class VisitEntity {
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable= false, unique = true)
	private UUID visitId;
	
	@Column(nullable= false)
	private LocalDate deadLineForVisit;
	
	@Column(nullable= false)
	private boolean visitDone;
	
	@Column
	private String tutorNote;
	
	
	
	public VisitEntity() {
		super();
	}

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
