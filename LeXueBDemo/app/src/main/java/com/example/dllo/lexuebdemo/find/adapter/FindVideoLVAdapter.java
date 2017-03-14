package com.example.dllo.lexuebdemo.find.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.find.model.FindVideoBean;

import java.util.List;

/**
 * Created by dllo on 17/3/10.
 */

public class FindVideoLVAdapter extends BaseAdapter{

    private List<FindVideoBean.LivesBean> data;
    private Context context;

    public List<FindVideoBean.LivesBean> getData() {
        return data;
    }

    public void setData(List<FindVideoBean.LivesBean> data) {
        this.data = data;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return data!=null?data.size():0;
    }

    @Override
    public Object getItem(int i) {
        return data!=null?data.get(i):null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        BaseViewHolder baseViewHolder=BaseViewHolder.createListViewHolder(context,view,viewGroup, R.layout.item_find_video);
        baseViewHolder.setText(R.id.tv_video_item_title,data.get(i).getLive_name());
        baseViewHolder.setImg(R.id.img_video_item,data.get(i).getLive_cover().getUrl());
        baseViewHolder.setText(R.id.tv_video_item_time,data.get(i).getLive_date()+" "+data.get(i).getLive_start()+"-"+data.get(i).getLive_end());
        baseViewHolder.setText(R.id.tv_video_item_price,"¥"+data.get(i).getReal_price());
        baseViewHolder.setText(R.id.tv_video_item_tag,data.get(i).getLive_tags().get(0).getTag_name());

        switch (data.get(i).getTagList().size()) {
            case 4:
                baseViewHolder.setViewVisiable(R.id.tv_video_item_tag1,View.VISIBLE);
                baseViewHolder.setViewVisiable(R.id.tv_video_item_tag2,View.VISIBLE);
                baseViewHolder.setViewVisiable(R.id.tv_video_item_tag3,View.VISIBLE);
                baseViewHolder.setViewVisiable(R.id.tv_video_item_tag4,View.VISIBLE);
                baseViewHolder.setText(R.id.tv_video_item_tag1,data.get(i).getTagList().get(0).getTag_name());
                baseViewHolder.setText(R.id.tv_video_item_tag2,data.get(i).getTagList().get(1).getTag_name());
                baseViewHolder.setText(R.id.tv_video_item_tag3,data.get(i).getTagList().get(2).getTag_name());
                baseViewHolder.setText(R.id.tv_video_item_tag4,data.get(i).getTagList().get(3).getTag_name());
                break;
            case 3:
                baseViewHolder.setViewVisiable(R.id.tv_video_item_tag1,View.VISIBLE);
                baseViewHolder.setViewVisiable(R.id.tv_video_item_tag2,View.VISIBLE);
                baseViewHolder.setViewVisiable(R.id.tv_video_item_tag3,View.VISIBLE);
                baseViewHolder.setViewVisiable(R.id.tv_video_item_tag4,View.INVISIBLE);
                baseViewHolder.setText(R.id.tv_video_item_tag1,data.get(i).getTagList().get(0).getTag_name());
                baseViewHolder.setText(R.id.tv_video_item_tag2,data.get(i).getTagList().get(1).getTag_name());
                baseViewHolder.setText(R.id.tv_video_item_tag3,data.get(i).getTagList().get(2).getTag_name());
                break;
            default:
                break;
        }
        return baseViewHolder.getMview();
    }
}
