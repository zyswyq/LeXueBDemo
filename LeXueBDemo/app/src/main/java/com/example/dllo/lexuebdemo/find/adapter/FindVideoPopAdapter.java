package com.example.dllo.lexuebdemo.find.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;

import java.util.List;

/**
 * Created by dllo on 17/3/13.
 */

public class FindVideoPopAdapter extends BaseAdapter{
    private List<String> data;
    private int onclickpos;
    private Context context;

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public int getOnclickpos() {
        return onclickpos;
    }

    public void setOnclickpos(int onclickpos) {
        this.onclickpos = onclickpos;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        BaseViewHolder baseViewHolder=BaseViewHolder.createListViewHolder(context,view,viewGroup, R.layout.item_find_pop_item);
        if (i==onclickpos){
            baseViewHolder.setTextColor(R.id.tv_find_pop_item, Color.BLUE);
        }else {
            baseViewHolder.setTextColor(R.id.tv_find_pop_item, Color.BLACK);

        }
        baseViewHolder.setText(R.id.tv_find_pop_item,data.get(i));
        return baseViewHolder.getMview();
    }
}
