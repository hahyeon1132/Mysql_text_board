package Dao;

import java.util.ArrayList;
import java.util.List;

import Dto.Article;

public class ArticleDao {
	List<Article> articles;
	int lastId;

	public ArticleDao() {
		articles = new ArrayList<>();
		lastId = 0;

	}

	public void write() {

	}

	public List<Article> showList() {
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

}
