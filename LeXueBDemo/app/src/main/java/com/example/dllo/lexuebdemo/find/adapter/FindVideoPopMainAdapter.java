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
        data1=new ArrayList<>();
        data2=new ArrayList<>();
        data1.add("全部");
        data1.add("数学");
        data1.add("化学");
        data1.add("物理");
        data1.add("生物");
        data1.add("语文");
        data1.add("英语");
        data1.add("志愿");
        data1.add("推荐");
        data1.add("历史");
        data1.add("政治");
        data1.add("地理");
        data1.add("自招数学");
        data1.add("政策面试");
        data1.add("自招物理");
        data2.add("全部");
        data2.add("报名中");
        data2.add("直播中");
        data2.add("已结束");
        data2.add("直播录像");
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
//                presenter.getData(adapter.getOnclickpos(),adapter1.getOnclickpos());
                    adapter.notifyDataSetChanged();
                    subject=i;
                    Log.d("hahahah", adapter.getOnclickpos() + "  " + adapter1.getOnclickpos());
                    Log.d("aaaaaa", subject + " " + type);

                }
            });
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
//                presenter.getData(adapter.getOnclickpos(),adapter1.getOnclickpos());
                    adapter1.notifyDataSetChanged();
                    type=i;
                    Log.d("hahahah", adapter.getOnclickpos() + "  " + adapter1.getOnclickpos());
                    Log.d("aaaaaa", subject + " " + type);
                }
            });
        }



        setListViewHeightBasedOnChildren(myViewHolder.listView);




        return view;
    }

    public class MyViewHolder {
        ListView listView;
        public MyViewHolder(View view) {
            listView= (ListView) view.findViewById(R.id.lv_find_pop_head);
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
