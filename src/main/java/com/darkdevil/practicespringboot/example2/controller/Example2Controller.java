package com.darkdevil.practicespringboot.example2.controller;

import com.darkdevil.practicespringboot.example2.model.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="dark/api/v1")
public class Example2Controller {

    @GetMapping(value="/lambda/1")
    public boolean lambda1(){
        try{

            List<Person> personList = new ArrayList<>();

            Person person1 = new Person();
            person1.setId(1);
            person1.setName("Hari");

            personList.add(person1);

            Person person2 = new Person();
            person2.setId(2);
            person2.setName("Vijay");

            personList.add(person2);

            Person person3 = new Person();
            person3.setId(3);
            person3.setName("Potter");

            personList.add(person3);

            System.out.println("normal for loop");
            // normal for loop
            for(Person p : personList){
                System.out.println(p.toString());
            }

            System.out.println("lambda for loop");
            // lambda for loop
            personList.forEach(
                    (p) -> {
                        System.out.println(p.toString());
                    }
            );

            return true;

        }
        catch (Exception e){
            System.out.println("Example2Controller => lambda1");
            e.printStackTrace();
            return false;
        }
    }

}
