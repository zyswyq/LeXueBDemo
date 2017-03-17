package com.example.dllo.lexuebdemo.teacher.model;

import java.util.List;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class VideoInfoBean {
    /**
     * bought : false
     * chat_room_id : 10002
     * collect : false
     * criticaled : false
     * diamond_price : 30
     * download_flag : 1
     * download_url : http://esfile.lexue.com/file/T1gyxTBgZT1RCvBVdK.pdf
     * encode_flag : 2
     * end_expiration_time : 0
     * error_info :
     * expiration_time : 90
     * flv_real_id : ff06cbcc170315.mp4
     * forward :
     * forward_note :
     * is_best : true
     * knowledge_comment : 历年高考使用本法解答的题目有:
     * knowledge_expect_comment : 2017年高考出现概率
     * praised : false
     * preview_redirection : {"forward":[{"name":"单节购买","url":"lexuegaokao://pay/buy"},{"name":"套卡购买","url":"http://www.lexue.com/n/index.html"}],"tip":"试看结束啦，购买即可观看完整版，套卡购买更超值哦"}
     * preview_video_url : http://vod.lexue.com/preview/04283bde170315.mp4
     * product_id : 57679
     * real_diamond_price : 30
     * real_video_id : ff06cbcc170315.mp4
     * recommend_video : {"diamond_price":"0","teacher_name":"俞锋","video_cover":{"height":412,"url":"https://esfile.lexue.com/file/T1qtJTBCYv1RCvBVdK.jpg","width":750},"video_id":127,"video_title":"有机高分子（上）"}
     * share_url : http://api.lexue.com/post/videoShare.jsp?video_id=1648.html
     * status : 0
     * tagList : [{"is_stress":0,"tag_name":"精讲"}]
     * teacher : {"display_fans_count":39537,"followed":false,"horoscope":"射手座","popularity":2144895,"teacher_area":"全国","teacher_description":"担任全球顶尖医药研究室产品主管长达7年之久，精研各类抗癌药物中间体合成。比\u201c绝命毒师\u201d更擅长工业提纯，比特级教师更谙熟高精理论。是罕见的拥有理论和实践双重能力的大师。\r\n俞锋老师的授课风格独树一帜。能够从学科的本源出发，一针见血、形象生动的阐释理论；能够从海量的题目中跳出，别出心裁、全面高效的总结题型规律，为学渣开路，为学霸领航！","teacher_icon":{"height":600,"url":"https://esfile.lexue.com/file/T10axTBQJT1RCvBVdK.jpg","width":600},"teacher_id":13,"teacher_name":"俞锋","teacher_sex":0,"teacher_subject":2,"video_count":20,"video_play_times":459425}
     * user_critical : 0
     * user_praise : 255
     * video_cover : {"height":422,"url":"https://esfile.lexue.com/file/T1ZyZTByDT1RCvBVdK.jpg","width":750}
     * video_description : #难度中等偏上，适用于全国选考有机的同学
     #主要内容为有机物命名规则，以及有机的一些有代表性题目的刷题
     #又见绝命毒师辣手摧题，十步一道题，百步一张卷
     * video_download : []
     * video_duration : 6245
     * video_id : 1648
     * video_price : 0
     * video_rate : 5
     * video_subject : 2
     * video_subject_name : 化学
     * video_title : 有机补充刷题（上） 化学二轮复习（二一）
     * video_type : 1
     * watcher_count : 1661
     * web_bad_praise : 0
     * web_good_praise : 18
     * web_mid_praise : 0
     */

    private boolean bought;
    private int chat_room_id;
    private boolean collect;
    private boolean criticaled;
    private int diamond_price;
    private int download_flag;
    private String download_url;
    private int encode_flag;
    private int end_expiration_time;
    private String error_info;
    private int expiration_time;
    private String flv_real_id;
    private String forward;
    private String forward_note;
    private boolean is_best;
    private String knowledge_comment;
    private String knowledge_expect_comment;
    private boolean praised;
    private PreviewRedirectionBean preview_redirection;
    private String preview_video_url;
    private int product_id;
    private int real_diamond_price;
    private String real_video_id;
    private RecommendVideoBean recommend_video;
    private String share_url;
    private int status;
    private TeacherBean teacher;
    private int user_critical;
    private int user_praise;
    private VideoCoverBeanX video_cover;
    private String video_description;
    private int video_duration;
    private int video_id;
    private int video_price;
    private int video_rate;
    private int video_subject;
    private String video_subject_name;
    private String video_title;
    private int video_type;
    private int watcher_count;
    private int web_bad_praise;
    private int web_good_praise;
    private int web_mid_praise;
    private List<TagListBean> tagList;
    private List<?> video_download;

    public boolean isBought() {
        return bought;
    }

    public void setBought(boolean bought) {
        this.bought = bought;
    }

    public int getChat_room_id() {
        return chat_room_id;
    }

    public void setChat_room_id(int chat_room_id) {
        this.chat_room_id = chat_room_id;
    }

    public boolean isCollect() {
        return collect;
    }

    public void setCollect(boolean collect) {
        this.collect = collect;
    }

    public boolean isCriticaled() {
        return criticaled;
    }

    public void setCriticaled(boolean criticaled) {
        this.criticaled = criticaled;
    }

    public int getDiamond_price() {
        return diamond_price;
    }

    public void setDiamond_price(int diamond_price) {
        this.diamond_price = diamond_price;
    }

    public int getDownload_flag() {
        return download_flag;
    }

    public void setDownload_flag(int download_flag) {
        this.download_flag = download_flag;
    }

    public String getDownload_url() {
        return download_url;
    }

    public void setDownload_url(String download_url) {
        this.download_url = download_url;
    }

    public int getEncode_flag() {
        return encode_flag;
    }

    public void setEncode_flag(int encode_flag) {
        this.encode_flag = encode_flag;
    }

    public int getEnd_expiration_time() {
        return end_expiration_time;
    }

    public void setEnd_expiration_time(int end_expiration_time) {
        this.end_expiration_time = end_expiration_time;
    }

    public String getError_info() {
        return error_info;
    }

    public void setError_info(String error_info) {
        this.error_info = error_info;
    }

    public int getExpiration_time() {
        return expiration_time;
    }

    public void setExpiration_time(int expiration_time) {
        this.expiration_time = expiration_time;
    }

    public String getFlv_real_id() {
        return flv_real_id;
    }

    public void setFlv_real_id(String flv_real_id) {
        this.flv_real_id = flv_real_id;
    }

    public String getForward() {
        return forward;
    }

    public void setForward(String forward) {
        this.forward = forward;
    }

    public String getForward_note() {
        return forward_note;
    }

    public void setForward_note(String forward_note) {
        this.forward_note = forward_note;
    }

    public boolean isIs_best() {
        return is_best;
    }

    public void setIs_best(boolean is_best) {
        this.is_best = is_best;
    }

    public String getKnowledge_comment() {
        return knowledge_comment;
    }

    public void setKnowledge_comment(String knowledge_comment) {
        this.knowledge_comment = knowledge_comment;
    }

    public String getKnowledge_expect_comment() {
        return knowledge_expect_comment;
    }

    public void setKnowledge_expect_comment(String knowledge_expect_comment) {
        this.knowledge_expect_comment = knowledge_expect_comment;
    }

    public boolean isPraised() {
        return praised;
    }

    public void setPraised(boolean praised) {
        this.praised = praised;
    }

    public PreviewRedirectionBean getPreview_redirection() {
        return preview_redirection;
    }

    public void setPreview_redirection(PreviewRedirectionBean preview_redirection) {
        this.preview_redirection = preview_redirection;
    }

    public String getPreview_video_url() {
        return preview_video_url;
    }

    public void setPreview_video_url(String preview_video_url) {
        this.preview_video_url = preview_video_url;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public int getReal_diamond_price() {
        return real_diamond_price;
    }

    public void setReal_diamond_price(int real_diamond_price) {
        this.real_diamond_price = real_diamond_price;
    }

    public String getReal_video_id() {
        return real_video_id;
    }

    public void setReal_video_id(String real_video_id) {
        this.real_video_id = real_video_id;
    }

    public RecommendVideoBean getRecommend_video() {
        return recommend_video;
    }

    public void setRecommend_video(RecommendVideoBean recommend_video) {
        this.recommend_video = recommend_video;
    }

    public String getShare_url() {
        return share_url;
    }

    public void setShare_url(String share_url) {
        this.share_url = share_url;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public TeacherBean getTeacher() {
        return teacher;
    }

    public void setTeacher(TeacherBean teacher) {
        this.teacher = teacher;
    }

    public int getUser_critical() {
        return user_critical;
    }

    public void setUser_critical(int user_critical) {
        this.user_critical = user_critical;
    }

    public int getUser_praise() {
        return user_praise;
    }

    public void setUser_praise(int user_praise) {
        this.user_praise = user_praise;
    }

    public VideoCoverBeanX getVideo_cover() {
        return video_cover;
    }

    public void setVideo_cover(VideoCoverBeanX video_cover) {
        this.video_cover = video_cover;
    }

    public String getVideo_description() {
        return video_description;
    }

    public void setVideo_description(String video_description) {
        this.video_description = video_description;
    }

    public int getVideo_duration() {
        return video_duration;
    }

    public void setVideo_duration(int video_duration) {
        this.video_duration = video_duration;
    }

    public int getVideo_id() {
        return video_id;
    }

    public void setVideo_id(int video_id) {
        this.video_id = video_id;
    }

    public int getVideo_price() {
        return video_price;
    }

    public void setVideo_price(int video_price) {
        this.video_price = video_price;
    }

    public int getVideo_rate() {
        return video_rate;
    }

    public void setVideo_rate(int video_rate) {
        this.video_rate = video_rate;
    }

    public int getVideo_subject() {
        return video_subject;
    }

    public void setVideo_subject(int video_subject) {
        this.video_subject = video_subject;
    }

    public String getVideo_subject_name() {
        return video_subject_name;
    }

    public void setVideo_subject_name(String video_subject_name) {
        this.video_subject_name = video_subject_name;
    }

    public String getVideo_title() {
        return video_title;
    }

    public void setVideo_title(String video_title) {
        this.video_title = video_title;
    }

    public int getVideo_type() {
        return video_type;
    }

    public void setVideo_type(int video_type) {
        this.video_type = video_type;
    }

    public int getWatcher_count() {
        return watcher_count;
    }

    public void setWatcher_count(int watcher_count) {
        this.watcher_count = watcher_count;
    }

    public int getWeb_bad_praise() {
        return web_bad_praise;
    }

    public void setWeb_bad_praise(int web_bad_praise) {
        this.web_bad_praise = web_bad_praise;
    }

    public int getWeb_good_praise() {
        return web_good_praise;
    }

    public void setWeb_good_praise(int web_good_praise) {
        this.web_good_praise = web_good_praise;
    }

    public int getWeb_mid_praise() {
        return web_mid_praise;
    }

    public void setWeb_mid_praise(int web_mid_praise) {
        this.web_mid_praise = web_mid_praise;
    }

    public List<TagListBean> getTagList() {
        return tagList;
    }

    public void setTagList(List<TagListBean> tagList) {
        this.tagList = tagList;
    }

    public List<?> getVideo_download() {
        return video_download;
    }

    public void setVideo_download(List<?> video_download) {
        this.video_download = video_download;
    }

    public static class PreviewRedirectionBean {
        /**
         * forward : [{"name":"单节购买","url":"lexuegaokao://pay/buy"},{"name":"套卡购买","url":"http://www.lexue.com/n/index.html"}]
         * tip : 试看结束啦，购买即可观看完整版，套卡购买更超值哦
         */

        private String tip;
        private List<ForwardBean> forward;

        public String getTip() {
            return tip;
        }

        public void setTip(String tip) {
            this.tip = tip;
        }

        public List<ForwardBean> getForward() {
            return forward;
        }

        public void setForward(List<ForwardBean> forward) {
            this.forward = forward;
        }

        public static class ForwardBean {
            /**
             * name : 单节购买
             * url : lexuegaokao://pay/buy
             */

            private String name;
            private String url;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }
        }
    }

    public static class RecommendVideoBean {
        /**
         * diamond_price : 0
         * teacher_name : 俞锋
         * video_cover : {"height":412,"url":"https://esfile.lexue.com/file/T1qtJTBCYv1RCvBVdK.jpg","width":750}
         * video_id : 127
         * video_title : 有机高分子（上）
         */

        private String diamond_price;
        private String teacher_name;
        private VideoCoverBean video_cover;
        private int video_id;
        private String video_title;

        public String getDiamond_price() {
            return diamond_price;
        }

        public void setDiamond_price(String diamond_price) {
            this.diamond_price = diamond_price;
        }

        public String getTeacher_name() {
            return teacher_name;
        }

        public void setTeacher_name(String teacher_name) {
            this.teacher_name = teacher_name;
        }

        public VideoCoverBean getVideo_cover() {
            return video_cover;
        }

        public void setVideo_cover(VideoCoverBean video_cover) {
            this.video_cover = video_cover;
        }

        public int getVideo_id() {
            return video_id;
        }

        public void setVideo_id(int video_id) {
            this.video_id = video_id;
        }

        public String getVideo_title() {
            return video_title;
        }

        public void setVideo_title(String video_title) {
            this.video_title = video_title;
        }

        public static class VideoCoverBean {
            /**
             * height : 412
             * url : https://esfile.lexue.com/file/T1qtJTBCYv1RCvBVdK.jpg
             * width : 750
             */

            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }
    }

    public static class TeacherBean {
        /**
         * display_fans_count : 39537
         * followed : false
         * horoscope : 射手座
         * popularity : 2144895
         * teacher_area : 全国
         * teacher_description : 担任全球顶尖医药研究室产品主管长达7年之久，精研各类抗癌药物中间体合成。比“绝命毒师”更擅长工业提纯，比特级教师更谙熟高精理论。是罕见的拥有理论和实践双重能力的大师。
         俞锋老师的授课风格独树一帜。能够从学科的本源出发，一针见血、形象生动的阐释理论；能够从海量的题目中跳出，别出心裁、全面高效的总结题型规律，为学渣开路，为学霸领航！
         * teacher_icon : {"height":600,"url":"https://esfile.lexue.com/file/T10axTBQJT1RCvBVdK.jpg","width":600}
         * teacher_id : 13
         * teacher_name : 俞锋
         * teacher_sex : 0
         * teacher_subject : 2
         * video_count : 20
         * video_play_times : 459425
         */

        private int display_fans_count;
        private boolean followed;
        private String horoscope;
        private int popularity;
        private String teacher_area;
        private String teacher_description;
        private TeacherIconBean teacher_icon;
        private int teacher_id;
        private String teacher_name;
        private int teacher_sex;
        private int teacher_subject;
        private int video_count;
        private int video_play_times;

        public int getDisplay_fans_count() {
            return display_fans_count;
        }

        public void setDisplay_fans_count(int display_fans_count) {
            this.display_fans_count = display_fans_count;
        }

        public boolean isFollowed() {
            return followed;
        }

        public void setFollowed(boolean followed) {
            this.followed = followed;
        }

        public String getHoroscope() {
            return horoscope;
        }

        public void setHoroscope(String horoscope) {
            this.horoscope = horoscope;
        }

        public int getPopularity() {
            return popularity;
        }

        public void setPopularity(int popularity) {
            this.popularity = popularity;
        }

        public String getTeacher_area() {
            return teacher_area;
        }

        public void setTeacher_area(String teacher_area) {
            this.teacher_area = teacher_area;
        }

        public String getTeacher_description() {
            return teacher_description;
        }

        public void setTeacher_description(String teacher_description) {
            this.teacher_description = teacher_description;
        }

        public TeacherIconBean getTeacher_icon() {
            return teacher_icon;
        }

        public void setTeacher_icon(TeacherIconBean teacher_icon) {
            this.teacher_icon = teacher_icon;
        }

        public int getTeacher_id() {
            return teacher_id;
        }

        public void setTeacher_id(int teacher_id) {
            this.teacher_id = teacher_id;
        }

        public String getTeacher_name() {
            return teacher_name;
        }

        public void setTeacher_name(String teacher_name) {
            this.teacher_name = teacher_name;
        }

        public int getTeacher_sex() {
            return teacher_sex;
        }

        public void setTeacher_sex(int teacher_sex) {
            this.teacher_sex = teacher_sex;
        }

        public int getTeacher_subject() {
            return teacher_subject;
        }

        public void setTeacher_subject(int teacher_subject) {
            this.teacher_subject = teacher_subject;
        }

        public int getVideo_count() {
            return video_count;
        }

        public void setVideo_count(int video_count) {
            this.video_count = video_count;
        }

        public int getVideo_play_times() {
            return video_play_times;
        }

        public void setVideo_play_times(int video_play_times) {
            this.video_play_times = video_play_times;
        }

        public static class TeacherIconBean {
            /**
             * height : 600
             * url : https://esfile.lexue.com/file/T10axTBQJT1RCvBVdK.jpg
             * width : 600
             */

            private int height;
            private String url;
            private int width;

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }
        }
    }

    public static class VideoCoverBeanX {
        /**
         * height : 422
         * url : https://esfile.lexue.com/file/T1ZyZTByDT1RCvBVdK.jpg
         * width : 750
         */

        private int height;
        private String url;
        private int width;

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getWidth() {
            return width;
        }

        public void setWidth(int width) {
            this.width = width;
        }
    }

    public static class TagListBean {
        /**
         * is_stress : 0
         * tag_name : 精讲
         */

        private int is_stress;
        private String tag_name;

        public int getIs_stress() {
            return is_stress;
        }

        public void setIs_stress(int is_stress) {
            this.is_stress = is_stress;
        }

        public String getTag_name() {
            return tag_name;
        }

        public void setTag_name(String tag_name) {
            this.tag_name = tag_name;
        }
    }
}
