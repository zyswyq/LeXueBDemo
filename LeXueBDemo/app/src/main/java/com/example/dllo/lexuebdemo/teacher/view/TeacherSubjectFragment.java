package com.example.dllo.lexuebdemo.teacher.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherRvAdapter;
import com.example.dllo.lexuebdemo.teacher.model.SubjectBean;
import com.example.dllo.lexuebdemo.teacher.model.TeacherTagBean;
import com.example.dllo.lexuebdemo.teacher.presenter.TeacherSubjectPresenter;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherSubjectFragment extends BaseFragment implements ITeacherSubjectView, TeacherRvAdapter.DetailInfo {
    private static final String TAG = "TeacherSubjectFragment";
    private RecyclerView recyclerView;
    private TeacherRvAdapter adapter;
    private TeacherSubjectPresenter teacherSubjectPresenter;

    private TeacherTagBean.SubjectsBean subjectsBean;
    private SubjectBean subjectBean;

    @Override
    protected int getLayout() {
        return R.layout.fragment_teacher_subject;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getArguments();
        subjectsBean = bundle.getParcelable("subjectsBean");
    }

    @Override
    protected void initView() {
        recyclerView = bindView(R.id.rv_teacher_subject);
        teacherSubjectPresenter = new TeacherSubjectPresenter(this);
        teacherSubjectPresenter.getNetData(subjectsBean.getTeacher_subject_id());
    }

    @Override
    protected void initData() {
//        teacherSubjectPresenter.setAdapter();
//        teacherSubjectPresenter.setRecyclerView();
    }

    @Override
    protected void initListener() {

    }

    public static Fragment instanceFragment(TeacherTagBean.SubjectsBean subjectsBean){
        Fragment fragment = new TeacherSubjectFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("subjectsBean", subjectsBean);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void setAdapter() {
        adapter = new TeacherRvAdapter();
        adapter.setContext(context);
        adapter.setDetailInfo(this);
        adapter.setSubjectBean(subjectBean);
    }

    @Override
    public void setRecyclerView() {
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void setNetData(SubjectBean subjectBean) {
        this.subjectBean = subjectBean;
        initAdapter();
        initRecyclerView();
    }

    private void initRecyclerView() {
        teacherSubjectPresenter.setRecyclerView();
    }

    private void initAdapter() {
        teacherSubjectPresenter.setAdapter();
    }

    @Override
    public void showTeacherInfo(int teacherId) {
        Intent intent = new Intent(context, TeacherDetailInfoActivity.class);
        intent.putExtra("teacherId", teacherId);
        context.startActivity(intent);
    }

    @Override
    public void showMovieInfo(int movieId) {
        Intent intent = new Intent(context, TeacherMovieDetailActivity.class);
        intent.putExtra("movieId", movieId);
        context.startActivity(intent);
    }

    @Override
    public void showMoreMovie(int teacherId) {
        Intent intent = new Intent(context, CourseAllActivity.class);
        intent.putExtra("teacherId", teacherId);
        context.startActivity(intent);
    }

}
