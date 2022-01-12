package com.darkdevil.practicespringboot.Sonar.DAO;

import com.darkdevil.practicespringboot.Sonar.Model.Prod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Types;
import java.util.List;

@Repository
public class ProdDaoImpl implements ProdDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Prod> listTest(String prodfam) {
        List<Prod> prodList = jdbcTemplate.query("SELECT * FROM prod WHERE prodfam = ?",  new Object[] { prodfam } , new BeanPropertyRowMapper(Prod.class));
        return prodList;
    }

    @Override
    public List<Prod> listTest2(String prodfam) {
        int[] argTypes = { Types.VARCHAR };
        System.out.println("Method Name: " + Thread.currentThread().getStackTrace()[1].getMethodName());
//        List<Prod> prodList = jdbcTemplate.query("SELECT * FROM prod WHERE prodfam = ?",  new Object[] { prodfam } , new BeanPropertyRowMapper(Prod.class));
        List<Prod> prodList = jdbcTemplate.query("SELECT * FROM prod WHERE prodfam = ?",  new Object[] { prodfam }, argTypes, new BeanPropertyRowMapper(Prod.class));
        return prodList;
    }
}
