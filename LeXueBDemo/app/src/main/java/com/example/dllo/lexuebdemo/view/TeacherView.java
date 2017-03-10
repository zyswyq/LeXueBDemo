package com.example.dllo.lexuebdemo.view;

import android.view.View;
import android.widget.PopupWindow;

import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public interface TeacherView {
    void setAdapter();
    void setTabLayout(List<String> tagList);
    void popTagList(PopupWindow popupWindow, View btn);
}
