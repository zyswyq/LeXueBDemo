package com.example.dllo.lexuebdemo.find.model;

import java.util.List;

/**
 * Created by dllo on 17/3/16.
 */

public class FuliBean {

    /**
     * error : false
     * results : [{"_id":"56cc6d26421aa95caa707e76","createdAt":"2015-11-18T01:54:41.245Z","desc":"11.18","publishedAt":"2015-11-18T05:17:57.247Z","type":"福利","url":"http://ww1.sinaimg.cn/large/7a8aed7bjw1ey4w5cdjbej20hs0qoq7q.jpg","used":true,"who":"张涵宇"}]
     */

    private boolean error;
    private List<ResultsBean> results;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {
        /**
         * _id : 56cc6d26421aa95caa707e76
         * createdAt : 2015-11-18T01:54:41.245Z
         * desc : 11.18
         * publishedAt : 2015-11-18T05:17:57.247Z
         * type : 福利
         * url : http://ww1.sinaimg.cn/large/7a8aed7bjw1ey4w5cdjbej20hs0qoq7q.jpg
         * used : true
         * who : 张涵宇
         */

        private String _id;
        private String createdAt;
        private String desc;
        private String publishedAt;
        private String type;
        private String url;
        private boolean used;
        private String who;

        public String get_id() {
            return _id;
        }

        public void set_id(String _id) {
            this._id = _id;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        public String getPublishedAt() {
            return publishedAt;
        }

        public void setPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public boolean isUsed() {
            return used;
        }

        public void setUsed(boolean used) {
            this.used = used;
        }

        public String getWho() {
            return who;
        }

        public void setWho(String who) {
            this.who = who;
        }
    }
}
