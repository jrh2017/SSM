package com.jiang.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
@Component
@Aspect
@Order(1)
public class ValidateAspect {

    @Pointcut("execution(* com.jiang.spring.aop.annotation.CalculatorImpl.*(..))")
    public void piontCut(){}

    @Before("piontCut()")
    public void beforeMethod() {
        System.out.println("ValidateAspect--->前置通知");
    }

}
