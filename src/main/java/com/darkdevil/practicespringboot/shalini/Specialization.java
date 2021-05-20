package com.darkdevil.practicespringboot.shalini;

import java.util.HashMap;

public class Specialization {
    private HashMap<String, Float> specializationList  = new HashMap<String,Float>();

    public void addSpecialization(String specialization, float gpa){
        specializationList.put(specialization, gpa);
    }
}
