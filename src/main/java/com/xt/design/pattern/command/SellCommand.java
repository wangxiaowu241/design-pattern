package com.xt.design.pattern.command;

public class SellCommand extends Command {

    public Receiver receiver;

    public SellCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        System.out.println("sell something...");
        receiver.doSomething();
    }
}
