package dao;

import entity.User;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
public interface UserDao extends BaseDao<User> {
    User findByAccount(String account);
}
