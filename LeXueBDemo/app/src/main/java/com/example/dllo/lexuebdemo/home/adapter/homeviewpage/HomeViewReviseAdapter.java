package com.example.dllo.lexuebdemo.home.adapter.homeviewpage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseViewHolder;
import com.example.dllo.lexuebdemo.home.sujectbean.HomeBean;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeViewReviseAdapter extends RecyclerView.Adapter<BaseViewHolder>{
    private Context context;
    private List<HomeBean.VideosBean> datas;
   private int modePosition;

    public HomeViewReviseAdapter(Context context) {
        this.context = context;
    }

    public void setDatas(List<HomeBean.VideosBean> datas,int modePosition) {
        this.datas = datas;
        this.modePosition = modePosition;
        notifyDataSetChanged();
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return BaseViewHolder.createRvViewHolder(context,parent, R.layout.item_home_revise);
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
     holder.setImg(R.id.item_home_revise_iv,datas.get(modePosition).getContent_list().get(position).getVideo_cover().getUrl());
    }

    @Override
    public int getItemCount() {
        return datas != null ? datas.get(modePosition).getContent_list().size() : 0;
    }
}
