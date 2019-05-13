package com.xt.design.pattern.responsebility_chain;

public abstract class AbstractLogger {

    public static final int DEBUG = 1;
    public static final int INFO = 2;
    public static final int ERROR = 3;


    protected int level;

    public AbstractLogger(int level) {
        this.level = level;
    }

    protected AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {

        if (level <= this.level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }
    }

    public abstract void write(String message);

    public abstract void setLevel();
}
