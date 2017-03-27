package com.example.dllo.lexuebdemo.find.adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.find.findview.activity.SpaceImageDetailActivity;
import com.example.dllo.lexuebdemo.find.model.FindCafeBean;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/3/11.
 */

public class FindCafeLVAdapter extends BaseAdapter {

    private List<FindCafeBean.PostsBean> data;
    private Context context;
    private ImageView imageView, imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8;
    private int[] location1;
    private List<Integer> img;
    private List<Integer> type;


    public List<FindCafeBean.PostsBean> getData() {
        return data;
    }

    public void setData(List<FindCafeBean.PostsBean> data) {
        this.data = data;
        notifyDataSetChanged();
        img=new ArrayList<>();
        type=new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            type.add(View.VISIBLE);
        }
        img.add(R.id.img_cafe_img1);
        img.add(R.id.img_cafe_img2);
        img.add(R.id.img_cafe_img3);
        img.add(R.id.img_cafe_img4);
        img.add(R.id.img_cafe_img5);
        img.add(R.id.img_cafe_img6);
        img.add(R.id.img_cafe_img7);
        img.add(R.id.img_cafe_img8);
        img.add(R.id.img_cafe_img9);
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return data != null ? data.size() : 0;
    }

    @Override
    public Object getItem(int i) {
        return data != null ? data.get(i) : null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(final int position, View view, ViewGroup viewGroup) {
        BaseViewHolder holder = BaseViewHolder.createListViewHolder(context, view, viewGroup, R.layout.item_find_cafe);
        switch (data.get(position).getAttribute()) {
            case 4:
                holder.setViewVisiable(R.id.tv_cafe_type, View.VISIBLE);
                holder.setViewVisiable(R.id.view_coffee_jiange, View.VISIBLE);
                holder.setText(R.id.tv_cafe_type, "置顶");
                holder.setTextleftImg(R.id.tv_cafe_type, R.mipmap.coffee_topposts_icon);
                holder.setTextColor(R.id.tv_cafe_name, Color.parseColor("#e17e00"));
                //置顶
                break;
            case 3:
                holder.setViewVisiable(R.id.tv_cafe_type, View.VISIBLE);
                holder.setViewVisiable(R.id.view_coffee_jiange, View.VISIBLE);
                holder.setText(R.id.tv_cafe_type, "今日话题");
                holder.setTextleftImg(R.id.tv_cafe_type, R.mipmap.coffee_topic_icon);
                holder.setTextColor(R.id.tv_cafe_name, Color.parseColor("#e17e00"));

                //今日话题
                break;
            case 2:
                holder.setViewVisiable(R.id.tv_cafe_type, View.VISIBLE);
                holder.setViewVisiable(R.id.view_coffee_jiange, View.VISIBLE);
                holder.setText(R.id.tv_cafe_type, "HOT热门");
                holder.setTextleftImg(R.id.tv_cafe_type, R.mipmap.coffee_hotposts_icon);
                holder.setTextColor(R.id.tv_cafe_name, Color.parseColor("#e17e00"));
                //热门话题
                break;
            default:
                holder.setViewVisiable(R.id.tv_cafe_type, View.GONE);
                holder.setViewVisiable(R.id.view_coffee_jiange, View.GONE);
                holder.setTextColor(R.id.tv_cafe_name, Color.parseColor("#000000"));
                //隐藏
                break;
        }

        switch (data.get(position).getImage_content().size()) {
            case 9:
                holder=setVisable(type,holder);
                holder.setImg(R.id.img_cafe_img1, data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2, data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3, data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4, data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5, data.get(position).getImage_content().get(4).getUrl());
                holder.setImg(R.id.img_cafe_img6, data.get(position).getImage_content().get(5).getUrl());
                holder.setImg(R.id.img_cafe_img7, data.get(position).getImage_content().get(6).getUrl());
                holder.setImg(R.id.img_cafe_img8, data.get(position).getImage_content().get(7).getUrl());
                holder.setImg(R.id.img_cafe_img9, data.get(position).getImage_content().get(8).getUrl());
                break;
            case 8:
                for (int i = 0; i < 9; i++) {
                    type.set(i,View.VISIBLE);
                }
                type.set(4,View.INVISIBLE);
                type.set(5,View.INVISIBLE);
                type.set(7,View.INVISIBLE);
                holder=setVisable(type,holder);
                holder.setImg(R.id.img_cafe_img1, data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2, data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3, data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4, data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5, data.get(position).getImage_content().get(4).getUrl());
                holder.setImg(R.id.img_cafe_img6, data.get(position).getImage_content().get(5).getUrl());
                holder.setImg(R.id.img_cafe_img7, data.get(position).getImage_content().get(6).getUrl());
                holder.setImg(R.id.img_cafe_img8, data.get(position).getImage_content().get(7).getUrl());
                break;
            case 7:
                for (int i = 0; i < 9; i++) {
                    type.set(i,View.VISIBLE);
                }
                type.set(8,View.INVISIBLE);
                type.set(9,View.INVISIBLE);
                holder=setVisable(type,holder);
                holder.setImg(R.id.img_cafe_img1, data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2, data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3, data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4, data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5, data.get(position).getImage_content().get(4).getUrl());
                holder.setImg(R.id.img_cafe_img6, data.get(position).getImage_content().get(5).getUrl());
                holder.setImg(R.id.img_cafe_img7, data.get(position).getImage_content().get(6).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img8, View.INVISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img9, View.INVISIBLE);
                break;
            case 6:
                holder.setViewVisiable(R.id.linear_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2, View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img3, View.GONE);
                holder.setImg(R.id.img_cafe_img1, data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2, data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3, data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4, data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5, data.get(position).getImage_content().get(4).getUrl());
                holder.setImg(R.id.img_cafe_img6, data.get(position).getImage_content().get(5).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6, View.VISIBLE);
                break;
            case 5:
                holder.setViewVisiable(R.id.linear_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2, View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img3, View.GONE);
                holder.setImg(R.id.img_cafe_img1, data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2, data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3, data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img4, data.get(position).getImage_content().get(3).getUrl());
                holder.setImg(R.id.img_cafe_img5, data.get(position).getImage_content().get(4).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6, View.INVISIBLE);

                break;
            case 4:
                holder.setViewVisiable(R.id.linear_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2, View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img3, View.GONE);
                holder.setImg(R.id.img_cafe_img1, data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2, data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img4, data.get(position).getImage_content().get(2).getUrl());
                holder.setImg(R.id.img_cafe_img5, data.get(position).getImage_content().get(3).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3, View.INVISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img6, View.INVISIBLE);

                break;
            case 3:
                holder.setViewVisiable(R.id.linear_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2, View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img3, View.GONE);
                holder.setImg(R.id.img_cafe_img1, data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2, data.get(position).getImage_content().get(1).getUrl());
                holder.setImg(R.id.img_cafe_img3, data.get(position).getImage_content().get(2).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3, View.VISIBLE);

                break;
            case 2:
                holder.setViewVisiable(R.id.linear_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2, View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img3, View.GONE);
                holder.setImg(R.id.img_cafe_img1, data.get(position).getImage_content().get(0).getUrl());
                holder.setImg(R.id.img_cafe_img2, data.get(position).getImage_content().get(1).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3, View.INVISIBLE);

                break;
            case 1:
                holder.setViewVisiable(R.id.linear_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.linear_cafe_img2, View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img3, View.GONE);
                holder.setImg(R.id.img_cafe_img1, data.get(position).getImage_content().get(0).getUrl());
                holder.setViewVisiable(R.id.img_cafe_img1, View.VISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img2, View.INVISIBLE);
                holder.setViewVisiable(R.id.img_cafe_img3, View.INVISIBLE);

                break;
            case 0:
                holder.setViewVisiable(R.id.linear_cafe_img1, View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img2, View.GONE);
                holder.setViewVisiable(R.id.linear_cafe_img3, View.GONE);
                break;
        }
        holder.setText(R.id.tv_cafe_content, data.get(position).getText_content());
        if (data.get(position).getCommented() != 0) {
            holder.setText(R.id.tv_cafe_agree, data.get(position).getCommented() + "");
        }
        if (data.get(position).getPraise_count() != 0) {
            holder.setText(R.id.tv_cafe_answer, data.get(position).getPraise_count() + "");
        }

        if (data.get(position).getSex() == 0) {
            holder.setTextImg(R.id.tv_cafe_name, R.mipmap.coffee_sex_boy);
        } else if (data.get(position).getSex() == 1) {
            holder.setTextImg(R.id.tv_cafe_name, R.mipmap.coffee_sex_girl);
        }
        if (data.get(position).getUser_icon() != null) {
            holder.setCircleImg(R.id.img_cafe_head, data.get(position).getUser_icon().getUrl());
        } else {
            holder.setCircleImg(R.id.img_cafe_head, R.mipmap.ic_launcher);
        }
        if (data.get(position).getUser_name().equals("")) {
            holder.setText(R.id.tv_cafe_name, "小明");
        } else {
            holder.setText(R.id.tv_cafe_name, data.get(position).getUser_name());
        }

        imageView = holder.getImg(R.id.img_cafe_img1);
        imageView1 = holder.getImg(R.id.img_cafe_img2);
        imageView2 = holder.getImg(R.id.img_cafe_img3);
        imageView3 = holder.getImg(R.id.img_cafe_img4);
        imageView4 = holder.getImg(R.id.img_cafe_img5);
        imageView5 = holder.getImg(R.id.img_cafe_img6);
        imageView6 = holder.getImg(R.id.img_cafe_img7);
        imageView7 = holder.getImg(R.id.img_cafe_img8);
        imageView8 = holder.getImg(R.id.img_cafe_img9);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SpaceImageDetailActivity.class);
                intent.putExtra("images", (data.get(position).getImage_content().get(0).getUrl()));
                intent.putExtra("position", 0);
                int[] location = new int[2];
                view.getLocationOnScreen(location);
                intent.putExtra("locationX", location[0]);
                intent.putExtra("locationY", location[1]);
                intent.putExtra("width", imageView.getWidth());
                intent.putExtra("height", imageView.getHeight());
                context.startActivity(intent);
            }
        });
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SpaceImageDetailActivity.class);
                intent.putExtra("images", (data.get(position).getImage_content().get(1).getUrl()));
                intent.putExtra("position", 0);
                int[] location = new int[2];
                view.getLocationOnScreen(location);
                intent.putExtra("locationX", location[0]);
                intent.putExtra("locationY", location[1]);
                intent.putExtra("width", imageView.getWidth());
                intent.putExtra("height", imageView.getHeight());
                context.startActivity(intent);
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SpaceImageDetailActivity.class);
                intent.putExtra("images", (data.get(position).getImage_content().get(2).getUrl()));
                intent.putExtra("position", 0);
                int[] location = new int[2];
                view.getLocationOnScreen(location);
                intent.putExtra("locationX", location[0]);
                intent.putExtra("locationY", location[1]);
                intent.putExtra("width", imageView.getWidth());
                intent.putExtra("height", imageView.getHeight());
                context.startActivity(intent);
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SpaceImageDetailActivity.class);
                intent.putExtra("images", (data.get(position).getImage_content().get(3).getUrl()));
                intent.putExtra("position", 0);
                int[] location = new int[2];
                view.getLocationOnScreen(location);
                intent.putExtra("locationX", location[0]);
                intent.putExtra("locationY", location[1]);
                intent.putExtra("width", imageView.getWidth());
                intent.putExtra("height", imageView.getHeight());
                context.startActivity(intent);
            }
        });
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SpaceImageDetailActivity.class);
                if (data.get(position).getImage_content().size()==4){
                    intent.putExtra("images", (data.get(position).getImage_content().get(3).getUrl()));
                }
                intent.putExtra("position", 0);
                int[] location = new int[2];
                view.getLocationOnScreen(location);
                intent.putExtra("locationX", location[0]);
                intent.putExtra("locationY", location[1]);
                intent.putExtra("width", imageView.getWidth());
                intent.putExtra("height", imageView.getHeight());
                context.startActivity(intent);
            }
        });
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SpaceImageDetailActivity.class);
                intent.putExtra("images", (data.get(position).getImage_content().get(5).getUrl()));
                intent.putExtra("position", 0);
                int[] location = new int[2];
                view.getLocationOnScreen(location);
                intent.putExtra("locationX", location[0]);
                intent.putExtra("locationY", location[1]);
                intent.putExtra("width", imageView.getWidth());
                intent.putExtra("height", imageView.getHeight());
                context.startActivity(intent);
            }
        });
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SpaceImageDetailActivity.class);
                intent.putExtra("images", (data.get(position).getImage_content().get(6).getUrl()));
                intent.putExtra("position", 0);
                int[] location = new int[2];
                view.getLocationOnScreen(location);
                intent.putExtra("locationX", location[0]);
                intent.putExtra("locationY", location[1]);
                intent.putExtra("width", imageView.getWidth());
                intent.putExtra("height", imageView.getHeight());
                context.startActivity(intent);
            }
        });
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SpaceImageDetailActivity.class);
                intent.putExtra("images", (data.get(position).getImage_content().get(7).getUrl()));
                intent.putExtra("position", 0);
                int[] location = new int[2];
                view.getLocationOnScreen(location);
                intent.putExtra("locationX", location[0]);
                intent.putExtra("locationY", location[1]);
                intent.putExtra("width", imageView.getWidth());
                intent.putExtra("height", imageView.getHeight());
                context.startActivity(intent);
            }
        });
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, SpaceImageDetailActivity.class);
                intent.putExtra("images", (data.get(position).getImage_content().get(8).getUrl()));
                intent.putExtra("position", 0);
                int[] location = new int[2];
                view.getLocationOnScreen(location);
                intent.putExtra("locationX", location[0]);
                intent.putExtra("locationY", location[1]);
                intent.putExtra("width", imageView.getWidth());
                intent.putExtra("height", imageView.getHeight());
                context.startActivity(intent);
            }
        });


        return holder.getMview();
    }


    private BaseViewHolder setVisable(List<Integer> data, BaseViewHolder holder){
        for (int i = 0; i < data.size(); i++) {
            holder.setViewVisiable(img.get(i),data.get(i));
        }
        return holder;
    }

}
