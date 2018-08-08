package demo.service;

import demo.model.User;

public interface UserService extends GenericService<User, Integer> {

    boolean signUp(User user);

    User signIn(User user);
}
