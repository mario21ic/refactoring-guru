package com.example;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App 
{
    public static void main( String[] args )
    {
        Date today = new Date();
        Date yesterday = new GregorianCalendar(2020, Calendar.MARCH, 21).getTime();

        Reporter mario = new Reporter("Mario");
        // ReporterSolved mario = new ReporterSolved("Mario");
        System.out.println(mario.speak(yesterday, today));
    }
}
