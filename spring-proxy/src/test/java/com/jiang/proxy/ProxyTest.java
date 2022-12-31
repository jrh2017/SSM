package com.jiang.proxy;

import com.jiang.spring.proxy.Calculator;
import com.jiang.spring.proxy.CalculatorImpl;
import com.jiang.spring.proxy.CalculatorStaticProxy;
import com.jiang.spring.proxy.ProxyFactory;
import org.junit.Test;

/**
 * @author jiangronghua
 */
public class ProxyTest {
    @Test
    public void testProxy() {
        // CalculatorStaticProxy proxy = new CalculatorStaticProxy(new CalculatorImpl());
        // int add = proxy.add(1, 2);

        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1, 2);
    }
}
