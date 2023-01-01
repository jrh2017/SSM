package com.jiang.ssm.service;

import com.github.pagehelper.PageInfo;
import com.jiang.ssm.pojo.Employee;

import java.util.List;

/**
 * @author jiangronghua
 */
public interface EmployeeService {

    /**
     * 查询所有的员工信息
     */
    List<Employee> getAllEmployee();

    /**
     * 获取员工到分页信息
     * @return
     */
    PageInfo<Employee> getEmployeePage(Integer pageNum);
}
