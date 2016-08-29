package dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
public interface BaseDao<T> {
    void save(T entity);
    void delete(T entity);
    void delete(Serializable id);
    void update(T entity);
    T get(Serializable id);
    List<T> findAll();  // 查询所有
    int findCount();    //查询实体总数
}
