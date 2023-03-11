package com.efreiproject.gift.students.data;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

import com.efreiproject.gift.internships.controllers.InternshipEntity;
import com.efreiproject.gift.tutors.data.TutorEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name ="student")
public class StudentEntity {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable= false, unique= true)
	private UUID studentId;
	
	@ManyToOne(fetch= FetchType.LAZY)
	private TutorEntity schoolTutor;
	
	@Column(nullable= false)
	private String firstName;
	
	@Column(nullable= false)
	private String lastName;
	
	@Column(nullable= false)
	private String currentClass;
	
	@Column(nullable= false)
	private String phoneNumber;
	
	@Column(nullable= false)
	private String Option;
	
	@Column(nullable= false)
	private String email;
	
	@Column(nullable= false)
	private LocalDate creationDate;
	
	@Column
	private String description;
	
	@Column
	private String pictureUrl;
	
	@OneToMany(mappedBy="student")
	private List<InternshipEntity> internships;
	
	

	public StudentEntity() {
		super();
	}

	public long getId() {
		return id;
	}

	public UUID getStudentId() {
		return studentId;
	}

	public TutorEntity getSchoolTutor() {
		return schoolTutor;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCurrentClass() {
		return currentClass;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getOption() {
		return Option;
	}

	public String getEmail() {
		return email;
	}

	public LocalDate getCreationDate() {
		return creationDate;
	}

	public String getDescription() {
		return description;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public List<InternshipEntity> getInternships() {
		return internships;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setStudentId(UUID studentId) {
		this.studentId = studentId;
	}

	public void setSchoolTutor(TutorEntity schoolTutor) {
		this.schoolTutor = schoolTutor;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCurrentClass(String currentClass) {
		this.currentClass = currentClass;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setOption(String option) {
		Option = option;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setCreationDate(LocalDate creationDate) {
		this.creationDate = creationDate;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public void setInternships(List<InternshipEntity> internships) {
		this.internships = internships;
	}
	
}
