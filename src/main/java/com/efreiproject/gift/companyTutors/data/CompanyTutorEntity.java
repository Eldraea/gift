package com.efreiproject.gift.companyTutors.data;

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
@Table(name = "TutorInCompany")
public class CompanyTutorEntity {

	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable= false, unique=true)
	private UUID companyId;
	
	@Column(nullable= false)
	private String companyTutorFirstName;
	
	@Column(nullable= false)
	private String companyTutorLastName;
	
	@Column(nullable= false)
	private String companyTutorProfession;
	
	@Column(nullable= false)
	private String companyTutorPhoneNumber;
	
	@Column(nullable= false, unique=true)
	private String companyTutorEmail;


	public CompanyTutorEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public UUID getCompanyId() {
		return companyId;
	}

	public String getCompanyTutorFirstName() {
		return companyTutorFirstName;
	}

	public String getCompanyTutorLastName() {
		return companyTutorLastName;
	}

	public String getCompanyTutorProfession() {
		return companyTutorProfession;
	}

	public String getCompanyTutorPhoneNumber() {
		return companyTutorPhoneNumber;
	}

	public String getCompanyTutorEmail() {
		return companyTutorEmail;
	}


	public void setId(long id) {
		this.id = id;
	}

	public void setCompanyId(UUID companyId) {
		this.companyId = companyId;
	}

	public void setCompanyTutorFirstName(String companyTutorFirstName) {
		this.companyTutorFirstName = companyTutorFirstName;
	}

	public void setCompanyTutorLastName(String companyTutorLastName) {
		this.companyTutorLastName = companyTutorLastName;
	}

	public void setCompanyTutorProfession(String companyTutorProfession) {
		this.companyTutorProfession = companyTutorProfession;
	}

	public void setCompanyTutorPhoneNumber(String companyTutorPhoneNumber) {
		this.companyTutorPhoneNumber = companyTutorPhoneNumber;
	}

	public void setCompanyTutorEmail(String companyTutorEmail) {
		this.companyTutorEmail = companyTutorEmail;
	}


	
	
	
}
