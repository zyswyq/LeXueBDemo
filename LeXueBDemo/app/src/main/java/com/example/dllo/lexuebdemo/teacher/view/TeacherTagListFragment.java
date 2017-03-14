package com.example.dllo.lexuebdemo.teacher.view;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.teacher.adapter.MyDragGvAdapter;
import com.example.dllo.lexuebdemo.teacher.customview.DragGridView;
import com.example.dllo.lexuebdemo.teacher.presenter.TeacherTagListPresenter;

import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherTagListFragment extends BaseFragment implements View.OnTouchListener, ITeacherTagListView, View.OnClickListener {
    private static final String TAG = "TeacherTagListFragment";
    private DragGridView dragGridView;
    private MyDragGvAdapter adapter;
    private ImageView hideBtn;
    private TeacherTagListPresenter presenter;

    private FragmentManager fm;
    private TextView finishEdit;


    @Override
    protected int getLayout() {
        return R.layout.fragment_teacher_taglist;
    }

    @Override
    protected void initView() {
        dragGridView= bindView(R.id.drag_gridview);
        hideBtn = bindView(R.id.iv_teacher_taglist_back);
        finishEdit = bindView(R.id.tv_teacher_finish);
        presenter = new TeacherTagListPresenter(this);
    }

    @Override
    protected void initData() {
        fm = getFragmentManager();
        presenter.initAdapter();

    }

    @Override
    protected void initListener() {
        //设置触摸事件监听
        view.setOnTouchListener(this);
        hideBtn.setOnClickListener(this);
        finishEdit.setOnClickListener(this);
    }

    //复写监听事件，防止fragment进行add操作后点击事件穿透
    @Override
    public boolean onTouch(View v, MotionEvent event) {
        return true;
    }


    @Override
    public void initAdapter(List<String> tagList) {
        adapter = new MyDragGvAdapter(tagList);
        adapter.setContext(context);
        dragGridView.setAdapter(adapter);
    }

    @Override
    public void onHide() {

        FragmentTransaction ft = fm.beginTransaction();
        ft.hide(this);
        ft.commit();
    }

    @Override
    public List<String> getTagList() {
        return adapter.getList();
    }


    public void setSelectedItem(int position) {
        adapter.setSelectedItem(position);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_teacher_taglist_back:
                presenter.onHide();
                break;
            case R.id.tv_teacher_finish:
                presenter.getTagList();
                presenter.onHide();
                break;
        }
    }



}
