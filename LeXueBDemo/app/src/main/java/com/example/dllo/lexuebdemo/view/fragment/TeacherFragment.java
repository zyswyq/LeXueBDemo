package com.example.dllo.lexuebdemo.view.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.adapter.TeacherViewPagerAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.presenter.TeacherPresenter;
import com.example.dllo.lexuebdemo.view.TeacherView;

import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherFragment extends BaseFragment implements TeacherView{
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TeacherViewPagerAdapter adapter;

    private TeacherPresenter teacherPresenter;


    @Override
    protected int getLayout() {
        return R.layout.fragment_teacher;
    }

    @Override
    protected void initView() {
        viewPager = bindView(R.id.vp_teacher);
        tabLayout = bindView(R.id.tablayout_teacher);
        teacherPresenter = new TeacherPresenter(this);
    }

    @Override
    protected void initData() {
        teacherPresenter.setAdapter();
        teacherPresenter.setTabLayout();
    }

    @Override
    protected void initListener() {

    }

    @Override
    public void setAdapter() {
        adapter = new TeacherViewPagerAdapter(getChildFragmentManager(), context);
        viewPager.setAdapter(adapter);
    }

    @Override
    public void setTabLayout(List<String> tagList) {
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(viewPager);
        for(int i = 0; i < tabLayout.getTabCount(); i++){
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setText(tagList.get(i));
        }
    }

}
