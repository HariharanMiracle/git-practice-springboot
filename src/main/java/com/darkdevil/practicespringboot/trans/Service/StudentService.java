package com.darkdevil.practicespringboot.trans.Service;

import com.darkdevil.practicespringboot.trans.Model.Student;

public interface StudentService {
    Student saveOrUpdateStudent(Student student);
    Student getStudentById(int id);
}
