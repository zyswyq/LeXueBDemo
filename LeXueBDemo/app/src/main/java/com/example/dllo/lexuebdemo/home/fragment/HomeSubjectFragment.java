package com.example.dllo.lexuebdemo.home.fragment;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.home.adapter.HomeSubjectRecycleAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.home.sujectbean.Physics;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.example.dllo.lexuebdemo.teacher.model.Constant;

import java.util.ArrayList;
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
    int page = 0;

    public static final String url = "http://api.lexue.com/video/list_v3?" +
            "pagesize=10&point_id=0&sub_point_id=0&phase=0&video_type=0&sort" +
            "=0&subject_id=3 ";
    private HomeSubjectRecycleAdapter mSubjectRecycleAdapter;
    private List<Physics.VideosBean> datas;
    private Physics.VideosBean beans;



    private Handler handler = new Handler(Looper.getMainLooper());


    @Override
    protected int getLayout() {
        return R.layout.fragment_home_subject;
    }

    @Override
    protected void initView() {

        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_home_subject_rl);
        mSubjectRecycleAdapter = new HomeSubjectRecycleAdapter(context);
        mRecyclerView.setAdapter(mSubjectRecycleAdapter);

//        mTestTv = bindView(R.id.test_tv);
    }

    @Override
    protected void initData() {
        Bundle bundle = getArguments();
        if (null != bundle) {
            int position = bundle.getInt("positionFrag");
        }


        datas = new ArrayList<>();
        LinearLayoutManager manager = new LinearLayoutManager(context);
        mRecyclerView.setLayoutManager(manager);
        page++;

        NetTools.getInstance().startRequest(Constant.HOME_SUBJECT_URL + page, Physics.class, new MyCallBack<Physics>() {

            @Override
            public void success(Physics respomse) {

                    datas  = respomse.getVideos();
                    mSubjectRecycleAdapter.setDatas(respomse.getVideos());


            }

            @Override
            public void error(Throwable throwable) {

            }
        });

//        Bundle bundle = getArguments();
//        int positionFrag = bundle.getInt("positionFrag");
//        mTestTv.setText("第"+positionFrag+"个");
//        mTestTv.setTextSize(50);
    }
    //fragment之间的传值
    public static HomeSubjectFragment newInstance(int position) {

        Bundle args = new Bundle();

        HomeSubjectFragment fragment = new HomeSubjectFragment();

        args.putInt("positionFrag",position);

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initListener() {

    }
}
