package com.example.dllo.lexuebdemo.view;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.adapter.TeacherRecyclerViewAdapter;
import com.example.dllo.lexuebdemo.adapter.TeacherViewPagerAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherFragment extends BaseFragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TeacherViewPagerAdapter adapter;

    private List<String> tagList;

    @Override
    protected int getLayout() {
        return R.layout.fragment_teacher;
    }

    @Override
    protected void initView() {
        viewPager = bindView(R.id.vp_teacher);
        tabLayout = bindView(R.id.tablayout_teacher);
    }

    @Override
    protected void initData() {
        tagList = new ArrayList<>();
        for(int i = 1; i <= 15; i++){
            tagList.add("课程"+i);
        }
        adapter = new TeacherViewPagerAdapter(getChildFragmentManager(), context);
        viewPager.setAdapter(adapter);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(viewPager);
        for(int i = 0; i < tabLayout.getTabCount(); i++){
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setText(tagList.get(i));
        }
    }

    @Override
    protected void initListener() {

    }
}
