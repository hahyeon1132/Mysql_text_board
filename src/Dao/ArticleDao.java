package Dao;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dto.Article;

public class ArticleDao {
	List<Article> articles;
	int lastId;
	public List<Article> getarticle() {
		
		articles = new ArrayList<>();
		lastId = 0;
		
		Article article = new Article();

		article.id = 1;
		article.memberid = 1;
		article.boardid = 1;
		article.title = "제목1";
		article.body = "내용1";
		article.regDate = "2020-12-12";
		article.updateDate = "2020-13-13";

		articles.add(article);
		
		article = new Article();
		article.id = 2;
		article.memberid = 2;
		article.boardid = 2;
		article.title = "제목2";
		article.body = "내용2";
		article.regDate = "2020-12-13";
		article.updateDate = "2020-13-14";

		articles.add(article);

		return articles;
		

	}

	public void write() {

	}

	public List<Article> showList() {
		
		try {
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/TextBoard");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return articles;
	}

}
