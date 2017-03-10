package com.example.dllo.lexuebdemo.teacher;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherSubjectFragment extends BaseFragment implements TeacherSubjectView{
    private RecyclerView recyclerView;
    private TeacherRecyclerViewAdapter adapter;
    private TeacherSubjectPresenter teacherSubjectPresenter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_teacher_subject;
    }

    @Override
    protected void initView() {
        recyclerView = bindView(R.id.rv_teacher_subject);
        teacherSubjectPresenter = new TeacherSubjectPresenter(this);
    }

    @Override
    protected void initData() {
        teacherSubjectPresenter.setAdapter();
        teacherSubjectPresenter.setRecyclerView();
    }

    @Override
    protected void initListener() {

    }

    public static Fragment instanceFragment(){
        Fragment fragment = new TeacherSubjectFragment();
        return fragment;
    }

    @Override
    public void setAdapter() {
        adapter = new TeacherRecyclerViewAdapter();
        adapter.setContext(context);
    }

    @Override
    public void setRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapter);
    }
}
