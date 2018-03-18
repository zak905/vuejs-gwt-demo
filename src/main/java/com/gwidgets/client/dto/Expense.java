package com.gwidgets.client.dto;


import com.google.gwt.core.client.GWT;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class Expense {

    @JsConstructor
    public Expense(double amount, String date, String reason, double amountVat, String vatRate, String currency) {
        this.amount = amount;
        this.date = date;
        this.reason = reason;
        GWT.log("inside constructor" + amountVat);
        this.amountVAT = amountVat;
        this.vatRate = vatRate;
        this.currency = currency;
    }

    @JsProperty
    public double amount = 0;

    @JsProperty
    public String date;

    @JsProperty
    public String reason;

    @JsProperty
    public double amountVAT = 0;

    @JsProperty
    public String vatRate;

    @JsProperty
    public String vat;

    @JsProperty
    public String currency;
}