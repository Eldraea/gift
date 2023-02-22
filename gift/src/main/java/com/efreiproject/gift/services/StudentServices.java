package com.efreiproject.gift.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.efreiproject.gift.model.StudentDetailed;

@Service
public class StudentServices {
	
	private static List<StudentDetailed> students = new ArrayList<>();
	
	static {
		students.add(new StudentDetailed(java.util.UUID.randomUUID(),java.util.UUID.randomUUID(), java.util.UUID.randomUUID(), "Kimberly", "NEWTON", "+33687269637","kimberly.jacques@efrei.net", LocalDate.now(), "E-Learning Lover!" ));
		students.add(new StudentDetailed(java.util.UUID.randomUUID(),java.util.UUID.randomUUID(), java.util.UUID.randomUUID(), "Dabi", "KEITA", "+33687269637","dabi.keita@efrei.net", LocalDate.now(), "Money money money must be funny in a rich man's world!" ));
	}
	
	public List<StudentDetailed> getStudents() {
		return students;
	}
	
	public StudentDetailed getUser(UUID studentId) {
		return students.stream().filter(student -> student.getId().equals(studentId)).findFirst().get();
	}
	

}
