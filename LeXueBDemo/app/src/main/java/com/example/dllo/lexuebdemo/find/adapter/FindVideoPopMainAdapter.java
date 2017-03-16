package com.example.dllo.lexuebdemo.find.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/3/13.
 */

public class FindVideoPopMainAdapter extends BaseAdapter{

    private Context context;
    private List<String> data1,data2;
    private int subject,type;

    private String title1,title2;

    public List<String> getData1() {
        return data1;
    }

    public void setData1(List<String> data1) {
        this.data1 = data1;
    }

    public List<String> getData2() {
        return data2;
    }

    public void setData2(List<String> data2) {
        this.data2 = data2;
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public Context getContext() {
        return context;
    }



    public void setContext(Context context) {
        this.context = context;

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        MyViewHolder myViewHolder=null;
        view= LayoutInflater.from(context).inflate(R.layout.item_find_pop_lv,null);
        myViewHolder=new MyViewHolder(view);

        final FindVideoPopAdapter adapter=new FindVideoPopAdapter();
        final FindVideoPopAdapter adapter1=new FindVideoPopAdapter();
        adapter.setContext(context);
        adapter1.setContext(context);
        if (i==0){
            adapter.setData(data1);
            adapter.setOnclickpos(subject);
            myViewHolder.listView.setAdapter(adapter);

            final MyViewHolder finalMyViewHolder = myViewHolder;
            myViewHolder.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    adapter.setOnclickpos(i);
                    adapter.notifyDataSetChanged();
                    subject=i;

                }
            });
            myViewHolder.title.setText(title1);

        }
        else {
            adapter1.setData(data2);
            adapter1.setOnclickpos(type);
            myViewHolder.listView.setAdapter(adapter1);
            final MyViewHolder finalMyViewHolder1 = myViewHolder;
            myViewHolder.listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    adapter1.setOnclickpos(i);
                    adapter1.notifyDataSetChanged();
                    type=i;
                }
            });
            myViewHolder.title.setText(title2);
        }



        setListViewHeightBasedOnChildren(myViewHolder.listView);




        return view;
    }

    public class MyViewHolder {
        ListView listView;
        TextView title;
        public MyViewHolder(View view) {
            listView= (ListView) view.findViewById(R.id.lv_find_pop_head);
            title= (TextView) view.findViewById(R.id.tv_find_pop_head);
        }
    }

    public void setListViewHeightBasedOnChildren(ListView listView) {

        // 获取ListView对应的Adapter
        ListAdapter listAdapter = listView.getAdapter();

        if (listAdapter == null) {

            return;

        }

        int totalHeight = 0;

        for (int i = 0; i < listAdapter.getCount(); i++) { // listAdapter.getCount()返回数据项的数目

            View listItem = listAdapter.getView(i, null, listView);

            listItem.measure(0, 0); // 计算子项View 的宽高

            totalHeight += listItem.getMeasuredHeight(); // 统计所有子项的总高度

        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();

        params.height = totalHeight
                + (listView.getDividerHeight() * (listAdapter.getCount() - 1));

        // listView.getDividerHeight()获取子项间分隔符占用的高度

        // params.height最后得到整个ListView完整显示需要的高度

        listView.setLayoutParams(params);

    }
}
