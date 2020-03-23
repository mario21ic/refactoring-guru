package com.example;

public class App 
{
    public static void main( String[] args )
    {
        MyClass myclass = new MyClass(11, 32.11);
        // MyClassSolved myclass = new MyClassSolved(11, 32.11);
        System.out.println(myclass.calcPrice());
    }
}
