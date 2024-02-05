package com.example.demo.model;

import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private long id;
    private String text;
    private Integer likes = 0;
    private Date creationDate;

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

    public Post() {

    }

    public Post(Long id, String text, Date creationDate) {
        this.likes = 0;
        this.text = text;
        this.creationDate = creationDate;
    }

    public Post(long id, String text, Date creationDate) {
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
        this.likes = 0;
    }
}
