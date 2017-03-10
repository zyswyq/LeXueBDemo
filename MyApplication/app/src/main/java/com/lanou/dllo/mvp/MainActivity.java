package com.lanou.dllo.mvp;

import android.app.ProgressDialog;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.lanou.dllo.mvp.model.Bean;
import com.lanou.dllo.mvp.presenter.MyPresenter;
import com.lanou.dllo.mvp.view.IView;

public class MainActivity extends AppCompatActivity implements IView {
    private RecyclerView recyclerView;
    private RVAdapter adapter;
    private ProgressDialog progressDialog;
    private MyPresenter presenter;
    private SwipeRefreshLayout layout;
    private String url = "http://app.bilibili.com/x/v2/show/region?appkey=1d8b6e7d45233436&build=500000&mobi_app=android&platform=android&ts=1488963472000&sign=daf423a57c71f79a763772ce42979655";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RVAdapter();
        recyclerView.setAdapter(adapter);
        progressDialog =  new ProgressDialog(this);
        presenter = new MyPresenter(this);
        presenter.getRequestData(url);

    }

    @Override
    public void requestSuccess(Bean bean) {
        adapter.setBean(bean);
    }

    @Override
    public void requestFail() {
        Toast.makeText(this, "失败了", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showProgress() {
        progressDialog.show();
    }

    @Override
    public void hintProgress() {
        progressDialog.dismiss();
    }
}
