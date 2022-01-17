package com.darkdevil.practicespringboot.trans.Service;

import com.darkdevil.practicespringboot.trans.Model.Mark;
import com.darkdevil.practicespringboot.trans.Repo.MarkRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MarkServiceImpl implements MarkService {

    @Autowired
    private MarkRepo markRepo;

    @Override
    public Mark saveOrUpdateMark(Mark mark) {
        mark = markRepo.save(mark);
        return mark;
    }
}
