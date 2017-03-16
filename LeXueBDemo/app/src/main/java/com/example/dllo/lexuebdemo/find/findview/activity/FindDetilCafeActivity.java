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
import com.example.dllo.lexuebdemo.find.adapter.FindCafeLVAdapter;
import com.example.dllo.lexuebdemo.find.adapter.FindVideoPopMainAdapter;
import com.example.dllo.lexuebdemo.find.findview.FindCafeView;
import com.example.dllo.lexuebdemo.find.model.FindCafeBean;
import com.example.dllo.lexuebdemo.find.presenter.FindCafePresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/3/10.
 * 王宇琦
 */

public class FindDetilCafeActivity extends BaseActivity implements FindCafeView, View.OnClickListener {
  private ListView listView, popLisrView;

    private List<FindCafeBean.PostsBean> data;
    private FindCafeLVAdapter adapter;
    private int page=1;
    private FindCafePresenter presenter;
    private List<String> data1,data2;
    private PopupWindow popupWindow;
    private View pop;
    private View thisPage;
    private TextView ok,dismiss;

    private ImageView chose;


    //几个变量
    private int PAGE = 1;
    private int SUBJECT = 0;
    private int TYPE = 0;

    @Override
    protected int getLayout() {
        return R.layout.activity_find_cafe;
    }

    @Override
    protected void initView() {
        chose = bindView(R.id.img_cafe_chose);
        listView=bindView(R.id.listview_cafe);
        data=new ArrayList<>();
        presenter=new FindCafePresenter(this);
        adapter=new FindCafeLVAdapter();
        adapter.setContext(this);
        presenter.getData(page,data);
        adapter.setData(data);
        listView.setAdapter(adapter);
        thisPage = LayoutInflater.from(this).inflate(R.layout.activity_find_cafe, null);

        data1=new ArrayList<>();
        data2=new ArrayList<>();
        data1.add("全国");
        data1.add("同省");

        data2.add("全部");
        data2.add("男同学");
        data2.add("女同学");

        chose.setOnClickListener(this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }

    @Override
    public void getData(List<FindCafeBean.PostsBean> data) {
        this.data=data;
        adapter.setData(data);
        adapter.notifyDataSetChanged();
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
        adapter.setTitle1("地区筛选");
        adapter.setTitle2("性别筛选");
        popLisrView.setAdapter(adapter);

        ok= (TextView) pop.findViewById(R.id.tv_find_pop_ok);
        dismiss= (TextView) pop.findViewById(R.id.tv_find_pop_dimiss);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SUBJECT=adapter.getSubject();
                TYPE=adapter.getType();
//                presenter.getData(adapter.getSubject(),adapter.getType());

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

    }

    @Override
    public void onClick(View view) {
        presenter.clickToOpen(view.getId());
    }
}
