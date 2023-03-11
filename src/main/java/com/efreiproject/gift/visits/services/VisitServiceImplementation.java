package com.efreiproject.gift.visits.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.exceptions.SoutenanceNotFoundException;
import com.efreiproject.gift.exceptions.VisitNotFoundException;
import com.efreiproject.gift.exceptions.VisitNullPointerException;
import com.efreiproject.gift.visits.data.VisitEntity;
import com.efreiproject.gift.visits.data.VisitRepository;
import com.efreiproject.gift.visits.shared.VisitDto;


@Service
public class VisitServiceImplementation implements VisitService {
	
	private VisitRepository visitRepository;
	
	@Autowired
	public VisitServiceImplementation(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}
	
	public VisitDto createVisit(VisitDto visitToCreate) {
		if(visitToCreate == null)
			throw new VisitNullPointerException("You must provide a visit");
		visitRepository.save(new ModelMapper().map(visitToCreate, VisitEntity.class));
		return visitToCreate;
	}
	
	public VisitDto updateVisit(VisitDto visitToUpdate) {
		if(visitToUpdate == null)
			throw new VisitNullPointerException("You must provide a report");
		VisitEntity visitEntity = visitRepository.findById(visitToUpdate.getId()).get();
		if(visitEntity == null)
			throw new VisitNotFoundException("There is no visit with the id:" + visitToUpdate.getId());
		visitRepository.save(visitEntity);
		return visitToUpdate;
	}
	
	public VisitDto getSVisit(long id) {
		VisitEntity visitEntity = visitRepository.findById(id).get();
		if(visitEntity == null)
			throw new VisitNotFoundException("There is no visit with the id:" + id);
		return new ModelMapper().map(visitEntity, VisitDto.class);	
	}
	
	public void deleteSoutenance(long id){
		VisitEntity visitEntity = visitRepository.findById(id).get();
		if(visitEntity == null)
			throw new SoutenanceNotFoundException("There is no visit with the id:" + id);
		visitRepository.delete(visitEntity);	
	}
	

}
