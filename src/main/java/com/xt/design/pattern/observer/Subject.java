package com.xt.design.pattern.observer;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * 被观察的对象
 */
public class Subject {

    /**
     * 监控的对象的属性
     */
    private int state;

    /**
     * 观察者list
     */
    private List<Observer> observerList = Lists.newArrayList();

    public void attatch(Observer observer) {
        observerList.add(observer);
    }

    public int getState() {
        return state;
    }

    public void updateState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        observerList.forEach(observer -> observer.subjectUpdate(this));
    }

}
