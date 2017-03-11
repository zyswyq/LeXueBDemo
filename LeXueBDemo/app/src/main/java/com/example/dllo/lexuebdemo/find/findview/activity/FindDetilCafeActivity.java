package com.example.dllo.lexuebdemo.find.findview.activity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ListView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.find.adapter.FindCafeLVAdapter;
import com.example.dllo.lexuebdemo.find.findview.FindCafeView;
import com.example.dllo.lexuebdemo.find.model.FindCafeBean;
import com.example.dllo.lexuebdemo.find.presenter.FindCafePresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/3/10.
 * 王宇琦
 */

public class FindDetilCafeActivity extends BaseActivity implements FindCafeView{

    private ListView listView;
    private List<FindCafeBean.PostsBean> data;
    private FindCafeLVAdapter adapter;
    private int page=1;
    private FindCafePresenter presenter;


    @Override
    protected int getLayout() {
        return R.layout.activity_find_cafe;
    }

    @Override
    protected void initView() {
        listView=bindView(R.id.listview_cafe);
        data=new ArrayList<>();
        presenter=new FindCafePresenter(this);
        adapter=new FindCafeLVAdapter();
        adapter.setContext(this);
        presenter.getData(page,data);
        adapter.setData(data);
        listView.setAdapter(adapter);
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
}
