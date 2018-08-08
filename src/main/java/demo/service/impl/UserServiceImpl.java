package demo.service.impl;

import demo.dao.GenericDao;
import demo.service.UserService;
import demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

@Service
public class UserServiceImpl extends GenericServiceImpl<User, Integer> implements UserService {
    @Override
    @Autowired
    @Qualifier("userDaoImpl")
    public void setGenericDao(GenericDao<User, Integer> genericDao) {
        super.genericDao = genericDao;
    }

    @Override
    public boolean signUp(User user) {
        if (super.genericDao.queryOne("queryByUsername", user) != null) {
            return false;
        }
        super.genericDao.create(user);
        return true;
    }

    @Override
    public User signIn(User user) {
        String plainPassword = user.getPassword();
        user = super.genericDao.queryOne("queryByUsername", user);
        if (user != null) {
            String encryptedPassword = user.getPassword();
            if (DigestUtils.md5DigestAsHex(plainPassword.getBytes()).equals(encryptedPassword)) {
                return user;
            }
        }
        return null;
    }
}
