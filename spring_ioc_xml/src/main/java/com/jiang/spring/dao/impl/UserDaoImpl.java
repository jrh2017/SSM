package com.jiang.spring.dao.impl;

import com.jiang.spring.dao.UserDao;

/**
 * @author jiangronghua
 */
public class UserDaoImpl implements UserDao {
    @Override
    public void saveUser() {
        System.out.println("保存成功！");
    }
}
