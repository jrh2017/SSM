package com.jiang.mybatis.mapper;

import com.jiang.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

/**
 * @author jiangronghua
 */
public interface DeptMapper {
    /**
     * 通过分步查询查询员工以及对应的部门信息第二步
     * @param deptId
     * @return
     */
    Dept getEmpAndDeptByStepTwo(@Param("deptId") Integer deptId);

    /**
     * 查询部门以及部门中员工信息
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpByDeptId(@Param("deptId") Integer deptId);

    /**
     * 通过分步查询部门以及部门中的员工信息的第一步
     * @param deptId
     * @return
     */
    Dept getDeptAndEmpBySetpOne(@Param("deptId") Integer deptId);
}
