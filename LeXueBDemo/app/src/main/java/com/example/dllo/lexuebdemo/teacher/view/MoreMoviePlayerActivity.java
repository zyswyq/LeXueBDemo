package com.example.dllo.lexuebdemo.teacher.view;


import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class MoreMoviePlayerActivity extends BaseActivity implements View.OnClickListener {
    private Button play, pause, replay;
    private VideoView videoView;

    @Override
    protected int getLayout() {
        return R.layout.activity_moremovieplayer;
    }

    @Override
    protected void initView() {
        play = bindView(R.id.btn_movie_play);
        pause = bindView(R.id.btn_movie_pause);
        replay = bindView(R.id.btn_movie_replay);
        videoView = bindView(R.id.video_view);
    }

    @Override
    protected void initData() {
        MediaController mediaController = new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setMediaPlayer(videoView);
//        videoView.setVideoURI(Uri.parse("http://clips.vorwaerts-gmbh.de/big_buck_bunny.mp4"));
        videoView.setVideoURI(Uri.parse("http://172.16.16.185:8080/0001.mp4"));
    }

    @Override
    protected void initListener() {
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        replay.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_movie_play:
                if(!videoView.isPlaying()){
                    videoView.start();
                }
                break;
            case R.id.btn_movie_pause:
                if(videoView.isPlaying()){
                    videoView.pause();
                }
                break;
            case R.id.btn_movie_replay:
                if(videoView.isPlaying()){
                    videoView.resume();
                }
                break;
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(videoView != null){
            videoView.suspend();
        }
    }
}
