package com.example.dllo.lexuebdemo.customview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/3/27.
 */

public class WeatherView extends View {

    private List<String> data;
    private List<String> dataX;
    private List<String> dataY;
    private List<Integer> XPoint;
    private List<Integer> YPoint;

    private int[][] xy = new int[][]{};
    private Paint paint = new Paint();
    private List<String> maxdata;
    private List<String> mindata;

    public void setData(List<String> data) {
        this.data = data;

        invalidate();

    }

    public WeatherView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.BLUE);
        mindata = new ArrayList<>();
        maxdata = new ArrayList<>();
        dataX = new ArrayList<>();
        dataY = new ArrayList<>();
        XPoint = new ArrayList<>();
        data = new ArrayList<>();
        YPoint = new ArrayList<>();
        dataX.add("今天");
        dataX.add("明天");
        dataX.add("后天");
        dataX.add("第三天");
        dataX.add("第四天");
        dataX.add("第五天");
        dataX.add("第六天");

        dataY.add("-40");
        dataY.add("-30");
        dataY.add("-20");
        dataY.add("-10");
        dataY.add(" 0");
        dataY.add("10");
        dataY.add("20");
        dataY.add("30");
        dataY.add("40");
    }

    public WeatherView(Context context, AttributeSet attrs) {
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLUE);
        data = new ArrayList<>();
        mindata = new ArrayList<>();
        maxdata = new ArrayList<>();
        dataX = new ArrayList<>();
        dataY = new ArrayList<>();
        XPoint = new ArrayList<>();
        YPoint = new ArrayList<>();
        dataX.add("今天");
        dataX.add("明天");
        dataX.add("后天");
        dataX.add("第三天");
        dataX.add("第四天");
        dataX.add("第五天");
        dataX.add("第六天");

        dataY.add("-40");
        dataY.add("-30");
        dataY.add("-20");
        dataY.add("-10");
        dataY.add(" 0");
        dataY.add("10");
        dataY.add("20");
        dataY.add("30");
        dataY.add("40");
    }

    public WeatherView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public WeatherView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        //画出固定的 比如刻度和时间
        paint.setTextSize(19);
        paint.setColor(Color.BLUE);
        //画时间  X
        for (int i = 0; i < dataX.size(); i++) {
            canvas.drawText(dataX.get(i), i * 100 + 100, 500, paint);
        }
        //画温度 Y
        for (int i = 0; i < dataY.size(); i++) {
            canvas.drawText(dataY.get(i), 50, i * 50 + 50, paint);
        }
        paint.setColor(Color.GREEN);
        canvas.drawLine(90, 0, 90, dataY.size() * 50 + 50, paint);
        canvas.drawLine(70, dataY.size() * 50 + 20, 1000, dataY.size() * 50 + 20, paint);

        //画出点和折线
        for (int i = 0; i < data.size(); i++) {
//            getPooint(getNum(data.get(i)), i);
//            canvas.drawCircle(XPoint.get(i), YPoint.get(i), 10, paint);
//            canvas.drawText(data.get(i) + "", XPoint.get(i) - 10, YPoint.get(i) - 20, paint);
//            if (i != 0) {
//                canvas.drawLine(XPoint.get(i - 1), YPoint.get(i - 1), XPoint.get(i), YPoint.get(i), paint);
//            }
            getNum(data.get(i));
        }
        for (int i = 0; i < mindata.size(); i++) {
            if (i >= 0) {
                YPoint.add((Integer.valueOf(mindata.get(i) )*5 + dataY.size() / 2 * 50 + 50));
                paint.setColor(Color.RED);
            } else {

                YPoint.add((Integer.valueOf(mindata.get(i) )*5+ dataY.size() / 2 * 50 + 50));
                paint.setColor(Color.BLACK);
            }
            XPoint.add(i * 100 + 110);
        }
        for (int i = 0; i < XPoint.size(); i++) {
            canvas.drawCircle(XPoint.get(i), YPoint.get(i), 10, paint);
            canvas.drawText(data.get(i) + "", XPoint.get(i) - 10, YPoint.get(i) - 20, paint);
            if (i != 0) {
                canvas.drawLine(XPoint.get(i - 1), YPoint.get(i - 1), XPoint.get(i), YPoint.get(i), paint);
            }
        }
        YPoint.clear();
        XPoint.clear();
        for (int i = 0; i < maxdata.size(); i++) {

            if (i >= 0) {
                YPoint.add((Integer.valueOf(maxdata.get(i) )*5 + dataY.size() / 2 * 50 + 50));
                paint.setColor(Color.RED);
            } else {

                YPoint.add((Integer.valueOf(maxdata.get(i) )*5+ dataY.size() / 2 * 50 + 50));
                paint.setColor(Color.BLACK);
            }
            XPoint.add(i * 100 + 110);

        }

        for (int i = 0; i < XPoint.size(); i++) {
            canvas.drawCircle(XPoint.get(i), YPoint.get(i), 10, paint);
//            canvas.drawText(data.get(i) + "", XPoint.get(i) - 10, YPoint.get(i) - 20, paint);
            if (i != 0) {
                canvas.drawLine(XPoint.get(i - 1), YPoint.get(i - 1), XPoint.get(i), YPoint.get(i), paint);
            }
        }
    }

    private Integer getNum(String s) {
        String min = "";
        String max = "";


        List<String> d = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            //48~58

            if ('9' >= s.subSequence(i, i + 1).charAt(0) && (int) s.subSequence(i, i + 1).charAt(0) >= '0' || s.subSequence(i, i + 1).equals("-")) {
                d.add(String.valueOf(s.subSequence(i, i + 1).charAt(0)));
            }else {
                if (min.equals("")) {
                    for (String string : d) {
                        min = min+ string;
                    }
                    d.clear();
                }else {
                    for (String string : d) {
                        max= max+string;
                    }
                    d.clear();
                }
            }

        }
        mindata.add(min);
        maxdata.add(max);
        Log.d("WeatherViewmin", min);
        Log.d("WeatherViewmax", max);
        return Integer.valueOf(min);
    }

    private void getPooint(Integer integer1, Integer i) {
        getNum(data.get(i));
        if (integer1 >= 0) {
            YPoint.add(getNum(data.get(i)) * 5 + dataY.size() / 2 * 50 + 50);
            paint.setColor(Color.RED);
        } else {

            YPoint.add(getNum(data.get(i)) * 5 + dataY.size() / 2 * 50 + 50);
            paint.setColor(Color.BLACK);
        }
        XPoint.add(i * 100 + 110);
    }
    private void getMaxPooint(Integer integer1, Integer i) {
        if (integer1 >= 0) {

            YPoint.add(getNum(data.get(i)) * 5 + dataY.size() / 2 * 50 + 50);
            paint.setColor(Color.RED);
        } else {

            YPoint.add(getNum(data.get(i)) * 5 + dataY.size() / 2 * 50 + 50);
            paint.setColor(Color.BLACK);
        }
        XPoint.add(i * 100 + 110);
    }
}
