package com.example.dllo.lexuebdemo.teacher.model;

import java.util.List;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class CommentBean {
    /**
     * comment_display : 1
     * comment_rate : 1
     * comments : [{"anonymous":false,"comment_content":"","comment_id":87489,"comment_time":1489295211,"grade":5,"replys":[],"user_gender":2,"user_icon":{"height":0,"url":"https://esfile.lexue.com/file/T1PRxTBvYT1RCvBVdK.jpg","width":0},"user_id":1124319,"user_name":"ninelie","video_id":127},{"anonymous":false,"comment_content":"很有意思的","comment_id":87418,"comment_time":1489289643,"grade":5,"replys":[],"user_gender":1,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1mRxTBgLT1RCvBVdK.jpg","width":300},"user_id":928292,"user_name":"忆锦凉","video_id":127},{"anonymous":false,"comment_content":"棒棒哒，而且很有趣","comment_id":86388,"comment_time":1489158487,"grade":5,"replys":[],"user_gender":1,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1qaxTBQZv1RCvBVdK.jpg","width":300},"user_id":629567,"user_name":"棒棒糖2333","video_id":127},{"anonymous":false,"comment_content":"不错","comment_id":85991,"comment_time":1489108092,"grade":5,"replys":[],"user_gender":1,"user_icon":{"height":300,"url":"http://esfile.lexue.com/file/T18axTBCD_1RCvBVdK.jpg","width":300},"user_id":826353,"user_name":"smile501","video_id":127},{"anonymous":false,"comment_content":"罕见全好评","comment_id":85622,"comment_time":1489052497,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1ytxTBjET1RCvBVdK.jpg","width":300},"user_id":328540,"user_name":"MGSTPP","video_id":127},{"anonymous":false,"comment_content":"罕见的全好评","comment_id":84337,"comment_time":1488779162,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1VtxTB4K_1RCvBVdK.jpg","width":300},"user_id":110282,"user_name":"武大三初","video_id":127},{"anonymous":false,"comment_content":"挺好","comment_id":82979,"comment_time":1488609257,"grade":5,"replys":[],"user_gender":1,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1etxTB4Jv1RCvBVdK.jpg","width":300},"user_id":929058,"user_name":"k嘉灵au","video_id":127},{"anonymous":false,"comment_content":"太强了，我平常记流程题都是老师讲一点写一点而且不懂原理，这样一通百通！赞","comment_id":81086,"comment_time":1488211025,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":300,"url":"http://esfile.lexue.com/file/T1FaxTBTYg1RCvBVdK.jpg","width":300},"user_id":724197,"user_name":"纳兹","video_id":127},{"anonymous":false,"comment_content":"好","comment_id":79740,"comment_time":1488028040,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1aRhTB7Zv1RCvBVdK.jpg","width":300},"user_id":806862,"user_name":"从未止步~","video_id":127},{"anonymous":false,"comment_content":"(๑\u2022 . \u2022๑)","comment_id":77563,"comment_time":1487583428,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":300,"url":"http://esfile.lexue.com/file/T1GaxTBXET1RCvBVdK.jpg","width":300},"user_id":1914392,"user_name":"数学组大弟子小伍","video_id":127}]
     * error_info :
     * status : 0
     * total : 67
     */

    private int comment_display;
    private double comment_rate;
    private String error_info;
    private int status;
    private int total;
    private List<CommentsBean> comments;

    public int getComment_display() {
        return comment_display;
    }

    public void setComment_display(int comment_display) {
        this.comment_display = comment_display;
    }

    public double getComment_rate() {
        return comment_rate;
    }
    public void setComment_rate(double comment_rate){
        this.comment_rate = comment_rate;
    }


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

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<CommentsBean> getComments() {
        return comments;
    }

    public void setComments(List<CommentsBean> comments) {
        this.comments = comments;
    }

    public static class CommentsBean {
        /**
         * anonymous : false
         * comment_content :
         * comment_id : 87489
         * comment_time : 1489295211
         * grade : 5
         * replys : []
         * user_gender : 2
         * user_icon : {"height":0,"url":"https://esfile.lexue.com/file/T1PRxTBvYT1RCvBVdK.jpg","width":0}
         * user_id : 1124319
         * user_name : ninelie
         * video_id : 127
         */

        private boolean anonymous;
        private String comment_content;
        private int comment_id;
        private int comment_time;
        private int grade;
        private int user_gender;
        private UserIconBean user_icon;
        private int user_id;
        private String user_name;
        private int video_id;
        private List<?> replys;

        public boolean isAnonymous() {
            return anonymous;
        }

        public void setAnonymous(boolean anonymous) {
            this.anonymous = anonymous;
        }

        public String getComment_content() {
            return comment_content;
        }

        public void setComment_content(String comment_content) {
            this.comment_content = comment_content;
        }

        public int getComment_id() {
            return comment_id;
        }

        public void setComment_id(int comment_id) {
            this.comment_id = comment_id;
        }

        public int getComment_time() {
            return comment_time;
        }

        public void setComment_time(int comment_time) {
            this.comment_time = comment_time;
        }

        public int getGrade() {
            return grade;
        }

        public void setGrade(int grade) {
            this.grade = grade;
        }

        public int getUser_gender() {
            return user_gender;
        }

        public void setUser_gender(int user_gender) {
            this.user_gender = user_gender;
        }

        public UserIconBean getUser_icon() {
            return user_icon;
        }

        public void setUser_icon(UserIconBean user_icon) {
            this.user_icon = user_icon;
        }

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }

        public String getUser_name() {
            return user_name;
        }

        public void setUser_name(String user_name) {
            this.user_name = user_name;
        }

        public int getVideo_id() {
            return video_id;
        }

        public void setVideo_id(int video_id) {
            this.video_id = video_id;
        }

        public List<?> getReplys() {
            return replys;
        }

        public void setReplys(List<?> replys) {
            this.replys = replys;
        }

        public static class UserIconBean {
            /**
             * height : 0
             * url : https://esfile.lexue.com/file/T1PRxTBvYT1RCvBVdK.jpg
             * width : 0
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
}
