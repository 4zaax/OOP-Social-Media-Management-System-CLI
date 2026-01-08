package repositories;

import entities.Report;
import entities.enums.ReportStatus;

import java.util.ArrayList;

public interface ReportRepository {
    ReportRepository findReportById(long id);
    Report findReportByUserId(long id);
    Report findReportByPostId(long id);
    ArrayList<Report> findReportsByStatus(ReportStatus status);
    ArrayList<Report> findAllReports();
    void saveReport(Report report);
    void deleteById(long id);
}