package com.example.dllo.lexuebdemo.teacher.view;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.teacher.adapter.MoreLvAdapter;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class MoreActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    private ListView listView;
    private MoreLvAdapter adapter;
    private String[] titles;

    @Override
    protected int getLayout() {
        return R.layout.activity_more;
    }

    @Override
    protected void initView() {
        listView = bindView(R.id.lv_more);
    }

    @Override
    protected void initData() {
        titles = new String[]{"获取图片", "听音乐", "看视频"};
        adapter = new MoreLvAdapter();
        adapter.setTitles(titles);
        adapter.setContext(this);
        listView.setAdapter(adapter);
    }

    @Override
    protected void initListener() {
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0:
                startActivity(new Intent(MoreActivity.this, MoreCameraAlbumActivity.class));
                break;
            case 1:
                startActivity(new Intent(MoreActivity.this, MoreMusicPlayerActivity.class));
                break;
            case 2:
                startActivity(new Intent(MoreActivity.this, MoreMoviePlayerActivity.class));
            default:
                break;
        }
    }
}
