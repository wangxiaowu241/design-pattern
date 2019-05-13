package com.xt.design.pattern.proxy.dynamic.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

/**
 * JDK动态代理测试
 *
 * @author wangxiaoteng
 * @date 2019/5/9 17:22
 */
public class JDKDynamicProxyTest {

    public static void main(String[] args)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        JDKDynamicProxyHandler jdkDynamicProxyHandler1 = new JDKDynamicProxyHandler(
                HelloServiceImpl.class);

        HelloService helloService = (HelloService) jdkDynamicProxyHandler1.getProxy();

        helloService.sayHello();

        Class<?> proxyClass = Proxy.getProxyClass(
                JDKDynamicProxyTest.class.getClassLoader(),
                new Class[]{HelloService.class});

        Constructor<?> constructor = proxyClass.getConstructor(InvocationHandler.class);

        JDKDynamicProxyHandler jdkDynamicProxyHandler = new JDKDynamicProxyHandler(HelloServiceImpl.class);

        HelloService helloService1 = (HelloService) constructor.newInstance(jdkDynamicProxyHandler);

        helloService1.sayHello();
    }
}
