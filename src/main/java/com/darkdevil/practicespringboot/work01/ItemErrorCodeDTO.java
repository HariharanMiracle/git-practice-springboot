package com.darkdevil.practicespringboot.work01;

import java.io.Serializable;

public class ItemErrorCodeDTO implements Serializable {
    private static final long serialVersionUID = -8642338036606463310L;
    private String itemCode;
    private Integer orderOffferItemSeq;
    private String verificationErrorCode;
    private String verificationRemarks;

    public ItemErrorCodeDTO() {
    }

    public String getItemCode() {
        return this.itemCode;
    }

    public void setItemCode(String itemCode) {
        this.itemCode = itemCode;
    }

    public Integer getOrderOffferItemSeq() {
        return this.orderOffferItemSeq;
    }

    public void setOrderOffferItemSeq(Integer orderOffferItemSeq) {
        this.orderOffferItemSeq = orderOffferItemSeq;
    }

    public String getVerificationErrorCode() {
        return this.verificationErrorCode;
    }

    public void setVerificationErrorCode(String verificationErrorCode) {
        this.verificationErrorCode = verificationErrorCode;
    }

    public String getVerificationRemarks() {
        return this.verificationRemarks;
    }

    public void setVerificationRemarks(String verificationRemarks) {
        this.verificationRemarks = verificationRemarks;
    }

    public String toString() {
        return "ItemErrorCodeDTO [itemCode=" + this.itemCode + ", orderOffferItemSeq=" + this.orderOffferItemSeq + ", verificationErrorCode=" + this.verificationErrorCode + ", verificationRemarks=" + this.verificationRemarks + "]";
    }
}
