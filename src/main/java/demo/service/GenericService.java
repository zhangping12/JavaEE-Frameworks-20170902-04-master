package demo.service;

import java.io.Serializable;
import java.util.List;

public interface GenericService<T extends Serializable, N extends Serializable> {

    void create(T t);

    T queryOne(String statement, Object parameter);

    List<T> queryList(String statement, Object parameter);

    T queryById(N id);

    void update(T t);

    void remove(N id);

    List<T> queryAll();

}
