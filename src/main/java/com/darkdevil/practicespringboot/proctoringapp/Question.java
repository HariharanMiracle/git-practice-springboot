package com.darkdevil.practicespringboot.proctoringapp;

import lombok.Data;

@Data
public class Question {
    private String questionName;
    private String answer1;
    private String answer2;
    private String answer3;
    private int correct;
}
