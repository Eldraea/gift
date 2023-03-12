package com.efreiproject.gift.reports.services;

import com.efreiproject.gift.exceptions.SoutenanceNotFoundException;
import com.efreiproject.gift.exceptions.SoutenanceNullPointerException;
import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.reports.data.ReportRepository;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;
import com.efreiproject.gift.soutenances.shared.SoutenanceDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.exceptions.ReportNotFoundException;
import com.efreiproject.gift.exceptions.ReportNullPointerException;
import com.efreiproject.gift.reports.data.ReportEntity;
import com.efreiproject.gift.reports.shared.ReportDto;

@Service
public class ReportServiceImplementation implements ReportService{
	
	private ReportRepository reportRepository;
	
	@Autowired
	public ReportServiceImplementation(ReportRepository reportRepository) {
		this.reportRepository = reportRepository;
	}

	@Override
	public ReportDto updateReport(InternshipEntity internshipEntity, ReportDto reportToUpdate) {
		if(reportToUpdate == null)
			throw new ReportNullPointerException("You must provide a report");
		ReportEntity reportEntity = reportRepository.getReportByInternshipId(internshipEntity);
		if(reportEntity == null)
			throw new ReportNotFoundException("There is no report with the id:" + reportToUpdate.getId());
		ReportEntity newReportEntity = new ModelMapper().map(reportToUpdate, ReportEntity.class);
		reportRepository.save(newReportEntity);
		ReportDto newReportDto = new ModelMapper().map(newReportEntity, ReportDto.class);

		return newReportDto;
	}

	public ReportDto createReport(long internshipId) {

		ReportDto newReport= new ReportDto();
		newReport.setInternshipId(internshipId);
		newReport.setReportDone(false);
		newReport.setTechnicalMark(0);
		newReport.setCommunicationMark(0);
		reportRepository.save(new ModelMapper().map(newReport, ReportEntity.class));
		return newReport;
	}

	

	

	

}
