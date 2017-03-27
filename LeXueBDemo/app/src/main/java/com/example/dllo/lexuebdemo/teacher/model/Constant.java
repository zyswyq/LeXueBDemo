package com.example.dllo.lexuebdemo.teacher.model;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class Constant {


    //学科界面
    public static final String HOME_SUBJECT_URL = "http://api.lexue.com/video/list_v3?pagesize=10&point_id=0&sub_point_id=0&phase=0&video_type=0&sort=0&subject_id=";
    //teacher界面的学科标签
    public static final String TEACHER_ALLDATA_URL = "http://api.lexue.com/teacher/subject_list";
    //根据学科的标签拼接，找到相应的学科界面数据
    public static final String TEACHER_SUBJECT_BASE_URL = "http://api.lexue.com/teacher/listV2?pagesize=10&subject_id=";
    //根据teacherid拼接，找到对应名师详细界面数据
    public static final String TEACHER_INFO_BASE_URL = "http://api.lexue.com/teacher/detail?teacher_id=";
    //将视频评价前面和后面拼接。中间加video_id
    public static final String TEACHER_INFO_FANS_BASE1_URL = "http://api.lexue.com/video/comment_list?vid=";
    public static final String TEACHER_INFO_FANS_BASE2_URL = "&type=a&page=1&page_size=10";
    //所有课程界面,拼接teacher_id
    public static final String TEACHER_ALL_COURSE_BASE1_URL = "http://api.lexue.com/teacher/video/list?teacher_id=";
    public static final String TEACHER_ALL_COURSE_BASE2_URL = "&pagesize=10&condition=0&sort=0&TeacherVideoListModel";
    //视频详情界面
    public static final String TEACHER_VIDEO_DETAIL_BASE_URL = "http://api.lexue.com/video/detail?vid=";
    public static final String TEACHER_VIDEO_PLAY_BASE_URL = "http://vod.lexue.com/video/";
}
