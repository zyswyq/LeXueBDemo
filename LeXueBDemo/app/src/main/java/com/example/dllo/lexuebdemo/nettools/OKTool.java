package com.example.dllo.lexuebdemo.nettools;
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
             |       |            <-----辣鸡
             |       |
              |       |
*/

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.example.dllo.lexuebdemo.nettools.inter.InternetRequest;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class OKTool implements InternetRequest {
    private static final String TAG = "OKTool";
    private Gson gson;
    private OkHttpClient okHttpClient;
    private Handler handler = new Handler(Looper.getMainLooper());

    public OKTool(){
        okHttpClient = new OkHttpClient.Builder().connectTimeout(5, TimeUnit.SECONDS)
                .retryOnConnectionFailure(true).build();
        gson = new Gson();
    }


    @Override
    public <T> void startRequest(String url, final Class<T> tClass, final MyCallBack<T> tMyCallBack) {
        Request request = new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, final IOException e) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        tMyCallBack.error(e);
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                //将成功请求到到数据解析成对应的bean或数据类型
                String back = response.body().string();
                final T result = gson.fromJson(back, tClass);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        tMyCallBack.success(result);
                    }
                });
            }
        });
    }
}
