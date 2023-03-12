package com.efreiproject.gift.tutors.data;

import java.util.List;
import java.util.UUID;

import com.efreiproject.gift.students.data.StudentEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="tutor")
public class TutorEntity {
	
private static final long serialVersionUID = 1214075402618036775L;
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable=false, unique=true)
	private UUID tutorId;
	
	@Column(nullable=false, length=50)
	private String firstName;
	
	@Column(nullable=false, length=50)
	private String lastName;
	
	@Column(nullable=false, length=120, unique=true)
	private String email;
	
	@Column(nullable=false, length=100)
	private String profession;
	
	@Column(nullable=false, length=10)
	private String phoneNumber;
	
	@Column(nullable=true, length=255)
	private String pictureUrl;
	
	@Column(nullable=false, unique=true)
	private String encryptedPassword;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<StudentEntity> students;
	
	
	
	
	public TutorEntity() {
		super();
	}
	public long getId() {
		return id;
	}
	public UUID getTutorId() {
		return tutorId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getEmail() {
		return email;
	}
	
	public String getProfession() {
		return profession;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getPictureUrl() {
		return pictureUrl;
	}
	public String getEncryptedPassword() {
		return encryptedPassword;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setTutorId(UUID tutorId) {
		this.tutorId = tutorId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName.toUpperCase();
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public void setEncryptedPassword(String encryptedPassword) {
		this.encryptedPassword = encryptedPassword;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public List<StudentEntity> getStudents() {
		return students;
	}
	public void setStudents(List<StudentEntity> students) {
		this.students = students;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
