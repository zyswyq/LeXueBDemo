package com.example.dllo.lexuebdemo.teacher.presenter;

import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.example.dllo.lexuebdemo.teacher.model.Constant;
import com.example.dllo.lexuebdemo.teacher.model.SubjectBean;
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

    public void getNetData(int id){
        NetTools.getInstance().startRequest(Constant.TEACHER_SUBJECT_BASE_URL + id, SubjectBean.class, new MyCallBack<SubjectBean>() {
            @Override
            public void success(SubjectBean respomse) {
                teacherSubjectView.setNetData(respomse);
            }

            @Override
            public void error(Throwable throwable) {

            }
        });
    }

    public void setAdapter(){
        teacherSubjectView.setAdapter();
    }

    public void setRecyclerView(){
        teacherSubjectView.setRecyclerView();
    }
}
