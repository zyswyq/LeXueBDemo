package com.example.dllo.lexuebdemo.teacher.view;

import com.example.dllo.lexuebdemo.teacher.model.SubjectBean;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public interface ITeacherSubjectView {
    void setAdapter();
    void setRecyclerView();

    void setNetData(SubjectBean subjectBean);
}
