package com.xt.design.pattern.command;

/**
 * 请求的调用者
 */
public class Invoker {


    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        this.command.execute();
    }
}
