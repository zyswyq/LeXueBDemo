package com.example.dllo.lexuebdemo.view;

import android.os.Bundle;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeSubjectFragment extends BaseFragment{

    private TextView mTestTv;

    //fragment之间的传值
    public static HomeSubjectFragment newInstance(int position) {

        Bundle args = new Bundle();

        HomeSubjectFragment fragment = new HomeSubjectFragment();

        args.putInt("positionFrag",position);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_home_subject;
    }

    @Override
    protected void initView() {
        mTestTv = bindView(R.id.test_tv);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        int positionFrag = bundle.getInt("positionFrag");
        mTestTv.setText("第"+positionFrag+"个");
        mTestTv.setTextSize(50);
    }

    @Override
    protected void initListener() {

    }
}
