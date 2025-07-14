package com.ll;

public class Article {
    private int id;
    private String subject;
    private String content;

    Article(int id, String subject, String content) {
        this.id = id;
        this.subject = subject;
        this.content = content;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public String getsub() {
        return subject;
    }

    public void setsub(String subject) {
        this.subject = subject;
    }

    public String getcont() {
        return content;
    }

    public void setcont(String content) {
        this.content = content;
    }
}