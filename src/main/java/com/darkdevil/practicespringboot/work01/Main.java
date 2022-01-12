package com.darkdevil.practicespringboot.work01;

import com.darkdevil.practicespringboot.work01.res.NewOrderResponse;
import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        System.out.println(students.length);

        String data = "{\"response\":{\"status\":1,\"errorSpcCode\":\"00\",\"errorSpcMessage\":\"SUCCESS\",\"orderId\":\"79967719\",\"cir\":[{\"serialNo\":\"1\"},{\"serialNo\":\"2\"}]}}";
        String data1 = "{\"name\":\"Hariharan\",\"dob\":\"1999-04-22\"}";
        System.out.println(data);
        System.out.println(data1);

        Gson gsonRefundObj = new Gson();
        Student student = gsonRefundObj.fromJson(data1, Student.class);
        NewOrderResponse orderRsDTO = gsonRefundObj.fromJson(data, NewOrderResponse.class);
        System.out.println(student.toString());
        System.out.println(orderRsDTO.toString());

    }
}
