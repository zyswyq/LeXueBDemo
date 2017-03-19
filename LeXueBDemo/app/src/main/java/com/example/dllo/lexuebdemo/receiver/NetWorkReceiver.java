package com.example.dllo.lexuebdemo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/*
    by Mr.L
    data 2017-03-18
    desc 接收网络变化的广播
*/
public class NetWorkReceiver extends BroadcastReceiver{

    @Override
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.
                getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();
        if(networkInfo != null && networkInfo.isAvailable()){
            Toast.makeText(context, "网络已连接", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(context, "无网络，请检查网络设置", Toast.LENGTH_SHORT).show();
        }

    }
}
