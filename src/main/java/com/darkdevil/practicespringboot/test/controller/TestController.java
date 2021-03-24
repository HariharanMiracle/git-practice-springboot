package com.darkdevil.practicespringboot.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="dark/api/v1")
public class TestController {

    @GetMapping(value = "/test")
    public String test(){
        return "test";
    }

    @RequestMapping(value="/test1", method = RequestMethod.GET)
    public String test1(){
        return "test 1";
    }

}
