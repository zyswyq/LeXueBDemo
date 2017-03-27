package com.example.dllo.lexuebdemo.customview;
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

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;

public class Toast {
    //声明Context对象、要弹出的字符串、显示时长
    private static Context context;
    private static String str;
    private static int duraiton;

    //声明时长的两个常量(就是使用原Toast的)
    public static final int LENGTH_LONG = android.widget.Toast.LENGTH_LONG;
    public static final int LENGTH_SHORT = android.widget.Toast.LENGTH_SHORT;


    private Toast(Context context, String str, int duraiton){
        Toast.context = context;
        Toast.str = str;
        Toast.duraiton = duraiton;
    }

    public static Toast makeText(Context context, String str, int duraiton){
        return new Toast(context, str, duraiton);
    }

    public void myShow(){
        //注意，这里创建的是原Toast，需要加全包名
        android.widget.Toast toast = new android.widget.Toast(context);

        //定义Toast的样式（在布局文件中）
        View view = LayoutInflater.from(context).inflate(R.layout.toast_view, null);
        ((TextView)view.findViewById(R.id.my_toast_content)).setText(str);
        //设置view
        toast.setView(view);
        //设置弹出的位置
        //toast.setGravity(Gravity.BOTTOM, 0, 0);

        toast.show();
    }
}
