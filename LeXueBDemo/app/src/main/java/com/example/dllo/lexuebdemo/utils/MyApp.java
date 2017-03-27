package com.example.dllo.lexuebdemo.utils;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class MyApp extends Application {
    private static final String TAG = "MyApp";
    private static Context context;
    public MyApp(){
        Log.e(TAG, "MyApp: start initApp");
        context = this;
    }

    public static Context getContext(){
        return context;
    }
}
