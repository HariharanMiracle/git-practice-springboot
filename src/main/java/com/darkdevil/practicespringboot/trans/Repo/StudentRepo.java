package com.darkdevil.practicespringboot.trans.Repo;

import com.darkdevil.practicespringboot.trans.Model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends CrudRepository<Student, Integer> {
}
