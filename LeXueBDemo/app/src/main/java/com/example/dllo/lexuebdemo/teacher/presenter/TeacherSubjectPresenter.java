package com.example.dllo.lexuebdemo.teacher.presenter;

import com.example.dllo.lexuebdemo.teacher.view.ITeacherSubjectView;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherSubjectPresenter {
    private ITeacherSubjectView teacherSubjectView;
    public TeacherSubjectPresenter(ITeacherSubjectView teacherSubjectView){
        this.teacherSubjectView = teacherSubjectView;
    }

    public void setAdapter(){
        teacherSubjectView.setAdapter();
    }

    public void setRecyclerView(){
        teacherSubjectView.setRecyclerView();
    }
}
