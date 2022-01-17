package com.darkdevil.practicespringboot.trans.Service;

import com.darkdevil.practicespringboot.trans.Model.Student;
import com.darkdevil.practicespringboot.trans.Model.Mark;

public interface StudMarkService {
    boolean saveStudentAndMark(Student student, Mark mark);
}
