package com.efreiproject.gift.internships.service;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.internships.shared.InternshipDto;

import java.util.List;

public interface InternshipService {

    InternshipDto createInternship(InternshipDto internshipDto);
    List<InternshipDto> getInternshipsStudentId(Long studentId);
    InternshipDto getInternshipById(Long studentId,Long internshipId);

    InternshipDto updateIntership(Long studentId, Long internshipId,InternshipDto internshipDto);
    void deleteInternship(Long studentId,Long internshipId);


}
