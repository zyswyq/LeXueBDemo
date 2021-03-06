package com.example.dllo.lexuebdemo.find.findview.activity;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBar;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.find.adapter.FindVideoLVAdapter;
import com.example.dllo.lexuebdemo.find.adapter.FindVideoPopMainAdapter;
import com.example.dllo.lexuebdemo.find.findview.FindVideoView;
import com.example.dllo.lexuebdemo.find.model.FindVideoBean;
import com.example.dllo.lexuebdemo.find.presenter.FindVideoPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/3/10.
 * 王宇琦
 */

public class FindDetilVideoActivity extends BaseActivity implements FindVideoView, View.OnClickListener {
    private ListView listView, popLisrView;
    private FindVideoLVAdapter adapter;

    private FindVideoPresenter presenter;
    private ImageView choseImg;
    private PopupWindow popupWindow;
    private View pop;
    private View thisPage;

    private List<String> data1,data2;


    private TextView ok,dismiss;


    //几个变量
    private int PAGE = 1;
    private int SUBJECT = 0;
    private int TYPE = 0;

    @Override
    protected int getLayout() {
        return R.layout.activity_find_video;
    }

    @Override
    protected void initView() {
        listView = bindView(R.id.listview_findvideo);
        choseImg = bindView(R.id.img_findvideo_chose);
        adapter = new FindVideoLVAdapter();
        presenter = new FindVideoPresenter(this);
        presenter.getData(SUBJECT, TYPE);
        thisPage = LayoutInflater.from(this).inflate(R.layout.activity_find_video, null);
        data1=new ArrayList<>();
        data2=new ArrayList<>();
        data1.add("全部");
        data1.add("数学");
        data1.add("化学");
        data1.add("物理");
        data1.add("生物");
        data1.add("语文");
        data1.add("英语");
        data1.add("志愿");
        data1.add("推荐");
        data1.add("历史");
        data1.add("政治");
        data1.add("地理");
        data1.add("自招数学");
        data1.add("政策面试");
        data1.add("自招物理");
        data2.add("全部");
        data2.add("报名中");
        data2.add("直播中");
        data2.add("已结束");
        data2.add("直播录像");


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
    }

    @Override
    public void showPop() {
        pop = LayoutInflater.from(this).inflate(R.layout.pop_findvideo, null);
        popLisrView = (ListView) pop.findViewById(R.id.lv_find_pop_main);
        final FindVideoPopMainAdapter adapter=new FindVideoPopMainAdapter();
        adapter.setContext(this);
        adapter.setSubject(SUBJECT);
        adapter.setType(TYPE);
        adapter.setData1(data1);
        adapter.setData2(data2);
        adapter.setTitle1("科目");
        adapter.setTitle2("状态");
        popLisrView.setAdapter(adapter);

        ok= (TextView) pop.findViewById(R.id.tv_find_pop_ok);
        dismiss= (TextView) pop.findViewById(R.id.tv_find_pop_dimiss);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SUBJECT=adapter.getSubject();
                TYPE=adapter.getType();
                presenter.getData(adapter.getSubject(),adapter.getType());

                popupWindow.dismiss();
            }
        });

        dismiss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                popupWindow.dismiss();
            }
        });


        popupWindow = new PopupWindow(pop, ActionBar.LayoutParams.WRAP_CONTENT, ActionBar.LayoutParams.MATCH_PARENT, true);
        popupWindow.setBackgroundDrawable(new BitmapDrawable(getResources(), (Bitmap) null));
        popupWindow.showAtLocation(thisPage, Gravity.RIGHT, 0, 0);

    }

    @Override
    public void disMissPop() {
        popupWindow.dismiss();
    }

    @Override
    public void onClick(View view) {
        presenter.clickToOpen(view.getId());
    }



}
