package com.example.dllo.lexuebdemo.teacher.view;

import android.Manifest;
import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.SystemClock;
import android.provider.MediaStore;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dllo.lexuebdemo.R;
import com.example.dllo.lexuebdemo.base.BaseActivity;
import com.example.dllo.lexuebdemo.teacher.morebean.MusicBean;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/*
    by Mr.L
    data 2017-03-18
    desc 简单的没有写在服务里的音乐播放器
*/
public class MoreMusicPlayerActivity extends BaseActivity implements View.OnClickListener {
    private static final String TAG = "MoreMusicPlayerActivity";
    private Button play, pause, stop, next, last, singleMode, randomMode, circleMode;
    private MediaPlayer mediaPlayer;
    private List<MusicBean> musicBeanList;
    private int mIndex;
    private String mUrl;
    private static final int SINGLE_MODE = 0;
    private static final int RANDOM_MODE = -1;
    private static final int CIRCLE_MODE = 1;
    private int mMode = 1;
    private TextView songName, singer;
    private SeekBar musicSeekBar;
    private boolean isFirst = true;
    private boolean isActivityDestroyed;

    //在进行自己设置的网络音乐资源，音乐切换的时候使用的地址拼接标记
    private int tag = 1;
    private boolean isPreapred;

    @Override
    protected int getLayout() {
        return R.layout.activity_moremusicplayer;
    }

    @Override
    protected void initView() {
        play = bindView(R.id.btn_music_play);
        pause = bindView(R.id.btn_music_pause);
        stop = bindView(R.id.btn_music_stop);
        next = bindView(R.id.play_next);
        last = bindView(R.id.play_last);
        singleMode = bindView(R.id.single_mode);
        randomMode = bindView(R.id.random_mode);
        circleMode = bindView(R.id.circle_mode);
        songName = bindView(R.id.tv_song_name);
        singer = bindView(R.id.tv_singer);
        musicSeekBar = bindView(R.id.music_seek_bar);
    }

    @Override
    protected void initData() {
        //初始化存储音乐的集合
        musicBeanList = new ArrayList<>();

        mediaPlayer = new MediaPlayer();
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.READ_EXTERNAL_STORAGE)
                != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.READ_EXTERNAL_STORAGE}, 1);
        } else {
            initMediaPlayer();//初始化 MediaPlayer
        }
    }



    @Override
    protected void initListener() {
        play.setOnClickListener(this);
        pause.setOnClickListener(this);
        stop.setOnClickListener(this);
        next.setOnClickListener(this);
        last.setOnClickListener(this);
        singleMode.setOnClickListener(this);
        randomMode.setOnClickListener(this);
        circleMode.setOnClickListener(this);
        //监听seekbar的进度条改变事件
        musicSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                //在停止拉动进度条的时候，设置mediaplayer进度为当前seekbar的进度
                mediaPlayer.seekTo(seekBar.getProgress());
                //下面的判断防止手拖动到最后，mediaPlayer监听不到自己播放结束。
                //切换下一首歌
                if(seekBar.getProgress() == mediaPlayer.getDuration()){
                    changeMusic(1);
                }
            }
        });
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                //对当前mediaPlayer的进度进行判断，为0时，有可能因为网络歌曲还未加载好，
                //此时不进行下一首歌曲的切换
                if(mediaPlayer.getCurrentPosition() != 0){

                    changeMusic(1);
                }

            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_music_play:
                musicPlay();

                break;
            case R.id.btn_music_pause:
                musicPause();
                break;
            case R.id.btn_music_stop:
                musicReset();
                break;
            //点击上一首或者下一首，均先根据当前Mode，来进行下一首或者上一首歌曲的设置
            case R.id.play_next:
                changeMusic(1);
                break;
            case R.id.play_last:
                changeMusic(0);
                break;
            //点击更改模式
            case R.id.single_mode:
                Toast.makeText(this, "单曲循环", Toast.LENGTH_SHORT).show();
                mMode = SINGLE_MODE;
                break;
            case R.id.random_mode:
                Toast.makeText(this, "随机播放", Toast.LENGTH_SHORT).show();
                mMode = RANDOM_MODE;
                break;
            case R.id.circle_mode:
                Toast.makeText(this, "列表循环", Toast.LENGTH_SHORT).show();
                mMode = CIRCLE_MODE;
                break;
        }
    }

    private void initMediaPlayer() {

        //获取手机中的音乐，并存储到集合中
        initMusic();

    }

    private void musicPrepare() {
        try {
            mUrl = musicBeanList.get(mIndex).getSongUri();
            mediaPlayer.reset();
            //播放手机中音乐的设置
//            mediaPlayer.setDataSource(mUrl);
//            mediaPlayer.prepare();

            //播放网络歌曲的设置（哈哈 Tomcat配置成功）
            mediaPlayer.setDataSource("http://172.16.16.185:8080/music"+tag+".mp3");
            mediaPlayer.prepareAsync();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //更改当前的歌曲，第二个参数为0切换上一首，为1切换下一首
    private void changeMusic(int lastOrNext) {
        setmIndex(lastOrNext);
        tag = tag == 1 ? 2 : 1;
        musicPrepare();
        musicPlay();
    }

    //更新进度条进度
    private void updateProgress() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (!isActivityDestroyed) {


                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            if(mediaPlayer.isPlaying()){
                                musicSeekBar.setProgress(mediaPlayer.getCurrentPosition());
                            }

                        }
                    });
                    /**
                     * 暂停100毫秒再进行刷新操作
                     */
                    SystemClock.sleep(100);
                }
                Log.e(TAG, "run: 线程已经结束了哦");
            }
        }).start();
    }

    //根据当前mode更改mIndex
    private void setmIndex(int lastOrNext) {
        switch (mMode) {
            case SINGLE_MODE:
                break;
            case CIRCLE_MODE:
                if (lastOrNext == 0) {
                    if(mIndex == 0){
                        mIndex = musicBeanList.size()-1;
                    }else {
                        mIndex -= 1;
                    }
                }else{
                    if(mIndex == musicBeanList.size()-1){
                        mIndex = 0;
                    }else {
                        mIndex += 1;
                    }
                }
                break;
            case RANDOM_MODE:
                mIndex = new Random().nextInt(musicBeanList.size());
                break;
        }

    }

    //播放音乐。并将音乐的信息显示到界面
    private void musicPlay() {
        if (!mediaPlayer.isPlaying()) {
            musicPrepare();
            //在异步的prepare后进行监听准备结束事件。
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                //结束后
                @Override
                public void onPrepared(MediaPlayer mp) {
                    Log.e(TAG, "onPrepared: ");
                    mediaPlayer.start();
                    //seekbar进度条最大值和更新的操作
                    musicSeekBar.setMax(mediaPlayer.getDuration());
                    if(isFirst){
                        updateProgress();
                        isFirst = false;
                    }
                }
            });


            if (musicBeanList.size() == 0){
                return;
            }
            MusicBean bean = musicBeanList.get(mIndex);
            songName.setText(bean.getSongName());
            singer.setText(bean.getSinger());

        }
    }
    //音乐暂停
    private void musicPause() {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.pause();//暂停播放
        }
    }

    //音乐停止
    private void musicReset() {
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.reset();//停止播放
            musicPrepare();
        }
    }

    //权限请求回调函数
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode) {
            case 1:
                if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    initMediaPlayer();
                } else {
                    Toast.makeText(this, "拒绝权限将无法使用程序", Toast.LENGTH_SHORT).show();
                }
                break;
            default:
                break;
        }
    }

    //在活动销毁的时候进行音乐播放器的停止和MediaPlayer的资源释放
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        isActivityDestroyed = true;
    }


    //获取手机中的音乐
    public void initMusic() {
        ContentResolver contentResolver = getContentResolver();
        Cursor cursor = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, null, null, null);
        //这个uri就是contentProvider暴露给我们，用来查询本地音乐的uri了
        if (cursor != null && cursor.moveToFirst()) {

            do {
                //根据我们的需求，我们需要歌手的名字和歌曲的名字还有歌曲的url
                String singer = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.ARTIST));
                String song = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.TITLE));
                String url = cursor.getString(cursor.getColumnIndex(MediaStore.Audio.Media.DATA));

                //获取音乐的类型  这个也是系统暴露给我们的 0代表不是音乐
                int isMusic = cursor.getInt(cursor.getColumnIndex(MediaStore.Audio.Media.IS_MUSIC));

                //获取音乐的时长
                Long duringTime = cursor.getLong(cursor.getColumnIndex(MediaStore.Audio.Media.DURATION));
                //在这里我们判断一下，如果类型符合。并且长度大于1分钟的话，我们就默认它是音乐，把它加到集合当中
                if (isMusic != 0 && duringTime / 60 * 1000 > 1) {
                    MusicBean musicBean = new MusicBean(song, singer, url);
                    musicBeanList.add(musicBean);
                    Log.e(TAG, "initmUrl: " + url);
                    Log.e(TAG, "initmUrl: " + singer + "," + song);
                }

            } while (cursor.moveToNext());
        }

        cursor.close();

    }
}
