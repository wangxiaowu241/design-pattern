package com.xt.design.pattern.command;


/**
 * 命令模式test
 * 命令模式：将请求的调用方和接收方分离，从而解耦。调用方无需关心是谁处理了这个命令，也无需关心如何处理。
 */
public class CommandDesignTest {

    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();
        invoker.setCommand(concreteCommand);
        invoker.invoke();

        invoker.setCommand(new SellCommand(receiver));
        invoker.invoke();
    }
}
