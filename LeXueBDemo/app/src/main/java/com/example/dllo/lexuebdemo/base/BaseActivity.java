package com.example.dllo.lexuebdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.example.dllo.lexuebdemo.utils.ActivityCollector;

/*
    by Mr.L
    data 2017-03-09
    desc activity基类
*/
public abstract class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e("BaseActivity", getClass().getSimpleName());
        ActivityCollector.addActivity(this);
        setContentView(getLayout());

        initView();
        initData();
        initListener();

    }

    //得到需要绑定的布局layoutID
    protected abstract int getLayout();
    //初始化视图
    protected abstract void initView();
    //初始化数据
    protected abstract void initData();
    //初始化监听事件
    protected abstract void initListener();
    //提供一个绑定组件的方法
    protected <T extends View> T bindView(int resId){
        return (T)findViewById(resId);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }


}
