package com.darkdevil.practicespringboot.shalini;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Shalini {

    public static void main(String[] args){
//        String a = "3000003476";
//        System.out.println(a);
//        int b = Integer.parseInt(a);
//        System.out.println(b);

//        String a = "123";
//        System.out.println(a);
//        int b = Integer.parseInt(a);
//        System.out.println(b);

        String listString = "VVV-GHK-VVV";
        System.out.println(listString);
        listString.replaceAll("VVV-GHK-VVV", "XXX");
        System.out.println(listString);


        String arr[] = new String[2];
        arr[0] = "abc1";
        arr[1] = "abc2";

        List<Boolean> isFoundItemArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            isFoundItemArr.add(false);
        }

        for (boolean abc : isFoundItemArr){
            System.out.println("abc: " + abc);
        }

        System.out.println(arr.length);
        for(String arrObj : arr){
            System.out.println("* " + arrObj);
        }

        System.out.println(arr.toString());

        String a = "3000003476";
        System.out.println(a);
//        int b = Integer.parseInt(a);
        long b = Long.parseLong(a);
        System.out.println(b);
        int c = 999999999;
        System.out.println(c);

        Weekend student1 = new Weekend();
        student1.addDetails("Jane", "Malabe", 'F', 1990, "DS", "QA");
        String studentid = student1.generateId();
        student1.addMark(56, 34, 12, 46, 78);
        student1.showDetails();
        System.out.println("Student ID "+studentid);
        System.out.println();

        Weekday student2 = new Weekday();
        student2.addDetails("Jim", "Kaluthura", 'M', 1991, "SE", "Tuesday");
        String studentid2 = student2.generateId();
        student2.showDetails();
        System.out.println("Student ID "+studentid2);

        Enroll sem1 = new Enroll();
        sem1.enrollStudent(studentid, "IT");
        sem1.enrollStudent(studentid2, "SE");
        System.out.println("\n\nEnrolled student details");
        sem1.displayEnrolledStudents();

        Specialization spe = new Specialization();
        spe.addSpecialization("SE", (float) 2.75);
        spe.addSpecialization("DS", (float) 3.5);
    }

}
