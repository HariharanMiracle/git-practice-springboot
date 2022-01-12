package com.darkdevil.practicespringboot.AsyncTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AsyncController {

    @Autowired
    AsyncSub asyncSub;

    @GetMapping("/async/test")
    public String asyncTest(){
        System.out.println("asyncTest");
        asyncSub.asyncMethod();
        return "Hello";
    }


}
