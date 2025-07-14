package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class APP {
    Scanner sc = new Scanner(System.in);
    ArrayList<Article> articleList = new ArrayList<>();

    void loof() {
        while (true) {
            print();
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                close();
                break;
            } else if (command.equals("등록")) {
                insert();
                break;
            } else if (command.equals("출력")) {
                insert_output();
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
        System.out.println("종료/등록/출력");
        System.out.printf("입력칸 : ");
    }

    void close() {
        sc.close();
        System.exit(0);

    }

    void insert() {
        String subject;
        String content;
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
        for (int i = 0; i < articleList.size(); i++) {
            Article article = articleList.get(i);
            System.out.printf("%d번 게시물 제목: %s\t내용: %s\n", article.getid(), article.getsub(), article.getcont());
        }
        loof();
    }
}