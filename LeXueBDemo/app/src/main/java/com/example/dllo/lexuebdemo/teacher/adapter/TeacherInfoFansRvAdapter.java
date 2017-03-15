package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherInfoFansRvAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;

    private final int TOP_VIEW = 0, NORMAL_VIEW = 1, DIV_VIEW =2;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder holder = null;
        switch (viewType){
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
        switch (getItemViewType(position)){
            case NORMAL_VIEW:
                holder.setImg(R.id.iv_fan_head, "url");
                holder.setText(R.id.tv_fans_name, "xy山水20-303霞");
                holder.setText(R.id.tv_fans_province, "xy河北省");
                holder.setText(R.id.tv_fans_city, "xy承德市");
                holder.setText(R.id.tv_fans_school, "xy隆化县章吉营中学");
                holder.setText(R.id.tv_fans_score, "xy200");
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
        if(position == 0){
            return TOP_VIEW;
        }else if(position == 4){
            return DIV_VIEW;
        }else{
            return NORMAL_VIEW;
        }
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
