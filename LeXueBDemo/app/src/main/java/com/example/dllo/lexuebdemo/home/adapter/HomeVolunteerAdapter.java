package com.example.dllo.lexuebdemo.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.home.RecycleViewItemClick;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeVolunteerBean;
import com.example.dllo.lexuebdemo.teacher.view.TeacherMovieDetailActivity;

import java.sql.Date;
import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 * <p>
 * <p>
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeVolunteerAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;
    private List<HomeVolunteerBean.VideosBean> datas ;
    private List<HomeVolunteerBean.VideosBean.TagListBean> mTagListBeen;
    private RecycleViewItemClick mRecycleViewItemClick;

    public void setRecycleViewItemClick(RecycleViewItemClick recycleViewItemClick) {
        mRecycleViewItemClick = recycleViewItemClick;
    }

    public HomeVolunteerAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<HomeVolunteerBean.VideosBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context, parent, R.layout.item_home_volunteer);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, final int position) {
        holder.setImg(R.id.item_home_volunteer_iv,datas.get(position).getVideo_cover().getUrl());
//        holder.setText(R.id.item_home_volunteer_tv,datas.get(position).getTagList().get(position + 1).getTag_name());
        holder.setText(R.id.item_home_volunteer_tv, datas.get(position).getVideo_subject_name());
        holder.setText(R.id.item_home_volunteer_school, datas.get(position).getVideo_title());
        holder.setText(R.id.item_home_volunteer_teacher, datas.get(position).getTeacher_name());
        holder.setText(R.id.item_home_volunteer_person, datas.get(position).getWatcher_count() + "");

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRecycleViewItemClick.onClick(position);
            }
        });
        holder.itemView.setTag(datas);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TeacherMovieDetailActivity.actionStart(context,datas.get(position).getVideo_id());
            }
        });
    }

    @Override
    public int getItemCount() {
        return datas != null ? datas.size() : 0;
    }
}
