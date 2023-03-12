package com.efreiproject.gift.archivedstudents.services;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.efreiproject.gift.archivedstudents.data.ArchivedStudentEntity;
import com.efreiproject.gift.archivedstudents.data.ArchivedStudentRepository;
import com.efreiproject.gift.archivedstudents.shared.ArchivedStudentDto;


@Service
public class ArchivedStudentServiceImplementation implements ArchivedStudentService {
	
	private ArchivedStudentRepository archivedStudentRepository;
	
	@Autowired
	public ArchivedStudentServiceImplementation(ArchivedStudentRepository archivedStudentRepository) {
		this.archivedStudentRepository = archivedStudentRepository;
	}
	
	public List<ArchivedStudentDto> getStudents() {
		List<ArchivedStudentDto> students = new ArrayList<ArchivedStudentDto>();
		for (ArchivedStudentEntity archivedStudent : archivedStudentRepository.findAll()) 
		{ 
		    students.add(new ModelMapper().map(archivedStudent, ArchivedStudentDto.class));
		}
		return students;
	}

	@Override
	public List<ArchivedStudentDto> getArchivedStudentsDetailsByTutorId(long id) {
		List<ArchivedStudentEntity> archivedStudentEntities =  archivedStudentRepository.getArchivedStudentsByTutorId(id);
		List<ArchivedStudentDto> archivedStudentDtos = new ArrayList<ArchivedStudentDto>();
		if(archivedStudentEntities.isEmpty())
			return new ArrayList<ArchivedStudentDto>();
		for(ArchivedStudentEntity archivedStudentEntity : archivedStudentEntities)
		  archivedStudentDtos.add(new ModelMapper().map(archivedStudentEntity, ArchivedStudentDto.class));
	
		return archivedStudentDtos;
	}

}
