package com.example.dllo.lexuebdemo.teacher.presenter;

import com.example.dllo.lexuebdemo.teacher.view.ITeacherTagListView;

import java.util.ArrayList;
import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherTagListPresenter {
    private ITeacherTagListView teacherTagListView;
    private List<String> tagList;


    public TeacherTagListPresenter(ITeacherTagListView teacherTagListView){
        this.teacherTagListView = teacherTagListView;
        tagList = new ArrayList<String>();
        for(int i = 1; i <= 15; i++){
            tagList.add("课程"+i);
        }
    }

    public void initAdapter(){
        teacherTagListView.initAdapter(tagList);
    }

    public void onHide(){
        teacherTagListView.onHide();
    }

    public List<String> getTagList(){
        return teacherTagListView.getTagList();
    }

}
