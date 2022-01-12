package com.darkdevil.practicespringboot.work01;


public class OrderRsDTO extends BaseDTO {


    private static final long serialVersionUID = -3304528648637117516L;

    private String orderId;
    private String verificationStatus;
    private ItemErrorCodeDTO[] itemErrorCode;
    private DocumentDTO[] document;

    private Cir[] cir;

    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public String getVerificationStatus() {
        return verificationStatus;
    }
    public void setVerificationStatus(String verificationStatus) {
        this.verificationStatus = verificationStatus;
    }
    public ItemErrorCodeDTO[] getItemErrorCode() {
        return itemErrorCode;
    }
    public void setItemErrorCode(ItemErrorCodeDTO[] itemErrorCode) {
        this.itemErrorCode = itemErrorCode;
    }
    public DocumentDTO[] getDocument() {
        return document;
    }
    public void setDocument(DocumentDTO[] document) {
        this.document = document;
    }
    public Cir[] getCir() {
        return cir;
    }
    public void setCir(Cir[] cir) {
        this.cir = cir;
    }
    @Override
    public String toString() {
        return "OrderRsDTO [orderId=" + orderId + ", verificationStatus="
                + verificationStatus + "]";
    }





}
