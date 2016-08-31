package action.sys;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by 嘉诚 on 2016/8/30.
 */
@Controller
@Scope("prototype")
public class SysAction extends ActionSupport{
    @Override
    public String execute() throws Exception {
        ActionContext actionContext = ActionContext.getContext();
        //如果session中oa_system_tag为1(管理员)则返回success
        Integer tag = (Integer) actionContext.getSession().get("tag");
        System.out.println(tag);
        if(tag == null || !tag .equals(1) ){
            return LOGIN;
        }
        return SUCCESS;
    }
}
