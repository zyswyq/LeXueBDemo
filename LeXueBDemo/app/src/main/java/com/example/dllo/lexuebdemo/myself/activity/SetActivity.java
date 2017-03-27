package com.example.dllo.lexuebdemo.myself.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.main.view.MainActivity;
import com.example.dllo.lexuebdemo.myself.bean.Bean;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

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

public class SetActivity extends BaseActivity implements View.OnClickListener {
    private ImageView backIv;
    private Button noLoginBtn;
    private RelativeLayout pushSetRl;
    private Intent intent;
    private TextView pushSetTextTv;

    @Override
    protected int getLayout() {
        return R.layout.activity_set;
    }

    @Override
    protected void initView() {
        backIv = bindView(R.id.iv_set_back);
        noLoginBtn = bindView(R.id.btn_set_nologin);
        pushSetRl = bindView(R.id.rl_set_pushset);
        pushSetTextTv = bindView(R.id.tv_set_pushsettext);
    }

    @Override
    protected void initData() {
        //注册EventBus
        EventBus.getDefault().register(this);
    }

    @Override
    protected void initListener() {
        backIv.setOnClickListener(this);
        noLoginBtn.setOnClickListener(this);
        pushSetRl.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_set_back:
                finish();
                break;
            case R.id.btn_set_nologin:
                SharedPreferences sharedPreferences = this.getSharedPreferences("register", this.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("register", false);
                editor.commit();
                finish();
                intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.rl_set_pushset:
                intent = new Intent(this, LoopActivity.class);
                intent.putExtra("pwd", "pushset");
                startActivity(intent);
                break;
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    public void getText(Bean bean) {
        pushSetTextTv.setText(bean.getText());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //解除EventBus注册
        EventBus.getDefault().unregister(this);
    }
}
