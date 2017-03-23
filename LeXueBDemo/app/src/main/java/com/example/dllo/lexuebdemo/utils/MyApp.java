package com.example.dllo.lexuebdemo.utils;

import android.app.Application;
import android.content.Context;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class MyApp extends Application {
    private static Context context;
    public MyApp(){
        context = this;
    }

    public static Context getContext(){
        return context;
    }
}
