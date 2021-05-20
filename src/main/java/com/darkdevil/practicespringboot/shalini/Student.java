package com.darkdevil.practicespringboot.shalini;

import java.util.Random;

public class Student {
    private String studentId;
    private String name;
    private String address;
    private char sex;
    private int bornYear;
    private String specialization;
    private float[] marks = new float[5];

    public void addDetails(String name, String address, char sex, int bornYear, String specialization) {
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.bornYear = bornYear;
        this.specialization = specialization;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getBornYear() {
        return bornYear;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String generateId(){
        try{
            Random random = new Random();
            String genertedId = "IT";
            String randomNumber = String.format("%05d", random.nextInt(100000));

            if(randomNumber.length() < 4 || !genertedId.equals("IT")){
                throw new IDInvalidException("Digit length not greater than or equal to 4 or prefix not equals to 'IT'");
            }

            genertedId = genertedId + randomNumber;
            this.studentId = genertedId;

            return genertedId;
        }
        catch (IDInvalidException e){
            System.out.println("Student.generateId() Error: " + e.toString());
            return generateId();
        }
    }

    public void showDetails(){
        System.out.println("Student name " + name);
        System.out.println("Student Address " + address);
        System.out.println("Gender " + sex);
        System.out.println("Student year " + bornYear);
        System.out.println("Student Specialization " + specialization);
    }

    public void addMark(float m1, float m2, float m3, float m4, float m5){
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        marks[3] = m4;
        marks[4] = m5;
    }
}
