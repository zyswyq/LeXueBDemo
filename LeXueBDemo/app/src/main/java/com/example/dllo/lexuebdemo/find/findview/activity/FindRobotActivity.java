package com.example.dllo.lexuebdemo.find.findview.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.find.adapter.FindRobotLvAdapter;
import com.example.dllo.lexuebdemo.find.model.FindRobotBean;
import com.example.dllo.lexuebdemo.find.model.RobotBean;
import com.google.gson.Gson;
import com.iflytek.cloud.RecognizerResult;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechSynthesizer;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.SynthesizerListener;
import com.iflytek.cloud.ui.RecognizerDialog;
import com.iflytek.cloud.ui.RecognizerDialogListener;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by dllo on 17/3/15.
 */

public class FindRobotActivity extends BaseActivity implements View.OnClickListener {

    private Button sayBtn;
    private TextView chageVoice;
    private ListView mainList;
    private List<FindRobotBean> data;
    private FindRobotLvAdapter adapter;
    private List<String> sound=new ArrayList<>();
    private int num=0;

    @Override
    protected int getLayout() {
        return R.layout.activity_find_robot;
    }

    @Override
    protected void initView() {
        sayBtn=bindView(R.id.btn_find_robot);
        chageVoice=bindView(R.id.tv_find_robot);
        mainList=bindView(R.id.lv_find_robot);
        SpeechUtility.createUtility(this, SpeechConstant.APPID + "=58c5f177");
        data=new ArrayList<>();
        adapter=new FindRobotLvAdapter();
        adapter.setContext(this);
        adapter.setData(data);
        mainList.setAdapter(adapter);
        sound.add("xiaoyu");
        sound.add("xiaoyan");
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        sayBtn.setOnClickListener(this);
//        mainList.setOnClickListener(this);
        chageVoice.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_find_robot:
                btnVoice();
                break;
            case R.id.tv_find_robot:
                if (num==0){
                    num=1;
                }else {
                    num=0;
                }

                break;
        }
    }
    private void btnVoice() {
        RecognizerDialog dialog = new RecognizerDialog(this, null);
        dialog.setParameter(SpeechConstant.LANGUAGE, "zh_cn");
        dialog.setParameter(SpeechConstant.ACCENT, "mandarin");
        dialog.setListener(new RecognizerDialogListener() {
            @Override
            public void onResult(RecognizerResult recognizerResult, boolean b) {
                printResult(recognizerResult);
            }

            @Override
            public void onError(SpeechError speechError) {
            }
        });
        dialog.show();
        Toast.makeText(this, "请开始说话", Toast.LENGTH_SHORT).show();
    }    //回调结果：
    private void printResult(RecognizerResult results) {
        String text = parseIatResult(results.getResultString());
        // 自动填写地址
//        mResultText.append(text);

        if (text.equals("!")||text.equals("?")||text.equals("。")){

        }else {
            FindRobotBean findbean=new FindRobotBean();
            findbean.setText(text);
            findbean.setType(1);//1是我说的
            data.add(findbean);
            adapter.notifyDataSetChanged();


            OkHttpClient okHttpClient = new OkHttpClient.Builder().build();
            FormBody body = new FormBody.Builder()
                    .add("key", "c59d0fd29bc345718515d7f64d1a3c31")
                    .add("info", text)
                    .add("userid", "123")
                    .build();

            Request request = new Request.Builder().url("http://www.tuling123.com/openapi/api").post(body).build();

            okHttpClient.newCall(request).enqueue(new Callback() {
                @Override
                public void onFailure(Call call, IOException e) {

                }

                @Override
                public void onResponse(Call call, Response response) throws IOException {
                    Gson gson = new Gson();
                    RobotBean bean = new RobotBean();
                    bean = gson.fromJson(response.body().string(), RobotBean.class);
                    String answer = bean.getText();
                    FindRobotBean robotbean=new FindRobotBean();
                    robotbean.setText(answer);
                    robotbean.setType(2);
                    data.add(robotbean);
                    Log.d("hjahahahah", "data.size():" + data.size());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            adapter.notifyDataSetChanged();

                        }
                    });


                    //1.创建 SpeechSynthesizer 对象, 第二个参数:本地合成时传 InitListener
                    SpeechSynthesizer mTts = SpeechSynthesizer.createSynthesizer(FindRobotActivity.this, null);
                    //2.合成参数设置,详见《MSC Reference Manual》SpeechSynthesizer 类
                    // 设置发音人(更多在线发音人,用户可参见 附录13.2
                    mTts.setParameter(SpeechConstant.VOICE_NAME, sound.get(num));
                    // 设置发音人
                    mTts.setParameter(SpeechConstant.SPEED, "50");
                    // 设置语速
                    mTts.setParameter(SpeechConstant.VOLUME, "80");
                    // 设置音量,范围 0~100
                    mTts.setParameter(SpeechConstant.ENGINE_TYPE, SpeechConstant.TYPE_CLOUD);
                    // 设置云端
                    // 设置合成音频保存位置(可自定义保存位置),保存在“./sdcard/iflytek.pcm”
                    //保存在 SD 卡需要在 AndroidManifest.xml 添加写 SD 卡权限
                    // 仅支持保存为 pcm 和 wav 格式,如果不需要保存合成音频,注释该行代码 mTts.setParameter(SpeechConstant.TTS_AUDIO_PATH, "./sdcard/iflytek.pcm");
                    // 3.开始合成
                    mTts.startSpeaking(answer, mSynListener);

                }
            });
        }

    }
    private SynthesizerListener mSynListener = new SynthesizerListener() {
        //会话结束回调接口,没有错误时,error为null
        public void onCompleted(SpeechError error) {
        }

        //缓冲进度回调 //percent为缓冲进度0~100,beginPos为缓冲音频在文本中开始位置,endPos表示缓冲音频在文本中结束位置,info为附加信息。
        public void onBufferProgress(int percent, int beginPos, int endPos, String info) {
        }

        //开始播放
        public void onSpeakBegin() {
        }

        //暂停播放
        public void onSpeakPaused() {
        }

        //播放进度回调 //percent为播放进度0~100,beginPos为播放音频在文本中开始位置,endPos表示播放音频在文本中结束位置.
        public void onSpeakProgress(int percent, int beginPos, int endPos) {
        }

        //恢复播放回调接口
        public void onSpeakResumed() {
        }

        //会话事件回调接口
        public void onEvent(int arg0, int arg1, int arg2, Bundle arg3) {
        }
    };

    public static String parseIatResult(String json) {
        StringBuffer ret = new StringBuffer();
        try {
            JSONTokener tokener = new JSONTokener(json);
            JSONObject joResult = new JSONObject(tokener);
            JSONArray words = joResult.getJSONArray("ws");
            for (int i = 0; i < words.length(); i++) {
                //转写结果词，默认使用第一个结果
                JSONArray items = words.getJSONObject(i).getJSONArray("cw");
                JSONObject obj = items.getJSONObject(0);
                ret.append(obj.getString("w"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ret.toString();
    }
}
