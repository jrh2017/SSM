package com.jiang.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author jiangronghua
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy() {
        /**
         * ClassLodaer loader : 指定加载动态生成定代理类定类加载器
         * Class[] interfaces: 获取目标对象实现的所有接口的class对象数组
         * InvocationHandler h : 设置代理类中的抽象方法如何重写
         */
        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("日志，方法："+ method.getName() + ", 参数 :" + Arrays.toString(args));
                Object result = method.invoke(target, args);
                System.out.println("日志，方法：" + method.getName() + ", 结果 :" + result);
                return result;
            }
        };
        return Proxy.newProxyInstance(classLoader, interfaces, h);
    }
}
