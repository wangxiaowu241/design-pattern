package com.xt.design.pattern.command;

/**
 * 收音机的播放命令
 */
public class PlayCommand extends Command {

    private AudioPlayerReceiver audioPlayerReceiver;

    public PlayCommand(AudioPlayerReceiver audioPlayerReceiver) {
        this.audioPlayerReceiver = audioPlayerReceiver;
    }

    @Override
    public void execute() {
        audioPlayerReceiver.play();
    }
}
