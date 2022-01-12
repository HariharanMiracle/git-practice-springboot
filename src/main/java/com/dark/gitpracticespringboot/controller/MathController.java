package com.dark.gitpracticespringboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
@RequestMapping("/math")
public class MathController {

    @Autowired
    Environment env;

    /**
     * http://localhost:9090/math/test
     * */
    @GetMapping("test")
    public String test(){
        return "test";
    }

    /**
     * http://localhost:9090/math/name/upper/KamAl
     * */
    @GetMapping("name/upper/{name}")
    public String nameUpper(@PathVariable String name){

        int length = name.length();

        int suffix = length + 4;
        name = "_" + name.toUpperCase() + "_";
        String prefix = env.getProperty("name.upper.value");

        String response = suffix + name + prefix;

        return response;
    }

    /**
     * http://localhost:9090/math/name/lower/KamAl
     * */
    @GetMapping("name/lower/{name}")
    public String nameLower(@PathVariable String name){

        int length = name.length();

        int suffix = length + 4;
        name = "_" + name.toLowerCase() + "_";
        String prefix = env.getProperty("name.lower.value");

        String response = suffix + name + prefix;

        return response;
    }

}
