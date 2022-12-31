package com.jiang.mybatis.mapper;

import com.jiang.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author jiangronghua
 */
public interface EmpMapper {

    Emp getEmpByEmpId(@Param("empId") Integer empId);

    /**
     * 获取员工及部门信息
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByEmpId(@Param("empId") Integer empId);

    /**
     * 通过分步查询查询员工以及对应的部门信息第一步
     * @param empId
     * @return
     */
    Emp getEmpAndDeptByStepOne(@Param("empId") Integer empId);

    List<Emp> getDeptAndEmpByStepTwo(@Param("deptId") Integer deptId);
}
