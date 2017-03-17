package com.example.dllo.lexuebdemo.teacher.model;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class Constant {
    //teacher界面的学科标签
    public static final String TEACHER_ALLDATA_URL = "http://api.lexue.com/teacher/subject_list";
    //根据学科的标签拼接，找到相应的学科界面数据
    public static final String TEACHER_SUBJECT_BASE_URL = "http://api.lexue.com/teacher/listV2?pagesize=10&subject_id=";
    //根据teacherid拼接，找到对应名师详细界面数据
    public static final String TEACHER_INFO_BASE_URL = "http://api.lexue.com/teacher/detail?teacher_id=";
    //将
    public static final String TEACHER_INFO_FANS_BASE1_URL = "http://api.lexue.com/video/comment_list?vid=";
    public static final String TEACHER_INFO_FANS_BASE2_URL = "&type=a&page=1&page_size=10";
}
