package com.xt.design.pattern.command;

/**
 * 请求的调用者，由键盘扮演
 */
public class KeyBoardInvoker {


    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void invoke() {
        this.command.execute();
    }
}
