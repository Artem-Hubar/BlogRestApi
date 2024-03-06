package com.example.blogrestapi.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Date;
import java.time.LocalDateTime;

@Document(collection = "posts")
public class Post {

    @Id
    private String id;

    private String text;
    private String author;
    private LocalDateTime data;
    private boolean enable;

    // Constructors, getters, and setters
    // ...

    public Post() {
        // Default constructor
    }

    public Post(String text, String author, LocalDateTime data, boolean enable) {
        this.text = text;
        this.author = author;
        this.data = data;
        this.enable = enable;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}