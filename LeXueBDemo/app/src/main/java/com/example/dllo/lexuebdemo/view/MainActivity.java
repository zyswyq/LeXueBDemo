package com.example.dllo.lexuebdemo.view;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.presenter.MainPresenter;

/**
 * by 王宇琦
 * 主界面
 */

public class MainActivity extends BaseActivity implements MainView{

    private RadioButton mainPage,teacherPage,findPage,MyPage;
    private RadioGroup mainRagioGroup;
    private FragmentManager manager;
    private FragmentTransaction transaction;
    private MainPresenter presenter;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }


    @Override
    protected void initView() {
        mainPage = bindView(R.id.radiobtn_main);
        teacherPage = bindView(R.id.radiobtn_teacher);
        findPage = bindView(R.id.radiobtn_find);
        MyPage = bindView(R.id.radiobtn_my);
        mainRagioGroup=bindView(R.id.radiogroup_main);
        manager=getSupportFragmentManager();
        presenter=new MainPresenter(this);
        mainPage.setChecked(true);
    }


    @Override
    protected void initData() {

    }


    @Override
    protected void initListener() {
        mainRagioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
               presenter.addView(i);
            }
        });
    }


    @Override
    public void onAddFragment(Fragment fragment) {
        transaction=manager.beginTransaction();
        transaction.replace(R.id.frame_main,fragment);
        transaction.commit();
    }


    @Override
    public void onRadiuGroupCheckChange(int Id) {

    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

}
