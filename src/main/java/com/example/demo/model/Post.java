package com.example.demo.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import java.io.Serializable;
@Entity
public class Post implements Serializable {

    private Integer likes;
    private String text;

    @Id
    @GeneratedValue
    private Long id;
    private Date creationDate;
    public Post() {
    }

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