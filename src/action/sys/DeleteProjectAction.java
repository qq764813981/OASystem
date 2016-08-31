package action.sys;

import com.opensymphony.xwork2.ActionSupport;
import dao.ProjectDao;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.system.PrjService;

import javax.annotation.Resource;

/**
 * Created by 嘉诚 on 2016/8/31.
 */
@Controller
@Scope("prototype")
public class DeleteProjectAction extends ActionSupport {
    @Resource
    private PrjService prjService;

    private String deleteId;

    public String getDeleteId() {
        return deleteId;
    }

    public void setDeleteId(String deleteId) {
        this.deleteId = deleteId;
    }

    @Override
    public String execute() throws Exception {
        System.out.println(deleteId);
        if(prjService.deleteFromId(deleteId)){
            return SUCCESS;
        }
        return ERROR;
    }
}
