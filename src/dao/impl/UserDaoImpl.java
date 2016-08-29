package dao.impl;

import dao.UserDao;
import entity.User;
import org.springframework.stereotype.Repository;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{
}
