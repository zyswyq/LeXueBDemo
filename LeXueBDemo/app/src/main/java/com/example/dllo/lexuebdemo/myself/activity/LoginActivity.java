package com.example.dllo.lexuebdemo.myself.activity;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;

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
public class LoginActivity extends BaseActivity implements View.OnClickListener {
    TextView clauseTv, logonTv, cancelTv;
    private Intent intent;


    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        logonTv = bindView(R.id.tv_login_cancel);
        cancelTv = bindView(R.id.tv_login_logon);
        clauseTv = bindView(R.id.tv_at_clause);
    }

    @Override
    protected void initData() {
    }

    @Override
    protected void initListener() {
        logonTv.setOnClickListener(this);
        clauseTv.setOnClickListener(this);
        cancelTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_login_cancel:
                finish();
                break;
            case R.id.tv_login_logon:
                intent = new Intent(this, LogonActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.tv_at_clause:
                intent = new Intent(this, ClauseActivity.class);
                startActivity(intent);
                break;
        }
    }
}
