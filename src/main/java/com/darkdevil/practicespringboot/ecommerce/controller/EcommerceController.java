package com.darkdevil.practicespringboot.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ecommerce")
public class EcommerceController {

    @GetMapping("test")
    public String test(){
        return "test";
    }

}
