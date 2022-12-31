package com.jiang.spring.test;

import com.jiang.spring.controller.UserController;
import com.jiang.spring.dao.UserDao;
import com.jiang.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangronghua
 */
public class IOCByAnnotationTest {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc-annotation.xml");
        UserController userController = ioc.getBean("controller", UserController.class);
        // System.out.println(userController);
        // UserService userService = ioc.getBean("userServiceImpl", UserService.class);
        // System.out.println(userService);
        // UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
        // System.out.println(userDao);
        userController.saveUser();
    }
}
