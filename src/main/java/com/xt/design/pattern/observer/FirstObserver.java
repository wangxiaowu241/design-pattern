package com.xt.design.pattern.observer;

public class FirstObserver extends Observer {
    @Override
    public void subjectUpdate(Subject subject) {
        System.out.println(String.format("first observer 发现了subject:{%s}发生了变化。。。", subject.getState()));
    }
}
