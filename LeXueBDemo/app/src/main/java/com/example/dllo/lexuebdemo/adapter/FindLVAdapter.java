package com.example.dllo.lexuebdemo.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;

import java.util.List;

/**
 * Created by dllo on 17/3/9.
 */

public class FindLVAdapter extends BaseAdapter{
    private Context context;
    private List<String> title;
    private List<String> content;
    private int[] a=new int[]{R.mipmap.home_videolive_btn_normal,R.mipmap.home_cafe_btn_pressed,R.mipmap.home_shop_btn_normal};

    public List<String> getTitle() {
        return title;
    }

    public void setTitle(List<String> title) {
        this.title = title;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    public Context getContext() {
        return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return title!=null?title.size():0;
    }

    @Override
    public Object getItem(int i) {
        return title!=null?title.get(i):null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        BaseViewHolder baseViewHolder=BaseViewHolder.createListViewHolder(context,view,viewGroup, R.layout.item_listview_find);
        baseViewHolder.setText(R.id.tv_find_lvitem_title,title.get(i));
        baseViewHolder.setText(R.id.tv_find_lvitem_content,content.get(i));
        baseViewHolder.setImg(R.id.image_find_lvitem,a[i]);
        return baseViewHolder.getMview();
    }
}
