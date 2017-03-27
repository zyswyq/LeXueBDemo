package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class MoreLvAdapter extends BaseAdapter {
    private Context context;
    private String[] titles;

    public void setTitles(String[] titles) {
        this.titles = titles;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_lv_more,
                    parent, false);
        }
        TextView text = (TextView) convertView.findViewById(R.id.item_lv_more_text);
        text.setText(titles[position]);
        return convertView;
    }

}
