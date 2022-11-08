package com.javeriana.aplicacionhostal.modelo;

public class Tenant {
    // Attributes:
    private TenantList tenantList = new TenantList();
    private PaymentList paymentList = new PaymentList();
    private int MAX;
    private String name;
    private int room;
    // Contributors:
    public Tenant() {
    }
    public Tenant(TenantList tenantList, PaymentList paymentList, int MAX, String name, int room) {
        this.tenantList = tenantList;
        this.paymentList = paymentList;
        this.MAX = MAX;
        this.name = name;
        this.room = room;
    }
    // Getters and setters:
    public TenantList getTenantList() {
        return tenantList;
    }
    public void setTenantList(TenantList tenantList) {
        this.tenantList = tenantList;
    }
    public int getMAX() {
        return MAX;
    }
    public void setMAX(int MAX) {
        this.MAX = MAX;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRoom() {
        return room;
    }
    public void setRoom(int room) {
        this.room = room;
    }
    public PaymentList getPaymentList() {
        return paymentList;
    }
    public void setPaymentList(PaymentList paymentList) {
        this.paymentList = paymentList;
    }
    // Methods:
    public PaymentList getPayments() {
        PaymentList payment = new PaymentList();
        return payment;
    }
    public void makePayment() {
    }
}
