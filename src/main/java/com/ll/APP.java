package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class APP {
    Scanner sc = new Scanner(System.in);
    ArrayList<Article> articleList = new ArrayList<>();
    String command;
    String subject;
    String content;

    void loof() {
        while (true) {
            print();
            command = sc.nextLine().trim();
            if (command.equals("종료")) {
                close();
                break;
            } else if (command.equals("등록")) {
                insert();
                break;
            } else if (command.equals("출력")) {
                insert_output();
                break;
            } else if (command.startsWith("삭제")) {
                delete();
                break;
            } else if (command.startsWith("수정")) {
                select();
                break;
            } else {
                System.out.println("잘못입력하셨습니다.");
                continue;
            }
        }
    }

    void print() {
        System.out.println("====게시판앱====");
        System.out.println("명령어");
        System.out.println("종료/등록/출력/삭제?id=num/수정?id=num");
        System.out.printf("입력칸 : ");
    }

    void close() {
        sc.close();
        System.exit(0);

    }

    void insert() {
        System.out.printf("제목 : ");
        subject = sc.nextLine().trim();
        System.out.printf("내용 : ");
        content = sc.nextLine().trim();
        int id = articleList.size() + 1;
        articleList.add(new Article(id, subject, content));

        System.out.println("게시글이 등록되었습니다");

        loof();
    }

    void insert_output() {
        for (int i = articleList.size() - 1; i >= 0; i--) {
            Article article = articleList.get(i);
            System.out.printf("%d번 게시물 제목: %s\t내용: %s\n", article.getid(), article.getsub(), article.getcont());
        }
        loof();
    }

    void delete() {
        String[] commandlist = command.split("\\?", 2);
        String[] paramsStr = commandlist[1].split("=", 2);

        String value = paramsStr[1];
        int idx = Integer.parseInt(value);
        Article article = null;
        for (int i = 0; i < articleList.size(); i++) {
            if (articleList.get(i).getid() == idx) {
                article = articleList.get(i);
            }
            if (article == null) {
                System.out.printf("%d번 게시물은 존재하지않습니다\n", idx);
            } else {
                articleList.remove(article);
                System.out.printf("%d번 게시물이 삭제되었습니다\n", idx);
            }
        }
        loof();
    }

    void select() {
        String[] commandlist = command.split("\\?", 2);
        String[] paramsStr = commandlist[1].split("=", 2);

        String value = paramsStr[1];
        int idx = Integer.parseInt(value);
        Article article = null;

        for (Article item : articleList) {
            if (item.getid() == idx) {
                article = item;
            }
        }

        if (article == null) {
            System.out.printf("%d번 게시물은 존재하지않습니다\n", idx);
        } else {
            System.out.println("기존 제목 : " + article.getsub());
            System.out.printf("새 제목 입력 : ");
            subject = sc.nextLine().trim();
            System.out.println("기존 내용 : " + article.getcont());
            System.out.printf("새 내용 입력 : ");
            content = sc.nextLine().trim();
            article.setsub(subject);
            article.setcont(content);
            System.out.printf("%d번 게시물이 수정되었습니다\n", idx);
        }
        loof();
    }
}
