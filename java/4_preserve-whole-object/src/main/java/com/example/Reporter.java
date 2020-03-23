package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Reporter
{
    private String name;

    public Reporter(String name) {
        this.name = name;
    }

    private String whitinRange(Date startDate, Date endDate, Integer low, Integer high) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return String.format("Start: %s - End: %s\nLow: %s - High: %s",
                dateFormat.format(startDate), 
                dateFormat.format(endDate), 
                low,
                high);
    }

    public String speak(Date startDate, Date endDate) {
        String message = "Good morning, this is " + this.name + "\n";
        TempRange tempRange = new TempRange(startDate, endDate);
        Integer low = tempRange.getLow();
        Integer high = tempRange.getHigh();
        String whitinRange = this.whitinRange(startDate, endDate, low, high);
        return message + whitinRange;
    }

}