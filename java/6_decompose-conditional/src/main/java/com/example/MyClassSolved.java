package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyClassSolved {
    private Integer winterRate;
    private Integer summerRate;
    private Integer winterServiceCharge;
    private Date summerStart;
    private Date summerEnd;

    public MyClassSolved() {
        this.winterRate = 10;
        this.summerRate = 12;
        this.winterServiceCharge = 5;

        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy/MM/dd");
        try {
            this.summerStart = sdformat.parse("2020/01/11");
            this.summerEnd = sdformat.parse("2020/04/30");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public Boolean isSummer(Date date) {
        if (date.after(this.summerStart) && date.before(this.summerEnd)) {
            return true;
        }
        return false;
    }

    public Integer compute(Date date, Integer quantify) {
        Integer charge = 0;
        if (this.isSummer(date)) {
            System.out.println("Verano");
            charge = quantify * this.summerRate;
        } else {
            System.out.println("Invierno");
            charge = quantify * (this.winterRate + this.winterServiceCharge);
        }
        return charge;
    }
    
}