package com.example;

public class MyClass
{
    private Integer quantify;
    private Double itemPrice;

    public MyClass(Integer quantify, Double itemPrice) {
        this.quantify = quantify;
        this.itemPrice = itemPrice;
    }

    public MyClass() {
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

    
    public Double calcPrice() {
        Double basePrice = this.quantify * this.itemPrice;

        if (basePrice > 1000) {
            return basePrice * 0.95;
        } else {
            return basePrice * 0.98;
        }
    }
}