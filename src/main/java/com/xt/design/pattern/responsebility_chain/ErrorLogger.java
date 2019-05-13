package com.xt.design.pattern.responsebility_chain;

public class ErrorLogger extends AbstractLogger {


    public ErrorLogger(int level) {
        super(level);
    }

    @Override
    public void write(String message) {
        System.out.println("error logger write message ..." + message);
    }

    @Override
    public void setLevel() {
        level = ERROR;
    }
}
