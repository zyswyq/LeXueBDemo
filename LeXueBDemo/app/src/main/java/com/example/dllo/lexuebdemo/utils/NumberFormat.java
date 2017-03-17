package com.example.dllo.lexuebdemo.utils;

import java.math.BigDecimal;

/*
    by Mr.L
    data 2017-03-11
    desc 对数字进行格式化,返回相应对字符串
        example:
            input 8589 output 8589
            input 28589 output 2.86万
            input 128589 output 12.9万
            input 34128589 output 3412万
*/
public class NumberFormat {
    public static String formatNum(int number){
        if(number < 10000){
            return number+"";
        }else if(number < 100000){
            float fNum = number;
            float result = fNum/10000;
            float ff = new BigDecimal(result).setScale(2, BigDecimal.ROUND_HALF_UP).floatValue();
            return ff + "万";
        }else if(number < 1000000){
            float fNum = number;
            float result = fNum/10000;
            float ff = new BigDecimal(result).setScale(1, BigDecimal.ROUND_HALF_UP).floatValue();
            return ff + "万";
        }else{
            return number/10000 + "万";
        }


    }
}
