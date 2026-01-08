package entities;

import entities.enums.ReportStatus;

public class Report{

    private static int idCounter = 0;
    private final int reportId;
    private final int reporterId;
    private final int postId;
    private final String reason;
    private ReportStatus status;

    // getters

    public static int getIdCounter() {
        return idCounter;
    }


    public int getReportId() {
        return reportId;
    }

    public int getReporterId() {
        return reporterId;
    }

    public int getPostId() {
        return postId;
    }

    public String getReason() {
        return reason;
    }

    public ReportStatus getStatus() {
        return status;
    }

    public void setStatus(ReportStatus status) {
        this.status = status;
    }

    public  Report(int reporterId, int postId, String reason) {
       this.reportId = this.idCounter++;
       this.reporterId = reporterId;
       this.postId = postId;
       this.reason = reason;
       this.status = ReportStatus.OPEN;
    }
}