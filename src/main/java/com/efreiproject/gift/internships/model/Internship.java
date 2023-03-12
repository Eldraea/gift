package com.efreiproject.gift.internships.model;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class Internship {

    @NotNull(message="the companyName cannot be null")
    private String companyName;

    @NotNull(message="the companyAddress cannot be null")
    private String companyAddress;


    private Report report;

    private Soutenance soutenance;

    private Visit visit;


    @NotNull(message="the companyTutorFirstName cannot be null")
    private String companyTutorFirstName;


    @NotNull(message="the companyTutorLastName cannot be null")
    private String companyTutorLastName;


    @NotNull(message="the startingDate cannot be null")
    private LocalDate startingDate;


    @NotNull(message="the endingDate cannot be null")
    private LocalDate endingDate;


    @NotNull(message="the specificationsDone cannot be null")
    private boolean specificationsDone;


    @NotNull(message="the webSurvey cannot be null")
    private boolean webSurvey;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public Soutenance getSoutenance() {
        return soutenance;
    }

    public void setSoutenance(Soutenance soutenance) {
        this.soutenance = soutenance;
    }

    public Visit getVisit() {
        return visit;
    }

    public void setVisit(Visit visit) {
        this.visit = visit;
    }

    public String getCompanyTutorFirstName() {
        return companyTutorFirstName;
    }

    public void setCompanyTutorFirstName(String companyTutorFirstName) {
        this.companyTutorFirstName = companyTutorFirstName;
    }

    public String getCompanyTutorLastName() {
        return companyTutorLastName;
    }

    public void setCompanyTutorLastName(String companyTutorLastName) {
        this.companyTutorLastName = companyTutorLastName;
    }

    public LocalDate getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDate startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDate getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDate endingDate) {
        this.endingDate = endingDate;
    }

    public boolean isSpecificationsDone() {
        return specificationsDone;
    }

    public void setSpecificationsDone(boolean specificationsDone) {
        this.specificationsDone = specificationsDone;
    }

    public boolean isWebSurvey() {
        return webSurvey;
    }

    public void setWebSurvey(boolean webSurvey) {
        this.webSurvey = webSurvey;
    }
}
