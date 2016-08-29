package dao.impl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import dao.ArticleDao;
import entity.Article;
import org.springframework.stereotype.Repository;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Repository("articleDao")
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {
}
