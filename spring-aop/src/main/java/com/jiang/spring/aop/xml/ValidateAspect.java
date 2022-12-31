package com.jiang.spring.aop.xml;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
@Component
public class ValidateAspect {
    public void beforeMethod() {
        System.out.println("ValidateAspect--->前置通知");
    }

}
