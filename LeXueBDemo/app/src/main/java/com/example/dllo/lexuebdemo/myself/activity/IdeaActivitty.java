package com.example.dllo.lexuebdemo.myself.activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

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

public class IdeaActivitty extends BaseActivity implements View.OnClickListener {
    private EditText textEt;
    private TextView submitTv, numberTv;
    private ImageView backIv;

    @Override
    protected int getLayout() {
        return R.layout.activity_idea;
    }

    @Override
    protected void initView() {
        textEt = bindView(R.id.et_idea_text);
        submitTv = bindView(R.id.tv_idea_submit);
        backIv = bindView(R.id.iv_idea_back);
        numberTv = bindView(R.id.tv_idea_textnumber);
    }

    @Override
    protected void initData() {
        textEt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                int num = 400 - s.length();
                numberTv.setText(num + "");
                if (!TextUtils.isEmpty(s)) {
                    submitTv.setOnClickListener(IdeaActivitty.this);
                    submitTv.setTextColor(0xffffffff);
                } else {
                    submitTv.setTextColor(0x33000000);
                }
                if (num == 0) {
                    Toast toast;
                    toast = Toast.makeText(getApplicationContext(), "最多可输入400个汉字", Toast.LENGTH_LONG);

                    toast.setGravity(Gravity.CENTER, 0, 0);
                    LinearLayout toastView = (LinearLayout) toast.getView();
                    ImageView i = new ImageView(getApplicationContext());
                    i.setImageResource(R.mipmap.toast_attention);
                    toastView.addView(i, 0);
                    toast.show();
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    protected void initListener() {
        backIv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.iv_idea_back:
                AlertDialog.Builder dialog = new AlertDialog.Builder(this);
                dialog.setTitle("确定放弃此次编辑？").setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                      finish();
                    }
                }).setNegativeButton("取消", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).show();
                break;
            case R.id.tv_idea_submit:
                Toast.makeText(this, "提交成功", Toast.LENGTH_SHORT).show();
                finish();
                break;
        }
    }
}
