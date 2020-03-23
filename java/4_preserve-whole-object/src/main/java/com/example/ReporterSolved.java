package com.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReporterSolved
{
    private String name;

    public ReporterSolved(String name) {
        this.name = name;
    }

    private String whitinRange(TempRange tempRange) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        return String.format("Start: %s - End: %s\nLow: %s - High: %s",
                dateFormat.format(tempRange.getStartDate()),
                dateFormat.format(tempRange.getEndDate()), 
                tempRange.getLow(),
                tempRange.getHigh());
    }

    public String speak(Date startDate, Date endDate) {
        String message = "Good morning, this is " + this.name + "\n";
        String whitinRange = this.whitinRange(new TempRange(startDate, endDate));
        return message + whitinRange;
    }

}