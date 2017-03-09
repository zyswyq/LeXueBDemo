package com.example.dllo.lexuebdemo.view;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.View;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.adapter.HomeTabAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;

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
    public static final String [] tanTitle = new String[]{"推荐","数学","语文","化学"
            ,"物理","生物","英语","政治","历史","地理","志愿","政策面试","自招物理",
            "自招物理","自招数学"};
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

    }

    @Override
    protected void initListener() {

    }
}
