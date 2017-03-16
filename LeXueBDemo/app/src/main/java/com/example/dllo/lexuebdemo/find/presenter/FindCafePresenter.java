package com.example.dllo.lexuebdemo.find.presenter;

import com.example.dllo.lexuebdemo.find.findview.FindCafeView;
import com.example.dllo.lexuebdemo.find.model.CafeModel;
import com.example.dllo.lexuebdemo.find.model.CafeRequestListener;
import com.example.dllo.lexuebdemo.find.model.FindCafeBean;
import com.example.dllo.lexuebdemo.find.model.URLBean;

import java.util.List;

/**
 * Created by dllo on 17/3/11.
 */

public class FindCafePresenter {
    private FindCafeView cafeView;
    private CafeModel model;

    public FindCafePresenter(FindCafeView cafeView) {
        this.cafeView = cafeView;
        model=new CafeModel();
    }

    //上拉加载和最开始获得数据
    public void getData(int page, final List<FindCafeBean.PostsBean> data){
        model.getData(URLBean.FINDCAFE+page, new CafeRequestListener() {
            @Override
            public void onSuccess(FindCafeBean bean) {
                if (data==null){
                    cafeView.getData(bean.getPosts());
                }else {
                    List<FindCafeBean.PostsBean> newData=data;
                    for (FindCafeBean.PostsBean postsBean : bean.getPosts()) {
                        newData.add(postsBean);
                    }
                    cafeView.getData(newData);
                }
            }

            @Override
            public void onError() {

            }
        });
    }

}
