package com.efreiproject.gift.historical.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.exceptions.HistoricalNullPointerException;
import com.efreiproject.gift.historical.data.HistoricalEntity;
import com.efreiproject.gift.historical.data.HistoricalRepository;
import com.efreiproject.gift.historical.shared.HistoricalDto;

@Service
public class HistoricalServiceImplementation implements HistoricalService{
	
	private HistoricalRepository historicalRepository;
	
	@Autowired
	public HistoricalServiceImplementation(HistoricalRepository historicalRepository) {
		this.historicalRepository= historicalRepository;
	}
	
	public HistoricalDto createEventInHistorical(HistoricalDto eventToCreate) {
		if(eventToCreate == null)
			throw new HistoricalNullPointerException("You must provide an event");
		historicalRepository.save(new ModelMapper().map(eventToCreate, HistoricalEntity.class));
		return eventToCreate;
	}
	
	public List<HistoricalDto> getAllHistorical(){
		List<HistoricalDto> historical = new ArrayList<HistoricalDto>();
		for(HistoricalEntity eventEntity: historicalRepository.findAll()) {
			historical.add(new ModelMapper().map(eventEntity, HistoricalDto.class));
		}
		return historical;
	}

}
