package com.example.dllo.lexuebdemo.home.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.home.RecycleViewItemClick;
import com.example.dllo.lexuebdemo.home.sujectbean.Physics;
import com.example.dllo.lexuebdemo.teacher.view.TeacherDetailInfoActivity;
import com.example.dllo.lexuebdemo.teacher.view.TeacherMovieDetailActivity;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeSubjectRecycleAdapter extends RecyclerView.Adapter<BaseViewHolder>{
    private RecycleViewItemClick mRecycleViewItemClick;



    private Context context;
    private List<Physics.VideosBean> datas;
//    private List<Physics.VideosBean.VideoCoverBean> mVideoCoverBeen;

    public void setRecycleViewItemClick(RecycleViewItemClick recycleViewItemClick) {
        mRecycleViewItemClick = recycleViewItemClick;
    }
    public HomeSubjectRecycleAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<Physics.VideosBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context,parent, R.layout.item_home_subject);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, final int position) {

//        holder.setText(R.id.item_home_subject_iv,datas.get(position).getTagList().get());
      holder.setText(R.id.item_home_subject_school,datas.get(position).getVideo_title());
        holder.setText(R.id.item_home_subject_teacher,datas.get(position).getTeacher_name());
        holder.setText(R.id.item_home_subject_person,datas.get(position).getWatcher_count() + "");
       holder.setImg(R.id.item_home_subject_iv,datas.get(position).getVideo_cover().getUrl());

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
