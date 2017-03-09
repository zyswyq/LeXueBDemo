package com.example.dllo.lexuebdemo.view;

import android.support.design.widget.TabLayout;
import android.support.v7.widget.RecyclerView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.adapter.TeacherRecyclerViewAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherFragment extends BaseFragment {
    private RecyclerView recyclerView;
    private TabLayout tabLayout;
    private TeacherRecyclerViewAdapter adapter;

    private List<String> tagList;

    @Override
    protected int getLayout() {
        return R.layout.fragment_teacher;
    }

    @Override
    protected void initView() {
        recyclerView = bindView(R.id.rv_teacher);
        tabLayout = bindView(R.id.tablayout_teacher);
    }

    @Override
    protected void initData() {
        tagList = new ArrayList<>();
        for(int i = 1; i <= 15; i++){
            tagList.add("课程"+i);
        }
        adapter = new TeacherRecyclerViewAdapter();
        adapter.setContext(context);

    }

    @Override
    protected void initListener() {

    }
}
