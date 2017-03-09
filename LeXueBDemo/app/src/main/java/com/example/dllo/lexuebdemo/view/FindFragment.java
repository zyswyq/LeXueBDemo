package com.example.dllo.lexuebdemo.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.adapter.FindLVAdapter;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.presenter.FindPresenter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/3/9.
 * by 王宇琦
 * 发现主界面
 */

public class FindFragment extends BaseFragment implements AdapterView.OnItemClickListener, FindView {

    private ListView findLV;
    private List<String> title;
    private List<String> content;
    private FindLVAdapter adapter;
    private FindPresenter presenter;

    @Override
    protected int getLayout() {
        return R.layout.fragment_find;
    }

    @Override
    protected void initView() {
        findLV=bindView(R.id.listview_findmain);
        title=new ArrayList<>();
        content=new ArrayList<>();
        adapter=new FindLVAdapter();
        presenter=new FindPresenter(this);
    }

    @Override
    protected void initData() {
        title.add("直播");
        title.add("乐学咖啡厅");
        title.add("商城");
        content.add("在线享受京城名师面对面授课");
        content.add("碎碎念,聊聊天");
        content.add("年卡一轮卡,有卡在手高考我有");
        presenter.setAdaper();
    }

    @Override
    protected void initListener() {
        findLV.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void setAdapter() {
        adapter.setContext(context);
        adapter.setTitle(title);
        adapter.setContent(content);
        findLV.setAdapter(adapter);
    }
}
