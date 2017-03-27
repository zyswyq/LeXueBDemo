package com.example.dllo.lexuebdemo.teacher.sql;

import com.litesuits.orm.db.annotation.PrimaryKey;
import com.litesuits.orm.db.annotation.Table;
import com.litesuits.orm.db.enums.AssignType;

/*
    by Mr.L
    data 2017-03-18
    desc 描述
*/
@Table("Course")
public class CourseBean {
    @PrimaryKey(AssignType.AUTO_INCREMENT)
    private int id;

    private int movieId;
    private boolean isCollected;

    public CourseBean(int movieId, boolean isCollected) {
        this.movieId = movieId;
        this.isCollected = isCollected;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public boolean isCollected() {
        return isCollected;
    }

    public void setCollected(boolean collected) {
        isCollected = collected;
    }
}
