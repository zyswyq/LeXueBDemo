package com.example.dllo.lexuebdemo.myself.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.NotificationCompat;
import android.text.Editable;
import android.text.InputType;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.main.view.MainActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import cn.smssdk.EventHandler;
import cn.smssdk.SMSSDK;

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
    private ImageButton showIb;
    private boolean isChanged = true;
    private EditText pwdEt, captchaEt, numberEt;
    private Button captchaBtn, logonBtn;
    private CheckBox checkBox;
    private Handler handler;


    @Override
    protected int getLayout() {
        return R.layout.activity_logon;
    }

    @Override
    protected void initView() {
        clauseTv = bindView(R.id.tv_fg_myself_clause);
        cancelTv = bindView(R.id.tv_logon_cancel);
        loginTv = bindView(R.id.tv_logon_login);
        showIb = bindView(R.id.ib_logon_show);
        pwdEt = bindView(R.id.et_logon_pwd);
        captchaBtn = bindView(R.id.btn_logon_captcha);
        captchaEt = bindView(R.id.et_logon_captcha);
        numberEt = bindView(R.id.et_logon_number);
        checkBox = bindView(R.id.cb_logon_approve);
        logonBtn = bindView(R.id.btn_logon);

    }

    @Override
    protected void initData() {
        checkBox.setChecked(true);
        pwdEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String number = numberEt.getText().toString();
                String pwd = pwdEt.getText().toString();
                String captcha = captchaEt.getText().toString();
                if (!TextUtils.isEmpty(pwd) && !TextUtils.isEmpty(number) && !TextUtils.isEmpty(captcha)) {
                    logonBtn.setBackground(getDrawable(R.color.mainblue));
                    logonBtn.setTextColor(0xffffffff);
                } else {
                    logonBtn.setBackground(getDrawable(R.color.alpBlack));
                    logonBtn.setTextColor(0xffe3e3e3);
                }
            }

        });
        numberEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String number = numberEt.getText().toString();
                String pwd = pwdEt.getText().toString();
                String captcha = captchaEt.getText().toString();
                if (!TextUtils.isEmpty(pwd) && !TextUtils.isEmpty(number) && !TextUtils.isEmpty(captcha)) {
                    logonBtn.setBackground(getDrawable(R.color.mainblue));
                    logonBtn.setTextColor(0xffffffff);
                } else {
                    logonBtn.setBackground(getDrawable(R.color.alpBlack));
                    logonBtn.setTextColor(0xffe3e3e3);
                }
            }
        });
        captchaEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                String number = numberEt.getText().toString();
                String pwd = pwdEt.getText().toString();
                String captcha = captchaEt.getText().toString();
                if (!TextUtils.isEmpty(pwd) && !TextUtils.isEmpty(number) && !TextUtils.isEmpty(captcha)) {
                    logonBtn.setBackground(getDrawable(R.color.mainblue));
                    logonBtn.setTextColor(0xffffffff);
                } else {
                    logonBtn.setBackground(getDrawable(R.color.alpBlack));
                    logonBtn.setTextColor(0xffe3e3e3);
                }
            }
        });
    }

    @Override
    protected void initListener() {
        clauseTv.setOnClickListener(this);
        cancelTv.setOnClickListener(this);
        loginTv.setOnClickListener(this);
        showIb.setOnClickListener(this);
        captchaBtn.setOnClickListener(this);
        logonBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String number = numberEt.getText().toString();
        String pwd = pwdEt.getText().toString();
        String captcha = captchaEt.getText().toString();

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
            case R.id.ib_logon_show:
                if (isChanged) {
                    showIb.setImageDrawable(getResources().getDrawable(R.mipmap.register_password_visible_icon));
                    pwdEt.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                } else {
                    showIb.setImageDrawable(getResources().getDrawable(R.mipmap.register_password_invisible_icon));
                    pwdEt.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
                isChanged = !isChanged;
                break;
            case R.id.btn_logon_captcha:
                SMSSDK.initSDK(this, "1c1db80e1b600", "487866f3309a6814b36eccc97134b135");
                //初步验证是不是手机号
                if (isNumber(number)) {
                    //给该号码发短信
                    Toast.makeText(this, "发送成功", Toast.LENGTH_SHORT).show();
                    SMSSDK.getVerificationCode("+86", number);
                } else if (TextUtils.isEmpty(number)) {
                    Toast.makeText(this, "输入不能为空", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(this, "请输入正确手机号", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.btn_logon:
                if (checkBox.isChecked()) {
                    intent = new Intent(this, MainActivity.class);
                    int ID = 4;
                    intent.putExtra("fragment", ID);
                    startActivity(intent);
                    //完成回调
                    //提交验证码成功
                    //获取验证码成功
                    //返回支持的国家列表
                    handler = new Handler(new Handler.Callback() {
                        @Override
                        public boolean handleMessage(Message msg) {
                            if (msg.arg2 == SMSSDK.RESULT_COMPLETE) {
                                //完成回调
                                if (msg.arg1 == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {
                                    Toast.makeText(LogonActivity.this, "注册成功", Toast.LENGTH_SHORT).show();
                                    //提交验证码成功
                                } else if (msg.arg1 == SMSSDK.EVENT_GET_VERIFICATION_CODE) {
                                    Toast.makeText(LogonActivity.this, "获取验证码成功", Toast.LENGTH_SHORT).show();
                                    //获取验证码成功
                                } else if (msg.arg1 == SMSSDK.EVENT_GET_SUPPORTED_COUNTRIES) {
                                    //返回支持的国家列表
                                    ArrayList<HashMap<String, Object>> list = (ArrayList<HashMap<String, Object>>) msg.obj;
                                }
                            }
                            return false;
                        }
                    });
                    finish();
                } else {
                    Toast.makeText(this, "你需要同意用户协议", Toast.LENGTH_SHORT).show();
                }
                SharedPreferences sharedPreferences = getSharedPreferences("register",this.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putBoolean("register",true);
                editor.commit();
                break;
        }

    }

    public static boolean isNumber(String mobiles) {

        Pattern p = Pattern.compile("^((13[0-9])|(14[0-9])|(15[^4,\\D])|(18[0,5-9])|(17[0-9]))\\d{8}$");

        Matcher m = p.matcher(mobiles);

        return m.matches();

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    private EventHandler eventHandler = new EventHandler() {
        @Override
        public void afterEvent(int i, int i1, Object o) {
            super.afterEvent(i, i1, o);
            Message msg = Message.obtain();
            msg.arg1 = i;
            msg.arg2 = i1;
            msg.obj = o;
            handler.sendMessage(msg);
        }
    };
}
