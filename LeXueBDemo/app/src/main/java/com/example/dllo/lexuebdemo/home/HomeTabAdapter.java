package com.example.dllo.lexuebdemo.home;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.dllo.lexuebdemo.view.HomeSubjectFragment;

import com.example.dllo.lexuebdemo.view.HomeViewPagerFragment;
import com.example.dllo.lexuebdemo.view.HomeVolunteerFragment;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeTabAdapter extends FragmentPagerAdapter{
    private List <Fragment> mFragments;
    private Context context;

    public HomeTabAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        //对position进行判断  加载不同的布局
        if (0 == position) {
            return HomeViewPagerFragment.newInstance();
        } else if (0 < position && 7 > position) {
            return HomeSubjectFragment.newInstance(position);
        } else
            return HomeVolunteerFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 15;
    }


}
