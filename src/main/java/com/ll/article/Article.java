package com.ll.article;

import java.util.Map;

public class Article {
    private int id;
    private String subject;
    private String content;

    public Article(int id, String subject, String content) {
        this.id = id;
        this.subject = subject;
        this.content = content;
    }

    public Article(Map<String, Object>row){
        this.id = (int)row.get("id");
        this.subject = (String)row.get("subject");
        this.content = (String)row.get("content");
    }

    int getId() {
        return this.id;
    }

    String getSubject() {
        return this.subject;
    }

    String getContent() {
        return this.content;
    }
}