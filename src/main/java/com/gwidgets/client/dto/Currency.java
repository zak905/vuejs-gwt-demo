package com.gwidgets.client.dto;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType
public class Currency {

    @JsProperty
    String name;

    @JsProperty
    String symbol;


    @JsConstructor
    public Currency(String name, String symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    @JsMethod
    public String getName() {
        return name;
    }

    @JsMethod
    public String getSymbol() {
        return symbol;
    }
}