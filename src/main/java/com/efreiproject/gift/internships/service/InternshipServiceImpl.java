package com.efreiproject.gift.internships.service;

import com.efreiproject.gift.exceptions.InternshipNotFoundException;
import com.efreiproject.gift.internships.data.*;
import com.efreiproject.gift.internships.shared.InternshipDto;
import com.efreiproject.gift.reports.data.ReportEntity;
import com.efreiproject.gift.reports.data.ReportRepository;
import com.efreiproject.gift.reports.services.ReportService;
import com.efreiproject.gift.reports.shared.ReportDto;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceRepository;
import com.efreiproject.gift.soutenances.services.SoutenanceService;
import com.efreiproject.gift.soutenances.shared.SoutenanceDto;
import com.efreiproject.gift.visits.data.VisitEntity;
import com.efreiproject.gift.visits.data.VisitRepository;
import com.efreiproject.gift.visits.services.VisitService;
import com.efreiproject.gift.visits.shared.VisitDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class InternshipServiceImpl implements InternshipService{

    @Autowired
    InternshipRepository internshipRepository;


    @Autowired
    ReportService reportService;


    @Autowired
    SoutenanceService soutenanceService;

    @Autowired
    VisitService visitService;

    @Override
    public InternshipDto createInternship(InternshipDto internshipDto) {

        InternshipEntity internship = internshipRepository.save(new ModelMapper().map(internshipDto, InternshipEntity.class));
        visitService.createVisit(internship.getId());
        soutenanceService.createSoutenance(internship.getId());
        reportService.createReport(internship.getId());

        return new ModelMapper().map(internship, InternshipDto.class);
    }

    @Override
    public List<InternshipDto> getInternshipsStudentId(Long studentId) {
        return internshipRepository.getInternshipsStudentId(studentId).stream()
                .map(internship ->
                        new ModelMapper()
                                .map(internship,InternshipDto.class)).toList();
    }

    @Override
    public InternshipDto getInternshipById(Long studentId, Long internshipId) {
        return new ModelMapper().map(internshipRepository.getInternshipById(internshipId),InternshipDto.class);
    }

    @Override
    public InternshipDto updateIntership(Long studentId, Long internshipId,InternshipDto internshipDto) {
        InternshipEntity internshipEntity = internshipRepository.findById(internshipId).orElseGet(() -> null);
        if(internshipEntity == null)
            throw new InternshipNotFoundException("There is no student with the id" + internshipId);
        if(internshipEntity.getStudent().getStudentId() != studentId){
            throw new InternshipNotFoundException("There is no student with the id" + internshipId);
        }

        internshipEntity.setCompanyName(internshipDto.getCompanyName());
        internshipEntity.setCompanyAddress(internshipDto.getCompanyAddress());
        internshipEntity.setReport(new ModelMapper().map(internshipDto.getReport(), ReportEntity.class));
        internshipEntity.setSoutenance(new ModelMapper().map(internshipDto.getSoutenance(), SoutenanceEntity.class));;
        internshipEntity.setVisit(new ModelMapper().map(internshipDto.getVisit(), VisitEntity.class));;
        internshipEntity.setCompanyTutorFirstName(internshipDto.getCompanyTutorFirstName());
        internshipEntity.setCompanyTutorLastName(internshipDto.getCompanyTutorLastName());
        internshipEntity.setSpecificationsDone(internshipDto.isSpecificationsDone());
        internshipEntity.setWebSurvey(internshipDto.isWebSurveyDone());

        InternshipEntity savedInternship = internshipRepository.save(internshipEntity);
        return new ModelMapper().map(savedInternship, InternshipDto.class);
    }

    @Override
    public void deleteInternship(Long studentId, Long internshipId) {

    }
}
