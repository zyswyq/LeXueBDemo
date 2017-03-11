package com.lanou.dllo.mvp.presenter;

import com.lanou.dllo.mvp.model.Bean;
import com.lanou.dllo.mvp.model.IRequestListener;
import com.lanou.dllo.mvp.model.MyModel;
import com.lanou.dllo.mvp.view.IView;

/*
         |              |
         | \            | \
         |   | | | | | |    | | | | |||||\
         |                          |||||||\
         |         ( )              ||||||||
         |                           |||||/
         |                  | | | | | |||/
         |    |             |          |
         |    |             |          |
       / |   | |            |          |\
      |      |/             |          \|
       \ |                  |
         |                  |
           \ | | | | | | | /
             |       |            <-----弱鸡
             |       |
             |       |
*/
public class MyPresenter {
    private MyModel myModel;
    private IView iView;

    public MyPresenter(IView iView) {
        this.iView = iView;
        myModel = new MyModel();
    }

    public void getRequestData(String url) {
        iView.showProgress();
        myModel.getData(url, new IRequestListener() {
            @Override
            public void onSuccess(Bean bean) {
                iView.requestSuccess(bean);
                iView.hintProgress();
            }

            @Override
            public void onError() {
                iView.requestFail();
            }
        });
    }
}
