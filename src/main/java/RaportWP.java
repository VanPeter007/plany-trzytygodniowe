import lombok.Data;

@Data
public class RaportWP {
    private String ac;
    private String wpNo;
    private String wpDescription;
    private String station;
    private String wpStatus;
    private String wpStatusName;
    private String wpClassification;
    private String plannedStartDate;
    private String plannedStartTime;
    private String plannedEndDate;
    private String plannedEndTime;
    private String realStartDate;
    private String realStartTime;
    private String realEndDate;
    private String realEndTime;
    private String delay;
    private String projectNo;
    private String Priority;
    private String remarks;
    private String internalRemarks;
    private String wpClassification2;
    private String orderReceivingDate;
}
