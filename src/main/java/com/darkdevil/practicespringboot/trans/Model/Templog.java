package com.darkdevil.practicespringboot.trans.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Templog {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int studentId;
    private String studentName;
    private String subject;
    private String score;
    private String status;
    private String statusDescription;
}
