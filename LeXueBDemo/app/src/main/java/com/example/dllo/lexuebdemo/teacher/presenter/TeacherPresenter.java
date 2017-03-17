package com.example.dllo.lexuebdemo.teacher.presenter;

import android.content.Context;

import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.example.dllo.lexuebdemo.nettools.NetBean;
import com.example.dllo.lexuebdemo.teacher.model.Constant;
import com.example.dllo.lexuebdemo.teacher.model.TeacherTagBean;
import com.example.dllo.lexuebdemo.teacher.view.ITeacherView;

import java.util.ArrayList;
import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherPresenter{
    private static final String TAG = "TeacherPresenter";
    private ITeacherView teacherView;
    private List<String> tagList;
    private Context context;

    public TeacherPresenter(final ITeacherView teacherView) {
        this.teacherView = teacherView;
        NetTools.getInstance().startRequest(Constant.TEACHER_ALLDATA_URL,
                TeacherTagBean.class, new MyCallBack<TeacherTagBean>() {
                    @Override
                    public void success(TeacherTagBean respomse) {
                        teacherView.setNetData(respomse);
                    }

                    @Override
                    public void error(Throwable throwable) {

                    }
                });

    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setAdapter() {
        teacherView.setAdapter();
    }

    public void setTabLayout() {
        teacherView.setTabLayout();
    }

    public void onShow(){
        teacherView.onShow();
    }

/**
    public void popTagList(View btn) {
        View popView = LayoutInflater.from(context).inflate(R.layout.fragment_teacher_taglist, null);
        DragGridView dragGridView = (DragGridView) popView.findViewById(R.id.drag_gridview);

        MyDragGvAdapter adapter = new MyDragGvAdapter(bean.getTags());
        adapter.setContext(context);
        dragGridView.setAdapter(adapter);


        initPopWindow(btn, popView);
    }

    private void initPopWindow(View btn, View popView) {
        PopupWindow popupWindow = new PopupWindow(popView, ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setTouchable(false);
        popupWindow.setTouchInterceptor(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                Log.e(TAG, "onTouch: " + v.getId());
                return false;
            }
        });

        popupWindow.setBackgroundDrawable(new BitmapDrawable(null, ""));
        WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);

//        int xpos = manager.getDefaultDisplay().getWidth();
//        int ypos = manager.getDefaultDisplay().getHeight();
        teacherView.popTagList(popupWindow, btn, 0, -60);
    }
 */
}
