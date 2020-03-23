package com.example;

public class PriceCalculator
{
    private Integer primaryBasePrice;
    private Integer secondayBasePrice;
    private Integer tertiaryBasePrice;

    public PriceCalculator() {
        this.primaryBasePrice = 10;
        this.secondayBasePrice = 20;
        this.tertiaryBasePrice = 30;
    }

    public Integer compute() {
        return this.primaryBasePrice + this.secondayBasePrice + this.tertiaryBasePrice;
    }
}