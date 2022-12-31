package com.jiang.spring.controller;

import com.jiang.spring.service.UserService;
import com.jiang.spring.service.impl.UserServiceImpl;

/**
 * @author jiangronghua
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser() {
        userService.saveUser();
    }
}
