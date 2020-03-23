package com.example;

import java.util.Date;
import java.util.Random;

public class TempRange
{
    private Date startDate;
    private Date endDate;
    private Integer low;
    private Integer high;
    
	public TempRange(Date startDate, Date endDate) {
        this.startDate = startDate;
        this.endDate = endDate;

        final Random rand = new Random();
        this.setLow(rand.nextInt(5));
        this.setHigh(rand.nextInt(10));
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

}