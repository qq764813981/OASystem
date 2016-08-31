package dao.impl;

import dao.UserDao;
import entity.User;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
    @Override
    public User findByAccount(String account) {
        List<User> userList = find("from User em where em.account = ?1", account);
        if(userList.size() == 0) {
            //没有查询到
            System.out.println("not find");
            return null;
        }else{
            return userList.get(0);
        }
    }
}
