package com.example.dllo.lexuebdemo.teacher.view;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherRvAdapter;
import com.example.dllo.lexuebdemo.teacher.presenter.TeacherSubjectPresenter;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherSubjectFragment extends BaseFragment implements ITeacherSubjectView, TeacherRvAdapter.DetailInfo {
    private RecyclerView recyclerView;
    private TeacherRvAdapter adapter;
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
        adapter = new TeacherRvAdapter();
        adapter.setContext(context);
        adapter.setDetailInfo(this);
    }

    @Override
    public void setRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void showTeacherInfo(String url) {
        context.startActivity(new Intent(context, TeacherDetailInfoActivity.class));
    }

    @Override
    public void showMovieInfo(String url) {
        context.startActivity(new Intent(context, TeacherMovieDetailActivity.class));
    }

}
