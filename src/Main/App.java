package Main;

import java.util.Scanner;

import Container.Container;

public class App {
	Scanner sc;
	
	public App() {
		sc = Container.scanner;
		
	}
	public void run() {
		while (true) {
			System.out.println("명령어 : ");
			String command = sc.nextLine();
			
			if(command.equals("article list")) {
				System.out.println("== 게시물 리스트 ==");
			}else if(command.equals("system exit")) {
				System.out.println("== 시스템 종료 ==");
				break;
			}
		}
		
		
	}

}
