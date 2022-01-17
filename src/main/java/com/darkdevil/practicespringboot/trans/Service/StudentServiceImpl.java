package com.darkdevil.practicespringboot.trans.Service;

import com.darkdevil.practicespringboot.trans.Model.Student;
import com.darkdevil.practicespringboot.trans.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepo studentRepo;

    @Override
    public Student saveOrUpdateStudent(Student student) {
        student = studentRepo.save(student);
        return student;
    }

    @Override
    public Student getStudentById(int id) {
        try{
            Student student = studentRepo.findById(id).get();
            return student;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
}
