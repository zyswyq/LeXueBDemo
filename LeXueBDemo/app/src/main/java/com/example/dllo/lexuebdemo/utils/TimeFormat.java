package com.example.dllo.lexuebdemo.utils;

import java.sql.Date;
import java.text.SimpleDateFormat;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TimeFormat {
    public static String formatTime(int time){
        long timeL = time;
        SimpleDateFormat dateFormater = new SimpleDateFormat("yyyy-MM-dd");
        Date date=new Date(timeL);
        return dateFormater.format(date);
    }
}
