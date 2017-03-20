package com.example.dllo.lexuebdemo.utils;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class ActivityCollector {
    public static List<Activity> actvities = new ArrayList<Activity>();

    public static void addActivity(Activity activity){
        actvities.add(activity);
    }

    public static void removeActivity(Activity activity){
        actvities.remove(activity);
    }

    public static void  finishAll(){
        for(Activity activity : actvities){
            if(!activity.isFinishing()){
                activity.finish();
            }
        }
    }
}
