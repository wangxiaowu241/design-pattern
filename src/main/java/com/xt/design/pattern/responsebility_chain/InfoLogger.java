package com.xt.design.pattern.responsebility_chain;

public class InfoLogger extends AbstractLogger {


    public InfoLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("info logger write message ..." + message);
    }

    @Override
    public void setLevel() {
        level = INFO;
    }
}
