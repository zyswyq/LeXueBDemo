package com.example.dllo.lexuebdemo.home.adapter.homeviewpage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.home.RecycleViewItemClick;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeBean;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 * <p>
 * <p>
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeViewFreeAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;
    private List<HomeBean.VideosBean> datas;
    private int modePosition;
    private RecycleViewItemClick mRecycleViewItemClick;

    public void setRecycleViewItemClick(RecycleViewItemClick recycleViewItemClick) {
        mRecycleViewItemClick = recycleViewItemClick;
    }

    public HomeViewFreeAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<HomeBean.VideosBean> datas,int modePosition) {
        this.datas = datas;
        this.modePosition = modePosition;
        notifyDataSetChanged();
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context, parent, R.layout.item_home_free);
    }

    @Override
    public void onBindViewHolder(final BaseViewHolder holder, final int position) {
        holder.setText(R.id.item_home_free_content, datas.get(modePosition).getContent_list().get(position).getVideo_title());
        holder.setText(R.id.item_home_free_author, datas.get(modePosition).getContent_list().get(position).getTeacher_name());
        holder.setText(R.id.item_home_free_subject, datas.get(modePosition).getContent_list().get(position).getVideo_subject_name());
        holder.setImg(R.id.item_home_free_imageview, datas.get(modePosition).getContent_list().get(position).getVideo_cover().getUrl());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mRecycleViewItemClick.onClick(position);
            }
        });
       holder.itemView.setTag(datas);
    }

    @Override
    public int getItemCount() {
        return datas != null ? datas.get(modePosition).getContent_list().size() : 0;
    }
}
