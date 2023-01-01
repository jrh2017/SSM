package com.jiang.ssm.mapper;

import com.jiang.ssm.pojo.Employee;

import java.util.List;

/**
 * @author jiangronghua
 */
public interface EmployeeMapper {

    /**
     * 查询所有的员工信息
     * @return
     */
    List<Employee> getAllEmployee();
}
