package com.example.dllo.lexuebdemo.myself.activity;

import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;

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

public class DialogActivity extends BaseActivity implements View.OnClickListener {
    private TextView creameTv, photoTv, deleteTv;

    @Override
    protected int getLayout() {
        return R.layout.activity_dialog;
    }

    @Override
    protected void initView() {
        creameTv = bindView(R.id.tv_dialog_creame);
        photoTv = bindView(R.id.tv_dialog_photo);
        deleteTv = bindView(R.id.tv_dialog_delete);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        creameTv.setOnClickListener(this);
        photoTv.setOnClickListener(this);
        deleteTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_dialog_creame:
                sendBroadcast(new Intent("creame"));
                finish();
                break;
            case R.id.tv_dialog_photo:
                sendBroadcast(new Intent("photo"));
                finish();
                break;
            case R.id.tv_dialog_delete:
                finish();
                break;
        }
    }
}
