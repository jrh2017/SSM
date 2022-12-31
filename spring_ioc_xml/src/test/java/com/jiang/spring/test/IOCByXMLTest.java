package com.jiang.spring.test;

import com.jiang.spring.pojo.Clazz;
import com.jiang.spring.pojo.Person;
import com.jiang.spring.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangronghua
 */
public class IOCByXMLTest {

    @Test
    public void testIOC() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        // Student studentOne = (Student) ioc.getBean("studentOne");
        // Student studentOne = (Student) ioc.getBean(Student.class);
        // Student studentOne = ioc.getBean("studentOne", Student.class);
        Person student = ioc.getBean(Person.class);
        System.out.println(student);
    }

    @Test
    public void testDI() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student student = ioc.getBean("studentSix", Student.class);
        System.out.println(student);
        // 无法获取内部bean
        // Clazz clazz = ioc.getBean("classInner", Clazz.class);
        // System.out.println(clazz);

        // Clazz clazz = ioc.getBean("clazzOne", Clazz.class);
        // System.out.println(clazz);
    }

    @Test
    public void testConstructor() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-ioc.xml");
        Student studentTwo = ioc.getBean("studentThree", Student.class);
        System.out.println(studentTwo);
    }
}
