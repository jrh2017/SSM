package com.jiang.mybatis.test;

import com.jiang.mybatis.mapper.SpecialSQLMapper;
import com.jiang.mybatis.pojo.User;
import com.jiang.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author jiangronghua
 */
public class SepcicalSQLMapperTest {
    @Test
    public void testGetUserByLike() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserByLike("oo");
        list.forEach(System.out :: println);
    }


    @Test
    public void testDeleteMoreUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        mapper.deleteMoreUser("9,10");
    }

    @Test
    public void testGetUserList() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        List<User> list = mapper.getUserList("t_user");
        list.forEach(System.out :: println);
    }

    @Test
    public void testInsertUser() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SpecialSQLMapper mapper = sqlSession.getMapper(SpecialSQLMapper.class);
        User user = new User(null, "jiangronghua", "123", 35, "男", "690400878@qq.com");
        mapper.insertUser(user);
        System.out.println(user);
    }
}
