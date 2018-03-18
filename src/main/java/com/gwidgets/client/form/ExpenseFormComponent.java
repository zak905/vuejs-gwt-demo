package com.gwidgets.client.form;

import java.util.List;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Computed;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.VueComponent;
import com.gwidgets.client.dto.Currency;
import com.gwidgets.client.dto.Expense;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;

@Component
public class ExpenseFormComponent extends VueComponent {
    @JsProperty
    double amount =  0;
    @JsProperty
    String date = "";
    @JsProperty
    String reason="";
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
        expenses.add(new Expense(amount, date, reason, getAmountVAT(), vatRate, currency));
    }

    @Computed
    public double getAmountVAT() {
        return Double.parseDouble(vatRate) / 100 * amount;
    }
}