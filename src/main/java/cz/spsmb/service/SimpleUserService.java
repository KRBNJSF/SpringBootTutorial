package cz.spsmb.service;

import cz.spsmb.entity.User;
import cz.spsmb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
public class SimpleUserService implements UserService {

    private final UserRepository userRepository;

    @Autowired
    public SimpleUserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAll() {
        List<User> users = new LinkedList<>();
        for (User user : this.userRepository.findAll()) {
            users.add(user);
        }
        return users;
    }

    @Override
    public void saveUser(String name, String password) {
        this.userRepository.save(User.builder().name(name).password(password).build());
    }

    @Override
    public User findUserByName(String name) {
        return this.userRepository.findByName(name);
    }

}


