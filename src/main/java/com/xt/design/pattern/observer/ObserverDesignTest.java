package com.xt.design.pattern.observer;

/**
 * 观察者模式test
 */
public class ObserverDesignTest {
    public static void main(String[] args) {

        Subject subject = new Subject();

        FirstObserver firstObserver = new FirstObserver();
        SecondObserver secondObserver = new SecondObserver();

        subject.attatch(firstObserver);
        subject.attatch(secondObserver);

        subject.updateState(2);
    }
}
