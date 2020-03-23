package com.example;

public class OrderSolved
{
    public Integer price(Integer quantify) {
        return quantify * (new PriceCalculator().compute());
    }
}