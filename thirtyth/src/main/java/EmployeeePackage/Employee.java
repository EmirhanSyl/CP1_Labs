package EmployeeePackage;

import JobPackage.Job;
import java.util.ArrayList;

public abstract class Employee {
    private String firstName;
    String lastName;
    private Job[] jobs;
    
    ArrayList<String> addresses = new ArrayList<>();
    Departmant departmant;
    
    void GetEmployeeSalary(){
        int total = 0;
        for (Job job : jobs) {
            total += job.GetJobSalary();
        }
        System.out.println(firstName + ": " + total);
    }
    
    void SetJobSalary(Job job, int increaseAmount){
        for (Job job1 : getJobs()) {
            if (job1.jobName.equals(job.jobName)) {
               job1.salary += increaseAmount; 
            }
        }
    }
    
    
    int GetJobCount(){
        return getJobs().length;
    }

    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Job[] getJobs() {
        return jobs;
    }
    public void setJobs(Job[] jobs) {
        this.jobs = jobs;
    }
}
