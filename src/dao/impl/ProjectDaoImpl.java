package dao.impl;

import dao.ProjectDao;
import entity.Project;
import org.springframework.stereotype.Repository;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Repository("projectDao")
public class ProjectDaoImpl extends BaseDaoImpl<Project> implements ProjectDao{
}
