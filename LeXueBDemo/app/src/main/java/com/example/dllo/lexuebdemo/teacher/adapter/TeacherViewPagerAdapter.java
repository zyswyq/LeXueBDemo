package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dllo.lexuebdemo.teacher.view.TeacherSubjectFragment;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherViewPagerAdapter extends FragmentPagerAdapter {
    private Context context;

    public TeacherViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return TeacherSubjectFragment.instanceFragment();
    }

    @Override
    public int getCount() {
        return 15;
    }
}
