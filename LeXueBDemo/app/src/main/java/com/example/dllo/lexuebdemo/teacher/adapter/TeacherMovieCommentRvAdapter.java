package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.teacher.model.CommentBean;
import com.example.dllo.lexuebdemo.teacher.model.VideoInfoBean;
import com.example.dllo.lexuebdemo.utils.TimeFormat;

import java.util.List;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherMovieCommentRvAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;
    private List<CommentBean.CommentsBean> commentsBeanList;

    public void setVideoInfoBean(List<CommentBean.CommentsBean> commentsBeanList) {
        this.commentsBeanList = commentsBeanList;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context, parent, R.layout.item_frame_movie_detail_evaluate_comment);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {

        CommentBean.CommentsBean commentsBean = commentsBeanList.get(position);

        final ImageView headImg = holder.getView(R.id.iv_item_comment_head);
        Glide.with(context).load(commentsBean.getUser_icon().getUrl()).asBitmap().centerCrop().into(new BitmapImageViewTarget(headImg) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                headImg.setImageDrawable(circularBitmapDrawable);
            }
        });

        holder.setText(R.id.tv_item_comment_nickname, commentsBean.getUser_name());
        holder.setText(R.id.tv_item_comment_content, commentsBean.getComment_content());
        holder.setText(R.id.tv_item_comment_time, commentsBean.getComment_time()+"");
//        holder.setText(R.id.tv_item_comment_time, TimeFormat.formatTime(commentsBean.getComment_time()));
        holder.setText(R.id.tv_item_comment_type, "好评");
    }

    @Override
    public int getItemCount() {
        int totalComment = commentsBeanList.size();
        return totalComment < 10 ? totalComment : 10;
    }
}
