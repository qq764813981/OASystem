package dao.impl;

import dao.ResourceDao;
import entity.Resource;
import org.springframework.stereotype.Repository;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Repository("resourceDao")
public class ResourceDaoImpl extends BaseDaoImpl<Resource> implements ResourceDao {
}
