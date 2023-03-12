package com.efreiproject.gift.internships.data;

import com.efreiproject.gift.internships.shared.InternshipDto;

import java.util.List;

public interface InternshipRepositoryCustom {
    List<InternshipEntity> getInternshipsStudentId(Long studentId);
    InternshipEntity getInternshipById(Long id);

    void deleteInternshipByIdAndStudentId(Long id, Long studenId);
}
