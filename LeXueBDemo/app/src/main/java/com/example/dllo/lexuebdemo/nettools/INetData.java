package com.example.dllo.lexuebdemo.nettools;

import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public interface INetData<T> {
    T requestNetData(String url, Class<T> tClass, MyCallBack myCallBack);
}
