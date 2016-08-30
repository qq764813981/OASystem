package dao.impl;

import dao.ProjectDao;
import entity.Project;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Repository("projectDao")
public class ProjectDaoImpl extends BaseDaoImpl<Project> implements ProjectDao{
}
