package com.gwidgets.client.form;


import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.annotations.component.Watch;
import com.axellience.vuegwt.core.client.component.VueComponent;
import com.gwidgets.client.dto.Currency;
import com.gwidgets.client.dto.Expense;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;

import java.util.List;

@Component
public class ExpenseFormComponent extends VueComponent {
    @JsProperty
    double amount =  0;
    @JsProperty
    String date = "";
    @JsProperty
    String reason="";
    @JsProperty
    double amountVAT=0;
    @JsProperty
    String currency="";

    @Prop
    @JsProperty
    String vatRate;

    @Prop
    @JsProperty
    List<Expense> expenses;

    @Prop
    @JsProperty
    List<Currency> currencies;

    @JsMethod
    public void submitExpense() {
        expenses.add(new Expense(amount, date, reason, amountVAT, vatRate, currency));
    }


    @Watch("amount")
    public void watchAmount(double newAmount) {
        this.amountVAT = Double.parseDouble(this.vatRate) / 100 * newAmount;
    }

    @Watch("vatRate")
    public void watchVatRate(String newVatRate) {
        this.amountVAT = Double.parseDouble(newVatRate) / 100 * this.amount;
    }
}