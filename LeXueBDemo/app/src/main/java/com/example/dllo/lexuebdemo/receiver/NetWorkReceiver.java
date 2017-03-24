package com.example.dllo.lexuebdemo.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import com.example.dllo.lexuebdemo.customview.Toast;

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
            Toast.makeText(context, "网络已连接", Toast.LENGTH_SHORT).myShow();
//            Toast toast = new Toast(context);
//            View view = LayoutInflater.from(context).inflate(R.layout.toast_view, null);
//            TextView content = (TextView) view.findViewById(R.id.my_toast_content);
//            content.setText("网络已连接");
//            toast.setView(view);
//            toast.show();
        }else{
            Toast.makeText(context, "未连接到网络，请检查网络设置", Toast.LENGTH_SHORT).myShow();
//            Toast toast = new Toast(context);
//            View view = LayoutInflater.from(context).inflate(R.layout.toast_view, null);
//            TextView content = (TextView) view.findViewById(R.id.my_toast_content);
//            content.setText("无网络，请检查网络设置");
//            toast.setView(view);
//            toast.show();
        }

    }
}
