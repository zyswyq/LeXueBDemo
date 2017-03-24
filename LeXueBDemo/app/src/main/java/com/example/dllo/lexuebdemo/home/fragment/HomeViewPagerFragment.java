package com.example.dllo.lexuebdemo.home.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.find.findview.FindCafeView;
import com.example.dllo.lexuebdemo.find.findview.activity.FindDetilVideoActivity;
import com.example.dllo.lexuebdemo.find.findview.activity.FindWebView;
import com.example.dllo.lexuebdemo.home.HomeBinner;
import com.example.dllo.lexuebdemo.home.RecycleViewItemClick;
import com.example.dllo.lexuebdemo.home.adapter.homeviewpage.HomeViewClassifyAdapter;
import com.example.dllo.lexuebdemo.home.adapter.homeviewpage.HomeViewConciseAdapter;
import com.example.dllo.lexuebdemo.home.adapter.homeviewpage.HomeViewFreeAdapter;
import com.example.dllo.lexuebdemo.home.adapter.homeviewpage.HomeViewReviseAdapter;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeBean;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeClassifyBean;
import com.example.dllo.lexuebdemo.myself.activity.LogonActivity;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.example.dllo.lexuebdemo.teacher.view.TeacherMovieDetailActivity;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 * <p>
 * <p>
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
//这是志愿界面
public class HomeViewPagerFragment extends BaseFragment {
    private RecyclerView mRecyclerView, freeRecyclerview, conciseRecyclerview,recommedRecyclerview

           ,refreshRecyclerview ,reviseRecyclerview;
    private RecycleViewItemClick mRecycleViewItemClick;


    private static final String url = "http://api.lexue.com/layout/entry ";
    private static final String freeurl = "http://api.lexue.com/video/list_v3?subject_id=100 ";

    private List<HomeClassifyBean.EntriesBean> datas;

    private List<HomeBean.VideosBean> mListBeen;

    private HomeViewClassifyAdapter mViewClassifyAdapter;
    private HomeViewFreeAdapter mHomeViewFreeAdapter;
    private HomeViewConciseAdapter mViewConciseAdapter;
    private HomeViewReviseAdapter mViewReviseAdapter;


    private Banner mBanner;
    private List<String> pic;
    String url1 = "https://esfile.lexue.com/file/T1yyxTB4hv1RCvBVdK.jpg";
    String url2 = "https://esfile.lexue.com/file/T1KyxTBQZT1RCvBVdK.jpg";
    String url3 = "https://esfile.lexue.com/file/T17txTBgbT1RCvBVdK.jpg";
    String url4 = "https://esfile.lexue.com/file/T17RxTB_dT1RCvBVdK.jpg";

    public void setRecycleViewItemClick(RecycleViewItemClick recycleViewItemClick) {
        mRecycleViewItemClick = recycleViewItemClick;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_home_viewpager;
    }

    @Override
    protected void initView() {
        mBanner = (Banner) view.
                findViewById(R.id.fragment_home_viewpager_banner);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_home_viewpager_rv);
        freeRecyclerview = (RecyclerView) view.findViewById(R.id.fragment_home_viewpager_first_rv);
        conciseRecyclerview = (RecyclerView) view.findViewById(R.id.fragment_home_viewpager_second_rv);
        reviseRecyclerview = (RecyclerView) view.findViewById(R.id.fragment_home_viewpager_three_rv);
        recommedRecyclerview = (RecyclerView) view.findViewById(R.id.fragment_home_viewpager_four_rv);
//        refreshRecyclerview = (RecyclerView) view.findViewById(R.id.fragment_home_viewpager_five_rv);
    }

    @Override
    protected void initData() {
        pic = new ArrayList<>();
        pic.add(url1);
        pic.add(url2);
        pic.add(url3);
        pic.add(url4);

        //显示圆形指示器和标题（垂直显示）

        mBanner.setBannerStyle(BannerConfig.CIRCLE_INDICATOR_TITLE);

        //        设置图片加载器
        mBanner.setImageLoader(new HomeBinner());
        //        设置轮播图片
        mBanner.setImages(pic);
        //        ()里动画常量类
        mBanner.setBannerAnimation(Transformer.ZoomOut);
//        mBanner.setBannerAnimation(Transformer.BackgroundToForeground);
//        mBanner.setBannerAnimation(Transformer.DepthPage);
        //        是否自动轮播
        mBanner.setDelayTime(3000);
        //设置指示器位置（没有标题默认为右边,有标题时默认左边）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);

        mBanner.start();

        homeClassify();
        homeConcise();
        homeRefresh();



    }
//八个图标
    public void homeClassify() {
        GridLayoutManager manager = new GridLayoutManager(context, 4);
        mViewClassifyAdapter = new HomeViewClassifyAdapter(context);

        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mViewClassifyAdapter);
        mViewClassifyAdapter.setRecycleViewItemClick(new RecycleViewItemClick() {
          @Override
          public void onClick(int position) {
              if (0 == position){

                  Intent intent = new Intent(getActivity(), FindWebView.class);

                  startActivity(intent);
              }
              if (1 == position){
                  Intent intent = new Intent(getActivity(), FindDetilVideoActivity.class);

                  startActivity(intent);
              }
              if (2 == position){
                  Intent intent = new Intent(getActivity(), FindCafeView.class);

                  startActivity(intent);
              }
              if (3 == position){
                  Intent intent = new Intent(getActivity(), LogonActivity.class);

                  startActivity(intent);
              }
              if (4 == position){
                  Intent intent = new Intent(getActivity(), FindDetilVideoActivity.class);

                  startActivity(intent);
              }
              if (5 == position){
                  Intent intent = new Intent(getActivity(), FindDetilVideoActivity.class);

                  startActivity(intent);
              }
              if (6 == position){
                  Intent intent = new Intent(getActivity(), FindDetilVideoActivity.class);

                  startActivity(intent);
              }
              if (7 == position){
                  Intent intent = new Intent(getActivity(), FindDetilVideoActivity.class);

                  startActivity(intent);
              }
          }
      });

        NetTools.getInstance().startRequest(url, HomeClassifyBean.class, new MyCallBack<HomeClassifyBean>() {
            @Override
            public void success(HomeClassifyBean respomse) {
                datas = respomse.getEntries();
                mViewClassifyAdapter.setDatas(datas);
//                mViewClassifyAdapter.setEntryIconBeen(mEntryIconBeen);
            }

            @Override
            public void error(Throwable throwable) {

            }
        });
    }
//9分钟
    public void homeFree() {
        GridLayoutManager freemanager = new GridLayoutManager(context, 2);

        mHomeViewFreeAdapter = new HomeViewFreeAdapter(context);

        freeRecyclerview.setLayoutManager(freemanager);
        freeRecyclerview.setAdapter(mHomeViewFreeAdapter);

        mHomeViewFreeAdapter.setDatas(mListBeen, 0);
        mHomeViewFreeAdapter.setRecycleViewItemClick(new RecycleViewItemClick() {
            @Override
            public void onClick(int position) {
                Intent intent = new Intent(getActivity(), TeacherMovieDetailActivity.class);
//                intent.putExtra("")
                startActivity(intent);
            }
        });

        homeRevise();
//        NetTools.getInstance().startRequest(freeurl, HomeBean.class, new MyCallBack<HomeBean>() {
//            @Override
//            public void success(HomeBean respomse) {
//                mListBeen = respomse.getVideos();
//                mHomeViewFreeAdapter.setDatas(mListBeen, 0);
//                Log.e("homeFree", "success: ");
//
//
//            }
//
//            @Override
//            public void error(Throwable throwable) {
//
//            }
//        });
    }

    //精讲
    public void homeConcise() {
        GridLayoutManager concisemanager = new GridLayoutManager(context, 2);


        mViewConciseAdapter = new HomeViewConciseAdapter(context);

        conciseRecyclerview.setLayoutManager(concisemanager);
        conciseRecyclerview.setAdapter(mViewConciseAdapter);
        mViewConciseAdapter.setRecycleViewItemClick(new RecycleViewItemClick() {
            @Override
            public void onClick(int position) {

            }
        });

        NetTools.getInstance().startRequest(freeurl, HomeBean.class, new MyCallBack<HomeBean>() {
            @Override
            public void success(HomeBean respomse) {
                mListBeen = respomse.getVideos();
                mViewConciseAdapter.setDatas(mListBeen, 1);
                Log.e("homeConcise", "success: ");

                homeFree();
            }

            @Override
            public void error(Throwable throwable) {

            }
        });
    }
    //精彩专题
    public void homeRevise() {
        LinearLayoutManager revisemanager = new LinearLayoutManager(context);


        mViewReviseAdapter = new HomeViewReviseAdapter(context);

        reviseRecyclerview.setLayoutManager(revisemanager);
        reviseRecyclerview.setAdapter(mViewReviseAdapter);
        mViewReviseAdapter.setDatas(mListBeen, 2);
        mViewReviseAdapter.setRecycleViewItemClick(new RecycleViewItemClick() {
            @Override
            public void onClick(int position) {

            }
        });

//        NetTools.getInstance().startRequest(freeurl, HomeBean.class, new MyCallBack<HomeBean>() {
//            @Override
//            public void success(HomeBean respomse) {
//                mListBeen = respomse.getVideos();
//
//
//            }
//
//            @Override
//            public void error(Throwable throwable) {
//
//            }
//        });
        homeRecommed();
    }
    //推荐
    public void homeRecommed(){
     GridLayoutManager recommed = new GridLayoutManager(context,2);
        mHomeViewFreeAdapter =  new HomeViewFreeAdapter(context);
        recommedRecyclerview.setLayoutManager(recommed);
        recommedRecyclerview.setAdapter(mHomeViewFreeAdapter);
        mHomeViewFreeAdapter.setDatas(mListBeen,3);
        mHomeViewFreeAdapter.setRecycleViewItemClick(new RecycleViewItemClick() {
            @Override
            public void onClick(int position) {

            }
        });
        homeRefresh();
    }
    //刷新
public void homeRefresh(){
  GridLayoutManager refresh = new GridLayoutManager(context,2);
    mHomeViewFreeAdapter = new HomeViewFreeAdapter(context);
    recommedRecyclerview.setLayoutManager(refresh);
    recommedRecyclerview.setAdapter(mHomeViewFreeAdapter);
    mHomeViewFreeAdapter.setDatas(mListBeen,4);
    mHomeViewFreeAdapter.setRecycleViewItemClick(new RecycleViewItemClick() {
        @Override
        public void onClick(int position) {

        }
    });
}
    @Override
    protected void initListener() {

    }

    public static HomeViewPagerFragment newInstance() {

        Bundle args = new Bundle();

        HomeViewPagerFragment fragment = new HomeViewPagerFragment();
        fragment.setArguments(args);
        return fragment;
    }


}
