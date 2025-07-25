package com.ll;

import com.ll.article.ArticleController;
import com.ll.db.DBConnection;
import com.ll.system.SystemController;

public class App {
    ArticleController articleController;
    SystemController systemController;

    App() {
        DBConnection.DB_NAME = "proj1";
        DBConnection.DB_PORT = 3306;
        DBConnection.DB_USER = "root";
        DBConnection.DB_PASSWORD = "";

        Container.getDBConnection().connect();

        articleController = new ArticleController();
        systemController = new SystemController();
    }

    public void run() {
        System.out.println("== 게시판 앱 ==");

        while (true) {
            System.out.println("등록/목록/삭제?id=num/수정?id=num/종료");
            System.out.print("명령) ");
            String command = Container.getSc().nextLine().trim();
            Request request = new Request(command);
            if (request.getActionCode().equals("종료")) {
                systemController.exit();
                break;
            } else if (request.getActionCode().equals("등록")) {
                articleController.write();
            } else if (request.getActionCode().equals("목록")) {
                articleController.list();
            } else if (request.getActionCode().startsWith("삭제")) {
                articleController.delete(request);
            } else if (request.getActionCode().startsWith("수정")) {
                articleController.modify(request);
            }
            else{
                System.out.println("잘못입력하셨습니다.");
                continue;
            }
        }
    }
}