package com.darkdevil.practicespringboot.property.check.controller;

import com.darkdevil.practicespringboot.property.check.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("property/check")
public class PropertyCheckController {

    @Autowired
    Car car;

    @GetMapping("function/01")
    public Car function1(){
        System.out.println("Function Called...");
        return car;
    }

}
