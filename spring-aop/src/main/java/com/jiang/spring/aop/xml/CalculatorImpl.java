package com.jiang.spring.aop.xml;

import org.springframework.stereotype.Component;

/**
 * @author jiangronghua
 */
@Component
public class CalculatorImpl implements Calculator {
    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("日志，内部add 结果：" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("日志，内部sub 结果：" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println("日志，内部mul 结果：" + result);
        return result;
    }

    @Override
    public double div(int i, int j) {
        double result = i / j;
        System.out.println("日志，内部div 结果：" + result);
        return result;
    }
}
