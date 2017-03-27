package com.example.dllo.lexuebdemo.myself.activity;

import android.content.Intent;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dllo.lexuebdemo.BuildConfig;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.myself.bean.Bean;
import com.example.dllo.lexuebdemo.myself.loopview.LoopView;
import com.example.dllo.lexuebdemo.myself.loopview.OnItemSelectedListener;

import org.greenrobot.eventbus.EventBus;

import java.util.ArrayList;

/**
 * |              |
 * | \            | \
 * |   | | | | | |    | | | | |||||\
 * |                          |||||||\
 * |         ( )              ||||||||
 * |                           |||||/
 * |                  | | | | | |||/
 * |    |             |          |
 * |    |             |          |
 * / |   | |            |          |\
 * |      |/             |          \|
 * \ |                  |
 * |                  |
 * \ | | | | | | | /
 * |       |            <-----弱鸡
 * |       |
 * |       |
 */

public class LoopActivity extends BaseActivity implements View.OnClickListener {
    private LoopView loopView;
    private TextView sureTv, deleteTv;
    private ArrayList<String> list;
    private Intent intent;
    private EventBus eventBus;

    @Override
    protected int getLayout() {
        return R.layout.activity_loop;
    }

    @Override
    protected void initView() {
        loopView = bindView(R.id.lv_loop);
        sureTv = bindView(R.id.tv_loop_sure);
        deleteTv = bindView(R.id.tv_loop_delete);
        eventBus = EventBus.getDefault();
    }

    @Override
    protected void initData() {
        // 获取屏幕宽高
        WindowManager wm = (WindowManager) getSystemService(WINDOW_SERVICE);
        DisplayMetrics metrics = new DisplayMetrics();
        wm.getDefaultDisplay().getMetrics(metrics);
        // 获取弹出Aty-window的宽高，重设置为屏幕的宽高
        WindowManager.LayoutParams lp = getWindow().getAttributes();
        lp.width = metrics.widthPixels;
        lp.height = metrics.heightPixels;
        // lp是布局参数，重设置了宽高之后再设置给window
        getWindow().setAttributes(lp);

        list = new ArrayList<>();
        intent = getIntent();
        String pwd = intent.getStringExtra("pwd");
        if (pwd.equals("pushset")) {
            list.add("开启");
            list.add("关闭");
            list.add("夜间勿扰");
        }
        loopView.setItems(list);
        loopView.setNotLoop();
        loopView.setListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(int index) {
                String text = list.get(index);
                Bean bean = new Bean();
                bean.setText(text);
                eventBus.post(bean);
                finish();
            }
        });
    }

    @Override
    protected void initListener() {
        loopView.setOnClickListener(this);
        sureTv.setOnClickListener(this);
        deleteTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_loop_sure:
                finish();
                break;
            case R.id.tv_loop_delete:
                finish();
                break;
        }
    }
}
