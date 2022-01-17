package com.darkdevil.practicespringboot.trans.Service;

import com.darkdevil.practicespringboot.trans.Model.Student;
import com.darkdevil.practicespringboot.trans.Model.Mark;
import com.darkdevil.practicespringboot.trans.Model.Templog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudMarkServiceImpl implements StudMarkService {

    @Autowired
    StudentService studentService;

    @Autowired
    MarkService markService;

    @Transactional
    @Override
    public boolean saveStudentAndMark(Student student, Mark mark) {
        boolean rsp = saveItems(student, mark);
        return rsp;
    }

    private boolean saveItems(Student student, Mark mark) {
        /**
         * Check if student is already present
         * */
        Student stdFromDB = studentService.getStudentById(student.getId());
        if(stdFromDB == null)
            stdFromDB = student;

        stdFromDB = studentService.saveOrUpdateStudent(stdFromDB);
        mark.setSid(stdFromDB.getId());
        markService.saveOrUpdateMark(mark);
        makeAnException();

        return true;
    }

    private void makeAnException() {
        System.out.println("Making an exception");
        int sum = 5 / 0;
    }
}
