package com.jiang.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author jiangronghua
 * 在切面中，需要通过制定的注解将方法标识为通知注解
 * @Before：前置通知，在目标对象方法执行之前执行
 */
@Component
public class LoggerAspect {
    public void beforeAdviceMethod(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        System.out.println("LoggerAspect, 方法：" + signature.getName() + ", 参数：" + Arrays.toString(args));
    }

    public void afterAdviceMethod(JoinPoint joinPoint) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法：" + signature.getName() + ", 执行完毕");
    }

    public void afterReturnAdviceMethod(JoinPoint joinPoint, Object result) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法：" + signature.getName() + ", 结果：" + result);
    }

    public void afterThrowingAdviceMethod(JoinPoint joinPoint, Throwable ex) {
        Signature signature = joinPoint.getSignature();
        System.out.println("LoggerAspect, 方法："+ signature.getName() + ", 异常：" + ex);
    }

    @Around("pointCut()")
    public Object aroundAdviceMethod(ProceedingJoinPoint joinPoint) {
        Object result = null;
        try {
            System.out.println("环绕通知---->前置通知");
            result = joinPoint.proceed();
            System.out.println("环绕通知---->返回通知");
        } catch  (Throwable e) {
            e.printStackTrace();
            System.out.println("环绕通知---->异常通知");
        } finally {
            System.out.println("环绕通知---->后置通知");
        }
        return result;
    }
}
