package com.darkdevil.practicespringboot.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

@Component
@Endpoint(id="custom-test")
public class CustomEndPoint {
    @ReadOperation
    public String getTest(){
        return "test-actuator";
    }

    @WriteOperation
    public String postTest(@Selector String value){
        return "Hello " + value;
    }
}
