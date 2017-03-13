package com.example.dllo.lexuebdemo.find.adapter;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.find.model.FindCafeBean;

import java.util.List;

/**
 * Created by dllo on 17/3/11.
 */

public class FindCafeLVAdapter extends BaseAdapter{

    private List<FindCafeBean.PostsBean> data;
    private Context context;


    public List<FindCafeBean.PostsBean> getData() {
        return data;
    }

    public void setData(List<FindCafeBean.PostsBean> data) {
        this.data = data;
        notifyDataSetChanged();

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
    public View getView(int position, View view, ViewGroup viewGroup) {
        BaseViewHolder holder=BaseViewHolder.createListViewHolder(context,view,viewGroup,R.layout.item_find_cafe);
        switch (data.get(position).getAttribute()){
            case 4:
                holder.setViewVisiable(R.id.tv_cafe_type,View.VISIBLE);
                holder.setViewVisiable(R.id.view_coffee_jiange,View.VISIBLE);
                holder.setText(R.id.tv_cafe_type,"置顶");
                holder.setTextleftImg(R.id.tv_cafe_type,R.mipmap.coffee_topposts_icon);
                holder.setTextColor(R.id.tv_cafe_name,Color.parseColor("#e17e00"));
                //置顶
                break;
            case 3:
                holder.setViewVisiable(R.id.tv_cafe_type,View.VISIBLE);
                holder.setViewVisiable(R.id.view_coffee_jiange,View.VISIBLE);
                holder.setText(R.id.tv_cafe_type,"今日话题");
                holder.setTextleftImg(R.id.tv_cafe_type,R.mipmap.coffee_topic_icon);
                holder.setTextColor(R.id.tv_cafe_name,Color.parseColor("#e17e00"));

                //今日话题
                break;
            case 2:
                holder.setViewVisiable(R.id.tv_cafe_type,View.VISIBLE);
                holder.setViewVisiable(R.id.view_coffee_jiange,View.VISIBLE);
                holder.setText(R.id.tv_cafe_type,"HOT热门");
                holder.setTextleftImg(R.id.tv_cafe_type,R.mipmap.coffee_hotposts_icon);
                holder.setTextColor(R.id.tv_cafe_name,Color.parseColor("#e17e00"));
                //热门话题
                break;
            default:
                holder.setViewVisiable(R.id.tv_cafe_type,View.GONE);
                holder.setViewVisiable(R.id.view_coffee_jiange,View.GONE);
                holder.setTextColor(R.id.tv_cafe_name, Color.parseColor("#000000"));
                //隐藏
                break;
        }

        switch (data.get(position).getImage_content().size()){
            case 9:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img8,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img9,View.VISIBLE);
                holder.setImg(R.id.img_cafe_img1,data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2,data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3,data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4,data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5,data.get(position).getImage_content().get(4).getUrl());
                holder.setImg(R.id.img_cafe_img6,data.get(position).getImage_content().get(5).getUrl());
                holder.setImg(R.id.img_cafe_img7,data.get(position).getImage_content().get(6).getUrl());
                holder.setImg(R.id.img_cafe_img8,data.get(position).getImage_content().get(7).getUrl());
                holder.setImg(R.id.img_cafe_img9,data.get(position).getImage_content().get(8).getUrl());
                break;
            case 8:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.VISIBLE);
                holder.setImg(R.id.img_cafe_img1,data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2,data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3,data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4,data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5,data.get(position).getImage_content().get(4).getUrl());
                holder.setImg(R.id.img_cafe_img6,data.get(position).getImage_content().get(5).getUrl());
                holder.setImg(R.id.img_cafe_img7,data.get(position).getImage_content().get(6).getUrl());
                holder.setImg(R.id.img_cafe_img8,data.get(position).getImage_content().get(7).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img8,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img9,View.INVISIBLE);
                break;
            case 7:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.VISIBLE);
                holder.setImg(R.id.img_cafe_img1,data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2,data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3,data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4,data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5,data.get(position).getImage_content().get(4).getUrl());
                holder.setImg(R.id.img_cafe_img6,data.get(position).getImage_content().get(5).getUrl());
                holder.setImg(R.id.img_cafe_img7,data.get(position).getImage_content().get(6).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img8,View.INVISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img9,View.INVISIBLE);
                break;
            case 6:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.GONE);
                holder.setImg(R.id.img_cafe_img1,data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2,data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3,data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4,data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5,data.get(position).getImage_content().get(4).getUrl());
                holder.setImg(R.id.img_cafe_img6,data.get(position).getImage_content().get(5).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6,View.VISIBLE);
                break;
            case 5:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.GONE);
                holder.setImg(R.id.img_cafe_img1,data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2,data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3,data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4,data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5,data.get(position).getImage_content().get(4).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6,View.INVISIBLE);

                break;
            case 4:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.GONE);
                holder.setImg(R.id.img_cafe_img1,data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2,data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img4,data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img5,data.get(position).getImage_content().get(3).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3,View.INVISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6,View.INVISIBLE);

                break;
            case 3:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.GONE);
                holder.setImg(R.id.img_cafe_img1,data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2,data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3,data.get(position).getImage_content().get(2).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3,View.VISIBLE);

                break;
            case 2:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.GONE);
                holder.setImg(R.id.img_cafe_img1,data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2,data.get(position).getImage_content().get(1).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3,View.INVISIBLE);

                break;
            case 1:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.GONE);
                holder.setImg(R.id.img_cafe_img1,data.get(position).getImage_content().get(0).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1,View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2,View.INVISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3,View.INVISIBLE);

                break;
            case 0:
                holder.setViewVisiable(R.id.linear_cafe_img1,View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img2,View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img3,View.GONE);
                break;
        }
        holder.setText(R.id.tv_cafe_content,data.get(position).getText_content());
        if (data.get(position).getCommented()!=0){
            holder.setText(R.id.tv_cafe_agree,data.get(position).getCommented()+"");
        }
        if (data.get(position).getPraise_count()!=0){
            holder.setText(R.id.tv_cafe_answer,data.get(position).getPraise_count()+"");
        }

        if (data.get(position).getSex()==0){
            holder.setTextImg(R.id.tv_cafe_name,R.mipmap.coffee_sex_boy);
        }else if (data.get(position).getSex()==1){
            holder.setTextImg(R.id.tv_cafe_name,R.mipmap.coffee_sex_girl);
        }


        if (data.get(position).getUser_icon()!=null){
            holder.setCircleImg(R.id.img_cafe_head,data.get(position).getUser_icon().getUrl());
        }else {
            holder.setCircleImg(R.id.img_cafe_head,R.mipmap.ic_launcher);
        }
        if (data.get(position).getUser_name().equals("")){
            holder.setText(R.id.tv_cafe_name,"小明");
        }else {
            holder.setText(R.id.tv_cafe_name,data.get(position).getUser_name());
        }


        return holder.getMview();
    }




}
