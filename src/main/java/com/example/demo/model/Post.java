package com.example.demo.model;

import java.util.Date;

public class Post {

    private final String text;
    private Integer likes;
    private Long id;
    private Date creationDate;

    public Post(Long id,String text,Date creationDate) {
        this.text = text;
        this.id = id;
        this.likes = 2;
        this.creationDate = creationDate;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public Long getId() {
        return id;
    }
    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }
    public Date getCreationDate() {
        return creationDate;
    }
}