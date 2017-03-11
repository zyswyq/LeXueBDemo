package com.example.dllo.lexuebdemo.teacher.view;

import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public interface TeacherTagListView {
    void setAdapter(List<String> tagList);

    void onHide();

    void setSelectedItem(int position);
}
