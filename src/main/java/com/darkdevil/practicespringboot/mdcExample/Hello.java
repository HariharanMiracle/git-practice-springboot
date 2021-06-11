package com.darkdevil.practicespringboot.mdcExample;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;

@Component
public class Hello {
    public void sayHello(){
        String val = MDC.get("param1");
        System.out.println("val: " + val);
        System.out.println("Hello world!");
    }
}
