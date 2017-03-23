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
    private static Context context;
    private static String str;
    private static int duraiton;

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

    public void xieShow(){
        android.widget.Toast toast = new android.widget.Toast(context);
        View view = LayoutInflater.from(context).inflate(R.layout.toast_view, null);
        ((TextView)view.findViewById(R.id.my_toast_content)).setText(str);
        toast.setView(view);
//        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.show();
    }
}
