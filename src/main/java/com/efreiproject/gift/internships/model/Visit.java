package com.efreiproject.gift.internships.model;

import java.time.LocalDate;

public class Visit {

    private long id;

    private LocalDate dateOfVisit;

    private boolean visitDone;
    private boolean webSurveyDone;
    private int schoolTutorNote;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateOfVisit() {
        return dateOfVisit;
    }

    public void setDateOfVisit(LocalDate dateOfVisit) {
        this.dateOfVisit = dateOfVisit;
    }

    public boolean isVisitDone() {
        return visitDone;
    }

    public void setVisitDone(boolean visitDone) {
        this.visitDone = visitDone;
    }

    public boolean isWebSurveyDone() {
        return webSurveyDone;
    }

    public void setWebSurveyDone(boolean webSurveyDone) {
        this.webSurveyDone = webSurveyDone;
    }

    public int getSchoolTutorNote() {
        return schoolTutorNote;
    }

    public void setSchoolTutorNote(int schoolTutorNote) {
        this.schoolTutorNote = schoolTutorNote;
    }
}
