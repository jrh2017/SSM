package com.jiang.mybatis.mapper;

import com.jiang.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author jiangronghua
 */
public interface DynamicSQLMapper {

    List<Emp> getEmpByCondition(Emp emp);

    List<Emp> getEmpByChoose(Emp emp);

    void insertMoreEmp(@Param("emps") List<Emp> emps);

    void deleteMoreEmp(@Param("empIds") Integer[] empIds);
}
