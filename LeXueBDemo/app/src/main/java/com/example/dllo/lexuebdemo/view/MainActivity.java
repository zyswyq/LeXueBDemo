package com.example.dllo.lexuebdemo.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;

/**
 * by 王宇琦
 * 主界面
 */

public class MainActivity extends BaseActivity {

    private RadioButton mainPage,teacherPage,findPage,MyPage;
    private RadioGroup mainRagioGroup;
    private FragmentManager manager;
    private FragmentTransaction transaction;


    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mainPage = (RadioButton) findViewById(R.id.radiobtn_main);
        teacherPage = (RadioButton) findViewById(R.id.radiobtn_teacher);
        findPage = (RadioButton) findViewById(R.id.radiobtn_find);
        MyPage = (RadioButton) findViewById(R.id.radiobtn_my);
        mainRagioGroup=(RadioGroup)findViewById(R.id.radiogroup_main);
        manager=getSupportFragmentManager();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mainRagioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radiobtn_main:
                        break;
                    case R.id.radiobtn_teacher:
                        break;
                    case R.id.radiobtn_find:
                        break;
                    case R.id.radiobtn_my:
                        break;
                }
            }
        });
    }
}
