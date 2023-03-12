package com.efreiproject.gift.internships.model;

import java.time.LocalDate;

public class Soutenance {
    private long id;

    private LocalDate dateOfSoutenance;

    private boolean soutenanceDone;
    private float technicalMark;
    private float communicationMark;
    private String tutorNote;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateOfSoutenance() {
        return dateOfSoutenance;
    }

    public boolean isSoutenanceDone() {
        return soutenanceDone;
    }

    public void setSoutenanceDone(boolean soutenanceDone) {
        this.soutenanceDone = soutenanceDone;
    }

    public void setDateOfSoutenance(LocalDate dateOfSoutenance) {
        this.dateOfSoutenance = dateOfSoutenance;
    }

    public float getTechnicalMark() {
        return technicalMark;
    }

    public void setTechnicalMark(float technicalMark) {
        this.technicalMark = technicalMark;
    }

    public float getCommunicationMark() {
        return communicationMark;
    }

    public void setCommunicationMark(float communicationMark) {
        this.communicationMark = communicationMark;
    }

    public String getTutorNote() {
        return tutorNote;
    }

    public void setTutorNote(String tutorNote) {
        this.tutorNote = tutorNote;
    }
}
