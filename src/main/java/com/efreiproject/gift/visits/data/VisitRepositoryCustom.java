package com.efreiproject.gift.visits.data;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;

public interface VisitRepositoryCustom {

    VisitEntity getVisitByInternshipId(InternshipEntity internshipEntity);
}
