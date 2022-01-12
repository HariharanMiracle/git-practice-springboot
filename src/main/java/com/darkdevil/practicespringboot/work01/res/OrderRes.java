package com.darkdevil.practicespringboot.work01.res;

import com.darkdevil.practicespringboot.work01.Cir;
import lombok.Data;

@Data
public class OrderRes {
    private int status;
    private String errorSpcCode;
    private String errorSpcMessage;
    private String orderId;
    private Cir cir[];
}
