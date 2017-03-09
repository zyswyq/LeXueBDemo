package com.example.dllo.lexuebdemo.presenter;

import com.example.dllo.lexuebdemo.view.FindView;

/**
 * Created by dllo on 17/3/9.
 */

public class FindPresenter {

    private FindView findView;

    public FindPresenter(FindView findView) {
        this.findView = findView;
    }

    public void setAdaper(){
        findView.setAdapter();
    }
}
