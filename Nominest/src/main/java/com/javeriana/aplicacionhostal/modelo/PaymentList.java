package com.javeriana.aplicacionhostal.modelo;

import java.util.ArrayList;
import java.util.List;

public class PaymentList {
    // Attributes:
    private Tenant tenant = new Tenant();
    private List<Payment> paymentList = new ArrayList<>();
    private int MAX;
    // Constructors:
    public PaymentList() {
    }
    public PaymentList(Tenant tenant, int MAX) {
        this.tenant = tenant;
        this.MAX = MAX;
    }
    // Getters and setters:
    public Tenant getTenant() {
        return tenant;
    }
    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
    public List<Payment> getPaymentList() {
        return paymentList;
    }
    public void setPaymentList(List<Payment> paymentList) {
        this.paymentList = paymentList;
    }
    public int getMAX() {
        return MAX;
    }
    public void setMAX(int MAX) {
        this.MAX = MAX;
    }
    // Methods:
    public boolean addPayment() {
        return true;
    }
    public double calculateTotalPaid() {
        double total = 0;
        return total;
    }
    public Payment getPayment(int numPayment) {
        Payment payment = new Payment();
        return payment;
    }
    public int getTotal() {
        int total = 0;
        return total;
    }
    public boolean isFull() {
        return true;
    }
}
