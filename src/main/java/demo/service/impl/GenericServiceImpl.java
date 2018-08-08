package demo.service.impl;

import demo.dao.GenericDao;
import demo.service.GenericService;

import java.io.Serializable;
import java.util.List;

public abstract class GenericServiceImpl<T extends Serializable, N extends Serializable> implements GenericService<T, N> {

    GenericDao<T, N> genericDao;

    public abstract void setGenericDao(GenericDao<T, N> genericDao);

    @Override
    public void create(T t) {
        genericDao.create(t);
    }

    @Override
    public T queryOne(String statement, Object parameter) {
        return genericDao.queryOne(statement, parameter);
    }

    @Override
    public List<T> queryList(String statement, Object parameter) {
        return genericDao.queryList(statement, parameter);
    }

    @Override
    public T queryById(N id) {
        return genericDao.queryById(id);
    }

    @Override
    public void remove(N id) {
        genericDao.remove(id);
    }

    @Override
    public void update(T t) {
        genericDao.update(t);
    }

    @Override
    public List<T> queryAll() {
        return genericDao.queryAll();
    }
}
