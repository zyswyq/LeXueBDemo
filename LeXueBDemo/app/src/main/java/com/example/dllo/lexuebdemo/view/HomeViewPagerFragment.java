package com.example.dllo.lexuebdemo.view;

import android.os.Bundle;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeViewPagerFragment extends BaseFragment{


    public static HomeViewPagerFragment newInstance() {

        Bundle args = new Bundle();

        HomeViewPagerFragment fragment = new HomeViewPagerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_home_viewpager;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }
}
