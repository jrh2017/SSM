package com.jiang.spring.test;

import com.jiang.spring.pojo.HelloWorld;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangronghua
 */
public class HelloWorldTest {

    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloworld = (HelloWorld) ioc.getBean("helloworld");
        helloworld.sayHello();
    }
}
