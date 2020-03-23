package com.example;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

public class Customer
{
    DateFormat dateFormat;

    public Customer() {
        this.dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    }

    public void amountInvoicedIn(Date startDate, Date endDate) {
        System.out.println(String.format("amountInvoicedIn: %s - %s",
            this.dateFormat.format(startDate),
            this.dateFormat.format(endDate)));
    }

    public void amountReceivedIn(Date startDate, Date endDate) {
        System.out.println(String.format("amountReceivedIn: %s - %s",
            this.dateFormat.format(startDate),
            this.dateFormat.format(endDate)));
    }

    public void amountOverdueIn(Date startDate, Date endDate) {
        System.out.println(String.format("amountOverdueIn: %s - %s",
            this.dateFormat.format(startDate),
            this.dateFormat.format(endDate)));
    }

}