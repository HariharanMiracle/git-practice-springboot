package com.darkdevil.practicespringboot.work01;

import java.io.Serializable;
import java.math.BigDecimal;

public class DocumentDTO implements Serializable {
    private static final long serialVersionUID = 4909719187900218705L;
    private String docNumber;
    private String docType;
    private String docSbu;
    private String docVendorType;
    private BigDecimal docTotal;

    public DocumentDTO() {
    }

    public String getDocNumber() {
        return this.docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getDocType() {
        return this.docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocSbu() {
        return this.docSbu;
    }

    public void setDocSbu(String docSbu) {
        this.docSbu = docSbu;
    }

    public String getDocVendorType() {
        return this.docVendorType;
    }

    public void setDocVendorType(String docVendorType) {
        this.docVendorType = docVendorType;
    }

    public BigDecimal getDocTotal() {
        return this.docTotal;
    }

    public void setDocTotal(BigDecimal docTotal) {
        this.docTotal = docTotal;
    }

    public String toString() {
        return "DocumentDTO [docNumber=" + this.docNumber + ", docType=" + this.docType + ", docSbu=" + this.docSbu + ", docVendorType=" + this.docVendorType + ", docTotal=" + this.docTotal + "]";
    }
}
