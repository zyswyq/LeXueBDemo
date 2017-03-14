package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherInfoGiftAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context, parent, R.layout.item_teacher_detail_info_dataframe_rv_giftinfo);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 11;
    }
}
