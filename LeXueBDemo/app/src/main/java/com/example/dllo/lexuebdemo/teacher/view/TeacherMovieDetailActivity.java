package com.example.dllo.lexuebdemo.teacher.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v4.graphics.drawable.RoundedBitmapDrawable;
import android.support.v4.graphics.drawable.RoundedBitmapDrawableFactory;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.BitmapImageViewTarget;
import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.nettools.NetTools;
import com.example.dllo.lexuebdemo.nettools.inter.MyCallBack;
import com.example.dllo.lexuebdemo.sql.DatabaseManager;
import com.example.dllo.lexuebdemo.sql.MyThreadPool;
import com.example.dllo.lexuebdemo.teacher.adapter.TeacherMovieCommentRvAdapter;
import com.example.dllo.lexuebdemo.teacher.model.CommentBean;
import com.example.dllo.lexuebdemo.teacher.model.Constant;
import com.example.dllo.lexuebdemo.teacher.model.VideoInfoBean;
import com.example.dllo.lexuebdemo.teacher.sql.CourseBean;
import com.example.dllo.lexuebdemo.utils.NumberFormat;

import java.util.List;


import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

import static com.example.dllo.lexuebdemo.teacher.model.Constant.TEACHER_INFO_FANS_BASE1_URL;
import static com.example.dllo.lexuebdemo.teacher.model.Constant.TEACHER_INFO_FANS_BASE2_URL;

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

    private View courseBottombar;

    private ImageView collectImg;
    private boolean isCollected;

    //TODO 最好将其放在sp里存储
    private static boolean isFirst = true;

    public static void actionStart(Context context, int movieId) {
        Intent intent = new Intent(context, TeacherMovieDetailActivity.class);
        intent.putExtra("movieId", movieId);
        context.startActivity(intent);
    }


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

        courseBottombar = bindView(R.id.course_bottombar);

        collectImg = bindView(R.id.course_collect);
    }

    @Override
    protected void initData() {
        movieId = getIntent().getIntExtra("movieId", -1);
        if (movieId == -1) {
            return;
        }
        getNetData();


        initFrame();

        radioButton.setChecked(true);

        //使用封装的线程池
        MyThreadPool.getInstance().getThreadPoolExecutor().execute(new Runnable() {
            @Override
            public void run() {
                //查询表中所有数据
                List<CourseBean> courseBeanArrayList = DatabaseManager.getInstance()
                        .getQueryAll(CourseBean.class);
                CourseBean nowBean = null;
                //遍历数据，找到此次的movieId就保存到nowBean中
                for (CourseBean courseBean : courseBeanArrayList) {

                    if (courseBean.getMovieId() == movieId) {
                        nowBean = courseBean;
                        Log.e(TAG, "run: i find it");
                    }
                }

                Log.e(TAG, "run: " + courseBeanArrayList.size());
                //如果为null或者被收藏属性为false，设置相应的变化
                if (nowBean == null || !nowBean.isCollected()) {
                    isCollected = false;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            collectImg.setImageResource(R.mipmap.toolbar_collection_btn_normal);
                        }
                    });
                } else {
                    isCollected = true;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            collectImg.setImageResource(R.mipmap.toolbar_collection_btn_pressed);
                        }
                    });
                }


            }
        });


    }

    private void getNetData() {
        String videoUrl = Constant.TEACHER_VIDEO_DETAIL_BASE_URL + movieId;
        NetTools.getInstance().startRequest(videoUrl,
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
        //请求评论的信息
        NetTools.getInstance().startRequest(TEACHER_INFO_FANS_BASE1_URL + movieId + TEACHER_INFO_FANS_BASE2_URL,
                CommentBean.class, new MyCallBack<CommentBean>() {
                    @Override
                    public void success(CommentBean respomse) {
                        adapter = new TeacherMovieCommentRvAdapter();
                        adapter.setContext(TeacherMovieDetailActivity.this);
                        adapter.setVideoInfoBean(respomse.getComments());

                        //设置好评率
                        /**
                         * CommentBean中的好评率，修改为了double类型
                         */
                        TextView goodPercent = (TextView) findViewById(R.id.tv_evaluate_good_persent);
                        goodPercent.setText((int) (respomse.getComment_rate() * 100) + "%");

                        commentRv.setLayoutManager(new LinearLayoutManager(TeacherMovieDetailActivity.this));
                        commentRv.setAdapter(adapter);
                    }

                    @Override
                    public void error(Throwable throwable) {

                    }
                });


        //设置课程的标题
        TextView courseTitle = (TextView) findViewById(R.id.tv_course_title);
        courseTitle.setText(videoInfoBean.getVideo_title());

        ImageView courseBg = (ImageView) findViewById(R.id.iv_teacher_movie_detail_bg);
        Glide.with(this).load(videoInfoBean.getVideo_cover().getUrl()).into(courseBg);

        //设置课程信息
        TextView priceTv = (TextView) findViewById(R.id.tv_course_real_price);
        int price = videoInfoBean.getReal_diamond_price();
        TextView priceFree = (TextView) findViewById(R.id.tv_course_real_free);
        TextView priceState = (TextView) findViewById(R.id.tv_course_real_state);
        if (price == 0) {
            priceTv.setVisibility(View.GONE);
            priceFree.setVisibility(View.VISIBLE);
            priceState.setText("已购买");
        } else {
            priceTv.setText(price + "");
        }
        TextView watcherCount = (TextView) findViewById(R.id.tv_course_real_playtimes);
        watcherCount.setText(NumberFormat.formatNum(videoInfoBean.getWatcher_count()));

        TextView userPraise = (TextView) findViewById(R.id.tv_movie_detail_spot);
        userPraise.setText(NumberFormat.formatNum(videoInfoBean.getUser_praise()));

        TextView description = (TextView) findViewById(R.id.tv_course_video_description);
        description.setText(videoInfoBean.getVideo_description());

        VideoInfoBean.TeacherBean teacherBean = videoInfoBean.getTeacher();
        //设置底部bar信息
        final ImageView headImg = (ImageView) findViewById(R.id.iv_movie_teacher_head);
        Glide.with(this).load(teacherBean.getTeacher_icon().getUrl()).asBitmap().centerCrop().into(new BitmapImageViewTarget(headImg) {
            @Override
            protected void setResource(Bitmap resource) {
                RoundedBitmapDrawable circularBitmapDrawable =
                        RoundedBitmapDrawableFactory.create(getResources(), resource);
                circularBitmapDrawable.setCircular(true);
                headImg.setImageDrawable(circularBitmapDrawable);
            }
        });

        TextView teacherName = (TextView) findViewById(R.id.iv_movie_teacher_name);
        teacherName.setText(teacherBean.getTeacher_name());

        TextView videoCount = (TextView) findViewById(R.id.course_video_count);
        videoCount.setText("视频数: " + teacherBean.getVideo_count());


        setJcPlayer();
    }

    private void setJcPlayer() {
        String url = Constant.TEACHER_VIDEO_PLAY_BASE_URL + realMovieId;
        Log.e(TAG, "setJcPlayer: " + url);
        jcVideoPlayerStandard.setUp(url,
                JCVideoPlayerStandard.SCREEN_WINDOW_FULLSCREEN, "");
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

        courseBottombar.setOnClickListener(this);

        collectImg.setOnClickListener(this);
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
        switch (v.getId()) {
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

            case R.id.course_bottombar:
                TeacherDetailInfoActivity.actionStart(this, videoInfoBean.getTeacher().getTeacher_id());
                break;

            case R.id.course_collect:
                //判断是否被收藏
                if (isCollected) {
                    //判断是是否为第一次创建数据库，是的话，需要先进行insert操作，数据库才会被创建
                    if (isFirst) {
                        isFirst = false;
                        CourseBean courseBean = new CourseBean(movieId, false);
                        DatabaseManager.getInstance().insert(courseBean);
                        Log.e(TAG, "onClick: addnew false first" + movieId);
                    }else{
                        //先进行更新操作，如果获得的更新行数为0，则代表该movieId数据尚未被录入，需要insert
                        int rows = DatabaseManager.getInstance().update(CourseBean.class, "movieId=?",
                                new String[]{"" + movieId}, new String[]{"isCollected"}, new String[]{"false"});
                        Log.e(TAG, "onClick: update false");
                        if(rows == 0){
                            CourseBean courseBean = new CourseBean(movieId, false);
                            DatabaseManager.getInstance().insert(courseBean);
                            Log.e(TAG, "onClick: addnew false 0" + movieId);
                        }
                    }
                    collectImg.setImageResource(R.mipmap.toolbar_collection_btn_normal);
                    isCollected = false;
                } else {
                    if (isFirst) {
                        isFirst = false;
                        CourseBean courseBean = new CourseBean(movieId, true);
                        DatabaseManager.getInstance().insert(courseBean);
                        Log.e(TAG, "onClick: addnew true first" + movieId);
                    }else{
                        int rows = DatabaseManager.getInstance().update(CourseBean.class, "movieId=?",
                                new String[]{"" + movieId}, new String[]{"isCollected"}, new String[]{"true"});
                        Log.e(TAG, "onClick: update true");
                        if(rows == 0){
                            CourseBean courseBean = new CourseBean(movieId, true);
                            DatabaseManager.getInstance().insert(courseBean);
                            Log.e(TAG, "onClick: addnew true 0" + movieId);
                        }
                    }
                    collectImg.setImageResource(R.mipmap.toolbar_collection_btn_pressed);
                    isCollected = true;
                }

                break;
        }
    }
}
