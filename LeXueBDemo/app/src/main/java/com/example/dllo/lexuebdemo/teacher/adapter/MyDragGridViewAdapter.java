package com.example.dllo.lexuebdemo.teacher.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.teacher.customview.DragGridAdapter;
import com.example.dllo.lexuebdemo.teacher.customview.DragGridView;

import java.util.List;

/*
    by Mr.L
    data 2017-03-09
    desc 描述
*/
public class MyDragGridViewAdapter extends DragGridAdapter<String> {
    private Context context;
    private int selectedItem = -1;


    public MyDragGridViewAdapter(List<String> tagList) {
        super(tagList);
    }

    public void setSelectedItem(int selectedItem) {
        this.selectedItem = selectedItem;
        notifyDataSetChanged();
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    protected View getItemView(int position, View convertView, ViewGroup parent) {
        String text = getList().get(position);
        convertView = LayoutInflater.from(context).inflate(R.layout.item_pop_window_teacher_taglist, null);
        TextView tv_text = (TextView) convertView.findViewById(R.id.item_pop_window_tv);

        if (position == selectedItem) {
            tv_text.setSelected(true);
        }

        tv_text.setText(text);
        return convertView;
    }
}
