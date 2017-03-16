package com.example.dllo.lexuebdemo.home.fragment;


import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.home.adapter.HomeVolunteerAdapter;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeVolunteerBean;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * 这是志愿等界面
 */
public class HomeVolunteerFragment extends BaseFragment {
    private RecyclerView mRecyclerView;
    private HomeVolunteerAdapter mVolunteerAdapter;
    public static final String url = "http://api.lexue.com/video/list_v3?pagesize=10&point_id=0&sub_point_id=0&phase=0&video_type=0&sort=0&subject_id=11";
    private List<HomeVolunteerBean.VideosBean>  datas;
    private List<HomeVolunteerBean.VideosBean.TagListBean> mTagListBeen;

    private Handler mHandler = new Handler(Looper.myLooper());

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
        mRecyclerView = (RecyclerView) view .findViewById(R.id.fragment_home_volunteer_rv);
        mVolunteerAdapter = new HomeVolunteerAdapter(context);
        mRecyclerView.setAdapter(mVolunteerAdapter);

//
    }

    @Override
    protected void initData() {
        LinearLayoutManager manager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(manager);


        NetTools.getInstance().startRequest(url, HomeVolunteerBean.class, new MyCallBack<HomeVolunteerBean>() {
            @Override
            public void success(HomeVolunteerBean respomse) {
                datas = respomse.getVideos();


                mVolunteerAdapter.setDatas(datas);
            }

            @Override
            public void error(Throwable throwable) {

            }
        });
//        Bundle bundle = getArguments();
//        int positionFrag = bundle.getInt("positionFrag");
////        mTestTv.setText("志愿第"+positionFrag+"个");
////        mTestTv.setTextSize(50);
    }

    @Override
    protected void initListener() {

    }

}