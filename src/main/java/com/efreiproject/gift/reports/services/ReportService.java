package com.efreiproject.gift.reports.services;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.reports.shared.ReportDto;
import com.efreiproject.gift.soutenances.shared.SoutenanceDto;
import org.springframework.stereotype.Service;

@Service
public interface ReportService {
    ReportDto updateReport(InternshipEntity internshipEntity, ReportDto reportToUpdate);
    ReportDto createReport(long internshipId);

}
