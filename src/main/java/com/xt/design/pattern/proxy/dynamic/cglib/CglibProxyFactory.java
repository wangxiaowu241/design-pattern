package com.xt.design.pattern.proxy.dynamic.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxyFactory implements MethodInterceptor {

    /**
     * 代理类目标对象--被代理类
     */
    private Object target;

    public CglibProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 获取代理类对象
     *
     * @return 代理类
     */
    public Object getProxyClass() {
        //工具类
        Enhancer enhancer = new Enhancer();
        //设置代理类
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        preAction();

        Object result = method.invoke(target, args);

        postAction();

        return result;
    }

    private void preAction() {
        System.out.println("cglib dynamic proxy pre action run ...");
    }

    private void postAction() {
        System.out.println("cglib dynamic proxy post action run ...");
    }
}
