package com.jiang.spring.service.impl;

import com.jiang.spring.dao.UserDao;
import com.jiang.spring.service.UserService;

/**
 * @author jiangronghua
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser() {
        userDao.saveUser();
    }
}
