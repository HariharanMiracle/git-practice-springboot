package com.dark.gitpracticespringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    /**
     * http://localhost:9090/math/test
     * */
    @GetMapping("test")
    public String test(){
        return "test";
    }

}
