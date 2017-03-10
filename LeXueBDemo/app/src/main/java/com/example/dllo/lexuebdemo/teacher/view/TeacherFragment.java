package com.example.dllo.lexuebdemo.teacher.view;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.teacher.presenter.TeacherPresenter;
import com.example.dllo.lexuebdemo.teacher.view.TeacherTagListFragment;
import com.example.dllo.lexuebdemo.teacher.view.TeacherView;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherViewPagerAdapter;

import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherFragment extends BaseFragment implements TeacherView, View.OnClickListener, ViewPager.OnPageChangeListener {
    private static final String TAG = "TeacherFragment";
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TeacherViewPagerAdapter adapter;

    private TeacherPresenter teacherPresenter;

    private ImageView tagListBtn;
    private FragmentManager fm;
    private TeacherTagListFragment tagListFragment;

    private int currentPage;


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

        fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        tagListFragment = new TeacherTagListFragment();
        ft.add(R.id.tag_fragment, tagListFragment);
        ft.addToBackStack(null);
        ft.hide(tagListFragment);
        ft.commit();
    }

    @Override
    protected void initListener() {
        tagListBtn.setOnClickListener(this);
        viewPager.addOnPageChangeListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.iv_teacher_taglist:
                teacherPresenter.onShow();
                break;
        }
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
        for (int i = 0; i < tabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = tabLayout.getTabAt(i);
            tab.setText(tagList.get(i));
        }
    }

    @Override
    public void popTagList(PopupWindow popupWindow, View btn, int xoff, int yoff) {
        popupWindow.showAsDropDown(btn, xoff, yoff);
    }

    @Override
    public void onShow() {
        tagListFragment.setSelectedItem(currentPage);
        FragmentTransaction ft = fm.beginTransaction();
        ft.show(tagListFragment);
        ft.commit();
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {
        currentPage = position;
    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }
}
