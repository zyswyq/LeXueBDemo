package com.example.dllo.lexuebdemo.teacher.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.dllo.lexuebdemo.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TestActivity extends AppCompatActivity {
    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.ctl)
    CollapsingToolbarLayout ctl;
    @BindView(R.id.abl)
    AppBarLayout abl;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
        //在此设置标题，可以随着View的滑动而伸缩
//        collapsingToolbarLayout.setTitle("标题");

    }

    @OnClick({R.id.iv, R.id.toolbar, R.id.ctl, R.id.abl})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv:
                break;
            case R.id.toolbar:
                break;
            case R.id.ctl:
                break;
            case R.id.abl:
                break;
        }
    }
}
