package com.example.dllo.lexuebdemo.sql;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class MyThreadPool {
    private static MyThreadPool ourInstance;
    private ThreadPoolExecutor mThreadPoolExecutor;
    public static MyThreadPool getInstance() {
        if (ourInstance == null){
            synchronized (MyThreadPool.class){
                if (ourInstance == null){
                    ourInstance = new MyThreadPool();
                }
            }
        }
        return ourInstance;
    }

    private MyThreadPool() {
        //获取手机核数
        int CPUSize = Runtime.getRuntime().availableProcessors();
        //一般来说我们核心线程数为手机核数+1
        //最大线程数不能超过手机核数2倍+1
        //自定义存活时间  时间单位 以及任务队列
        mThreadPoolExecutor =
                new ThreadPoolExecutor(CPUSize + 1
                        ,CPUSize * 2 + 1
                        ,60, TimeUnit.SECONDS,
                        new LinkedBlockingDeque<Runnable>());

    }

    public ThreadPoolExecutor getThreadPoolExecutor() {
        return mThreadPoolExecutor;
    }
}
