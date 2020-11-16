package Controller;

import java.util.List;

import Dto.Article;
import Service.ArticleService;

public class ArticleController {
	private ArticleService ArticleService;
	
	public ArticleController() {
		ArticleService = new ArticleService();
	}

	public void showList() {
		System.out.println("== 게시물 리스트 ==");
		List<Article> articles = ArticleService.showList();
		for (Article article : articles) {
		System.out.println(article.updateDate);
		}
	}
}
