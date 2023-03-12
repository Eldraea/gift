package com.efreiproject.gift.soutenances.data;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.students.data.StudentEntity;
import com.efreiproject.gift.tutors.data.TutorEntity;

import java.util.List;

public interface SoutenanceRepositoryCustom {
   SoutenanceEntity getSoutenanceByInternshipId(InternshipEntity internshipEntity);
}
