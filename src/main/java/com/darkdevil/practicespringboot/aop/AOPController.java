package com.darkdevil.practicespringboot.aop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="aop")
public class AOPController {

    @GetMapping("method1")
    public String method1(){
        System.out.println("aop/method1");
        return "text method 1";
    }

    @GetMapping("method2")
    public String method2(){
        System.out.println("aop/method2");
        return "text method 2";
    }

    @GetMapping("method3/{id}")
    public String method3(@PathVariable String id){
        return "prcessed_" + id;
    }

}
