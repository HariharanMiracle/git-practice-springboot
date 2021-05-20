package com.darkdevil.practicespringboot.shalini;

import java.util.HashMap;
import java.util.Map;

public class Enroll {
    private HashMap<String, String> studentList = new HashMap<String,String>();

    public void enrollStudent(String name, String specialization){
        this.studentList.put(name, specialization);
    }

    public void displayEnrolledStudents(){
        for(Map.Entry stdObj : studentList.entrySet()){
            System.out.println(stdObj.getKey() + " : " + stdObj.getValue());
        }
    }
}
