package com.darkdevil.practicespringboot.trans.Controller;

import com.darkdevil.practicespringboot.Sonar.DAO.ProdDao;
import com.darkdevil.practicespringboot.Sonar.Model.Prod;
import com.darkdevil.practicespringboot.trans.Service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdController {
    @Autowired
    private ProdService prodService;

    @PutMapping("updateProd/{x}/{y}")
    public boolean function1(@RequestBody Prod prod, @PathVariable int x, @PathVariable int y){
        boolean data = prodService.updateProd(prod, x, y);
        return data;
    }
}
