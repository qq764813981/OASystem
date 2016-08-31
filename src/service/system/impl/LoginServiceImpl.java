package service.system.impl;

import dao.UserDao;
import entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.system.LoginService;

import javax.annotation.Resource;

/**
 * Created by 嘉诚 on 2016/8/30.
 */
@Service("loginService")
@Transactional
public class LoginServiceImpl implements LoginService {
    @Resource
    private UserDao userDao;

    @Override
    public String findManagerId(String account, String password) {
        User user = userDao.findByAccount(account);
        if(user == null || !user.getPassword().equals(password) || !(user.getTag()==1)){
            //null，密码不符，不为管理员，返回的ManagerId都为null
            return null;
        }
        return user.getId();
    }
}
