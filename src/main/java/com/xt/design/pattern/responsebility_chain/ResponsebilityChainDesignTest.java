package com.xt.design.pattern.responsebility_chain;

/**
 * 责任链模式test
 * 责任链模式：为请求创建一个接受者对象的链，这种模式给与请求的类型，对请求的发送者和接收者解耦。
 * 避免请求发送者与接收者耦合在一起，让多个对象都有可能接收请求，将这些对象连接成一条链，并且沿着这条链传递请求，直到有对象处理它为止。
 */
public class ResponsebilityChainDesignTest {

    public static void main(String[] args) {

        DebugLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        InfoLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);

        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);

        debugLogger.logMessage(AbstractLogger.DEBUG,"this is debug message");
        debugLogger.logMessage(AbstractLogger.INFO,"this is info message");
        debugLogger.logMessage(AbstractLogger.ERROR,"this is error message");
    }
}
