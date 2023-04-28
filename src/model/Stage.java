package model;
import java.util.Calendar;

public class Stage {
    //attributes
    private StageType type; // Start, Analysis, Design, Development, ClosingAndMaintenance, ProjectControl
    private boolean active;

    //relations
    private Calendar startDate;
    private Calendar endDate;
    private Calendar actualStartDate;
    private Calendar actualEndDate;
    private KnowledgeUnit[] knowledgeUnits;

    //methods
    public Stage(int intType, boolean approvedState) { //TODO: Add date support
        this.type = StageType.getType(intType);
        this.active = approvedState;
        knowledgeUnits = new KnowledgeUnit[50];
    }
    
    public StageType getType() {
        return type;
    }

    public void setType(int intType) {
        this.type = StageType.getType(intType);
    }

    public boolean isActive() {
        return active;
    }
    
    public void setActive(boolean approvedState) {
        this.active = approvedState;
    }
    
    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }
    
    public Calendar getEndDate() {
        return endDate;
    }
    
    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }
    
    public Calendar getActualStartDate() {
        return actualStartDate;
    }
    
    public void setActualStartDate(Calendar actualStartDate) {
        this.actualStartDate = actualStartDate;
    }
    
    public Calendar getActualEndDate() {
        return actualEndDate;
    }

    public void setActualEndDate(Calendar actualEndDate) {
        this.actualEndDate = actualEndDate;
    }

    public KnowledgeUnit[] getKnowledgeUnits() {
        return knowledgeUnits;
    }
    
    public void setKnowledgeUnits(KnowledgeUnit[] knowledgeUnits) {
        this.knowledgeUnits = knowledgeUnits;
    }

    @Override
    public String toString() {
        return "Stage: " + type + "\nApproved State: " + active + "\nStart Date: " + startDate + "\nEnd Date: "
                + endDate + "\nActual Start Date: " + actualStartDate + "\nActual End Date: " + actualEndDate;
    }
}
