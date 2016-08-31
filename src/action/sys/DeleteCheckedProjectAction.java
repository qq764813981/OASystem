package action.sys;

import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.system.PrjService;

import javax.annotation.Resource;

/**
 * Created by 嘉诚 on 2016/8/31.
 */
@Controller
@Scope("prototype")
public class DeleteCheckedProjectAction extends ActionSupport {
    @Resource
    private PrjService prjService;

    private String[] checks;

    public String[] getChecks() {
        return checks;
    }

    public void setChecks(String[] checks) {
        this.checks = checks;
    }

    @Override
    public String execute() throws Exception {
        if(checks != null) {
            for (int i = 0; i < checks.length; ++i) {
                prjService.deleteFromId(checks[i]);
            }
        }
        return SUCCESS;
    }
}
