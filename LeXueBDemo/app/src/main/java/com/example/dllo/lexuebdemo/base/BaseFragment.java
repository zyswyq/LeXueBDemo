package com.example.dllo.lexuebdemo.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public abstract class BaseFragment extends Fragment {
    //声明一个成员View对象,方便后面使用
    protected View view;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(getLayout(), container, false);

        initView();
        initData();
        initListener();

        return view;
    }

    protected abstract int getLayout();
    protected abstract void initView();
    protected abstract void initData();
    protected abstract void initListener();
    protected <T extends View> T bindView(int resId){
        return (T)view.findViewById(resId);
    }
}
