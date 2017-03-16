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
public class TeacherMovieCommentRvAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context, parent, R.layout.item_frame_movie_detail_evaluate_comment);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        if(false) {
            holder.setImg(R.id.iv_item_comment_head, "url");
        }
        holder.setText(R.id.tv_item_comment_nickname, "233皇上啊");
        holder.setText(R.id.tv_item_comment_time, "2013-01-04");
        holder.setText(R.id.tv_item_comment_type, "类型");
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
