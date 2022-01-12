package com.darkdevil.practicespringboot.trans.Service;

import com.darkdevil.practicespringboot.Sonar.Model.Prod;
import com.darkdevil.practicespringboot.trans.Repo.ProdRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class ProdServiceImpl implements ProdService{

    @Autowired
    ProdRepo prodRepo;

    @Transactional
    @Override
    public boolean updateProd(Prod prod, int x, int y) {
        Prod dbProd = prodRepo.save(prod);
        process(x, y);
        return true;
    }

    void process(int x, int y){
        System.out.println(x/y);
    }
}
