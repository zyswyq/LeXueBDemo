package com.example.dllo.lexuebdemo.teacher.view;

import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.find.model.CafeModel;
import com.example.dllo.lexuebdemo.teacher.adapter.CourseAllRvAdapter;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class CourseAllActivity extends BaseActivity implements View.OnClickListener {
    private RecyclerView courseRv;
    private CourseAllRvAdapter adapter;

    private TextView allBtn, freeBtn, unfreeBtn;
    private ImageView allDiv, freeDiv, unfreeDiv;

    private ImageView backBtn;


    @Override
    protected int getLayout() {
        return R.layout.activity_course_all;
    }

    @Override
    protected void initView() {
        courseRv = bindView(R.id.rv_course_all);

        allBtn = bindView(R.id.tv_course_detail_all);
        freeBtn = bindView(R.id.tv_course_detail_free);
        unfreeBtn = bindView(R.id.tv_course_detail_unfree);
        allDiv = bindView(R.id.iv_course_detail_all_div);
        freeDiv = bindView(R.id.iv_course_detail_free_div);
        unfreeDiv = bindView(R.id.iv_course_detail_unfree_div);

        backBtn = bindView(R.id.topbar_course_all_back);
    }

    @Override
    protected void initData() {
        adapter = new CourseAllRvAdapter();
        adapter.setContext(this);
        courseRv.setLayoutManager(new LinearLayoutManager(this));
        courseRv.setAdapter(adapter);

        initCourseSelect();
    }

    private void initCourseSelect() {
        onAllCourseSelected();
    }


    @Override
    protected void initListener() {
        allBtn.setOnClickListener(this);
        freeBtn.setOnClickListener(this);
        unfreeBtn.setOnClickListener(this);

        backBtn.setOnClickListener(this);
    }

    private void onAllCourseSelected() {
        allBtn.setTextColor(Color.parseColor("#000000"));
        freeBtn.setTextColor(Color.parseColor("#8492A3"));
        unfreeBtn.setTextColor(Color.parseColor("#8492A3"));
        allDiv.setVisibility(View.VISIBLE);
        freeDiv.setVisibility(View.GONE);
        unfreeDiv.setVisibility(View.GONE);
    }

    private void onFreeCourseSelected() {
        allBtn.setTextColor(Color.parseColor("#8492A3"));
        freeBtn.setTextColor(Color.parseColor("#000000"));
        unfreeBtn.setTextColor(Color.parseColor("#8492A3"));
        allDiv.setVisibility(View.GONE);
        freeDiv.setVisibility(View.VISIBLE);
        unfreeDiv.setVisibility(View.GONE);
    }

    private void onUnfreeCourseSelected() {
        allBtn.setTextColor(Color.parseColor("#8492A3"));
        freeBtn.setTextColor(Color.parseColor("#8492A3"));
        unfreeBtn.setTextColor(Color.parseColor("#000000"));
        allDiv.setVisibility(View.GONE);
        freeDiv.setVisibility(View.GONE);
        unfreeDiv.setVisibility(View.VISIBLE);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_course_detail_all:
                onAllCourseSelected();
                break;
            case R.id.tv_course_detail_free:
                onFreeCourseSelected();
                break;
            case R.id.tv_course_detail_unfree:
                onUnfreeCourseSelected();
                break;
            case R.id.topbar_course_all_back:
                finish();
                break;
        }
    }
}

