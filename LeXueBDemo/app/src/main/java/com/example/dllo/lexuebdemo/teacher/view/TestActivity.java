package com.example.dllo.lexuebdemo.teacher.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.dllo.lexuebdemo.R;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TestActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private CollapsingToolbarLayout collapsingToolbarLayout;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        collapsingToolbarLayout =(CollapsingToolbarLayout)findViewById(R.id.ctl);
        //在此设置标题，可以随着View的滑动而伸缩
//        collapsingToolbarLayout.setTitle("标题");

    }
}
