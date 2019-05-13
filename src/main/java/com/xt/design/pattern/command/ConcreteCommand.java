package com.xt.design.pattern.command;

public class ConcreteCommand extends Command {

    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {

        receiver.doSomething();
    }
}
