package dao.impl;

import dao.BaseDao;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

import javax.annotation.Resource;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Created by 嘉诚 on 2016/8/29.
 */
public class BaseDaoImpl<T> implements BaseDao<T>{
    private String className;
    private Class<T> clazz;

    public BaseDaoImpl(){
        Type type = this.getClass().getGenericSuperclass();
        //转换为参数化类型
        ParameterizedType pt = (ParameterizedType) type;
        //得到实际类型
        Type types[] = pt.getActualTypeArguments();
        clazz = (Class<T>) types[0];
        className = clazz.getSimpleName();
    }

    @Resource(name = "sessionFactory")
    private SessionFactory sessionFactory;


    @Override
    public void save(T entity) {
        sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public void delete(T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }

    @Override
    public void delete(Serializable id) {
        sessionFactory.getCurrentSession().createQuery("delete "+ className + " entity where entity.id = ?").setParameter("1",id).executeUpdate();
    }

    @Override
    public void update(T entity) {
        sessionFactory.getCurrentSession().update(entity);
    }

    @Override
    public T get(Serializable id) {
        return (T) sessionFactory.getCurrentSession().get(clazz,id);
    }

    @Override
    public List<T> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from " + className).list();
    }

    @Override
    public int findCount() {
        List<?> list = sessionFactory.getCurrentSession().createQuery("select count(*) from " + className).list();
        if(list != null && list.size() == 1){
            return (Integer) list.get(0);
        }
        return 0;
    }

    protected List<T> findByPage(String hql, int pageNo, int pageSize) {
        //不带参数的分页查询
        return sessionFactory.getCurrentSession().createQuery(hql)
                .setFirstResult((pageNo - 1) * pageSize).setMaxResults(pageSize)
                .list();
    }

    protected List<T> findByPage(String hql, int pageNo, int pageSize, Object... params) {
        //带参数的分页查询
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        for(int i = 1, len = params.length; i <= len; ++i){
            query.setParameter(i+"",params[i-1]);
        }
        return query.setFirstResult((pageNo - 1) * pageSize)
                .setMaxResults(pageSize)
                .list();
    }

    protected List<T> find(String hql){
        //hql查询
        return sessionFactory.getCurrentSession().createQuery(hql).list();
    }

    protected List<T> find(String hql, Object...params){
        //带参数的hql查询
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        for(int i = 1, len = params.length; i <= len; ++i){
            query.setParameter(i+"",params[i-1]);
        }
        return query.list();
    }

    protected void execute(String hql){
        //执行hql语句
        sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();
    }

    protected void execute(String hql, Object...params){
        //执行带参数的hql语句
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        for(int i = 1, len = params.length; i <= len; ++i){
            query.setParameter(i+"",params[i-1]);
        }
        query.executeUpdate();
    }
}
