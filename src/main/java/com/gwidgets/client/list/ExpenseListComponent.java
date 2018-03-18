package com.gwidgets.client.list;

import java.util.List;

import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.annotations.component.Prop;
import com.axellience.vuegwt.core.client.component.VueComponent;
import com.gwidgets.client.dto.Currency;
import com.gwidgets.client.dto.Expense;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;

@Component
public class ExpenseListComponent extends VueComponent {
    @Prop
    @JsProperty
    double vatRate;

    @Prop
    @JsProperty
    List<Expense> expenses;

    @Prop
    @JsProperty
    List<Currency> currencies;

    @JsMethod
    public String getCurrencySymbol(String currencyName) {
        return currencies.stream()
                         .filter(currency -> currency.getName().equals(currencyName))
                         .findFirst()
                         .map(Currency::getSymbol)
                         .orElse("$");
    }
}