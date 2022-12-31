package com.jiang.mybatis.test;

import com.jiang.mybatis.mapper.DynamicSQLMapper;
import com.jiang.mybatis.pojo.Emp;
import com.jiang.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jiangronghua
 */
public class DynamicMapperTest {

    @Test
    public void testGetEmpByCondition() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", 23, "");
        List<Emp> list = mapper.getEmpByCondition(emp);
        list.forEach(System.out :: println);
    }

    @Test
    public void testGetEmpByChoose() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", 23, "");
        List<Emp> list = mapper.getEmpByChoose(emp);
        list.forEach(System.out :: println);
    }

    @Test
    public void testInsertMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "小明1", 23, "男");
        Emp emp2 = new Emp(null, "小明2", 23, "男");
        Emp emp3 = new Emp(null, "小明3", 23, "男");
        List<Emp> emps = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(emps);
    }

    @Test
    public void testDeleteMoreEmp() {
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] empIds = new Integer[]{8,9};
        mapper.deleteMoreEmp(empIds);
    }
}
