package com.ll;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String name;
    static String text;
    static Scanner sc = new Scanner(System.in);
    static ArrayList<String> textlist = new ArrayList<>();
    static ArrayList<String> namelist = new ArrayList<>();
    public static void main(String[] args) {
        loof();
    }
    static void loof(){
        while(true){
            print();
            String command = sc.nextLine().trim();
            if (command.equals("종료")) {
                close();
            }
            else if (command.equals("등록")){
                insert();
            }
            else if (command.equals("출력")){
                insert_output();
            }
            else{
                System.out.println("잘못입력하셨습니다.");
                continue;
            }
        }
    }
    static void print(){
        System.out.println("====게시판앱====");
        System.out.println("명령어");
        System.out.println("종료");
        System.out.println("등록");
        System.out.println("출력");
        System.out.printf("입력칸 : ");
    }
   static void close(){
       sc.close();
       System.exit(0);

    }
    static void insert(){
        System.out.printf("제목 : ");
        name = sc.nextLine().trim();
        namelist.add(name);
        System.out.printf("내용 : ");
        text = sc.nextLine().trim();
        textlist.add(text);
        System.out.println("게시글이 등록되었습니다");
        loof();
    }
    static void insert_output(){
        for (int i = 0; i < namelist.size(); i++) {
            System.out.println(i+1 + "번 게시물 제목 : " + namelist.get(i));
            System.out.println(i+1 + "번 게시물 내용 : " + textlist.get(i));
            }
        loof();
    }
}

