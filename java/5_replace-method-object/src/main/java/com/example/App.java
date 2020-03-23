package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Order order = new Order();
        // OrderSolved order = new OrderSolved();
        System.out.println(order.price(2));
    }
}
