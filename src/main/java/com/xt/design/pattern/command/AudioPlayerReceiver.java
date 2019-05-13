package com.xt.design.pattern.command;

/**
 * 请求的接受者，负责处理请求
 * 在这里为收音机，有播放、停止、倒带等功能
 */
public class AudioPlayerReceiver {

    public void play() {
        System.out.println("播放音乐中。。。");
    }

    public void stop() {
        System.out.println("收音机停止运行工作。。。");
    }

    public void rewind(){
        System.out.println("倒带中。。。");
        play();
    }
}
