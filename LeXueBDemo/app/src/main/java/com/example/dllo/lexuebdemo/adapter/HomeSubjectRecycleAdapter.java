package com.example.dllo.lexuebdemo.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.home.sujectbean.Physics;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeSubjectRecycleAdapter extends RecyclerView.Adapter<BaseViewHolder>{
    private Context context;
    private List<Physics.VideosBean> datas;

    public void setDatas(List<Physics.VideosBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context,parent, R.layout.item_home_subject);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {

      holder.setText(R.id.item_home_subject_school,datas.get(position).getVideo_title());
        holder.setText(R.id.item_home_subject_teacher,datas.get(position).getTeacher_name());
        holder.setText(R.id.item_home_subject_person,datas.get(position).getWatcher_count() + "");
    }

    @Override
    public int getItemCount() {
        return datas != null ? datas.size() : 0;
    }
}
