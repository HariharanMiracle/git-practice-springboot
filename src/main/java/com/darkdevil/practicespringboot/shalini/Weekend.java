package com.darkdevil.practicespringboot.shalini;

public class Weekend extends Student{
    private String jobTitle;

    public void addDetails(String name, String address, char sex, int bornYear, String specialization, String jobTitle) {
        super.addDetails(name, address, sex, bornYear, specialization);
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Student Job Title " + jobTitle);
    }
}
