package demo.dao.impl;

import demo.dao.UserDao;
import demo.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends GenericDaoImpl<User, Integer> implements UserDao {
}
