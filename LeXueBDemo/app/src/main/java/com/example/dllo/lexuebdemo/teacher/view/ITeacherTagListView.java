package com.example.dllo.lexuebdemo.teacher.view;

import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public interface ITeacherTagListView {
    void initAdapter(List<String> tagList);
    void onHide();
    List<String> getTagList();
}
