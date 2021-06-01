package com.darkdevil.practicespringboot.test.controller;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TestScheduler {

//    @Scheduled(fixedRate = 2000)
    public void testScheduler(){
        System.out.println("I am a scheduled function...");
    }

}
