package com.jiang.controller;

import com.jiang.dao.EmployeeDao;
import com.jiang.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * @author jiangronghua
 *
 *  查询所有的员工信息 ---> /employee -->get
 *  跳转到添加页面 ---> /to/add -->get
 *  新增员工信息 ---> /employee -->post
 *  跳转到修改页面 ---> /employee/1 -->get
 *  修改员工信息 ---> /employee -->put
 *  删除员工信息 ---> /employee/1 -->delete
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public String getAllEmployee(Model model) {
        // 获取所有到员工信息
        Collection<Employee> allEmployee = employeeDao.getAll();
        model.addAttribute("allEmployee", allEmployee);
        return "employee_list";
    }

    @RequestMapping(value = "employee", method = RequestMethod.POST)
    public String addEmployee(Employee employee) {
        // 保存员工信息
        employeeDao.save(employee);
        // 重定向到列表功能
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.GET)
    public String toUpdate(@PathVariable("id") Integer id, Model model) {
        // 根据id查询员工信息
        Employee employee = employeeDao.get(id);
        // 将员工信息共享到请求域中
        model.addAttribute("employee", employee);
        // 跳转到employee_update.html
        return "employee_update";
    }

    @RequestMapping(value = "/employee", method = RequestMethod.PUT)
    public String updateEmployee(Employee employee) {
        // 保存员工信息
        employeeDao.save(employee);
        // 重定向到列表功能
        return "redirect:/employee";
    }

    @RequestMapping(value = "/employee/{id}", method = RequestMethod.DELETE)
    public String deleteEmployee(@PathVariable("id") Integer id) {
        employeeDao.delete(id);
        return "redirect:/employee";
    }
}
