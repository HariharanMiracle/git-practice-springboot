package com.darkdevil.practicespringboot.trans.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Mark {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;
    private int sid;
    private String subject;
    private String score;
}
