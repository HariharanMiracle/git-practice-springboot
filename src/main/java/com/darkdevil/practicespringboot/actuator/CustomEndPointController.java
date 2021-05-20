package com.darkdevil.practicespringboot.actuator;

import com.darkdevil.practicespringboot.example1.model.Posts;
import org.springframework.boot.actuate.endpoint.web.annotation.RestControllerEndpoint;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@RestControllerEndpoint(id = "rest-endpoint")
public class CustomEndPointController {
    @GetMapping("/custom1")
    public String custom1(){
        return "custom1";
    }

    @PostMapping("/custom2")
    public String custom2(@RequestBody Posts posts){
        return posts.toString();
    }
}
