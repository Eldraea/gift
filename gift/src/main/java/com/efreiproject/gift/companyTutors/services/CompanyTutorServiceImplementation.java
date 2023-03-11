package com.efreiproject.gift.companyTutors.services;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.companyTutors.data.CompanyTutorEntity;
import com.efreiproject.gift.companyTutors.data.CompanyTutorRepository;
import com.efreiproject.gift.companyTutors.shared.CompanyTutorDto;
import com.efreiproject.gift.exceptions.CompanyTutorAlreadyExistsException;
import com.efreiproject.gift.exceptions.CompanyTutorNotFoundException;
import com.efreiproject.gift.exceptions.CompanyTutorNullPointerException;

@Service
public class CompanyTutorServiceImplementation implements CompanyTutorService{
	
	private CompanyTutorRepository companyTutorRepository;
	
	public CompanyTutorServiceImplementation(CompanyTutorRepository companyTutorRepository) {
		this.companyTutorRepository = companyTutorRepository;
	}
	
	public CompanyTutorDto createCompanyTutor(CompanyTutorDto companyTutorToCreate) {
		if(companyTutorToCreate  == null)
			throw new CompanyTutorNotFoundException("You must provide a companyTutor");
		CompanyTutorEntity companyTutorEntity =companyTutorRepository.findById(companyTutorToCreate.getId()).get();
		if(companyTutorEntity != null)
			throw new CompanyTutorAlreadyExistsException("A companyTutor with the id " + companyTutorToCreate.getId() + " alreday exists");
		companyTutorRepository.save(new ModelMapper().map(companyTutorToCreate, CompanyTutorEntity.class));
		
		return companyTutorToCreate;	
	}
	
	public CompanyTutorDto getCompanyTutorById(long id) {
		CompanyTutorEntity companyTutorEntity = companyTutorRepository.findById(id).get();
		if(companyTutorEntity == null)
			throw new CompanyTutorNotFoundException("There is no companyTutor with the id" + id);
		return new ModelMapper().map(companyTutorEntity, CompanyTutorDto.class);	
	}
	
	public CompanyTutorDto updateCompanyTutor(CompanyTutorDto companyTutorToUpdate) {
		
		if(companyTutorToUpdate == null)
			throw new CompanyTutorNullPointerException("You must provide a companyTutor");
		CompanyTutorEntity companyTutorEntity =companyTutorRepository.findById(companyTutorToUpdate.getId()).get();
		if(companyTutorEntity == null)
			throw new CompanyTutorNotFoundException("There is no companyTutor with the id" + companyTutorToUpdate.getId());
		companyTutorRepository.save(new ModelMapper().map(companyTutorToUpdate, CompanyTutorEntity.class));
		return companyTutorToUpdate;
	}
	
	public void deleteCompanyTutor(long id) {
		CompanyTutorEntity companyTutorEntity =companyTutorRepository.findById(id).get();
		if(companyTutorEntity == null)
			throw new CompanyTutorNotFoundException("There is no companyTutor with the id" + id);
		companyTutorRepository.delete(companyTutorEntity);
		
	}

}
