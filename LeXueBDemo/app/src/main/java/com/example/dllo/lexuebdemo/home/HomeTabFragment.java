package com.example.dllo.lexuebdemo.home;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.home.HomeTabAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeTabFragment extends BaseFragment{
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private HomeTabAdapter mHomeTabAdapter;
    private List<String> fragments;


//    public static final String [] tabTitle = new String[]{"推荐","数学","语文","化学"
//            ,"物理","生物","英语","政治","历史","地理","志愿","政策面试","自招物理",
//            "自招物理","自招数学"};
    @Override
    protected int getLayout() {
        return R.layout.fragment_home_tablayout;
    }

    @Override
    protected void initView() {
        mTabLayout = (TabLayout) view.findViewById(R.id.fragment_home_tablayout);
        mViewPager = (ViewPager) view.findViewById(R.id.fragment_home_viewpager);
    }

    @Override
    protected void initData() {
        //字体底部下划线消失方法
        mTabLayout.setSelectedTabIndicatorColor(0);

        fragments = new ArrayList<>();
        for (int i = 1; i <= 15 ; i++) {
            fragments.add("课程" + i);
        }
    mHomeTabAdapter = new HomeTabAdapter(getFragmentManager(),context);
        mViewPager.setAdapter(mHomeTabAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        //可以滑动的方法
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        for (int i = 0; i < mTabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = mTabLayout.getTabAt(i);
            tab.setText(fragments.get(i));
        }

    }

    @Override
    protected void initListener() {

    }


}
