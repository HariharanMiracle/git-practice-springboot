package com.darkdevil.practicespringboot.Sonar.Model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity(name = "prod")
public class Prod implements Serializable {
    @Id
    private int id;
    private String prodfam;
    private String prodname;
}
