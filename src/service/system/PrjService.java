package service.system;

import entity.Project;

import java.text.ParseException;
import java.util.List;

/**
 * Created by 嘉诚 on 2016/8/31.
 */
public interface PrjService {
    boolean save(String name,String requestDocument,String systemDocument,String deadline);
    List<Project> getAllProject();
    boolean deleteFromId(String id);
}
