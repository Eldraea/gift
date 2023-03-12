package com.efreiproject.gift.visits.services;

import com.efreiproject.gift.exceptions.SoutenanceNullPointerException;
import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;
import com.efreiproject.gift.soutenances.shared.SoutenanceDto;
import com.efreiproject.gift.visits.data.VisitRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.exceptions.SoutenanceNotFoundException;
import com.efreiproject.gift.exceptions.VisitNotFoundException;
import com.efreiproject.gift.exceptions.VisitNullPointerException;
import com.efreiproject.gift.visits.data.VisitEntity;
import com.efreiproject.gift.visits.shared.VisitDto;


@Service
public class VisitServiceImplementation implements VisitService {
	
	private VisitRepository visitRepository;
	
	@Autowired
	public VisitServiceImplementation(VisitRepository visitRepository) {
		this.visitRepository = visitRepository;
	}


	@Override
	public VisitDto updateVisit(InternshipEntity internshipEntity, VisitDto visitToUpdate) {
		if(visitToUpdate == null)
			throw new VisitNullPointerException("You must provide a visit");
		VisitEntity visitEntity = visitRepository.getVisitByInternshipId(internshipEntity);
		if(visitEntity == null)
			throw new VisitNotFoundException("There is no visit with the id:" + visitToUpdate.getId());
		VisitEntity newVisitEntity = new ModelMapper().map(visitToUpdate, VisitEntity.class);
		visitRepository.save(newVisitEntity);
		VisitDto newVisitDto = new ModelMapper().map(newVisitEntity, VisitDto.class);
		return newVisitDto;
	}

	@Override
	public VisitDto createVisit(long internshipId) {
		VisitDto newVisitDto= new VisitDto();
		newVisitDto.setVisitDone(false);
		newVisitDto.setInternshipId(internshipId);
		newVisitDto.setTutorNote("");
		this.visitRepository.save(new ModelMapper().map(newVisitDto,VisitEntity.class));
		return newVisitDto;
	}
}
