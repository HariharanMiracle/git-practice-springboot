package com.darkdevil.practicespringboot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value="dark/api/v1")
public class TestController {

    @Value("${megatron.tax.url}")
    private String taxWsUrl;

    @Autowired
    Environment env;

    @GetMapping(value = "/test")
    public String test(){

        HashMap<String, List<Student>> mapList = new HashMap<>();

        List<Student> stdList1 = new ArrayList<>();
        List<Student> stdList2 = new ArrayList<>();

        Student std1 = new Student("hari", "20");
        Student std2 = new Student("yasi", "21");
        Student std3 = new Student("dillu", "22");
        Student std4 = new Student("vino", "23");
        Student std5 = new Student("rahul", "24");

        stdList1.add(std1);
        stdList1.add(std2);
        stdList2.add(std3);
        stdList2.add(std4);

        mapList.put("class1", stdList1);
        mapList.put("class2", stdList2);

        mapList.get("class1").add(std5);

        System.out.println(mapList.containsKey("sadas"));
        System.out.println(mapList.containsKey("class2"));

        System.out.println(mapList.get("class1"));

        return "test";
    }

    @RequestMapping(value="/test1", method = RequestMethod.GET)
    public String test1(){
        return "test 1";
    }

    @GetMapping(value="/test2")
    public boolean test2(){

        return Boolean.parseBoolean(env.getProperty("STATUS_1"));
    }

    @GetMapping(value = "/test3")
    public String test3(){
        return taxWsUrl;
    }
}
