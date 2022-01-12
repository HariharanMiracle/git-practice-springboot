package com.darkdevil.practicespringboot.work01;

import java.io.Serializable;

public class BaseDTO implements Serializable {

    /**
     * @author Eranga_jkcs
     */
    private static final long serialVersionUID = -2149169043844458113L;

    private Integer status;
    private String errorSpcCode;
    private String errorSpcMessage;


    public Integer getStatus() {
        return status;
    }
    public void setStatus(Integer status) {
        this.status = status;
    }
    public String getErrorSpcCode() {
        return errorSpcCode;
    }
    public void setErrorSpcCode(String errorSpcCode) {
        this.errorSpcCode = errorSpcCode;
    }
    public String getErrorSpcMessage() {
        return errorSpcMessage;
    }
    public void setErrorSpcMessage(String errorSpcMessage) {
        this.errorSpcMessage = errorSpcMessage;
    }







}
