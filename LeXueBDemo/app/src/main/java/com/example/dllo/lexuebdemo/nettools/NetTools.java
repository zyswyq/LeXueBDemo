package com.example.dllo.lexuebdemo.nettools;/*
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


import com.example.dllo.lexuebdemo.nettools.inter.InternetRequest;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;

public class NetTools implements InternetRequest {
    private static NetTools ourInstance;
    private InternetRequest internetRequest;

    public static NetTools getInstance() {
        if(ourInstance == null){
            synchronized (NetTools.class){
                if(ourInstance == null){
                    ourInstance = new NetTools();
                }
            }
        }
        return ourInstance;
    }

    private NetTools() {
        internetRequest = new OKTool();
    }


    @Override
    public <T> void startRequest(String url, Class<T> tClass, MyCallBack<T> myCallBack) {
        internetRequest.startRequest(url, tClass, myCallBack);
    }
}
