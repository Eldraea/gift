package com.efreiproject.gift.internships.model;

import com.efreiproject.gift.model.Internship;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class Report {

    private long id;

    private LocalDate dateOfReport;

    private boolean reportDone;
    private float technicalMark;
    private float communicationMark;
    private String tutorNote;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateOfReport() {
        return dateOfReport;
    }

    public void setDateOfReport(LocalDate dateOfReport) {
        this.dateOfReport = dateOfReport;
    }

    public boolean isReportDone() {
        return reportDone;
    }

    public void setReportDone(boolean reportDone) {
        this.reportDone = reportDone;
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
