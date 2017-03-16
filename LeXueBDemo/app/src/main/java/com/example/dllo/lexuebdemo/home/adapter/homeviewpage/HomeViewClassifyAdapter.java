package com.example.dllo.lexuebdemo.home.adapter.homeviewpage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeClassifyBean;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeViewClassifyAdapter extends RecyclerView.Adapter<BaseViewHolder>{

    private List<HomeClassifyBean.EntriesBean>  datas;
//    private List<HomeClassifyBean.EntriesBean.EntryIconBean> mEntryIconBeen;


    private Context context;

    public HomeViewClassifyAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<HomeClassifyBean.EntriesBean> datas) {
        this.datas = datas;
        notifyDataSetChanged();
    }

//    public void setEntryIconBeen(List<HomeClassifyBean.EntriesBean.EntryIconBean> entryIconBeen) {
//        mEntryIconBeen = entryIconBeen;
//    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context,parent, R.layout.item_home_classify);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
    holder.setText(R.id.item_home_classify_tv,datas.get(position).getEntry_name());
    holder.setImg(R.id.item_home_classify_iv,datas.get(position).getEntry_icon().getUrl());
    }

    @Override
    public int getItemCount() {
        return datas != null ? datas.size() : 0;
    }
}
