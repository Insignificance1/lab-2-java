package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.io.Serializable;
@Entity
public class Post implements Serializable {

    @Column(nullable = false)
    private Integer likes;
    private String text;

    @Id
    @GeneratedValue
    private Long id;
    @Temporal(TemporalType.TIMESTAMP)
    @CreationTimestamp
    private Date creationDate;
    public Post() {
    }

    public Post(Long id,String text,Date creationDate) {
        this.text = text;
        this.id = id;
        this.likes = 0;
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