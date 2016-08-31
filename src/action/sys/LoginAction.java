package action.sys;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.hibernate.Session;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.system.LoginService;

import javax.annotation.Resource;

/**
 * Created by 嘉诚 on 2016/8/30.
 */
@Controller
@Scope("prototype")
public class LoginAction extends ActionSupport{
    @Resource
    private LoginService loginService;

    private String account;
    private String password;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String execute() throws Exception {
        String userId = loginService.findManagerId(account,password);
        if(userId != null){
            //如果管理员登录成功
            ActionContext.getContext().getSession().put("userId",userId);
            ActionContext.getContext().getSession().put("tag",1);
            ActionContext.getContext().getSession().put("loginTip",null);
            //把其id放入session
            return SUCCESS;
        }
        ActionContext.getContext().getSession().put("loginTip","登录失败");
        return ERROR;
    }
}
