package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.teacher.model.TeacherInfoBean;
import com.example.dllo.lexuebdemo.utils.NumberFormat;

import java.util.List;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherInfoGiftRvAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private Context context;
    private List<TeacherInfoBean.GiftsBean> giftsBeanList;

    public void setGiftsBeanList(List<TeacherInfoBean.GiftsBean> giftsBeanList) {
        this.giftsBeanList = giftsBeanList;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context, parent, R.layout.item_teacher_detail_info_dataframe_rv_giftinfo);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        TeacherInfoBean.GiftsBean giftsBean = giftsBeanList.get(position);
        Glide.with(context).load(giftsBean.getGift_icon().getUrl())
                .into((ImageView) (holder.getView(R.id.item_iv_gift_img)));
        holder.setText(R.id.item_iv_gift_tag, giftsBean.getGift_name());
        holder.setText(R.id.item_iv_gift_amount, NumberFormat.formatNum(giftsBean.getGift_count()));
    }

    @Override
    public int getItemCount() {
        return giftsBeanList.size();
    }
}
