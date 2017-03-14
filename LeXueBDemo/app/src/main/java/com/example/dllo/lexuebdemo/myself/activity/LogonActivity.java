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
public class LogonActivity extends BaseActivity implements View.OnClickListener {
    private TextView cancelTv, clauseTv, loginTv;
    private Intent intent;


    @Override
    protected int getLayout() {
        return R.layout.activity_logon;
    }

    @Override
    protected void initView() {
        clauseTv = bindView(R.id.tv_fg_myself_clause);
        cancelTv = bindView(R.id.tv_logon_cancel);
        loginTv = bindView(R.id.tv_logon_login);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        clauseTv.setOnClickListener(this);
        cancelTv.setOnClickListener(this);
        loginTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_fg_myself_clause:
                intent = new Intent(this, ClauseActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_logon_cancel:
                finish();
                break;
            case R.id.tv_logon_login:
                intent = new Intent(this, LoginActivity.class);
                startActivity(intent);
                finish();
                break;
        }
    }
}
