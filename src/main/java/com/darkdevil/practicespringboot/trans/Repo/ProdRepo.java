package com.darkdevil.practicespringboot.trans.Repo;

import com.darkdevil.practicespringboot.Sonar.Model.Prod;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdRepo extends CrudRepository<Prod, Integer> {
}
