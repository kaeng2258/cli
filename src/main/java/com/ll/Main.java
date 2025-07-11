package com.ll;

import java.util.Scanner;

public class Main {
    static String name;
    static String text;
    static Scanner sc = new Scanner(System.in);
    static String command = sc.nextLine();
    public static void main(String[] args) {
        loof();
    }
    static void loof(){
        while(true){
            print();
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
        name = sc.nextLine();
        System.out.printf("내용 : ");
        text = sc.nextLine();
        loof();
    }
    static void insert_output(){
        System.out.println("제목 : " + name);
        System.out.println("내용 : " + text);
        loof();
    }
}

