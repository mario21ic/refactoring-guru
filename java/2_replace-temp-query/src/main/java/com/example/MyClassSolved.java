package com.example;

public class MyClassSolved
{
    private Integer quantify;
    private Double itemPrice;

    public MyClassSolved(Integer quantify, Double itemPrice) {
        this.quantify = quantify;
        this.itemPrice = itemPrice;
    }

    public MyClassSolved() {
    }

    public Integer getQuantify() {
        return quantify;
    }

    public void setQuantify(Integer quantify) {
        this.quantify = quantify;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }


    private Double basePrice() {
        return this.quantify * this.itemPrice;
    }

    public Double calcPrice() {
        Double basePrice = this.basePrice();

        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }
}