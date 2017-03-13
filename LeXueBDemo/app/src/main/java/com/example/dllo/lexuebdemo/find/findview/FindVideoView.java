package com.example.dllo.lexuebdemo.find.findview;

import com.example.dllo.lexuebdemo.find.model.FindVideoBean;

import java.util.List;

/**
 * Created by dllo on 17/3/10.
 */

public interface FindVideoView {

    void getData(List<FindVideoBean.LivesBean> data);

    void showPop();
    void disMissPop();

}
