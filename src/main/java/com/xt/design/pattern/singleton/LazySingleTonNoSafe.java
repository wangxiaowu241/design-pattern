package com.xt.design.pattern.singleton;

/**
 * 懒汉式单例-非线程安全
 * <p>
 * <p/>
 * 是否lazy初始化：是
 * <p/>
 * 是否多线程安全：否
 * <p/>
 * 实现难度：易
 * <p/>
 *
 * @author wangxiaoteng
 * @date 2019/4/29 18:57
 */
public final class LazySingleTonNoSafe {

    private static LazySingleTonNoSafe instance;

    private LazySingleTonNoSafe() {
        if (instance != null) {
            throw new IllegalStateException("实例已经初始化！");
        }
    }

    private static LazySingleTonNoSafe getInstance() {
        if (null == instance) {
            instance = new LazySingleTonNoSafe();
        }
        return instance;
    }
}
