package com.efreiproject.gift.soutenances.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.exceptions.ReportNotFoundException;
import com.efreiproject.gift.exceptions.SoutenanceNotFoundException;
import com.efreiproject.gift.exceptions.SoutenanceNullPointerException;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceRepository;
import com.efreiproject.gift.soutenances.shared.SoutenanceDto;

@Service
public class SoutenanceServiceImplementation implements SoutenanceService {

	
	private SoutenanceRepository soutenanceRepository;
	
	@Autowired
	public SoutenanceServiceImplementation(SoutenanceRepository soutenanceRepository) {
		this.soutenanceRepository = soutenanceRepository;
	}
	
	public SoutenanceDto createSoutenance(SoutenanceDto soutenanceToCreate) {
		if(soutenanceToCreate == null)
			throw new SoutenanceNullPointerException("You must provide a soutenance");
		soutenanceRepository.save(new ModelMapper().map(soutenanceToCreate, SoutenanceEntity.class));
		return soutenanceToCreate;
	}
	
	public SoutenanceDto updateSoutenance(SoutenanceDto soutenanceToUpdate) {
		if(soutenanceToUpdate == null)
			throw new SoutenanceNullPointerException("You must provide a report");
		SoutenanceEntity soutenanceEntity = soutenanceRepository.findById(soutenanceToUpdate.getId()).get();
		if(soutenanceEntity == null)
			throw new ReportNotFoundException("There is no report with the id:" + soutenanceToUpdate.getId());
		soutenanceRepository.save(soutenanceEntity);
		return soutenanceToUpdate;
	}
	
	public SoutenanceDto getSoutenance(long id) {
		SoutenanceEntity soutenanceEntity = soutenanceRepository.findById(id).get();
		if(soutenanceEntity == null)
			throw new ReportNotFoundException("There is no report with the id:" + id);
		return new ModelMapper().map(soutenanceEntity, SoutenanceDto.class);	
	}
	
	public void deleteSoutenance(long id){
		SoutenanceEntity soutenanceEntity = soutenanceRepository.findById(id).get();
		if(soutenanceEntity == null)
			throw new SoutenanceNotFoundException("There is no report with the id:" + id);
		soutenanceRepository.delete(soutenanceEntity);	
	}
	
}
