package com.example.dllo.lexuebdemo.customview;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by dllo on 17/3/9.
 * 王宇琦
 */

public class NoMoveViewPager extends ViewPager {

    public NoMoveViewPager(Context context) {
        super(context);
    }

    public NoMoveViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean onTouchEvent(MotionEvent arg0) {
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent arg0) {
        return false;
    }
}