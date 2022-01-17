package com.darkdevil.practicespringboot.trans.Repo;

import com.darkdevil.practicespringboot.trans.Model.Mark;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkRepo extends CrudRepository<Mark, Integer> {
}
