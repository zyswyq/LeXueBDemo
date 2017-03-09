package com.example.dllo.lexuebdemo.view;

import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.adapter.TeacherRecyclerViewAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TheacherSubjectFragment extends BaseFragment {
    private RecyclerView recyclerView;
    private TeacherRecyclerViewAdapter adapter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_teacher_subject;
    }

    @Override
    protected void initView() {
        recyclerView = bindView(R.id.rv_teacher_subject);
    }

    @Override
    protected void initData() {
        adapter = new TeacherRecyclerViewAdapter();
        adapter.setContext(context);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void initListener() {

    }

    public static Fragment instanceFragment(){
        Fragment fragment = new TheacherSubjectFragment();
        return fragment;
    }
}
