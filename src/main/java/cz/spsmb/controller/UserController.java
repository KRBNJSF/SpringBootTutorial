package cz.spsmb.controller;

import cz.spsmb.entity.User;
import cz.spsmb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Toto je controller, ktery ma neco zpracovat behem requestu
@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public List<User> getAllUsers() {
        return userService.getAll();
        //Talend api tester
    }

    @RequestMapping(path = "/signup", method = RequestMethod.POST)
    public void saveUser(@RequestParam String name, @RequestParam String password) {
        userService.saveUser(name, password);
    }

    @RequestMapping(path = "/user/{userName}", method = RequestMethod.GET)
    public User getUserByName(@PathVariable String userName) {
        return this.userService.findUserByName(userName);
    }


}
