package com.example.dllo.lexuebdemo.presenter;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.adapter.TeacherTagListRecycleViewAdapter;
import com.example.dllo.lexuebdemo.model.TeacherPageTagBean;
import com.example.dllo.lexuebdemo.view.TeacherView;

import java.util.ArrayList;
import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherPresenter {
    private static final String TAG = "TeacherPresenter";
    private TeacherView teacherView;
    private TeacherPageTagBean bean;
    private final List<String> tagList;
    private Context context;

    public TeacherPresenter(TeacherView teacherView) {
        this.teacherView = teacherView;
        tagList = new ArrayList<>();
        for(int i = 1; i <= 15; i++){
            tagList.add("课程"+i);
        }
        bean = new TeacherPageTagBean(tagList);
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setAdapter() {
        teacherView.setAdapter();
    }

    public void setTabLayout() {
        teacherView.setTabLayout(bean.getTags());
    }

    public void popTagList(View btn) {
        View popView = LayoutInflater.from(context).inflate(R.layout.pop_window_teacher_taglist, null);
        RecyclerView recyclerView = (RecyclerView) popView.findViewById(R.id.rv_pop_teacher_taglist);
        recyclerView.setLayoutManager(new GridLayoutManager(context, 3, LinearLayoutManager.VERTICAL, false));
        TeacherTagListRecycleViewAdapter adapter = new TeacherTagListRecycleViewAdapter();
        adapter.setContext(context);
        recyclerView.setAdapter(adapter);

        PopupWindow popupWindow = new PopupWindow(popView, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT, true);
        popupWindow.setTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e(TAG, "onTouch: " + v.getId());
                return false;
            }
        });

        popupWindow.setBackgroundDrawable(new BitmapDrawable(null, ""));
        WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

        int xpos = manager.getDefaultDisplay().getWidth();
        int ypos = manager.getDefaultDisplay().getHeight();
        popupWindow.showAsDropDown(btn, 0, -60);
        Log.e(TAG, "popTagList: init finished");
//        teacherView.popTagList(popupWindow, btn);
    }
}
