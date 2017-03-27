package com.example.dllo.lexuebdemo.myself.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
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
import com.example.dllo.lexuebdemo.receiver.NetWorkReceiver;

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
    private ImageView backIv, showIv, creameIv;
    private final int IMAGE_RESULT_CODE = 2;// 表示打开照相机
    private final int PICK = 1;// 选择图片库
    private IntentFilter filter;
    private IdeaActivitty.creameReceiver creameReceiver;
    private IdeaActivitty.photoReceiver photoReceiver;

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
        showIv = bindView(R.id.iv_idea_show);
        creameIv = bindView(R.id.iv_idea_creame);
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
        creameReceiver = new creameReceiver();
        filter = new IntentFilter("creame");
        registerReceiver(creameReceiver,filter);
        photoReceiver = new photoReceiver();
        filter = new IntentFilter("photo");
        registerReceiver(photoReceiver,filter);
    }

    @Override
    protected void initListener() {
        backIv.setOnClickListener(this);
        creameIv.setOnClickListener(this);
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
            case R.id.iv_idea_creame:
                Intent intent = new Intent(this, DialogActivity.class);
                startActivity(intent);
        }
    }

    class creameReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, IMAGE_RESULT_CODE);// 打开照相机
        }
    }

    class photoReceiver extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            intent = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
            startActivityForResult(intent, PICK);// 打开照相机
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        // TODO Auto-generated method stub
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            // 表示 调用照相机拍照
            case IMAGE_RESULT_CODE:
                if (resultCode == RESULT_OK) {
                    Bundle bundle = data.getExtras();
                    Bitmap bitmap = (Bitmap) bundle.get("data");
                    showIv.setImageBitmap(bitmap);
                    showIv.setVisibility(View.VISIBLE);
                    creameIv.setVisibility(View.GONE);
                }
                break;
            // 选择图片库的图片
            case PICK:
                if (resultCode == RESULT_OK) {
                    Uri uri = data.getData();
                    showIv.setImageURI(uri);
                    showIv.setVisibility(View.VISIBLE);
                    creameIv.setVisibility(View.GONE);
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(creameReceiver);
        unregisterReceiver(photoReceiver);
    }
}
