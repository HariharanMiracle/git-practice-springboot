package com.darkdevil.practicespringboot.Sonar.DAO;

import com.darkdevil.practicespringboot.Sonar.Model.Prod;

import java.util.List;

public interface ProdDao {
   List<Prod> listTest(String prodfam);
   List<Prod> listTest2(String prodfam);
}
