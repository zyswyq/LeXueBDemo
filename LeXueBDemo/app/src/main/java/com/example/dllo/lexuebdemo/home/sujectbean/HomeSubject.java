package com.example.dllo.lexuebdemo.home.sujectbean;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeSubject {

    /**
     * error_info :
     * status : 0
     * video_subjects : [{"is_filter":false,"new_coming":false,"video_subject_id":100,"video_subject_name":"推荐"},{"is_filter":true,"new_coming":true,"video_subject_id":1,"video_subject_name":"数学"},{"is_filter":true,"new_coming":true,"video_subject_id":5,"video_subject_name":"语文"},{"is_filter":true,"new_coming":false,"video_subject_id":2,"video_subject_name":"化学"},{"is_filter":true,"new_coming":false,"video_subject_id":3,"video_subject_name":"物理"},{"is_filter":true,"new_coming":false,"video_subject_id":4,"video_subject_name":"生物"},{"is_filter":true,"new_coming":false,"video_subject_id":6,"video_subject_name":"英语"},{"is_filter":true,"new_coming":false,"video_subject_id":103,"video_subject_name":"政治"},{"is_filter":true,"new_coming":false,"video_subject_id":102,"video_subject_name":"历史"},{"is_filter":true,"new_coming":false,"video_subject_id":104,"video_subject_name":"地理"},{"is_filter":false,"new_coming":false,"video_subject_id":11,"video_subject_name":"志愿"},{"is_filter":false,"new_coming":false,"video_subject_id":302,"video_subject_name":"政策面试"},{"is_filter":false,"new_coming":false,"video_subject_id":303,"video_subject_name":"自招物理"},{"is_filter":false,"new_coming":false,"video_subject_id":301,"video_subject_name":"自招数学"}]
     */

    private String error_info;
    private int status;
    private List<VideoSubjectsBean> video_subjects;

    public String getError_info() {
        return error_info;
    }

    public void setError_info(String error_info) {
        this.error_info = error_info;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<VideoSubjectsBean> getVideo_subjects() {
        return video_subjects;
    }

    public void setVideo_subjects(List<VideoSubjectsBean> video_subjects) {
        this.video_subjects = video_subjects;
    }

    public static class VideoSubjectsBean {
        /**
         * is_filter : false
         * new_coming : false
         * video_subject_id : 100
         * video_subject_name : 推荐
         */

        private boolean is_filter;
        private boolean new_coming;
        private int video_subject_id;
        private String video_subject_name;

        public boolean isIs_filter() {
            return is_filter;
        }

        public void setIs_filter(boolean is_filter) {
            this.is_filter = is_filter;
        }

        public boolean isNew_coming() {
            return new_coming;
        }

        public void setNew_coming(boolean new_coming) {
            this.new_coming = new_coming;
        }

        public int getVideo_subject_id() {
            return video_subject_id;
        }

        public void setVideo_subject_id(int video_subject_id) {
            this.video_subject_id = video_subject_id;
        }

        public String getVideo_subject_name() {
            return video_subject_name;
        }

        public void setVideo_subject_name(String video_subject_name) {
            this.video_subject_name = video_subject_name;
        }
    }
}
