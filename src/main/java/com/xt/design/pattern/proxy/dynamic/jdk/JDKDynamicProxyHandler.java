package com.xt.design.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author wangxiaoteng
 * @date 2019/5/9 16:35
 */
public class JDKDynamicProxyHandler implements InvocationHandler {

    private Object target;

    public JDKDynamicProxyHandler(Class clazz) {
        try {
            this.target = clazz.getDeclaredConstructor().newInstance();
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        preAction();
        Object result = method.invoke(target, args);
        postAction();
        return result;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
        );
    }

    private void preAction() {
        System.out.println("JDKDynamicProxyHandler.preAction()");
    }

    private void postAction() {
        System.out.println("JDKDynamicProxyHandler.postAction()");
    }
}
