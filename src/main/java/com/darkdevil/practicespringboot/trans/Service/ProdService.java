package com.darkdevil.practicespringboot.trans.Service;

import com.darkdevil.practicespringboot.Sonar.Model.Prod;
import org.springframework.stereotype.Service;

public interface ProdService {
    boolean updateProd(Prod prod, int x, int y);
}
