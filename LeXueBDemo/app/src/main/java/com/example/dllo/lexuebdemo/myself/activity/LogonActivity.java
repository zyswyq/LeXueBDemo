package com.example.dllo.lexuebdemo.myself.activity;

import android.content.Intent;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;

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
    private EditText pwdEt,captchaEt,numberEt;
    private Button captchaBtn;


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
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        clauseTv.setOnClickListener(this);
        cancelTv.setOnClickListener(this);
        loginTv.setOnClickListener(this);
        showIb.setOnClickListener(this);
        captchaBtn.setOnClickListener(this);
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
                String number = numberEt.getText().toString();
                //给该号码发短信
                SMSSDK.getVerificationCode("+86",number);
//                SMSSDK.registerEventHandler(eventHandler);
                break;
        }

    }

//    private EventHandler eventHandler = new EventHandler() {
//        @Override
//        public void afterEvent(int event, int result, Object data) {
//            if (result == SMSSDK.RESULT_COMPLETE) {
//                if (event == SMSSDK.EVENT_SUBMIT_VERIFICATION_CODE) {
//
//                } else if (event == SMSSDK.EVENT_GET_VERIFICATION_CODE) {
//                } else if (event == SMSSDK.EVENT_GET_SUPPORTED_COUNTRIES) {
//
//                }
//
//            } else {
//                ((Throwable) data).printStackTrace();
//            }
//        }
//    };
}
