package com.efreiproject.gift.visits.services;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.soutenances.shared.SoutenanceDto;
import com.efreiproject.gift.visits.shared.VisitDto;
import org.springframework.stereotype.Service;

@Service
public interface VisitService {

    VisitDto updateVisit(InternshipEntity internshipEntity, VisitDto visitToUpdate);
    VisitDto createVisit(long internshipId);

}
