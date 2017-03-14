package com.example.dllo.lexuebdemo.view;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.adapter.HomeSubjectRecycleAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.home.sujectbean.Physics;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
//这是学科界面
public class HomeSubjectFragment extends BaseFragment{
     private RecyclerView mRecyclerView;
    private HomeSubjectRecycleAdapter mSubjectRecycleAdapter;
    private List<Physics.VideosBean> datas;
    private List<Physics.VideosBean.TagListBean> mTagListBeen;
    private List<Physics.VideosBean.VideoCoverBean> mVideoCoverBeen;

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
        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_home_subject_rl);
//        mTestTv = bindView(R.id.test_tv);
    }

    @Override
    protected void initData() {
//        Bundle bundle = getArguments();
//        int positionFrag = bundle.getInt("positionFrag");
//        mTestTv.setText("第"+positionFrag+"个");
//        mTestTv.setTextSize(50);
    }

    @Override
    protected void initListener() {

    }
}
