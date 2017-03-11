package com.example.dllo.lexuebdemo.teacher.presenter;

import com.example.dllo.lexuebdemo.teacher.view.TeacherTagListView;
import com.example.dllo.lexuebdemo.teacher.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherTagListPresenter {
    private TeacherTagListView teacherTagListView;
    private List<String> tagList;

    public TeacherTagListPresenter(TeacherTagListView teacherTagListView){
        this.teacherTagListView = teacherTagListView;
        tagList = new ArrayList<String>();
        for(int i = 1; i <= 15; i++){
            tagList.add("课程"+i);
        }
    }

    public void setAdapter(){
        teacherTagListView.setAdapter(tagList);
    }

    public void onHide(){
        teacherTagListView.onHide();
    }


    public void setSelectedItem(int position){
        teacherTagListView.setSelectedItem(position);
    }


}
