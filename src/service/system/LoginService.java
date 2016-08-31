package service.system;

import org.springframework.stereotype.Service;

/**
 * Created by 嘉诚 on 2016/8/30.
 */

public interface LoginService {
    String findManagerId(String account, String password);
    //根据账号和密码查询管理员，并返回其Id
}
