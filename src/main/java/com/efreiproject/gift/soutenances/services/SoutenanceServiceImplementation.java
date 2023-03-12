package com.efreiproject.gift.soutenances.services;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.exceptions.ReportNotFoundException;
import com.efreiproject.gift.exceptions.SoutenanceNotFoundException;
import com.efreiproject.gift.exceptions.SoutenanceNullPointerException;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;
import com.efreiproject.gift.soutenances.shared.SoutenanceDto;

@Service
public class SoutenanceServiceImplementation implements SoutenanceService {

	
	private SoutenanceRepository soutenanceRepository;
	
	@Autowired
	public SoutenanceServiceImplementation(SoutenanceRepository soutenanceRepository) {
		this.soutenanceRepository = soutenanceRepository;
	}
	
	public SoutenanceDto createSoutenance(long internshipId) {
		SoutenanceDto newSoutenance= new SoutenanceDto();
		newSoutenance.setInternship_id(internshipId);
		newSoutenance.setSoutenanceDone(false);
		newSoutenance.setTechnicalMark(0);
		newSoutenance.setCommunicationMark(0);
		soutenanceRepository.save(new ModelMapper().map(newSoutenance, SoutenanceEntity.class));
		return newSoutenance;
	}
	
	public SoutenanceDto updateSoutenance(InternshipEntity internshipEntity, SoutenanceDto soutenanceToUpdate) {
		if(soutenanceToUpdate == null)
			throw new SoutenanceNullPointerException("You must provide a soutenance");
		SoutenanceEntity soutenanceEntity = soutenanceRepository.getSoutenanceByInternshipId(internshipEntity);
		if(soutenanceEntity == null)
			throw new SoutenanceNotFoundException("There is no soutenance with the id:" + soutenanceToUpdate.getId());
		SoutenanceEntity newSoutenanceEntity = new ModelMapper().map(soutenanceToUpdate, SoutenanceEntity.class);
		soutenanceRepository.save(newSoutenanceEntity);
		SoutenanceDto newSoutenanceDto = new ModelMapper().map(newSoutenanceEntity, SoutenanceDto.class);

		return newSoutenanceDto;
	}



}
