package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dllo.lexuebdemo.teacher.model.TeacherTagBean;
import com.example.dllo.lexuebdemo.teacher.view.TeacherSubjectFragment;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherVpAdapter extends FragmentPagerAdapter {
    private Context context;
    private TeacherTagBean teacherTagBean;

    public void setTeacherTagBean(TeacherTagBean teacherTagBean) {
        this.teacherTagBean = teacherTagBean;
    }

    public TeacherVpAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return TeacherSubjectFragment.instanceFragment(teacherTagBean.getSubjects().get(position));
    }

    @Override
    public int getCount() {
        return teacherTagBean.getSubjects().size();
    }
}
