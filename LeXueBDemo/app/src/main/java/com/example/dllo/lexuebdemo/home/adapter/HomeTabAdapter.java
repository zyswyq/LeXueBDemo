package com.example.dllo.lexuebdemo.home.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.util.Log;

import com.example.dllo.lexuebdemo.home.fragment.HomeSubjectFragment;

import com.example.dllo.lexuebdemo.home.fragment.HomeViewPagerFragment;
import com.example.dllo.lexuebdemo.home.fragment.HomeVolunteerFragment;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeBean;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeSubject;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeTabAdapter extends FragmentPagerAdapter{
    private static final String TAG = "HomeTabAdapter";
//    private List <HomeSubject.VideoSubjectsBean> mFragments;
    private int[] ids;

    public void setIds(int[] ids) {
        this.ids = ids;
    }

    public HomeTabAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Log.e(TAG, "getItem: "+ids[position]);

        //对position进行判断  加载不同的布局

        if (0 == position) {

            return HomeViewPagerFragment.newInstance();
        } else if (0 < position && 9 > position) {

            return HomeSubjectFragment.newInstance(ids[position]);

        } else
            return HomeVolunteerFragment.newInstance(ids[position]);

    }

    @Override
    public int getCount() {
        return 14;
    }


}
