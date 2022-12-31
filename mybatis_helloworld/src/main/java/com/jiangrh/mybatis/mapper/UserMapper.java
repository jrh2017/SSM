package com.jiangrh.mybatis.mapper;

import com.jiangrh.mybatis.pojo.User;

import java.util.List;

/**
 * @author jiangronghua
 */
public interface UserMapper {


    int insertUser();

    void updateUser();

    /**
     * 删除用户
     */
    void deleteUser();

    /**
     * 根据用户id查询用户信息
     * @return
     */
    User getUserById();

    List<User> getAllUser();
}
