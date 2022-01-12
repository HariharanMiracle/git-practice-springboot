package com.darkdevil.practicespringboot.Sonar.Controller;

import com.darkdevil.practicespringboot.Sonar.DAO.ProdDao;
import com.darkdevil.practicespringboot.Sonar.Model.Prod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("sonar")
public class DatabaseChangeController {

    @Autowired
    private ProdDao prodDao;

    @GetMapping("function1/{prodfam}")
    public String function1(@PathVariable String prodfam){
        List<Prod> prodList = prodDao.listTest2(prodfam);
        return prodList.toString();
    }

}
