package com.jiang.mybatis.test;

import com.jiang.mybatis.mapper.EmpMapper;
import com.jiang.mybatis.pojo.Emp;
import com.jiang.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

/**
 * @author jiangronghua
 */
public class MBGTest {
    @Test
    public void testMBG() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        Emp emp = mapper.selectByPrimaryKey(1);
        System.out.println(emp);
    }
}
