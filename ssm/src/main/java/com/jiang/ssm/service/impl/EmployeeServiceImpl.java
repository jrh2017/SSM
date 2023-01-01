package com.jiang.ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jiang.ssm.mapper.EmployeeMapper;
import com.jiang.ssm.pojo.Employee;
import com.jiang.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jiangronghua
 *
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAllEmployee() {
        return employeeMapper.getAllEmployee();
    }

    @Override
    public PageInfo<Employee> getEmployeePage(Integer pageNum) {
        // 开启分页功能
        PageHelper.startPage(pageNum, 4);
        // 查询所有到员工信息
        List<Employee> list = employeeMapper.getAllEmployee();

        PageInfo<Employee> page = new PageInfo<Employee>(list, 5);
        return page;
    }

}
