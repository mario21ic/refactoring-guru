package com.example;

public class App 
{
    public static void main( String[] args )
    {
        Printer my_printer = new Printer("Mario", 32);
        // PrinterSolved my_printer = new PrinterSolved("Mario", 32);
        my_printer.printOwing();
    }
}
