package com.example.dllo.lexuebdemo.find.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.find.model.FindRobotBean;

import java.util.List;

/**
 * Created by dllo on 17/3/15.
 */

public class FindRobotLvAdapter extends BaseAdapter{
    private static final String TAG = "FindRobotLvAdapter";

    private List<FindRobotBean> data;
    private Context context;

    public List<FindRobotBean> getData() {
        return data;
    }

    public void setData(List<FindRobotBean> data) {
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
    public int getViewTypeCount() {
        return 3;
    }

    @Override
    public int getItemViewType(int position) {
        int type = data.get(position).getType();
        Log.e(TAG, "getItemViewType: " + type);
        return type;
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
        if (getItemViewType(i)==1){
            BaseViewHolder baseViewHolder= BaseViewHolder.createListViewHolder(context,view,viewGroup, R.layout.item_robot_me);
            baseViewHolder.setText(R.id.tv_robot_me,data.get(i).getText());
            return baseViewHolder.getMview();
        }else {
            BaseViewHolder baseViewHolder=BaseViewHolder.createListViewHolder(context,view,viewGroup, R.layout.item_robot_robot);
            baseViewHolder.setText(R.id.tv_robot_robot,data.get(i).getText());
            return baseViewHolder.getMview();
        }


    }
}
