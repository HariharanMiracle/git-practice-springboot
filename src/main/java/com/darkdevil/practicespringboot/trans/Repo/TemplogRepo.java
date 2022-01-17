package com.darkdevil.practicespringboot.trans.Repo;

import com.darkdevil.practicespringboot.trans.Model.Templog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemplogRepo extends CrudRepository<Templog, Integer> {
}
