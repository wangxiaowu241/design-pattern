package com.xt.design.pattern.responsebility_chain;

public class DebugLogger extends AbstractLogger {


    public DebugLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("debug logger write message ..." + message);
    }

    @Override
    public void setLevel() {
        level = DEBUG;
    }
}
