package service.system.impl;

import dao.ProjectDao;
import entity.Project;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.system.PrjService;

import javax.annotation.Resource;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * Created by 嘉诚 on 2016/8/31.
 */
@Service("prjService")
@Transactional
public class PrjServiceImpl implements PrjService {
    @Resource
    private ProjectDao projectDao;
    //dao

    @Resource
    private SimpleDateFormat simpleDateFormat;
    //时间转换器

    @Override
    public boolean save(String name, String requestDocument, String systemDocument, String deadline){
        //文件都为绝对路径
        Project project = new Project();
        try {
            project.setDeadline(simpleDateFormat.parse(deadline));
            //如果时间无法转化，返回false
        } catch (ParseException e) {
            e.printStackTrace();
            return false;
        }
        project.setName(name);
        project.setRequestDocument(requestDocument);
        project.setSystemDocument(systemDocument);
        project.setStart(new Date(System.currentTimeMillis()));
        projectDao.save(project);
        return true;
    }

    @Override
    public List<Project> getAllProject() {
        return projectDao.findAll();
    }

    @Override
    public boolean deleteFromId(String id) {
        Project project = projectDao.get(id);
        if(project != null){
            projectDao.delete(project);
            return true;
        }
        return false;
    }
}
