package model;
import java.util.Calendar;
import java.util.ArrayList;

public class Company {
    // attributes
    private String name;

    // relations
    private ArrayList<Project> projects;

    // methods
    public Company(String name) {
        this.name = name;
        projects = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }

    // _________________________Controller Class_______________________________________________

    public String createProject(String name, String clientName, Calendar endDate, double budget,
        String managerName, String managerPhone, Calendar stageEndDate) {

        String message = "";

        return message;
    }
    
    public String createCapsule() {
        String message = "";

        return message;

    }




}
