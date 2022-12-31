package com.jiang.mybatis.mapper;

import com.jiang.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author jiangronghua
 */
public interface UserMapper {

    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    User getUserByUsername(String username);

    /**
     * 验证登录
     * @param username
     * @param password
     * @return
     */
    User checkLogin(String username, String password);

    User checkLoginByMap(Map<String, Object> map);

    /**
     * 添加用户对象
     * @param user
     */
    void insertUser(User user);

    User checkLoginByParam(@Param("username") String username, @Param("password") String password);
}
