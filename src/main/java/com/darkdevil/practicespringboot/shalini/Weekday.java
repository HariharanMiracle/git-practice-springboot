package com.darkdevil.practicespringboot.shalini;

public class Weekday extends Student{
    private String freeDay;

    public void addDetails(String name, String address, char sex, int bornYear, String specialization, String freeDay) {
        super.addDetails(name, address, sex, bornYear, specialization);
        this.freeDay = freeDay;
    }

    public String getFreeDay() {
        return freeDay;
    }

    public void setFreeDay(String freeDay) {
        this.freeDay = freeDay;
    }

    public void showDetails(){
        super.showDetails();
        System.out.println("Student Freeday " + freeDay);
    }
}
