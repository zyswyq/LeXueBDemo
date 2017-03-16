package com.example.dllo.lexuebdemo.home.fragment;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.home.HomeBinner;
import com.example.dllo.lexuebdemo.home.adapter.homeviewpage.HomeViewClassifyAdapter;
import com.example.dllo.lexuebdemo.home.adapter.homeviewpage.HomeViewFreeAdapter;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeBean;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeClassifyBean;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.youth.banner.Banner;
import com.youth.banner.BannerConfig;
import com.youth.banner.Transformer;

import java.util.ArrayList;
import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
//这是志愿界面
public class HomeViewPagerFragment extends BaseFragment{
    private RecyclerView mRecyclerView ,freeRecycleview;

    private static final String url = "http://api.lexue.com/layout/entry ";
    private static final String freeurl = "http://api.lexue.com/video/list_v3?subject_id=100 ";

    private  List<HomeClassifyBean.EntriesBean>  datas;
    private  List<HomeBean.VideosBean.ContentListBean> mContentListBeen;

    private HomeViewClassifyAdapter mViewClassifyAdapter;
    private HomeViewFreeAdapter mHomeViewFreeAdapter;


    private Banner mBanner;
    private List<String> pic;
    String url1 = "https://esfile.lexue.com/file/T1yyxTB4hv1RCvBVdK.jpg";
    String url2 = "https://esfile.lexue.com/file/T1KyxTBQZT1RCvBVdK.jpg";
    String url3 = "https://esfile.lexue.com/file/T17txTBgbT1RCvBVdK.jpg";
    String url4 = "https://esfile.lexue.com/file/T17RxTB_dT1RCvBVdK.jpg";


    @Override
    protected int getLayout() {
        return R.layout.fragment_home_viewpager;
    }

    @Override
    protected void initView() {
        mBanner = (Banner) view.
                findViewById(R.id.fragment_home_viewpager_banner);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_home_viewpager_rv);
        freeRecycleview = (RecyclerView) view.findViewById(R.id.fragment_home_viewpager_first_rv);




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
        mBanner.setBannerAnimation(Transformer.DepthPage);
        //        是否自动轮播
        mBanner.setDelayTime(3000);
        //设置指示器位置（没有标题默认为右边,有标题时默认左边）
        mBanner.setIndicatorGravity(BannerConfig.CENTER);

        mBanner.start();
//        homeClassify();
        homeFree();
    }

    public  void homeClassify(){
        GridLayoutManager manager = new GridLayoutManager(context,4);
        mViewClassifyAdapter = new HomeViewClassifyAdapter(context);

        mRecyclerView.setLayoutManager(manager);
        mRecyclerView.setAdapter(mViewClassifyAdapter);
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

    public void homeFree(){
        GridLayoutManager freemanager = new GridLayoutManager(context,2);
        mHomeViewFreeAdapter = new HomeViewFreeAdapter(context);

        freeRecycleview.setLayoutManager(freemanager);
        freeRecycleview.setAdapter(mHomeViewFreeAdapter);
        NetTools.getInstance().startRequest(freeurl, HomeBean.VideosBean.class, new MyCallBack<HomeBean.VideosBean>() {
            @Override
            public void success(HomeBean.VideosBean respomse) {
                mContentListBeen = respomse.getContent_list();
                mHomeViewFreeAdapter.setDatas(mContentListBeen);
            }

            @Override
            public void error(Throwable throwable) {

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
