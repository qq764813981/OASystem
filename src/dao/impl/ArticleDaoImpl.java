package dao.impl;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import dao.ArticleDao;
import entity.Article;
import org.hibernate.SessionFactory;
import org.hibernate.annotations.Parent;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Repository("articleDao")
public class ArticleDaoImpl extends BaseDaoImpl<Article> implements ArticleDao {
}
