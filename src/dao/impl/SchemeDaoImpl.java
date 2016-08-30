package dao.impl;

import dao.SchemeDao;
import entity.Scheme;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Repository("schemeDao")
public class SchemeDaoImpl extends BaseDaoImpl<Scheme> implements SchemeDao {
}
