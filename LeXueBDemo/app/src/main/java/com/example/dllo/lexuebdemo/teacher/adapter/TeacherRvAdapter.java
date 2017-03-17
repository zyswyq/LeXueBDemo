package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.teacher.model.SubjectBean;
import com.example.dllo.lexuebdemo.teacher.model.TeacherTagBean;
import com.example.dllo.lexuebdemo.utils.NumberFormat;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class TeacherRvAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private static final String TAG = "TeacherRvAdapter";

    private Context context;
    private DetailInfo detailInfo;
    private SubjectBean subjectBean;
    private final int SEX_MAN = 0, SEX_WOMAN = 1;

    public void setSubjectBean(SubjectBean subjectBean) {
        this.subjectBean = subjectBean;
    }

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
    public void onBindViewHolder(final BaseViewHolder holder, final int position) {

        final SubjectBean.TeachersBean teachersBean = subjectBean.getTeachers().get(position);

        //设置名师背景图片根据性别不同背景变化
        if (teachersBean.getTeacher_sex() == SEX_MAN) {
            holder.setImg(R.id.item_teacher_rv_bg, R.mipmap.teacher_list_man_bg);
            //设置名师性别图标
            holder.setImg(R.id.item_teacher_rv_sex, R.mipmap.sex_man);
        } else {
            holder.setImg(R.id.item_teacher_rv_bg, R.mipmap.teacher_list_woman_bg);
            //设置名师性别图标
            holder.setImg(R.id.item_teacher_rv_sex, R.mipmap.sex_woman);
        }
        //设置名师圆形头像
        String teacherHeadUrl = teachersBean.getTeacher_icon().getUrl();
        final ImageView teacherHeadImg = holder.getView(R.id.item_teacher_rv_headimg);
        Glide.with(context).load(teacherHeadUrl).asBitmap().centerCrop().into(new BitmapImageViewTarget(teacherHeadImg) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                teacherHeadImg.setImageDrawable(circularBitmapDrawable);
            }
        });
        //设置名师icon
            //注意有一些是没有学科图标的
        if(teachersBean.getTeacher_subject_icon() != null){
            String teacherIconUrl = teachersBean.getTeacher_subject_icon().getUrl();
            holder.setImg(R.id.item_teacher_rv_icon, teacherIconUrl);
        }

        //设置名师name
        holder.setText(R.id.item_teacher_rv_name, teachersBean.getTeacher_name());

        //设置名师的信息info
        //视频数据需要再次拼接名师id才能拿到
        holder.setText(R.id.item_teacher_rv_video_count, teachersBean.getVideo_count() + "");
        String playTimes = NumberFormat.formatNum(teachersBean.getVideo_play_times());
        holder.setText(R.id.item_teacher_rv_video_play_times, playTimes);
        String fansCount = NumberFormat.formatNum(teachersBean.getFans_count());
        holder.setText(R.id.item_teacher_rv_fans_count, fansCount);
        String popilarity = NumberFormat.formatNum(teachersBean.getPopularity());
        holder.setText(R.id.item_teacher_rv_popularity, popilarity);


        final SubjectBean.TeachersBean.VideosBean videosBeanLeft = teachersBean.getVideos().get(0);
        //设置左边movie的背景
        String movieLeft = videosBeanLeft.getVideo_cover().getUrl();
        Glide.with(context).load(movieLeft).into((ImageView) holder.getView(R.id.item_teacher_rv_movie_left_bg));
        //设置左边movie的标题
        holder.setText(R.id.item_teacher_rv_movie_left_title, videosBeanLeft.getVideo_title());
        //设置价格和播放次数
        boolean isFreeLeft = true;

        if (videosBeanLeft.getVideo_price() != 0) {
            isFreeLeft = false;
        }
        TextView priceFreeLeft = holder.getView(R.id.item_teacher_rv_movie_left_price_free);
        TextView priceLeft = holder.getView(R.id.item_teacher_rv_movie_left_price);
        if (isFreeLeft) {
            priceFreeLeft.setVisibility(View.VISIBLE);
            priceLeft.setVisibility(View.GONE);
        } else {
            priceFreeLeft.setVisibility(View.GONE);
            priceLeft.setVisibility(View.VISIBLE);
            priceLeft.setText(videosBeanLeft.getVideo_price() + "");
        }
        //左边视频播放次数
        holder.setText(R.id.item_teacher_rv_movie_left_count, videosBeanLeft.getWatcher_count() + "");

        final SubjectBean.TeachersBean.VideosBean videosBeanRight = teachersBean.getVideos().get(1);
        //设置右边movie的背景

        String movieRight = videosBeanRight.getVideo_cover().getUrl();
        Glide.with(context).load(movieRight).into((ImageView) holder.getView(R.id.item_teacher_rv_movie_right_bg));
        //设置左边movie的标题
        holder.setText(R.id.item_teacher_rv_movie_right_title, "百题狂练之化学与生活");
        //设置价格和播放次数
        boolean isFreeRight = true;
        if (videosBeanLeft.getVideo_price() != 0) {
            isFreeRight = false;
        }
        TextView priceFreeRight = holder.getView(R.id.item_teacher_rv_movie_right_price_free);
        TextView priceRight = holder.getView(R.id.item_teacher_rv_movie_right_price);
        if (isFreeRight) {
            priceFreeRight.setVisibility(View.VISIBLE);
            priceRight.setVisibility(View.GONE);
        } else {
            priceFreeRight.setVisibility(View.GONE);
            priceRight.setVisibility(View.VISIBLE);
            priceRight.setText(videosBeanRight.getVideo_price() + "");
        }
        //右边视频播放次数
        holder.setText(R.id.item_teacher_rv_movie_right_count, videosBeanRight.getWatcher_count() + "");


        //设置点击事件
        //跳转名师详情界面
        holder.getView(R.id.item_teacher_rv_basic_info).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailInfo.showTeacherInfo(teachersBean.getTeacher_id());
            }
        });
        //跳转视频(左)详情界面
        holder.getView(R.id.item_teacher_rv_movie_left_bg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailInfo.showMovieInfo(videosBeanLeft.getVideo_id());
            }
        });
        //跳转视频(右)详情界面
        holder.getView(R.id.item_teacher_rv_movie_right_bg).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailInfo.showMovieInfo(videosBeanRight.getVideo_id());
            }
        });

        holder.getView(R.id.item_teacher_rv_movie_more).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailInfo.showMoreMovie(teachersBean.getTeacher_id(), teachersBean.getTeacher_name());
            }
        });

    }

    @Override
    public int getItemCount() {
        if(subjectBean == null){
            return 0;
        }
        int total = subjectBean.getTeacher_total();

        return total < 10 ? total : 10;
    }

    public interface DetailInfo {
        void showTeacherInfo(int teacherId);

        void showMovieInfo(int movieId);

        void showMoreMovie(int teacherId, String teacherName);
    }
}



