package Main;

import java.util.Scanner;

import Container.Container;
import Controller.ArticleController;

public class App {
	Scanner sc;
	private ArticleController ArticleController;
	
	
	public App() {
		sc = Container.scanner;
		ArticleController = new ArticleController();
		
	}
	public void run() {
		while (true) {
			System.out.println("명령어 : ");
			String command = sc.nextLine();
			
			if(command.equals("article list")) {
				ArticleController.showList();
				
			}else if(command.equals("system exit")) {
				System.out.println("== 시스템 종료 ==");
				break;
			}
		}
		
		
	}

}
