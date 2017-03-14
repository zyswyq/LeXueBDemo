package com.example.dllo.lexuebdemo.teacher.view;

import android.view.View;
import android.widget.PopupWindow;

import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;

import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public interface ITeacherView {
    void setAdapter();
    void setTabLayout(List<String> tagList);
    void onShow();
   <T> void  setNetData(T data);
}
