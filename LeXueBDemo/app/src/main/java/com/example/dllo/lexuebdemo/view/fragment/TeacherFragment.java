package com.example.dllo.lexuebdemo.view.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;

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
public class TeacherFragment extends BaseFragment implements TeacherView, View.OnClickListener {
    private static final String TAG = "TeacherFragment";
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TeacherViewPagerAdapter adapter;

    private TeacherPresenter teacherPresenter;

    private ImageView tagListBtn;


    @Override
    protected int getLayout() {
        return R.layout.fragment_teacher;
    }

    @Override
    protected void initView() {
        viewPager = bindView(R.id.vp_teacher);
        tabLayout = bindView(R.id.tablayout_teacher);
        tagListBtn = bindView(R.id.iv_teacher_taglist);
        teacherPresenter = new TeacherPresenter(this);
        teacherPresenter.setContext(context);
    }

    @Override
    protected void initData() {
        teacherPresenter.setAdapter();
        teacherPresenter.setTabLayout();
    }

    @Override
    protected void initListener() {
        tagListBtn.setOnClickListener(this);
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

    @Override
    public void popTagList(PopupWindow popupWindow, View btn) {
        popupWindow.showAsDropDown(btn);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_teacher_taglist:
                Log.e(TAG, "onClick: into click");
                teacherPresenter.popTagList(v);
                break;
        }
    }
}
