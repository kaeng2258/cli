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

    public int setid() {
        return id;
    }

    public String getsub() {
        return subject;
    }

    public String setsub() {
        return subject;
    }

    public String getcont() {
        return content;
    }

    public String setcont() {
        return content;
    }
}