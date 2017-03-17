package com.example.dllo.lexuebdemo.teacher.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/*
    by Mr.L
    data 2017-03-11
    desc 描述
*/
public class TeacherTagBean implements Parcelable{
    /**
     * error_info :
     * status : 0
     * subject_total : 15
     * subjects : [{"alive":1,"priority":1,"teacher_subject_id":5000,"teacher_subject_name":"推荐"},{"alive":1,"priority":3,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1yaJTB_Yv1RCvBVdK.png","width":135},"teacher_subject_id":1,"teacher_subject_name":"数学"},{"alive":1,"priority":3,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1TtJTBghv1RCvBVdK.png","width":135},"teacher_subject_id":5,"teacher_subject_name":"语文"},{"alive":1,"priority":4,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1yRJTBgxv1RCvBVdK.png","width":135},"teacher_subject_id":2,"teacher_subject_name":"化学"},{"alive":1,"priority":5,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1XtJTBjxv1RCvBVdK.png","width":135},"teacher_subject_id":3,"teacher_subject_name":"物理"},{"alive":1,"priority":6,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1FyhTBsET1RCvBVdK.png","width":135},"teacher_subject_id":4,"teacher_subject_name":"生物"},{"alive":1,"priority":7,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1hthTBvCv1RCvBVdK.png","width":135},"teacher_subject_id":6,"teacher_subject_name":"英语"},{"alive":1,"priority":8,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1PthTByY_1RCvBVdK.png","width":135},"teacher_subject_id":102,"teacher_subject_name":"历史"},{"alive":1,"priority":7,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1qahTBbJv1RCvBVdK.png","width":135},"teacher_subject_id":103,"teacher_subject_name":"政治"},{"alive":1,"priority":10,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1qRhTBs_v1RCvBVdK.png","width":135},"teacher_subject_id":104,"teacher_subject_name":"地理"},{"alive":1,"priority":12,"subject_icon":{"height":135,"url":"https://esfile.lexue.com/file/T1VahTBbYv1RCvBVdK.png","width":135},"teacher_subject_id":11,"teacher_subject_name":"志愿"},{"alive":1,"priority":124,"teacher_subject_id":302,"teacher_subject_name":"政策面试"},{"alive":1,"priority":125,"teacher_subject_id":303,"teacher_subject_name":"自招物理"},{"alive":1,"priority":126,"teacher_subject_id":301,"teacher_subject_name":"自招数学"},{"alive":1,"priority":0,"teacher_subject_id":100,"teacher_subject_name":"综合"}]
     */

    private String error_info;
    private int status;
    private int subject_total;
    private List<SubjectsBean> subjects;

    protected TeacherTagBean(Parcel in) {
        error_info = in.readString();
        status = in.readInt();
        subject_total = in.readInt();
        subjects = in.createTypedArrayList(SubjectsBean.CREATOR);
    }

    public static final Creator<TeacherTagBean> CREATOR = new Creator<TeacherTagBean>() {
        @Override
        public TeacherTagBean createFromParcel(Parcel in) {
            return new TeacherTagBean(in);
        }

        @Override
        public TeacherTagBean[] newArray(int size) {
            return new TeacherTagBean[size];
        }
    };

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

    public int getSubject_total() {
        return subject_total;
    }

    public void setSubject_total(int subject_total) {
        this.subject_total = subject_total;
    }

    public List<SubjectsBean> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<SubjectsBean> subjects) {
        this.subjects = subjects;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(error_info);
        dest.writeInt(status);
        dest.writeInt(subject_total);
        dest.writeTypedList(subjects);
    }

    public static class SubjectsBean implements Parcelable{
        /**
         * alive : 1
         * priority : 1
         * teacher_subject_id : 5000
         * teacher_subject_name : 推荐
         * subject_icon : {"height":135,"url":"https://esfile.lexue.com/file/T1yaJTB_Yv1RCvBVdK.png","width":135}
         */

        private int alive;
        private int priority;
        private int teacher_subject_id;
        private String teacher_subject_name;
        private SubjectIconBean subject_icon;

        protected SubjectsBean(Parcel in) {
            alive = in.readInt();
            priority = in.readInt();
            teacher_subject_id = in.readInt();
            teacher_subject_name = in.readString();
            subject_icon = in.readParcelable(SubjectIconBean.class.getClassLoader());
        }

        public static final Creator<SubjectsBean> CREATOR = new Creator<SubjectsBean>() {
            @Override
            public SubjectsBean createFromParcel(Parcel in) {
                return new SubjectsBean(in);
            }

            @Override
            public SubjectsBean[] newArray(int size) {
                return new SubjectsBean[size];
            }
        };

        public int getAlive() {
            return alive;
        }

        public void setAlive(int alive) {
            this.alive = alive;
        }

        public int getPriority() {
            return priority;
        }

        public void setPriority(int priority) {
            this.priority = priority;
        }

        public int getTeacher_subject_id() {
            return teacher_subject_id;
        }

        public void setTeacher_subject_id(int teacher_subject_id) {
            this.teacher_subject_id = teacher_subject_id;
        }

        public String getTeacher_subject_name() {
            return teacher_subject_name;
        }

        public void setTeacher_subject_name(String teacher_subject_name) {
            this.teacher_subject_name = teacher_subject_name;
        }

        public SubjectIconBean getSubject_icon() {
            return subject_icon;
        }

        public void setSubject_icon(SubjectIconBean subject_icon) {
            this.subject_icon = subject_icon;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(alive);
            dest.writeInt(priority);
            dest.writeInt(teacher_subject_id);
            dest.writeString(teacher_subject_name);
            dest.writeParcelable(subject_icon, flags);
        }

        public static class SubjectIconBean implements Parcelable{
            /**
             * height : 135
             * url : https://esfile.lexue.com/file/T1yaJTB_Yv1RCvBVdK.png
             * width : 135
             */

            private int height;
            private String url;
            private int width;

            protected SubjectIconBean(Parcel in) {
                height = in.readInt();
                url = in.readString();
                width = in.readInt();
            }

            public static final Creator<SubjectIconBean> CREATOR = new Creator<SubjectIconBean>() {
                @Override
                public SubjectIconBean createFromParcel(Parcel in) {
                    return new SubjectIconBean(in);
                }

                @Override
                public SubjectIconBean[] newArray(int size) {
                    return new SubjectIconBean[size];
                }
            };

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

            @Override
            public int describeContents() {
                return 0;
            }

            @Override
            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(height);
                dest.writeString(url);
                dest.writeInt(width);
            }
        }
    }
}
