package com.efreiproject.gift.visits.data;

import java.time.LocalDate;
import java.util.UUID;

import com.efreiproject.gift.internships.data.InternshipEntity;
import jakarta.persistence.*;

@Entity
@Table(name="visit")
public class VisitEntity {
	@Id
	@GeneratedValue
	private long id;

	@OneToOne(mappedBy="visit")
	private InternshipEntity internship;
;
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

	public LocalDate getDeadLineForVisit() {
		return deadLineForVisit;
	}

	public boolean isVisitDone() {
		return visitDone;
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


	public String getTutorNote() {
		return tutorNote;
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
