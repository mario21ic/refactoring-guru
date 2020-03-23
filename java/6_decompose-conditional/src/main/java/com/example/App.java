package com.example;

import java.util.Date;
// import java.util.Calendar;
// import java.util.GregorianCalendar;

public class App 
{
    public static void main( String[] args )
    {
        Date today = new Date();
        // Date yesterday = new GregorianCalendar(2020, Calendar.MARCH, 21).getTime();

        MyClass myClass = new MyClass();
        // MyClassSolved myClass = new MyClassSolved();
        System.out.println(myClass.compute(today, 2));
    }
}
