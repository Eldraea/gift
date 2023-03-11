package com.efreiproject.gift.model;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="company")
public class Company {
	
	@Id
	@GeneratedValue
	private UUID id;
	private String name;
	
	@Column(unique=true)
	private String address;
	
	@OneToMany(mappedBy="company")
	private List<Internship> internships;
	
	
	
	
	public Company( ){
		
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
