package com.jiang.spring.test;

import com.jiang.spring.aop.annotation.Calculator;
import com.jiang.spring.aop.annotation.CalculatorImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author jiangronghua
 */
public class AOPTest {
    
    @Test
    public void testAOPByAnnotation() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("aop-annotation.xml");
        Calculator calculator = ioc.getBean(Calculator.class);
        calculator.div(1, 1);
        // calculator.mul(1, 3);
        // calculator.sub(1, 3);
        // calculator.div(1, 3);
    }
}
