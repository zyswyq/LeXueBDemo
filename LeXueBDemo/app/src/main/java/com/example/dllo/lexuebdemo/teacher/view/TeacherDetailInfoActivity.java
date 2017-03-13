package com.example.dllo.lexuebdemo.teacher.view;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherInfoGiftAdapter;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherDetailInfoActivity extends BaseActivity {
    private static final String TAG = "TeacherDetailInfoActivi";

    private RecyclerView giftRv;
    private TeacherInfoGiftAdapter adapter;
    private CollapsingToolbarLayout collapsingToolbarLayout;
    private CoordinatorLayout coordinatorLayout;

    @Override
    protected int getLayout() {
        return R.layout.activity_teacher_detail_info;
    }

    @Override
    protected void initView() {
        giftRv = bindView(R.id.rv_gift_info);
        collapsingToolbarLayout = bindView(R.id.ctl);

        coordinatorLayout = bindView(R.id.coord_layout);
    }

    @Override
    protected void initData() {
        adapter = new TeacherInfoGiftAdapter();
        adapter.setContext(this);
        giftRv.setLayoutManager(new GridLayoutManager(this, 4));
        giftRv.setAdapter(adapter);
    }

    @Override
    protected void initListener() {

    }
}
