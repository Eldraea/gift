package com.efreiproject.gift.students.data;

import java.util.List;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.tutors.data.TutorEntity;

import jakarta.persistence.*;

@Entity
@Table(name ="student")
public class StudentEntity {
	
	@Id
	@GeneratedValue
	private long id;

	@Column
	private Long studentId;
	@ManyToOne(fetch= FetchType.LAZY)
	private TutorEntity tutorId;
	
	@Column(nullable= false)
	private String firstName;
	
	@Column(nullable= false)
	private String lastName;
	
	@Column(nullable= false)
	private String currentClass;
	
	@Column(nullable= false)
	private String phoneNumber;

	
	@Column(nullable= false, unique = true)
	private String email;
	
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


	public TutorEntity getSchoolTutor() {
		return tutorId;
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

	public String getEmail() {
		return email;
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


	public void setSchoolTutor(TutorEntity schoolTutor) {
		this.tutorId = schoolTutor;
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

	public void setEmail(String email) {
		this.email = email;
	}



	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public void setInternships(List<InternshipEntity> internships) {
		this.internships = internships;
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
}
