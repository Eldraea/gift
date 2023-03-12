package com.efreiproject.gift.reports.data;

import com.efreiproject.gift.internships.data.InternshipEntity;
import com.efreiproject.gift.soutenances.data.SoutenanceEntity;

import java.util.List;

public interface ReportRepositoryCustom {

    ReportEntity getReportByInternshipId(InternshipEntity internshipEntity);
}
