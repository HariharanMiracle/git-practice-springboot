package com.darkdevil.practicespringboot.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;

@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

// ###############################################################################################

    // sample
//    @Before("execution(* com.darkdevil.practicespringboot.aop..*(..))")
//    @Before("execution(public String method1())")
//    @Before("execution(* com.darkdevil.practicespringboot..*(..))")
//    public void log(){
//        System.out.println("Name: " + Thread.currentThread().getName() + " | logging...");
//    }

// ###############################################################################################

    // before and after advice together
//    @Pointcut("execution(* AOPController.*(..))")
//    public void abcPointcut(){}

//    @Around("abcPointcut()")
//    public Object myadvice(ProceedingJoinPoint pjp) throws Throwable
//    {
//        System.out.println("Additional Concern Before calling actual method");
//        Object obj=pjp.proceed();
//        System.out.println("Object: " + obj.toString());
//        System.out.println("Additional Concern After calling actual method");
//        return obj;
//    }

// ###############################################################################################

    // For scheduled job
//    @Around("execution(public void testScheduler())")
//    public void myadvice1(ProceedingJoinPoint pjp) throws Throwable
//    {
//        System.out.println("Additional Concern Before calling actual method");
//        Object obj=pjp.proceed();
//        System.out.println("Additional Concern After calling actual method");
//    }

// ###############################################################################################

    //Before and after advices
//    @Before(value="execution(public String method3(..)) && args(id)", argNames = "joinPoint,id")
//    public void myadvice1(JoinPoint joinPoint, String id){
//        System.out.println("AOP: Before advice");
//        System.out.println("Request: " + id);
//    }
//
//    @AfterReturning(value = "execution(public String method3(..))", returning = "response", argNames = "joinPoint,response")
//    public void after(JoinPoint joinPoint, String response) {
//
//        System.out.println("Response : " + response);
//    }


// ###############################################################################################



}
