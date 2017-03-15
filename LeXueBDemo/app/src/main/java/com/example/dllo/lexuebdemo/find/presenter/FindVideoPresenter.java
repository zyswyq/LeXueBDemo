package com.example.dllo.lexuebdemo.find.presenter;

import android.util.Log;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.find.findview.FindVideoView;
import com.example.dllo.lexuebdemo.find.model.FindVideoBean;
import com.example.dllo.lexuebdemo.find.model.URLBean;
import com.example.dllo.lexuebdemo.find.model.VideoModel;
import com.example.dllo.lexuebdemo.find.model.VideoRequestListener;

/**
 * Created by dllo on 17/3/10.
 */

public class FindVideoPresenter {
    private FindVideoView videoView;
    private VideoModel model;

    public FindVideoPresenter(FindVideoView videoView) {
        this.videoView = videoView;
        model=new VideoModel();
    }

    public void getData(int subject,int type){
        Log.d("hahahah", subject + "  " + type);
        model.getData(URLBean.FINDVIDEO1 + "1" + URLBean.FINDVIDEO2 + subject + URLBean.FINDVIDEO3 + type, new VideoRequestListener() {
            @Override
            public void onSuccess(FindVideoBean bean) {
                videoView.getData(bean.getLives());

            }

            @Override
            public void onError() {

            }
        });
    }

    public void clickToOpen(int Id){
        switch (Id){
            case R.id.img_findvideo_chose:
                videoView.showPop();
                break;
            case R.id.tv_find_pop_dimiss:
                videoView.disMissPop();
                break;
            case R.id.tv_find_pop_ok:
                //TODO 从新加载数据
                break;
        }

    }

}
