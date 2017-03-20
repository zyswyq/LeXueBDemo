package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.teacher.model.CourseAllBean;
import com.example.dllo.lexuebdemo.teacher.view.TeacherMovieDetailActivity;
import com.example.dllo.lexuebdemo.utils.NumberFormat;

import java.util.List;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class CourseAllRvAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;
    private List<CourseAllBean.VideosBean> videosBeanList;

    public void setVideosBeanList(List<CourseAllBean.VideosBean> videosBeanList) {
        this.videosBeanList = videosBeanList;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context, parent, R.layout.item_course_all_rv);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        final CourseAllBean.VideosBean videosBean = videosBeanList.get(position);
        //设置视频预览图、标题、老师名字
        ImageView headImg = holder.getView(R.id.iv_course_bg);
        Glide.with(context).load(videosBean.getVideo_cover().getUrl()).into(headImg);
        headImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, TeacherMovieDetailActivity.class);
                intent.putExtra("movieId", videosBean.getVideo_id());
                context.startActivity(intent);
            }
        });

        holder.setText(R.id.tv_course_title, videosBean.getVideo_title());
        holder.setText(R.id.tv_course_auther, videosBean.getTeacher_name());
        int liveState = videosBean.getLive_status();
        //根据直播状态设置视频信息 liveState=1为直播中
        if(liveState == 0){
            holder.setText(R.id.tv_course_time, NumberFormat.formatNum(videosBean.getWatcher_count())+"次播放");
        }else if(liveState == 1){
            holder.setText(R.id.tv_course_time, videosBean.getLive_date() + " " +
                    videosBean.getLive_start() + "-" + videosBean.getLive_end());
        }
        List<CourseAllBean.VideosBean.TagListBean> tagListBeanList = videosBean.getTagList();
        int tagCount = tagListBeanList.size();
        switch (tagCount){
            case 5:
                TextView tag5 = holder.getView(R.id.tv_course_maintag5);
                tag5.setText(tagListBeanList.get(4).getTag_name());
            case 4:
                TextView tag4 = holder.getView(R.id.tv_course_maintag4);
                tag4.setText(tagListBeanList.get(3).getTag_name());
            case 3:
                TextView tag3 = holder.getView(R.id.tv_course_maintag3);
                tag3.setText(tagListBeanList.get(2).getTag_name());
            case 2:
                TextView tag2 = holder.getView(R.id.tv_course_maintag2);
                tag2.setText(tagListBeanList.get(1).getTag_name());
            case 1:
                TextView tagMain = holder.getView(R.id.tv_course_maintag);
                tagMain.setText(tagListBeanList.get(0).getTag_name());
                break;

        }

        //设置视频的价格
        int price = videosBean.getReal_diamond_price();
        if(price > 0){
            holder.setText(R.id.tv_course_price, price+"");
            if(liveState == 1){
                holder.setText(R.id.tv_course_learninfo, "120人/300人");
            }else if(liveState == 0){
                holder.getView(R.id.tv_course_learninfo).setVisibility(View.GONE);
                holder.getView(R.id.tv_course_islearning).setVisibility(View.GONE);
            }
        }else{
            holder.getView(R.id.iv_course_icon).setVisibility(View.GONE);
            holder.setText(R.id.tv_course_price, "免费");
            holder.setText(R.id.tv_course_learninfo, "已购买");
            holder.getView(R.id.tv_course_islearning).setVisibility(View.GONE);
        }


    }

    @Override
    public int getItemCount() {
        int totalVideos = videosBeanList.size();
        return totalVideos < 10 ? totalVideos : 10;
    }
}
