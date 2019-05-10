package com.xt.design.pattern.proxy.dynamic.jdk;

/**
 * @author wangxiaoteng
 * @date 2019/5/9 17:22
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public void sayHello() {
        System.out.println("hello world！");
    }
}
