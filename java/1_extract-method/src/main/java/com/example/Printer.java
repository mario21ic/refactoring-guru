package com.example;

class Printer {

    private String name;
    private Integer amount;

    public Printer(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

    public Printer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    
    public void printBanner() {
        System.out.println("### Banner ###");
    }
    
    public void printOwing() {
        this.printBanner();
        System.out.println(String.format("Name: %s", this.name));
        System.out.println(String.format("Amount: %s", this.amount));
    }
}