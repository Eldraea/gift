package com.efreiproject.gift.soutenances.services;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;
import com.efreiproject.gift.soutenances.shared.SoutenanceDto;
import org.springframework.stereotype.Service;

@Service
public interface SoutenanceService {
    SoutenanceDto updateSoutenance(InternshipEntity internshipEntity, SoutenanceDto soutenanceToUpdate);
    SoutenanceDto createSoutenance(long internshipId);

}
