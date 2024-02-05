package com.example.demo.model;

import java.util.Date;

public class Post {
    private final long id;
    private final String text;
    private Integer likes;
    private final Date creationDate;

    public long getPostId() {
        return id;
    }
    public String getText() {
        return text;
    }
    public Integer getLikes() {
        return likes;
    }
    public void setLikes(Integer likes) {
        this.likes = likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }

    public Post(long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }
}
