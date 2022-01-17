package com.darkdevil.practicespringboot.trans.Service;

import com.darkdevil.practicespringboot.trans.Model.Templog;
import com.darkdevil.practicespringboot.trans.Repo.TemplogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TemplogServiceImpl implements TemplogService {

    @Autowired
    private TemplogRepo templogRepo;

    @Override
    public Templog saveOrUpdate(Templog templog) {
        templog = templogRepo.save(templog);
        return templog;
    }
}
