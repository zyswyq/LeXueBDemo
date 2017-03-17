package com.example.dllo.lexuebdemo.teacher.view;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherInfoFansRvAdapter;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherInfoGiftRvAdapter;
import com.example.dllo.lexuebdemo.teacher.model.Constant;
import com.example.dllo.lexuebdemo.teacher.model.TeacherInfoBean;
import com.example.dllo.lexuebdemo.utils.NumberFormat;

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

    private int teacherId;

    private TeacherInfoBean teacherInfoBean;

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
        Intent intent = getIntent();
        //未获取到id值就设置默认-1
        teacherId = intent.getIntExtra("teacherId", -1);


        NetTools.getInstance().startRequest(Constant.TEACHER_INFO_BASE_URL + teacherId, TeacherInfoBean.class, new MyCallBack<TeacherInfoBean>() {
            @Override
            public void success(TeacherInfoBean respomse) {
                teacherInfoBean = respomse;

                adapter = new TeacherInfoGiftRvAdapter();
                adapter.setContext(TeacherDetailInfoActivity.this);
                adapter.setGiftsBeanList(respomse.getGifts());
                giftRv.setLayoutManager(new GridLayoutManager(TeacherDetailInfoActivity.this, 4));
                giftRv.setAdapter(adapter);

                fansRvAdapter = new TeacherInfoFansRvAdapter();
                fansRvAdapter.setContext(TeacherDetailInfoActivity.this);
                fansRvAdapter.setFansBeanList(respomse.getFans());
                fansRv.setLayoutManager(new LinearLayoutManager(TeacherDetailInfoActivity.this));
                fansRv.setAdapter(fansRvAdapter);
                setData();
            }

            @Override
            public void error(Throwable throwable) {

            }
        });

        //tag标签以及frame的初始设置
        infoDataClick();

        /**
         * 快速滑动顶部bar的显示隐藏效果还可以，慢速的话，效果不好
         */


    }


    private void setData() {
        //设置头像
        if (teacherInfoBean.getTeacher_icon() != null) {
            String headUrl = teacherInfoBean.getTeacher_icon().getUrl();
            final ImageView head = (ImageView) findViewById(R.id.item_teacher_detail_rv_head);
            Glide.with(this).load(headUrl).asBitmap().centerCrop().into(new BitmapImageViewTarget(head) {
                @Override
                protected void setResource(Bitmap resource) {
                    RoundedBitmapDrawable circularBitmapDrawable =
                            RoundedBitmapDrawableFactory.create(getResources(), resource);
                    circularBitmapDrawable.setCircular(true);
                    head.setImageDrawable(circularBitmapDrawable);
                }
            });
        }

        //设置顶部的标题
        TextView title = (TextView) findViewById(R.id.item_teacher_detail_rv_topbar_white_name);
        title.setText(teacherInfoBean.getTeacher_name());

        //设置学科icon
        if (teacherInfoBean.getTeacher_subject_icon() != null) {
            ImageView icon = (ImageView) findViewById(R.id.item_teacher_detail_rv_sex);
            Glide.with(this).load(teacherInfoBean.getTeacher_subject_icon().getUrl()).into(icon);
        }

        //设置teacher名字
        String name = teacherInfoBean.getTeacher_name();
        TextView nameTv = (TextView) findViewById(R.id.item_teacher_detail_rv_name);
        nameTv.setText(name);
        //设置个性签名
        String sign = teacherInfoBean.getSign();
        TextView signTv = (TextView) findViewById(R.id.item_teacher_detail_rv_sign);
        signTv.setText(sign);

        //设置名师信息
        TextView videoCountTv = (TextView) findViewById(R.id.item_teacher_rv_video_count);
        TextView playTimesTv = (TextView) findViewById(R.id.item_teacher_rv_video_play_times);
        TextView fansCountTv = (TextView) findViewById(R.id.item_teacher_rv_fans_count);
        TextView popularityTv = (TextView) findViewById(R.id.item_teacher_rv_popularity);
        videoCountTv.setText(NumberFormat.formatNum(teacherInfoBean.getVideo_count()));
        playTimesTv.setText(NumberFormat.formatNum(teacherInfoBean.getVideo_play_times()));
        fansCountTv.setText(NumberFormat.formatNum(teacherInfoBean.getFans_count()));
        popularityTv.setText(NumberFormat.formatNum(teacherInfoBean.getPopularity()));

        //设置资料页数据
        TextView country = (TextView) findViewById(R.id.item_teacher_detail_rv_dataframe_allcountry);
        country.setText(teacherInfoBean.getTeacher_area());
        TextView subject = (TextView) findViewById(R.id.item_teacher_detail_rv_dataframe_biology);
        subject.setText(teacherInfoBean.getTeacher_subject_name());
        TextView star = (TextView) findViewById(R.id.item_teacher_detail_rv_dataframe_star);
        star.setText(teacherInfoBean.getHoroscope());
        //设置教师描述
        TextView description = (TextView) findViewById(R.id.item_teacher_detail_rv_dataframe_description);
        description.setText(teacherInfoBean.getTeacher_description());
        //设置所有课程数量
        TextView courseCount = (TextView) findViewById(R.id.tv_teacher_detail_info_dataframe_course_count);
        courseCount.setText(teacherInfoBean.getVideo_count() + "");

        //设置前三课程视频图片
        ImageView video1 = (ImageView) findViewById(R.id.iv_course_video1);
        ImageView video2 = (ImageView) findViewById(R.id.iv_course_video2);
        ImageView video3 = (ImageView) findViewById(R.id.iv_course_video3);
        if (teacherInfoBean.getVideos() != null) {
            int count = teacherInfoBean.getVideo_count() > 3 ? 3 : teacherInfoBean.getVideo_count();
            switch (count) {
                case 3:
                    Glide.with(this).load(teacherInfoBean.getVideos().get(2).getVideo_cover().getUrl())
                            .into(video3);
                case 2:
                    Glide.with(this).load(teacherInfoBean.getVideos().get(1).getVideo_cover().getUrl())
                            .into(video2);
                case 1:
                    Glide.with(this).load(teacherInfoBean.getVideos().get(0).getVideo_cover().getUrl())
                            .into(video1);
                    break;
            }
            //设置礼物的数量
            TextView giftCount = (TextView) findViewById(R.id.layout_teacher_detail_info_dataframe_gift_sum);
            giftCount.setText(NumberFormat.formatNum(teacherInfoBean.getGift_num()));
        }
    }

    @Override
    protected void initListener() {
        nestedScrollView.setOnScrollChangeListener(new NestedScrollView.OnScrollChangeListener() {
            @Override
            public void onScrollChange(NestedScrollView v, int scrollX, int scrollY, int oldScrollX, int oldScrollY) {
                tooBarHideOrShow(scrollY);
            }
        });

        backBtn.setOnClickListener(this);
        backBtnWhite.setOnClickListener(this);
        infotagData.setOnClickListener(this);
        infotagDataDiv.setOnClickListener(this);
        infotagPhone.setOnClickListener(this);
        infotagPhoneDiv.setOnClickListener(this);
        infotagFans.setOnClickListener(this);
        infotagFansDiv.setOnClickListener(this);
    }


    //控制顶部bar的显示和隐藏
    private void tooBarHideOrShow(int scrollY) {
        if (scrollY >= 0 && !topBarIsHide) {
            topBar.setVisibility(View.GONE);
            topBarWhite.setVisibility(View.VISIBLE);
            topBarIsHide = true;
        }
        if (scrollY == 0 && topBarIsHide) {
            topBar.setVisibility(View.VISIBLE);
            topBarWhite.setVisibility(View.GONE);
            topBarIsHide = false;
        }
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
