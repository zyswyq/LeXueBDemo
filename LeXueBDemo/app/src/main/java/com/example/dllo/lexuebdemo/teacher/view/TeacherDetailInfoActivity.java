package com.example.dllo.lexuebdemo.teacher.view;

import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherInfoFansRvAdapter;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherInfoGiftRvAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherDetailInfoActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "TeacherDetailInfoActivi";
    @BindView(R.id.tv_teacher_detail_infotag_data)
    TextView infotagData;
    @BindView(R.id.tv_teacher_detail_infotag_data_div)
    ImageView infotagDataDiv;
    @BindView(R.id.tv_teacher_detail_infotag_photo)
    TextView infotagPhone;
    @BindView(R.id.tv_teacher_detail_infotag_phone_div)
    ImageView infotagPhoneDiv;
    @BindView(R.id.tv_teacher_detail_infotag_fans)
    TextView infotagFans;
    @BindView(R.id.tv_teacher_detail_infotag_fans_div)
    ImageView infotagFansDiv;

    private RecyclerView giftRv;
    private TeacherInfoGiftRvAdapter adapter;

    private ImageView backBtn, backBtnWhite;
    private NestedScrollView nestedScrollView;
    private View personalInclude, courseInclude, fansInclude;

    private View topBarWhite, topBar;
    private boolean topBarIsHide = false;

    private RecyclerView fansRv;
    private TeacherInfoFansRvAdapter fansRvAdapter;


    @Override
    protected int getLayout() {
        return R.layout.activity_teacher_detail_info;
    }

    @Override
    protected void initView() {
        ButterKnife.bind(this);
        giftRv = bindView(R.id.rv_gift_info);
        nestedScrollView = bindView(R.id.nsv);
        backBtn = bindView(R.id.item_teacher_detail_back);
        backBtnWhite = bindView(R.id.item_teacher_detail_back_white);

        personalInclude = bindView(R.id.personal_include);
        courseInclude = bindView(R.id.all_course);
        fansInclude = bindView(R.id.fans);

        topBarWhite = bindView(R.id.item_teacher_detail_rv_topbar_white);
        topBar = bindView(R.id.item_teacher_detail_rv_topbar_alp);

        fansRv = bindView(R.id.rv_fans_contribution);
    }

    @Override
    protected void initData() {
        adapter = new TeacherInfoGiftRvAdapter();
        adapter.setContext(this);
        giftRv.setLayoutManager(new GridLayoutManager(this, 4));
        giftRv.setAdapter(adapter);
        //tag标签以及frame的初始设置
        infoDataClick();

        /**
         * 快速滑动顶部bar的显示隐藏效果还可以，慢速的话，效果不好
         */
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                if(scrollY >= 0 && !topBarIsHide){
                    topBar.setVisibility(View.GONE);
                    topBarWhite.setVisibility(View.VISIBLE);
                    topBarIsHide = true;
                }
                if(scrollY == 0 && topBarIsHide){
                    topBar.setVisibility(View.VISIBLE);
                    topBarWhite.setVisibility(View.GONE);
                    topBarIsHide = false;
                }
            }
        });
        fansRvAdapter = new TeacherInfoFansRvAdapter();
        fansRvAdapter.setContext(this);
        fansRv.setLayoutManager(new LinearLayoutManager(this));
        fansRv.setAdapter(fansRvAdapter);



        //使用起来有问题
//        coordinatorLayout.setOnScrollChangeListener(new View.OnScrollChangeListener() {
//            @Override
//            public void onScrollChange(View v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
//                Log.e(TAG, "onScrollChange: " + scrollY);
//            }
//        });

    }

    @Override
    protected void initListener() {
        backBtn.setOnClickListener(this);
        backBtnWhite.setOnClickListener(this);
        infotagData.setOnClickListener(this);
        infotagDataDiv.setOnClickListener(this);
        infotagPhone.setOnClickListener(this);
        infotagPhoneDiv.setOnClickListener(this);
        infotagFans.setOnClickListener(this);
        infotagFansDiv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.item_teacher_detail_back:
                finish();
                break;
            case R.id.item_teacher_detail_back_white:
                finish();
                break;
            case R.id.tv_teacher_detail_infotag_data:
                infoDataClick();
                break;
            case R.id.tv_teacher_detail_infotag_photo:
                infoPhotoClick();
                break;
            case R.id.tv_teacher_detail_infotag_fans:
                infoFansClick();
                break;
        }
    }

    //粉丝页面
    private void infoFansClick() {
        infotagData.setTextColor(Color.parseColor("#8492A3"));
        infotagPhone.setTextColor(Color.parseColor("#8492A3"));
        infotagFans.setTextColor(Color.parseColor("#000000"));
        infotagDataDiv.setVisibility(View.GONE);
        infotagPhoneDiv.setVisibility(View.GONE);
        infotagFansDiv.setVisibility(View.VISIBLE);

        personalInclude.setVisibility(View.GONE);
        courseInclude.setVisibility(View.GONE);
        fansInclude.setVisibility(View.VISIBLE);
    }
    //相册界面
    private void infoPhotoClick() {
        infotagData.setTextColor(Color.parseColor("#8492A3"));
        infotagPhone.setTextColor(Color.parseColor("#000000"));
        infotagFans.setTextColor(Color.parseColor("#8492A3"));
        infotagDataDiv.setVisibility(View.GONE);
        infotagPhoneDiv.setVisibility(View.VISIBLE);
        infotagFansDiv.setVisibility(View.GONE);

        personalInclude.setVisibility(View.GONE);
        courseInclude.setVisibility(View.VISIBLE);
        fansInclude.setVisibility(View.GONE);
    }
    //资料界面
    private void infoDataClick() {
        infotagData.setTextColor(Color.parseColor("#000000"));
        infotagPhone.setTextColor(Color.parseColor("#8492A3"));
        infotagFans.setTextColor(Color.parseColor("#8492A3"));
        infotagDataDiv.setVisibility(View.VISIBLE);
        infotagPhoneDiv.setVisibility(View.GONE);
        infotagFansDiv.setVisibility(View.GONE);

        personalInclude.setVisibility(View.VISIBLE);
        courseInclude.setVisibility(View.GONE);
        fansInclude.setVisibility(View.GONE);
    }


}
