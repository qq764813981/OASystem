package action.sys;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.Project;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.system.PrjService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 嘉诚 on 2016/8/31.
 */
@Controller
@Scope("prototype")
public class PrjManagerAction extends ActionSupport {
    @Resource
    PrjService prjService;
    @Override
    public String execute() throws Exception {
        List<Project> projectList = prjService.getAllProject();
        ActionContext.getContext().getSession().put("projectList",projectList);
        return SUCCESS;
    }
}
