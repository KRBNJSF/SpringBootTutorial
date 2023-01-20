package cz.spsmb.service;

import cz.spsmb.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    void saveUser(String name, String password);

    User findUserByName(String userName);

}
