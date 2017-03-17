package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.teacher.model.TeacherInfoBean;

import java.util.List;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherInfoFansRvAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;
    private final int TOP_VIEW = 0, NORMAL_VIEW = 1, DIV_VIEW = 2;
    private List<TeacherInfoBean.FansBean> fansBeanList;

    public void setFansBeanList(List<TeacherInfoBean.FansBean> fansBeanList) {
        this.fansBeanList = fansBeanList;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder holder = null;
        switch (viewType) {
            case TOP_VIEW:
                holder = BaseViewHolder.createRvViewHolder(context, parent,
                        R.layout.item_teacher_detail_info_fansframe_rv_fan_top);
                break;
            case NORMAL_VIEW:
                holder = BaseViewHolder.createRvViewHolder(context, parent,
                        R.layout.item_teacher_detail_info_fansframe_rv_fan);
                break;
            case DIV_VIEW:
                holder = BaseViewHolder.createRvViewHolder(context, parent,
                        R.layout.rv_div);
                break;
        }
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        TeacherInfoBean.FansBean fansBean = fansBeanList.get(position);
        switch (getItemViewType(position)) {
            case NORMAL_VIEW:
                final ImageView head = holder.getView(R.id.iv_fan_head);
                Glide.with(context).load(fansBean.getUser_icon().getUrl()).asBitmap().centerCrop().into(new BitmapImageViewTarget(head) {
                    @Override
                    protected void setResource(Bitmap resource) {
                        RoundedBitmapDrawable circularBitmapDrawable =
                                RoundedBitmapDrawableFactory.create(context.getResources(), resource);
                        circularBitmapDrawable.setCircular(true);
                        head.setImageDrawable(circularBitmapDrawable);
                    }
                });
                holder.setText(R.id.tv_fans_name, fansBean.getUser_name());
                holder.setText(R.id.tv_fans_province, fansBean.getProvince());
                holder.setText(R.id.tv_fans_city, fansBean.getCity());
                holder.setText(R.id.tv_fans_school, fansBean.getSchool());
                holder.setText(R.id.tv_fans_score, fansBean.getContribute()+"");
                if (position == 1) {
                    holder.setImg(R.id.iv_fan_top, R.mipmap.fans_contribution_list1);
                } else if (position == 2) {
                    holder.setImg(R.id.iv_fan_top, R.mipmap.fans_contribution_list2);
                } else if (position == 3) {
                    holder.setImg(R.id.iv_fan_top, R.mipmap.fans_contribution_list3);
                } else {
                    holder.getView(R.id.iv_fan_top).setVisibility(View.GONE);
                }
                break;
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TOP_VIEW;
        } else if (position == 4) {
            return DIV_VIEW;
        } else {
            return NORMAL_VIEW;
        }
    }

    @Override
    public int getItemCount() {
        int totalFans = fansBeanList.size();
        return totalFans < 10 ? totalFans+2 : 12;
    }
}
