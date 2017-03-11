package com.example.dllo.lexuebdemo.find.presenter;

import android.content.Context;
import android.content.Intent;

import com.example.dllo.lexuebdemo.find.findview.FindView;
import com.example.dllo.lexuebdemo.find.findview.activity.FindDetilCafeActivity;
import com.example.dllo.lexuebdemo.find.findview.activity.FindDetilVideoActivity;
import com.example.dllo.lexuebdemo.find.findview.activity.FindWebView;

/**
 * Created by dllo on 17/3/9.
 * 王宇琦
 */

public class FindPresenter {

    private FindView findView;
    private Intent intent;

    public FindPresenter(FindView findView) {
        this.findView = findView;
    }

    public void setAdaper(){
        findView.setAdapter();
    }

    public void goIntent(int position, Context context){
        switch (position){
            case 0:
                intent = new Intent(context, FindDetilVideoActivity.class);
                findView.goActivity(intent);
                break;
            case 1:
                intent=new Intent(context, FindDetilCafeActivity.class);
                findView.goActivity(intent);
                break;
            case 2:
                intent=new Intent(context, FindWebView.class);
                findView.goActivity(intent);
                break;
        }
    }
}
