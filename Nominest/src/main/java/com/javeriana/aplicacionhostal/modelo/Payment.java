package com.javeriana.aplicacionhostal.modelo;

public class Payment {
    // Attributes:
    private PaymentList paymentList = new PaymentList();
    private double amount;
    private String month;
    // Constructors:
    public Payment() {
    }
    public Payment(PaymentList paymentList, double amount, String month) {
        this.paymentList = paymentList;
        this.amount = amount;
        this.month = month;
    }
    // Getters and setters:
    public PaymentList getPaymentList() {
        return paymentList;
    }
    public void setPaymentList(PaymentList paymentList) {
        this.paymentList = paymentList;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getMonth() {
        return month;
    }
    public void setMonth(String month) {
        this.month = month;
    }
}
