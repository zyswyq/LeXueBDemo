package com.example.dllo.lexuebdemo.teacher.view;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.nettools.NetBean;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.example.dllo.lexuebdemo.teacher.presenter.TeacherPresenter;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherVpAdapter;

import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherFragment extends BaseFragment implements ITeacherView, View.OnClickListener, ViewPager.OnPageChangeListener {
    private static final String TAG = "TeacherFragment";
    private ViewPager viewPager;
    private TabLayout tabLayout;
    private TeacherVpAdapter adapter;

    private TeacherPresenter teacherPresenter;

    private ImageView tagListBtn;
    private FragmentManager fm;
    private TeacherTagListFragment tagListFragment;

    private int currentPage;
    private boolean isFirst = true;


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
        initTagListFrgamnet();

    }

    private void initTagListFrgamnet() {
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
        adapter = new TeacherVpAdapter(getChildFragmentManager(), context);
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
    public void onShow() {
        //在显示tagfragment的时候，把当前选中页面位置传过去
        tagListFragment.setSelectedItem(currentPage);
        FragmentTransaction ft = fm.beginTransaction();
        ft.show(tagListFragment);
        ft.commit();
    }

    @Override
    public <T> void setNetData(T data) {

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
