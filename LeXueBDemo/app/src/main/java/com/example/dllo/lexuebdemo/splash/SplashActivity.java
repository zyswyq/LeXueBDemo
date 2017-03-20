package com.example.dllo.lexuebdemo.splash;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.ScaleAnimation;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.main.view.MainActivity;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class SplashActivity extends BaseActivity {
    private View layout;
    private Context mContext = this;

    @Override
    protected int getLayout() {

        return R.layout.activity_splash;
    }

    @Override
    protected void initView() {
        layout = bindView(R.id.splash_layout);
    }

    @Override
    protected void initData() {
        /**
         * 可以将做出的动画封装成一个类，需要什么样的动画调用就可以
         */
        //闪屏页的动画

        ObjectAnimator animator = ObjectAnimator.ofFloat(layout, "scaleY", 1f, 1.3f);
        ObjectAnimator animator1 = ObjectAnimator.ofFloat(layout, "scaleX", 1f, 1.3f);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(layout, "alpha", 0.5f, 1f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(animator).with(animator1).with(animator2);
        animatorSet.setDuration(3000).start();
        //监听动画，结束时跳转MainActivity
        animatorSet.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {
                mContext.startActivity(new Intent(mContext, MainActivity.class));
                finish();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });
//        AlphaAnimation alphaAnimation = new AlphaAnimation(0.7f, 1.0f);
//        alphaAnimation.setDuration(2000);
//        layout.startAnimation(alphaAnimation);

    }

    @Override
    protected void initListener() {

    }
}
