package com.xt.design.pattern.proxy.dynamic.cglib;


/**
 * cglib 动态代理测试
 */
public class CglibDynamicProxyTest {

    public static void main(String[] args) {

        SayHello sayHello = new SayHello();

        CglibProxyFactory cglibProxyFactory = new CglibProxyFactory(sayHello);

        SayHello proxyClass = (SayHello) cglibProxyFactory.getProxyClass();

        proxyClass.sayHeello();
    }
}
