package com.jiang.mybatis.mapper;

import com.jiang.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiangronghua
 */
public interface CacheMapper {

    Emp getEmpById(@Param("empId") Integer empId);

    void insertEmp(Emp emp);
}
