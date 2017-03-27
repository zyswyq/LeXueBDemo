package com.example.dllo.lexuebdemo.home.sujectbean;

import java.util.List;

/**
 * ✎﹏﹏﹏.₯㎕*﹏﹏﹏
 *
 *
 * 　　　　 ﹏﹏﹏♥♥刘延涛✍♥♥﹏﹏
 */
public class HomeFree {

    /**
     * comment_display : 1
     * comment_rate : 0.9767442
     * comments : [{"anonymous":false,"comment_content":"","comment_id":91425,"comment_time":1489989476,"grade":5,"replys":[],"user_gender":1,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1KRxTBjET1RCvBVdK.jpg","width":300},"user_id":29202,"user_name":"卡修","video_id":568},{"anonymous":false,"comment_content":"","comment_id":90005,"comment_time":1489766126,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":0,"url":"http://wx.qlogo.cn/mmopen/3GeXhEhaWzYb1UtZmnR1RyPLQsrFLqyL7FEdLPhg7peMcSuSPqO5AnsIyRKbamSSZ134fMkonuDX6P2PyUEedgXsfwr0Zrjq/0","width":0},"user_id":1622259,"user_name":"小小小小皓","video_id":568},{"anonymous":false,"comment_content":"哈哈哈哈哈原来当时的峰哥还这么一本正经   点赞点赞","comment_id":87125,"comment_time":1489244291,"grade":5,"replys":[],"user_gender":1,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1lyxTBjKv1RCvBVdK.jpg","width":300},"user_id":210205,"user_name":"张sir家小迷妹","video_id":568},{"anonymous":false,"comment_content":"不好\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u2026\u20262-","comment_id":79628,"comment_time":1488024282,"grade":1,"replys":[],"user_gender":0,"user_icon":{"height":200,"url":"https://esfile.lexue.com/file/T1eRJTBXYT1RCvBVdK.png","width":200},"user_id":129298,"user_name":"一直向前","video_id":568},{"anonymous":false,"comment_content":"讲得很好","comment_id":79563,"comment_time":1488019689,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":200,"url":"https://esfile.lexue.com/file/T1eRJTBXYT1RCvBVdK.png","width":200},"user_id":529804,"user_name":"逃离兮","video_id":568},{"anonymous":false,"comment_content":"政哥好暖","comment_id":79527,"comment_time":1488016977,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":300,"url":"http://esfile.lexue.com/file/T1ZyxTBCEj1RCvBVdK.jpg","width":300},"user_id":1815160,"user_name":"  吏部尚书","video_id":568},{"anonymous":false,"comment_content":"题干中会有信息如何成酯吧，还用记这些方法吗？","comment_id":78415,"comment_time":1487825985,"grade":5,"replys":[],"user_gender":1,"user_icon":{"height":200,"url":"https://esfile.lexue.com/file/T1eRJTBXYT1RCvBVdK.png","width":200},"user_id":1727159,"user_name":"小卢同学","video_id":568},{"anonymous":false,"comment_content":"西装锋","comment_id":76794,"comment_time":1487422040,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1etxTBy_v1RCvBVdK.jpg","width":300},"user_id":827147,"user_name":"帅出屎的小孟老师","video_id":568},{"anonymous":false,"comment_content":"相见恨晚","comment_id":76350,"comment_time":1487325894,"grade":5,"replys":[],"user_gender":0,"user_icon":{"height":200,"url":"https://esfile.lexue.com/file/T1eRJTBXYT1RCvBVdK.png","width":200},"user_id":29924,"user_name":"诗情梦战","video_id":568},{"anonymous":false,"comment_content":"希望有点讲义   讲的非常好 很满意  666","comment_id":73745,"comment_time":1486739873,"grade":5,"replys":[],"user_gender":1,"user_icon":{"height":300,"url":"https://esfile.lexue.com/file/T1VRxTBvY_1RCvBVdK.jpg","width":300},"user_id":1128285,"user_name":"筱玙","video_id":568}]
     * error_info :
     * status : 0
     * total : 86
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

    public void setComment_rate(double comment_rate) {
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
         * comment_id : 91425
         * comment_time : 1489989476
         * grade : 5
         * replys : []
         * user_gender : 1
         * user_icon : {"height":300,"url":"https://esfile.lexue.com/file/T1KRxTBjET1RCvBVdK.jpg","width":300}
         * user_id : 29202
         * user_name : 卡修
         * video_id : 568
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
             * height : 300
             * url : https://esfile.lexue.com/file/T1KRxTBjET1RCvBVdK.jpg
             * width : 300
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
