package com.xt.design.pattern.command;

/**
 * 收音机的倒带命令
 */
public class RewindCommand extends Command {

    private AudioPlayerReceiver audioPlayerReceiver;

    public RewindCommand(AudioPlayerReceiver audioPlayerReceiver) {
        this.audioPlayerReceiver = audioPlayerReceiver;
    }

    @Override
    public void execute() {
        audioPlayerReceiver.rewind();
    }
}
