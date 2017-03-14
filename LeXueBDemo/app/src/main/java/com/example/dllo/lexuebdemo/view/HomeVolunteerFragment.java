package com.example.dllo.lexuebdemo.view;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;

/**
 * A simple {@link Fragment} subclass.
 * 这是志愿等界面
 */
public class HomeVolunteerFragment extends BaseFragment {

    private TextView mTestTv;

    public static HomeVolunteerFragment newInstance(int position) {

        Bundle args = new Bundle();

        HomeVolunteerFragment fragment = new HomeVolunteerFragment();
        args.putInt("positionFrag",position);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_home_volunteer;
    }

    @Override
    protected void initView() {
//        mTestTv = bindView(R.id.test_tv_volunteer);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        int positionFrag = bundle.getInt("positionFrag");
//        mTestTv.setText("志愿第"+positionFrag+"个");
//        mTestTv.setTextSize(50);
    }

    @Override
    protected void initListener() {

    }

}
