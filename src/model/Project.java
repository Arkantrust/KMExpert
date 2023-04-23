package model;
import java.util.Calendar;

public class Project {
    //attributes
    private String name;
    private String clientName;
    private Calendar startDate;
    private Calendar endDate;
    private double budget;
    private String managerName;
    private String managerPhone;
    
    //relations
    private Stage[] stages;

    private Calendar today = Calendar.getInstance();

    //CONSTANTS
    public final int NUMSTAGES = 6;

    //methods
    public Project(String name, String clientName, Calendar endDate, double budget,
            String managerName, String managerPhone, Calendar stageEndDate) {
        this.name = name;
        this.clientName = clientName;
        this.startDate = today;
        this.endDate = endDate;
        this.budget = budget;
        this.managerName = managerName;
        this.managerPhone = managerPhone;

        // Stage
        this.stages = new Stage[NUMSTAGES];
        stages[0] = new Stage(1, true);
        stages[0].setStartDate(today);
        stages[0].setEndDate(stageEndDate);
        for (int i = 1; i < NUMSTAGES; i++) {
            stages[i] = new Stage(i, false);
        }
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClientName() {
        return clientName;
    }
    public void setClientName(String clientName) {
        this.clientName = clientName;
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
    public double getBudget() {
        return budget;
    }
    public void setBudget(double budget) {
        this.budget = budget;
    }
    public String getManagerName() {
        return managerName;
    }
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }
    public String getManagerPhone() {
        return managerPhone;
    }
    public void setManagerPhone(String managerPhone) {
        this.managerPhone = managerPhone;
    }

    public Stage[] getStages() {
        return stages;
    }

    public void setStages(Stage[] stages) {
        this.stages = stages;
    }

    public String toString() {
        return "Project Name: " + name + "\nClient Name: " + clientName + "\nStart Date: " + startDate + "\nEnd Date: "
                + endDate + "\nBudget: " + budget + "\nManager Name: " + managerName + "\nManager Phone: " + managerPhone;
    }
}
