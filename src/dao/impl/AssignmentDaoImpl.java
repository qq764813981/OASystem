package dao.impl;

import dao.AssignmentDao;
import dao.BaseDao;
import entity.Assignment;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Repository("assignmentDao")
public class AssignmentDaoImpl extends BaseDaoImpl<Assignment> implements AssignmentDao {
}
