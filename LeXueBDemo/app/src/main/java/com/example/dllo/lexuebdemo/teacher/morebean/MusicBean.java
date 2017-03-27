package com.example.dllo.lexuebdemo.teacher.morebean;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
public class MusicBean {
    private String songName;
    private String singer;
    private String songUri;

    public MusicBean(String songName, String singer, String songUri) {
        this.songName = songName;
        this.singer = singer;
        this.songUri = songUri;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getSongUri() {
        return songUri;
    }

    public void setSongUri(String songUri) {
        this.songUri = songUri;
    }
}

