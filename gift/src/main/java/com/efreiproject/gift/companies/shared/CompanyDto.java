package com.efreiproject.gift.companies.shared;

import java.util.List;
import java.util.UUID;

public class CompanyDto {

	private long id;
	private UUID companyId;
	private String name;
	private String address;
	private List<UUID> internships;
	private List<UUID> companyTutors;
	
	
	public long getId() {
		return id;
	}
	public UUID getCompanyId() {
		return companyId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public List<UUID> getInternships() {
		return internships;
	}
	public List<UUID> getCompanyTutors() {
		return companyTutors;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setInternships(List<UUID> internships) {
		this.internships = internships;
	}
	public void setCompanyTutors(List<UUID> companyTutors) {
		this.companyTutors = companyTutors;
	}	
}