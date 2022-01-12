package com.darkdevil.practicespringboot.trans.Model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Prod implements Serializable {
    private int id;
    private String prodfam;
    private String prodname;
}
