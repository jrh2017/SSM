package com.jiang.mybatis.test;

import com.jiang.mybatis.mapper.UserMapper;
import com.jiang.mybatis.pojo.User;
import com.jiang.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jiangronghua
 */
public class Parameter {

    @Test
    public void testGetUserByUsername() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User admin = mapper.getUserByUsername("root");
        System.out.println(admin);
    }

    @Test
    public void testCheckLogin() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root = mapper.checkLogin("root", "123456");
        System.out.println(root);
    }

    @Test
    public void testCheckLoginByMap() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("username", "root");
        map.put("password", "123456");
        User root = mapper.checkLoginByMap(map);
        System.out.println(root);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map<String, Object> map = new HashMap<String, Object>();
        User user = new User(null, "root", "123456", 33, "女", "123@qq.com");
        mapper.insertUser(user);
    }

    @Test
    public void testCheckLoginByParam() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User root = mapper.checkLoginByParam("root", "123456");
        System.out.println(root);
    }
}
