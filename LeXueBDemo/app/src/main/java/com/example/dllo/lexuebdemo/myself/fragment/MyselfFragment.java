package com.example.dllo.lexuebdemo.myself.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.RelativeLayout;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseFragment;
import com.example.dllo.lexuebdemo.myself.activity.IdeaActivitty;

/*
         |              |
         | \            | \
         |   | | | | | |    | | | | |||||\
         |                          |||||||\
         |         ( )              ||||||||
         |                           |||||/
         |                  | | | | | |||/
         |    |             |          |
         |    |             |          |
       / |   | |            |          |\
      |      |/             |          \|
       \ |                  |
         |                  |
           \ | | | | | | | /
             |       |            <-----弱鸡
             |       |
             |       |
*/
public class MyselfFragment extends BaseFragment implements View.OnClickListener {
    private RelativeLayout ideaLayout,setLayout;
    private Intent intent;

    @Override
    protected int getLayout() {
        return R.layout.fragment_myself;
    }

    @Override
    protected void initView() {
        ideaLayout = bindView(R.id.ll_fg_myself_idea);
        setLayout = bindView(R.id.rl_idea_set);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        ideaLayout.setOnClickListener(this);
        setLayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll_fg_myself_idea:
                intent = new Intent(getActivity(),IdeaActivitty.class);
                startActivity(intent);
                break;
            case R.id.rl_idea_set:
                break;
        }
    }
}
