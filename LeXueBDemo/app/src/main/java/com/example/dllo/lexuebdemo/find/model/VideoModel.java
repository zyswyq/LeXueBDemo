package com.example.dllo.lexuebdemo.find.model;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by dllo on 17/3/10.
 */

public class VideoModel implements VideoRequest{
    private Handler handler=new Handler(Looper.getMainLooper());

    @Override
    public void getData(String url, final VideoRequestListener listener) {
        OkHttpClient okHttpClient=new OkHttpClient.Builder().build();
        final Request request=new Request.Builder().url(url).build();
        okHttpClient.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.onError();
                    }
                });
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String result=response.body().string();
                Log.d("FindDetilVideoActivity", result);
                Gson gson=new Gson();
                final FindVideoBean bean=gson.fromJson(result,FindVideoBean.class);
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        listener.onSuccess(bean);

                    }
                });

            }
        });
    }
}
