package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherRvAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private Context context;
    private int dataSize = 10;
    private DetailInfo detailInfo;

    public void setDetailInfo(DetailInfo detailInfo) {
        this.detailInfo = detailInfo;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context, parent, R.layout.item_teacher_recyclerview);
    }

    @Override
    public void onBindViewHolder(final BaseViewHolder holder, int position) {
        //设置名师背景图片根据性别不同背景变化
        holder.setImg(R.id.item_teacher_rv_bg, R.mipmap.teacher_list_man_bg);
        //设置名师圆形头像
        String teacherHeadUrl = "https://esfile.lexue.com/file/T1hyxTB7CT1RCvBVdK.jpg";
        final ImageView teacherHeadImg = holder.getView(R.id.item_teacher_rv_headimg);
        Glide.with(context).load(teacherHeadUrl).asBitmap().centerCrop().into(new BitmapImageViewTarget(teacherHeadImg) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                ImageView imageView = null;
                teacherHeadImg.setImageDrawable(circularBitmapDrawable);
            }
        });
        //设置名师icon
        String teacherIconUrl = "https://esfile.lexue.com/file/T1yRJTBgxv1RCvBVdK.png";
        holder.setImg(R.id.item_teacher_rv_icon, teacherIconUrl);
        //设置名师name
        holder.setText(R.id.item_teacher_rv_name, "李政");
        //设置名师性别图标
        holder.setImg(R.id.item_teacher_rv_sex, R.mipmap.sex_man);
        //设置名师的信息info
        holder.setText(R.id.item_teacher_rv_video_count, "89");
        holder.setText(R.id.item_teacher_rv_video_play_times, "347万");
        holder.setText(R.id.item_teacher_rv_fans_count, "7.5万");
        holder.setText(R.id.item_teacher_rv_popularity, "2345万");

        //设置左边movie的背景
        String movieLeft = "https://esfile.lexue.com/file/T1zRhTBgWT1RCvBVdK.jpg";
        Glide.with(context).load(movieLeft).into((ImageView) holder.getView(R.id.item_teacher_rv_movie_left_bg));
        //设置左边movie的标题
        holder.setText(R.id.item_teacher_rv_movie_left_title, "百题狂练之化学与生活");
        //设置价格和播放次数
        boolean isFreeLeft = true;
        TextView priceFreeLeft = holder.getView(R.id.item_teacher_rv_movie_left_price_free);
        TextView priceLeft = holder.getView(R.id.item_teacher_rv_movie_left_price);
        if (isFreeLeft) {
            priceFreeLeft.setVisibility(View.VISIBLE);
            priceLeft.setVisibility(View.GONE);
        } else {
            priceFreeLeft.setVisibility(View.GONE);
            priceLeft.setVisibility(View.VISIBLE);
            priceLeft.setText("90");
        }
        TextView playCountLeft = holder.getView(R.id.item_teacher_rv_movie_left_count);
        playCountLeft.setText("2875");

        //设置右边movie的背景
        String movieRight = "https://esfile.lexue.com/file/T1TRxTBCZT1RCvBVdK.jpg";
        Glide.with(context).load(movieRight).into((ImageView) holder.getView(R.id.item_teacher_rv_movie_right_bg));
        //设置左边movie的标题
        holder.setText(R.id.item_teacher_rv_movie_right_title, "百题狂练之化学与生活");
        //设置价格和播放次数
        boolean isFreeRight = false;
        TextView priceFreeRight = holder.getView(R.id.item_teacher_rv_movie_right_price_free);
        TextView priceRight = holder.getView(R.id.item_teacher_rv_movie_right_price);
        if (isFreeRight) {
            priceFreeRight.setVisibility(View.VISIBLE);
            priceRight.setVisibility(View.GONE);
        } else {
            priceFreeRight.setVisibility(View.GONE);
            priceRight.setVisibility(View.VISIBLE);
            priceRight.setText("30");
        }
        TextView playCountRight = holder.getView(R.id.item_teacher_rv_movie_right_count);
        playCountRight.setText("2875");


        //设置点击事件
        //跳转名师详情界面
        holder.getView(R.id.item_teacher_rv_basic_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailInfo.showTeacherInfo(null);
            }
        });
        //跳转视频(左)详情界面
        holder.getView(R.id.item_teacher_rv_movie_left_bg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailInfo.showMovieInfo(null);
            }
        });
        //跳转视频(右)详情界面
        holder.getView(R.id.item_teacher_rv_movie_right_bg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailInfo.showMovieInfo(null);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataSize;
    }

    public interface DetailInfo{
        void showTeacherInfo(String url);
        void showMovieInfo(String url);
    }
}
