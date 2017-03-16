package com.example.dllo.lexuebdemo.home.fragment.homeviewpage;

import android.os.Handler;
import android.os.Looper;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.home.adapter.homeviewpage.HomeViewClassifyAdapter;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeClassifyBean;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
//public class HomeViewClassifyFragment extends BaseFragment{
//    private RecyclerView mRecyclerView;
//    private List<HomeClassifyBean.EntriesBean>  datas;
//    private List<HomeClassifyBean.EntriesBean.EntryIconBean> mEntryIconBeen;
//    private HomeViewClassifyAdapter mViewClassifyAdapter;
//    private static final String url = "http://api.lexue.com/layout/entry ";
//
//    private Handler mHandler = new Handler(Looper.myLooper());
//    @Override
//    protected int getLayout() {
//        return R.layout.fragment_home_viewpager;
//    }
//
//    @Override
//    protected void initView() {
//   mRecyclerView = (RecyclerView) view.findViewById(R.id.fragment_home_viewpager_rv);
//        mViewClassifyAdapter = new HomeViewClassifyAdapter(context);
//    }
//
//    @Override
//    protected void initData() {
////        StaggeredGridLayoutManager manager =
////                new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
//        GridLayoutManager manager = new GridLayoutManager(context,4);
//        mRecyclerView.setLayoutManager(manager);
//        mRecyclerView.setAdapter(mViewClassifyAdapter);
//
//
//        NetTools.getInstance().startRequest(url, HomeClassifyBean.class, new MyCallBack<HomeClassifyBean>() {
//            @Override
//            public void success(HomeClassifyBean respomse) {
//                datas = respomse.getEntries();
//                mViewClassifyAdapter.setDatas(datas);
//               mViewClassifyAdapter.setEntryIconBeen(mEntryIconBeen);
//            }
//
//            @Override
//            public void error(Throwable throwable) {
//
//            }
//        });
//    }
//    @Override
//    protected void initListener() {
//
//    }
//}
