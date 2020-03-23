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

        Customer customer = new Customer();
        customer.amountInvoicedIn(yesterday, today);
        customer.amountReceivedIn(yesterday, today);
        customer.amountOverdueIn(yesterday, today);

        // CustomerSolved customer = new CustomerSolved();
        // DateRange dateRange = new DateRange(yesterday, today);
        // customer.amountInvoicedIn(dateRange);
        // customer.amountReceivedIn(dateRange);
        // customer.amountOverdueIn(dateRange);
    }
}
