package action.sys;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by 嘉诚 on 2016/8/31.
 */
@Controller
@Scope("prototype")
public class LogoutAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //登出操作，把session中的userId和tag置为null
        ActionContext.getContext().getSession().put("userId",null);
        ActionContext.getContext().getSession().put("tag",null);
        return LOGIN;
    }
}
