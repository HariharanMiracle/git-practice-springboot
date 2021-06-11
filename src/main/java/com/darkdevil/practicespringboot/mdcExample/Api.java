package com.darkdevil.practicespringboot.mdcExample;

import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("mdc/api")
public class Api {

    @Autowired
    private Hello hello;

    @GetMapping("test")
    public String test(){
        String val = "param-1-value";
        MDC.put("param1", val);
        System.out.println("Api: test: " + val);
        hello.sayHello();
        return "test";
    }

}
