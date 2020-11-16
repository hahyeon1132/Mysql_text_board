package Service;

import java.util.List;

import Dao.ArticleDao;
import Dto.Article;

public class ArticleService {
	
	private ArticleDao ArticleDao;
	
	public ArticleService() {
		ArticleDao = new ArticleDao();
	}

	public List<Article> showList() {
		return ArticleDao.showList();
		
	}

}
