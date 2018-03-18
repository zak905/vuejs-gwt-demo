package com.gwidgets.client;


import com.axellience.vuegwt.core.annotations.component.Component;
import com.axellience.vuegwt.core.client.component.VueComponent;
import com.gwidgets.client.dto.Currency;
import com.gwidgets.client.dto.Expense;
import com.gwidgets.client.form.ExpenseFormComponent;
import com.gwidgets.client.list.ExpenseListComponent;
import jsinterop.annotations.JsProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component(components = {ExpenseFormComponent.class, ExpenseListComponent.class})
public class AppComponent extends VueComponent  {

    @JsProperty
    String vatRate = "20";

    @JsProperty
    List<Expense> expenses = new ArrayList<>();


    @JsProperty
    List<Currency> currencies = Arrays.asList(new Currency("EUR", "€"),
                                              new Currency("USD", "$"),
                                              new Currency("GBP", "£"));
}