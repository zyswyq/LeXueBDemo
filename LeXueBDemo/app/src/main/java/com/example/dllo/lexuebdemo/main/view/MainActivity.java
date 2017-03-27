package com.example.dllo.lexuebdemo.main.view;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.customview.NoMoveViewPager;
import com.example.dllo.lexuebdemo.find.findview.fragment.FindFragment;
import com.example.dllo.lexuebdemo.home.fragment.HomeTabFragment;
import com.example.dllo.lexuebdemo.main.adapter.MainVPAdapter;
import com.example.dllo.lexuebdemo.main.presenter.MainPresenter;
import com.example.dllo.lexuebdemo.myself.activity.LogonActivity;
import com.example.dllo.lexuebdemo.myself.fragment.MyselfFragment;
import com.example.dllo.lexuebdemo.receiver.NetWorkReceiver;
import com.example.dllo.lexuebdemo.teacher.view.TeacherFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * by 王宇琦
 * 主界面
 */

public class MainActivity extends BaseActivity implements MainView {
    private static final String TAG = "MainActivity";

    private RadioButton mainPage, teacherPage, findPage, myPage;
    private RadioGroup mainRagioGroup;
    private MainPresenter presenter;
    private NoMoveViewPager mainVP;
    private List<Fragment> fragments;
    private MainVPAdapter adapter;

    private boolean confirmExit = false;
    private Handler handler = new Handler(new Handler.Callback() {
        @Override
        public boolean handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    //还原boolean值状态
                    confirmExit = false;
                    break;
                default:
                    break;
            }
            return false;
        }
    });

    private NetWorkReceiver netWorkReceiver;

    private boolean register() {
        SharedPreferences sharedPreferences = getSharedPreferences("register", this.MODE_PRIVATE);
        return sharedPreferences.getBoolean("register", false);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }


    @Override
    protected void initView() {
        fragments = new ArrayList<>();
        mainPage = bindView(R.id.radiobtn_main);
        myPage = bindView(R.id.radiobtn_my);
        teacherPage = bindView(R.id.radiobtn_teacher);
        findPage = bindView(R.id.radiobtn_find);
        mainRagioGroup = bindView(R.id.radiogroup_main);
        mainVP = bindView(R.id.vp_main);
        presenter = new MainPresenter(this);
        mainPage.setChecked(true);
        adapter = new MainVPAdapter(getSupportFragmentManager());
    }

    @Override
    protected void initData() {
        fragments.add(new HomeTabFragment());
        fragments.add(new TeacherFragment());
        fragments.add(new FindFragment());
        if (register()) {
            fragments.add(new MyselfFragment());
        }
        adapter.setFragments(fragments);
        mainVP.setAdapter(adapter);
        mainVP.setOffscreenPageLimit(4);
        if (getIntent().getIntExtra("fragment", 0) == 4) {
            mainVP.setCurrentItem(4);
            myPage.setChecked(true);
        }
        netWorkReceiver = new NetWorkReceiver();
        IntentFilter filter = new IntentFilter();
        filter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        registerReceiver(netWorkReceiver, filter);
    }

    @Override
    protected void initListener() {
        mainRagioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                presenter.selectPage(i);
                if (!register()) {
                    if (i == R.id.radiobtn_my) {
                        Intent intent = new Intent(MainActivity.this, LogonActivity.class);
                        startActivity(intent);
                    }
                }
            }
        });
    }


    class RefreshReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            initData();
        }
    }


    @Override
    public void selectFragment(int i) {
        mainVP.setCurrentItem(i);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return super.onKeyDown(keyCode, event);
    }


    //延时发送消息，控制一定时间内点击两次返回，退出程序
    @Override
    public void onBackPressed() {
        if (confirmExit) {
            finish();
        } else {
            confirmExit = true;
            Toast.makeText(this, "再次返回，退出程序", Toast.LENGTH_SHORT).show();
            handler.sendEmptyMessageDelayed(0, 2000);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(netWorkReceiver);
    }
}
