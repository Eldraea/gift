package com.efreiproject.gift.reports.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.exceptions.ReportNotFoundException;
import com.efreiproject.gift.exceptions.ReportNullPointerException;
import com.efreiproject.gift.reports.data.ReportEntity;
import com.efreiproject.gift.reports.data.ReportRepository;
import com.efreiproject.gift.reports.shared.ReportDto;

@Service
public class ReportServiceImplementation implements ReportService{
	
	private ReportRepository reportRepository;
	
	@Autowired
	public ReportServiceImplementation(ReportRepository reportRepository) {
		this.reportRepository = reportRepository;
	}
	
	public ReportDto createReport(ReportDto reportToCreate) {
		if(reportToCreate == null)
			throw new ReportNullPointerException("You must provide a report");
		reportRepository.save(new ModelMapper().map(reportToCreate, ReportEntity.class));
		return reportToCreate;
	}
	
	public ReportDto updateReport(ReportDto reportToUpdate) {
		if(reportToUpdate == null)
			throw new ReportNullPointerException("You must provide a report");
		ReportEntity reportEntity = reportRepository.findById(reportToUpdate.getId()).get();
		if(reportEntity == null)
			throw new ReportNotFoundException("There is no report with the id:" + reportToUpdate.getId());
		reportRepository.save(reportEntity);
		return reportToUpdate;
	}
	
	public ReportDto getReport(long id) {
		ReportEntity reportEntity = reportRepository.findById(id).get();
		if(reportEntity == null)
			throw new ReportNotFoundException("There is no report with the id:" + id);
		return new ModelMapper().map(reportEntity, ReportDto.class);	
	}
	
	public void deleteReport(long id){
		ReportEntity reportEntity = reportRepository.findById(id).get();
		if(reportEntity == null)
			throw new ReportNotFoundException("There is no report with the id:" + id);
		reportRepository.delete(reportEntity);	
	}
	

}
