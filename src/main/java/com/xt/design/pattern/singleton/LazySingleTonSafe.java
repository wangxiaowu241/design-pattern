package com.xt.design.pattern.singleton;

/**
 * 懒汉式-线程安全  缺点：方法上加锁，效率较低
 * <p/>
 * 是否lazy初始化：是
 * <p/>
 * 是否多线程安全：shi
 * <p/>
 * 实现难度：易
 * <p/>
 *
 * @author wangxiaoteng
 * @date 2019/4/29 19:00
 */
public final class LazySingleTonSafe {

    private static volatile LazySingleTonSafe instance;

    private LazySingleTonSafe() {
        if (instance != null) {
            throw new IllegalStateException("实例已经初始化！");
        }
    }

    public synchronized static LazySingleTonSafe getInstance() {
        if (null == instance) {
            instance = new LazySingleTonSafe();
        }
        return instance;
    }
}
