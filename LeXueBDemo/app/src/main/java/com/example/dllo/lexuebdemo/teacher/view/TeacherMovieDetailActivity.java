package com.example.dllo.lexuebdemo.teacher.view;

import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherMovieCommentRvAdapter;
import com.example.dllo.lexuebdemo.teacher.model.Constant;
import com.example.dllo.lexuebdemo.teacher.model.VideoInfoBean;

import fm.jiecao.jcvideoplayer_lib.JCVideoPlayer;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherMovieDetailActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "TeacherMovieDetailActiv";
    private RecyclerView commentRv;
    private TeacherMovieCommentRvAdapter adapter;

    private View detailInclude, testInclude, evaluateInclude;
    private TextView detailBtn, testBtn, evaluateBtn;
    private ImageView detailDiv, testDiv, evaluateDiv;

    private RadioButton radioButton;
    private ImageView backBtn;

    private JCVideoPlayerStandard jcVideoPlayerStandard;
    private int movieId;
    private String realMovieId;
    private VideoInfoBean videoInfoBean;

    private ImageView videoPlay;
    private ImageView videoBg;
    private boolean playerIsPrepared;


    @Override
    protected int getLayout() {
        return R.layout.activity_teacher_movie_detail;
    }

    @Override
    protected void initView() {
        commentRv = bindView(R.id.rv_movie_comment);

        detailInclude = bindView(R.id.detail_include);
        testInclude = bindView(R.id.test_include);
        evaluateInclude = bindView(R.id.evaluate_include);

        detailBtn = bindView(R.id.tv_teacher_movie_detail_detail);
        testBtn = bindView(R.id.tv_teacher_movie_detail_test);
        evaluateBtn = bindView(R.id.tv_teacher_movie_detail_evaluate);

        detailDiv = bindView(R.id.iv_teacher_movie_detail_detail_div);
        testDiv = bindView(R.id.iv_teacher_movie_detail_test_div);
        evaluateDiv = bindView(R.id.tv_teacher_movie_detail_evaluate_div);

        radioButton = bindView(R.id.rb_all);

        backBtn = bindView(R.id.iv_teacher_movie_detail_back);

        jcVideoPlayerStandard = bindView(R.id.jc_video);

        videoPlay = bindView(R.id.video_play);
        videoBg = bindView(R.id.iv_teacher_movie_detail_bg);
    }

    @Override
    protected void initData() {
        movieId = getIntent().getIntExtra("movieId", -1);
        if(movieId == -1){
            return;
        }
        getNetData();


        initFrame();

        radioButton.setChecked(true);


    }

    private void getNetData() {
        NetTools.getInstance().startRequest(Constant.TEACHER_VIDEO_DETAIL_BASE_URL + movieId,
                VideoInfoBean.class, new MyCallBack<VideoInfoBean>() {
                    @Override
                    public void success(VideoInfoBean respomse) {
                        videoInfoBean = respomse;
                        realMovieId = respomse.getFlv_real_id();


                        setNetData();
                    }

                    @Override
                    public void error(Throwable throwable) {

                    }
                });

    }

    private void setNetData() {
        adapter = new TeacherMovieCommentRvAdapter();
        adapter.setContext(TeacherMovieDetailActivity.this);
        adapter.setVideoInfoBean(videoInfoBean);
        commentRv.setLayoutManager(new LinearLayoutManager(TeacherMovieDetailActivity.this));
        commentRv.setAdapter(adapter);

        setJcPlayer();
    }

    private void setJcPlayer() {
        jcVideoPlayerStandard.setUp(Constant.TEACHER_VIDEO_PLAY_BASE_URL+realMovieId,
                JCVideoPlayerStandard.SCREEN_WINDOW_FULLSCREEN, "");
        Log.e(TAG, "setJcPlayer: " + realMovieId);
    }

    private void initFrame() {
        detailFrameClick();
    }



    @Override
    protected void initListener() {
        detailBtn.setOnClickListener(this);
        testBtn.setOnClickListener(this);
        evaluateBtn.setOnClickListener(this);

        backBtn.setOnClickListener(this);

        videoPlay.setOnClickListener(this);
    }

    private void detailFrameClick() {
        detailBtn.setTextColor(Color.parseColor("#000000"));
        testBtn.setTextColor(Color.parseColor("#8492A3"));
        evaluateBtn.setTextColor(Color.parseColor("#8492A3"));

        detailDiv.setVisibility(View.VISIBLE);
        testDiv.setVisibility(View.GONE);
        evaluateDiv.setVisibility(View.GONE);

        detailInclude.setVisibility(View.VISIBLE);
        testInclude.setVisibility(View.GONE);
        evaluateInclude.setVisibility(View.GONE);
    }

    private void testFrameClick() {
        detailBtn.setTextColor(Color.parseColor("#8492A3"));
        testBtn.setTextColor(Color.parseColor("#000000"));
        evaluateBtn.setTextColor(Color.parseColor("#8492A3"));

        detailDiv.setVisibility(View.GONE);
        testDiv.setVisibility(View.VISIBLE);
        evaluateDiv.setVisibility(View.GONE);

        detailInclude.setVisibility(View.GONE);
        testInclude.setVisibility(View.VISIBLE);
        evaluateInclude.setVisibility(View.GONE);
    }

    private void evaluateFrameClick() {
        detailBtn.setTextColor(Color.parseColor("#8492A3"));
        testBtn.setTextColor(Color.parseColor("#8492A3"));
        evaluateBtn.setTextColor(Color.parseColor("#000000"));

        detailDiv.setVisibility(View.GONE);
        testDiv.setVisibility(View.GONE);
        evaluateDiv.setVisibility(View.VISIBLE);

        detailInclude.setVisibility(View.GONE);
        testInclude.setVisibility(View.GONE);
        evaluateInclude.setVisibility(View.VISIBLE);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_teacher_movie_detail_detail:
                detailFrameClick();
                break;
            case R.id.tv_teacher_movie_detail_test:
                testFrameClick();
                break;
            case R.id.tv_teacher_movie_detail_evaluate:
                evaluateFrameClick();
                break;
            case R.id.iv_teacher_movie_detail_back:
                finish();
                break;

            case R.id.video_play:
//                if(playerIsPrepared){
                    Log.e(TAG, "onClick: ");
//                    jcVideoPlayerStandard.startVideo();
                    videoBg.setVisibility(View.GONE);
                    videoPlay.setVisibility(View.GONE);

//                }
                break;
        }
    }
}
