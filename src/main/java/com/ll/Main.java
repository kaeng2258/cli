package com.ll;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("====게시판앱====");
        System.out.println("1 입력시 프로그램 종료");
        Scanner sc = new Scanner(System.in);


        while(true){
            System.out.printf("명령)");
            String command = sc.nextLine();
            if (command.equals("종료")) {
                sc.close();
                System.exit(0);
            }
        }
    }
   public void close(){


    }
}
