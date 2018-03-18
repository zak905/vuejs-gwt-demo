package com.gwidgets.client.dto;

public class Expense {
    public double amount;
    public String date;
    public String reason;
    public double amountVAT;
    public double vatRate;
    public String vat;
    public String currency;

    public Expense(double amount, String date, String reason, double amountVat, double vatRate, String currency) {
        this.amount = amount;
        this.date = date;
        this.reason = reason;
        this.amountVAT = amountVat;
        this.vatRate = vatRate;
        this.currency = currency;
    }
}