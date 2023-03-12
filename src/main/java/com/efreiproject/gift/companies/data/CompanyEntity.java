package com.efreiproject.gift.companies.data;

import java.util.List;
import java.util.UUID;

import com.efreiproject.gift.internships.data.InternshipEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="company")
public class CompanyEntity {
	
	@Id
	@GeneratedValue
	private long id;
	
	private UUID companyId;
	
	@Column(nullable= false)
	private String name;
	
	@Column(nullable= false, unique=true)
	private String address;

	
	

	public CompanyEntity() {
		super();
	}

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

	
	
	

}
