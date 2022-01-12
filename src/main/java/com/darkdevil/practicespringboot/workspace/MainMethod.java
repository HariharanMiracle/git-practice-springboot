package com.darkdevil.practicespringboot.workspace;

import org.springframework.scheduling.annotation.Async;

public class MainMethod {
    public static void main(String[] args) {
        System.out.println("Calling async method");
        asyncMethod();
        System.out.println("Hi I am from mainMethod");
    }

    @Async
    public static void asyncMethod(){
        try{
            Thread.sleep(5000);
            System.out.println("Hi I am from asyncMethod");
        }
        catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
