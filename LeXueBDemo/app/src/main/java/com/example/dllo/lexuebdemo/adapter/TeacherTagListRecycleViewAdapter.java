package com.example.dllo.lexuebdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherTagListRecycleViewAdapter extends RecyclerView.Adapter<BaseViewHolder>{
    private Context context;

    public void setContext(Context context) {

        this.context = context;
    }
    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context, parent, R.layout.item_pop_window_teacher_taglist);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 15;
    }
}
