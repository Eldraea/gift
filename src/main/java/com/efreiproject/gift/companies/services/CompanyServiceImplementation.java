package com.efreiproject.gift.companies.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.companies.data.CompanyEntity;
import com.efreiproject.gift.companies.data.CompanyRepository;
import com.efreiproject.gift.companies.shared.CompanyDto;
import com.efreiproject.gift.exceptions.CompanyNotFoundException;
import com.efreiproject.gift.model.Company;

@Service
public class CompanyServiceImplementation implements CompanyService {
	
	private CompanyRepository companyRepository;
	
	@Autowired
	public CompanyServiceImplementation() {
		this.companyRepository = companyRepository;
	}
	
	public CompanyDto createCompany(Company companyToCreate) {
		CompanyDto companyDto = new ModelMapper().map(companyToCreate, CompanyDto.class);
		companyRepository.save(new ModelMapper().map(companyDto, CompanyEntity.class));
		return companyDto;
	}
	
	public List<CompanyDto> getAllCompanies(){
		List<CompanyDto> companies = new ArrayList<CompanyDto>();
		for (CompanyEntity companyEntity : companyRepository.findAll()) 
		{ 
		    companies.add(new ModelMapper().map(companyEntity, CompanyDto.class));
		}
		return companies;
	}
	
	public CompanyDto getCompanyById(long id) {
		CompanyEntity companyEntity = companyRepository.findById(id).get();
		if(companyEntity == null)
			throw new CompanyNotFoundException("There is no company with id" + id);
		return new ModelMapper().map(companyEntity, CompanyDto.class);
	}
	
	public void deleteCompany(long id) {
		CompanyEntity companyEntity = companyRepository.findById(id).get();
		if(companyEntity == null)
			throw new CompanyNotFoundException("There is no company with id" + id);
		companyRepository.delete(companyEntity);
	}
	
	public CompanyDto updateCompany(CompanyDto updatedCompany) {
		CompanyEntity companyEntity = companyRepository.findById(updatedCompany.getId()).get();
		if(companyEntity == null)
			throw new CompanyNotFoundException("There is no company with id" + updatedCompany.getId());
		CompanyEntity newCompanyEntity = new ModelMapper().map(updatedCompany, CompanyEntity.class);
		companyRepository.save(newCompanyEntity);
		return updatedCompany;
	}
	

}
