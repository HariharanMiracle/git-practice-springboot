package com.darkdevil.practicespringboot.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="dark/api/v1")
public class TestController {

    @Value("${megatron.tax.url}")
    private String taxWsUrl;

    @Autowired
    Environment env;

    @GetMapping(value = "/test")
    public String test(){
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
