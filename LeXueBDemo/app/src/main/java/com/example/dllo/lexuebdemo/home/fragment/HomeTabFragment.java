package com.example.dllo.lexuebdemo.home.fragment;

import android.graphics.drawable.BitmapDrawable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.home.adapter.HomeTabAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeBean;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeSubject;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.example.dllo.lexuebdemo.teacher.customview.DragGridView;
import com.example.dllo.lexuebdemo.teacher.model.Constant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeTabFragment extends BaseFragment implements View.OnClickListener {
    private static final String TAG = "HomeTabFragment";
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private HomeTabAdapter mHomeTabAdapter;
    private TextView mTextView;

    private int[] ids;


    public static final String [] tabTitle = new String[]{"推荐","数学","语文","化学"
            ,"物理","生物","英语","政治","历史","地理","志愿","政策面试","自招物理","自招数学"};
    @Override
    protected int getLayout() {
        return R.layout.fragment_home_tablayout;
    }

    @Override
    protected void initView() {
        mTextView = (TextView) view.findViewById(R.id.fragment_home_tablayout_tv);
        mTabLayout = (TabLayout) view.findViewById(R.id.fragment_home_tablayout);
        mViewPager = (ViewPager) view.findViewById(R.id.fragment_home_viewpager);

    }

    @Override
    protected void initData() {
        ids = new int[]{100, 1, 5, 2, 3, 4, 6, 103, 102, 104, 11, 302, 303, 301};
        HomeSubject();
//        NetTools.getInstance().startRequest(Constant.HOME_SUBJECT, HomeSubject.class, new MyCallBack<HomeSubject>() {
//            @Override
//            public void success(HomeSubject respomse) {
//                fragments = respomse.getVideo_subjects();
//                HomeSubject();
//
//            }
//
//            @Override
//            public void error(Throwable throwable) {
//
//            }
//        });
        //字体底部下划线消失方法


//        NetTools.getInstance().startRequest(Constant.HOME_SUBJECT, HomeBean.class, new MyCallBack<HomeBean>() {
//            @Override
//            public void success(HomeBean respomse) {
//                fragments = respomse.getVideos();
//
//            }
//
//            @Override
//            public void error(Throwable throwable) {
//
//            }
//        });
//        for (int i = 1; i <= 14 ; i++) {
//            Collections.addAll(fragments);
////                    .add("学科" + i );
//        }
//    mHomeTabAdapter = new HomeTabAdapter(getFragmentManager(),context);
//        mViewPager.setAdapter(mHomeTabAdapter);
//        mViewPager.setOffscreenPageLimit(7);
//        mTabLayout.setupWithViewPager(mViewPager);
//        //可以滑动的方法
//        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
//        for (int i = 0; i < mTabLayout.getTabCount(); i++) {
//            TabLayout.Tab tab = mTabLayout.getTabAt(i);
//
//
//                        tab.setText(fragments.get());
        }



    public void HomeSubject(){
        mTextView.setOnClickListener(this);

        mTabLayout.setSelectedTabIndicatorColor(0);

//        fragments = new ArrayList<>();
//        for (int i = 1; i <= 14 ; i++) {
//            Collections.addAll(fragments);
////                    .add("学科" + i );
//        }
        mHomeTabAdapter = new HomeTabAdapter(getFragmentManager());
//        mHomeTabAdapter.setFragments(fragments);
        mHomeTabAdapter.setIds(ids);
        mViewPager.setAdapter(mHomeTabAdapter);
        mViewPager.setOffscreenPageLimit(7);
        mTabLayout.setupWithViewPager(mViewPager);
        //可以滑动的方法
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        for (int i = 0; i < mTabLayout.getTabCount(); i++) {
            TabLayout.Tab tab = mTabLayout.getTabAt(i);
            Log.e(TAG, "HomeSubject: "+tabTitle[i]);
            tab.setText(tabTitle[i]);
        }
    }
public void popupwindows(){
    View popview = LayoutInflater.from(context).inflate(R.layout.pop_findvideo,null);
    PopupWindow popupWindow = new PopupWindow(popview,
            LinearLayout.LayoutParams.WRAP_CONTENT,
            LinearLayout.LayoutParams.WRAP_CONTENT);
    popupWindow.setOutsideTouchable(true);
    popupWindow.setBackgroundDrawable(new BitmapDrawable());
    popupWindow.showAsDropDown(mTextView,100,0);

}

    @Override
    protected void initListener() {

    }


    @Override
    public void onClick(View view) {
        popupwindows();
    }
}
