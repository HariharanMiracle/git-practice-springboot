package com.darkdevil.practicespringboot.AsyncTest;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncSub {
    @Async
    public void asyncMethod(){
        try{
            Thread.sleep(5000);
            System.out.println("Hi I am from asyncMethod");
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
