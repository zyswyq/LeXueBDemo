package com.example.dllo.lexuebdemo.teacher;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherSubjectPresenter {
    private TeacherSubjectView teacherSubjectView;
    public TeacherSubjectPresenter(TeacherSubjectView teacherSubjectView){
        this.teacherSubjectView = teacherSubjectView;
    }

    public void setAdapter(){
        teacherSubjectView.setAdapter();
    }

    public void setRecyclerView(){
        teacherSubjectView.setRecyclerView();
    }
}
