package com.example.dllo.lexuebdemo.find.findview;

import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.find.adapter.FindVideoLVAdapter;
import com.example.dllo.lexuebdemo.find.model.FindVideoBean;
import com.example.dllo.lexuebdemo.find.presenter.FindVideoPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/3/10.
 * 王宇琦
 */

public class FindDetilVideoActivity extends BaseActivity implements FindVideoView, View.OnClickListener {
    private ListView listView;
    private FindVideoLVAdapter adapter;
    private List<FindVideoBean.LivesBean> data;
    private FindVideoPresenter presenter;
    private ImageView choseImg;

    //几个变量
    private int PAGE=1;
    private int SUBJECT=0;
    private int TYPE=0;

    @Override
    protected int getLayout() {
        return R.layout.activity_find_video;
    }

    @Override
    protected void initView() {
        listView=bindView(R.id.listview_findvideo);
        choseImg=bindView(R.id.img_findvideo_chose);
        adapter=new FindVideoLVAdapter();
        data=new ArrayList<>();
        presenter=new FindVideoPresenter(this);
        presenter.getData(SUBJECT,TYPE);
    }

    @Override
    protected void initData() {
        adapter.setContext(this);
    }

    @Override
    protected void initListener() {
        choseImg.setOnClickListener(this);
    }

    @Override
    public void getData(List<FindVideoBean.LivesBean> data) {
        adapter.setData(data);
        listView.setAdapter(adapter);
        this.data=data;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.img_findvideo_chose:

                break;
        }
    }
}
