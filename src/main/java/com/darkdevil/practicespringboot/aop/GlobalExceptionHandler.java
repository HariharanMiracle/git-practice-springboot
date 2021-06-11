package com.darkdevil.practicespringboot.aop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler({Exception.class})
    public void exceptionHandler1(Exception e){
        System.out.println("GlobalExceptionHandler: Error: " + e);
        e.printStackTrace();
    }

}
