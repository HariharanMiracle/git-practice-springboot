package com.darkdevil.practicespringboot.proctoringapp;

import lombok.Data;

import java.util.List;

@Data
public class Lecture {
    private int id;
    private String name;
    private String teacher;
    private String startTime;
    private String endTime;
    private List<Question> questions;
}
