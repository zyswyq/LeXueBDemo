package com.example.dllo.lexuebdemo.teacher;

import java.util.ArrayList;
import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherPresenter {
    private TeacherView teacherView;
    private TeacherPageTagBean bean;
    private final List<String> tagList;

    public TeacherPresenter(TeacherView teacherView) {
        this.teacherView = teacherView;
        tagList = new ArrayList<>();
        for(int i = 1; i <= 15; i++){
            tagList.add("课程"+i);
        }
        bean = new TeacherPageTagBean(tagList);
    }

    public void setAdapter() {
        teacherView.setAdapter();
    }

    public void setTabLayout() {
        teacherView.setTabLayout(bean.getTags());
    }
}
