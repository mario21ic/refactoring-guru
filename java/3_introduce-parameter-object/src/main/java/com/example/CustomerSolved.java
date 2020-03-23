package com.example;

import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class CustomerSolved
{
    DateFormat dateFormat;

    public CustomerSolved() {
        this.dateFormat = new SimpleDateFormat("yyyy/MM/dd");
    }

    public void amountInvoicedIn(DateRange dateRange) {
        System.out.println(String.format("amountInvoicedIn: %s - %s",
            this.dateFormat.format(dateRange.getStartDate()),
            this.dateFormat.format(dateRange.getEndDate())));
    }

    public void amountReceivedIn(DateRange dateRange) {
        System.out.println(String.format("amountReceivedIn: %s - %s",
        this.dateFormat.format(dateRange.getStartDate()),
        this.dateFormat.format(dateRange.getEndDate())));
    }

    public void amountOverdueIn(DateRange dateRange) {
        System.out.println(String.format("amountOverdueIn: %s - %s",
        this.dateFormat.format(dateRange.getStartDate()),
        this.dateFormat.format(dateRange.getEndDate())));
    }

}