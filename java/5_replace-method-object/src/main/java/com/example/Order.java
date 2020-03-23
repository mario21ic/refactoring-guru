package com.example;

public class Order
{
    public Integer price(Integer quantify) {
        Integer primaryBasePrice = 10;
        Integer secondayBasePrice = 20;
        Integer tertiaryBasePrice = 30;
        return quantify * (primaryBasePrice + secondayBasePrice + tertiaryBasePrice);
    }
}