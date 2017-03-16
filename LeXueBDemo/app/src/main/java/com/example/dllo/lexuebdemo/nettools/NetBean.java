package com.example.dllo.lexuebdemo.nettools;

import com.example.dllo.lexuebdemo.nettools.INetData;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class NetBean {


    public <T> void startRequest(String url, Class<T> tClass, MyCallBack<T> myCallBack) {
        NetTools.getInstance().startRequest(url,tClass, myCallBack);
    }
}
