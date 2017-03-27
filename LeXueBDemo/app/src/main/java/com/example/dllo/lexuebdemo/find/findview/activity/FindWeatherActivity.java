package com.example.dllo.lexuebdemo.find.findview.activity;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.customview.WeatherView;
import com.example.dllo.lexuebdemo.find.model.FindWeatherBean;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.OKTool;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/3/27.
 */

public class FindWeatherActivity extends BaseActivity{

    private WeatherView weatherView;
    private List<String> data;

    @Override
    protected int getLayout() {
        return R.layout.activity_find_weather;
    }

    @Override
    protected void initView() {
        weatherView=bindView(R.id.weather_find);

    }

    @Override
    protected void initData() {
        NetTools.getInstance().startRequest("http://v.juhe.cn/weather/index?format=2&cityname=%E8%8B%8F%E5%B7%9E&key=15860908a55d8c1df143be575433d4f6", FindWeatherBean.class, new MyCallBack<FindWeatherBean>() {
            @Override
            public void success(FindWeatherBean respomse) {
                data=new ArrayList<>();
                data.add(respomse.getResult().getToday().getTemperature());
                for (FindWeatherBean.ResultBean.FutureBean futureBean : respomse.getResult().getFuture()) {
                    data.add(futureBean.getTemperature());
                }
                weatherView.setData(data);

            }

            @Override
            public void error(Throwable throwable) {

            }
        });
    }

    @Override
    protected void initListener() {

    }
}
