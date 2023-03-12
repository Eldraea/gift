package com.efreiproject.gift.tutors.shared;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

import com.efreiproject.gift.students.data.StudentEntity;

public class TutorDto implements Serializable {
	
	private static final long serialVersionUID = 2214309915494222447L;

	private long id;
	private UUID tutorId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String profession;
	private String phoneNumber;
	private String pictureUrl;
	private String encryptedPassword;
	private List<StudentEntity> students;
	
	
	public List<StudentEntity> getStudents() {
		return students;
	}
	public void setStudents(List<StudentEntity> students) {
		this.students = students;
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
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
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
	public UUID getTutorId() {
		return tutorId;
	}
	public String getPassword() {
		return password;
	}
	public void setTutorId(UUID tutorId) {
		this.tutorId = tutorId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	
	
	
	
}
