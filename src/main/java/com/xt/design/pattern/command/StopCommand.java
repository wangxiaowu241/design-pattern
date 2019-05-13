package com.xt.design.pattern.command;

/**
 * 收音机的停止命令
 */
public class StopCommand extends Command {

    private AudioPlayerReceiver audioPlayerReceiver;

    public StopCommand(AudioPlayerReceiver audioPlayerReceiver) {
        this.audioPlayerReceiver = audioPlayerReceiver;
    }

    @Override
    public void execute() {
        audioPlayerReceiver.stop();
    }
}
