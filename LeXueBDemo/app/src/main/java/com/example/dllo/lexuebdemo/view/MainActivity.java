package com.example.dllo.lexuebdemo.view;

import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.adapter.MainVPAdapter;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.presenter.MainPresenter;
import com.example.dllo.lexuebdemo.view.fragment.TeacherFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * by 王宇琦
 * 主界面
 */

public class MainActivity extends BaseActivity implements MainView{

    private RadioButton mainPage,teacherPage,findPage,myPage;
    private RadioGroup mainRagioGroup;
    private MainPresenter presenter;
    private NoMoveViewPager mainVP;
    private List<Fragment> fragments;
    private MainVPAdapter adapter;

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }


    @Override
    protected void initView() {
        fragments=new ArrayList<>();
        mainPage = bindView(R.id.radiobtn_main);
        teacherPage = bindView(R.id.radiobtn_teacher);
        findPage = bindView(R.id.radiobtn_find);
        myPage = bindView(R.id.radiobtn_my);
        mainRagioGroup=bindView(R.id.radiogroup_main);
        mainVP=bindView(R.id.vp_main);
        presenter=new MainPresenter(this);
        mainPage.setChecked(true);
        adapter=new MainVPAdapter(getSupportFragmentManager());
    }


    @Override
    protected void initData() {
        fragments.add(new HomeTabFragment());
        fragments.add(new TeacherFragment());
        fragments.add(new FindFragment());
        fragments.add(new FindFragment());
        adapter.setFragments(fragments);
        mainVP.setAdapter(adapter);
        mainVP.setOffscreenPageLimit(4);
    }


    @Override
    protected void initListener() {
        mainRagioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
               presenter.selectPage(i);
            }
        });
    }


    @Override
    public void selectFragment(int i) {
        mainVP.setCurrentItem(i);
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
