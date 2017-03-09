package com.example.dllo.lexuebdemo.view;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.dllo.lexuebdemo.R;

/**
 * by 王宇琦
 * 主界面
 */

public class MainActivity extends AppCompatActivity {

    private ViewPager mainVp;
    private RadioButton mainPage,teacherPage,findPage,MyPage;
    private RadioGroup mainRagioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        mainVp = (ViewPager) findViewById(R.id.vp_main);
        mainPage = (RadioButton) findViewById(R.id.radiobtn_main);
        teacherPage = (RadioButton) findViewById(R.id.radiobtn_teacher);
        findPage = (RadioButton) findViewById(R.id.radiobtn_find);
        MyPage = (RadioButton) findViewById(R.id.radiobtn_my);
        mainRagioGroup=(RadioGroup)findViewById(R.id.radiogroup_main);

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
