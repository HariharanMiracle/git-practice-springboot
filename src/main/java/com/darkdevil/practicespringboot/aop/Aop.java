//package com.darkdevil.practicespringboot.aop;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.slf4j.MDC;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Component;
//import org.springframework.validation.BindingResult;
//import org.springframework.validation.FieldError;
//
//import java.util.*;
//
//
//@Aspect
//@Component
//@Slf4j
//@SuppressWarnings("unchecked")
//public class Aop {
//
//    public static final String MIFE_NAME = "MIFE_NAME";
//
//    @Before(value = "execution(* lk.dialog.crm.orders.controller..*.*(..)) && args(bindingResult)", argNames = "joinPoint,traceId,request,bindingResult")
//    public void before(JoinPoint joinPoint, BindingResult bindingResult) throws IllegalAccessException, NoSuchFieldException {
//
//        if (joinPoint.getSignature().getName().equals("updateCashMemoSale")) {
//            MDC.put(MIFE_NAME, "CashMemoMIFE_Name");
//
//
//        } else if (joinPoint.getSignature().getName().equals("placeOrder")) {
//            MDC.put(MIFE_NAME, "placeOrderMIFE_Name");
//
//
//        }
//
//        if (bindingResult.hasErrors()) {
//
//            String error = Objects.requireNonNull(bindingResult.getFieldError()).getDefaultMessage();
//
//            if (bindingResult.getAllErrors().size() > 1) {
//
//                error = validateMandatoryParameters(bindingResult);
//            }
//        }
//
//    }
//
//
//    @AfterReturning(value = "execution(* lk.dialog.crm.orders.controller..*.*(..)) || execution(* lk.dialog.crm.orders.aop.GlobalExceptionHandler.*(..)) ", returning = "response", argNames = "joinPoint,response")
//    public void after(JoinPoint joinPoint, ResponseEntity response) {
//
//        log.info("Response : " + response.getStatusCode() + " | " + response.getBody());
//        MDC.remove("traceId");
//    }
//
//
//    private String validateMandatoryParameters(BindingResult bindingResult) {
//
//        String allFields = "";
//        String errorMsg = "";
//        HashSet<String> fieldSet = new HashSet<>();
//        List<String> fieldList = new ArrayList<>();
//
//        List<FieldError> fieldErrorList = bindingResult.getFieldErrors();
//
//        for (FieldError fieldError : fieldErrorList) {
//            String field = fieldError.getField();
//            if (field.contains(".")) {
//                String[] fieldArray = field.split("\\.");
//                fieldSet.add(fieldArray[fieldArray.length - 1]);
//            } else {
//                fieldSet.add(field);
//            }
//
//
//        }
//
//        if (fieldSet.size() == 1) {
//            for (String value : fieldSet) {
//                allFields = value;
//
//
//            }
//            errorMsg = allFields + " can not be empty, null or invalid";
//        } else {
//            for (String value : fieldSet) {
//                fieldList.add(value);
//
//            }
//            Collections.sort(fieldList);
//            for (int i = 0; i < fieldList.size(); i++) {
//                if (i == fieldList.size() - 1) {
//                    allFields += "" + fieldList.get(i);
//                } else {
//                    allFields += "" + fieldList.get(i) + ",";
//                }
//
//            }
//            errorMsg = allFields + " are mandatory parameters. can not be empty, null or invalid";
//        }
//
//        return errorMsg;
//    }
//}
