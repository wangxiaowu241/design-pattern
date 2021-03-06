package com.xt.design.pattern.command;


/**
 * 命令模式test
 * 命令模式：将请求的调用方和接收方分离，从而解耦。调用方无需关心是谁处理了这个命令，也无需关心如何处理。
 * <p>
 * Command：声明了所有具体命令类的抽象接口
 * 具体命令（ConcreteCommand）：定义接受者和执行者之间的弱耦合，实现execute方法，负责处理调用方的具体操作。
 * Client：创建一个具体命令执行者对象，并确定其接收者
 * KeyBoardInvoker：负责调用命令对象执行请求。
 * AudioPlayerReceiver：负责具体实施和执行一个请求。任何一个类都可以成为接收者，实施和执行请求的方法叫做行动方法。
 */
public class Client {

    public static void main(String[] args) {

        AudioPlayerReceiver audioPlayerReceiver = new AudioPlayerReceiver();

        PlayCommand playCommand = new PlayCommand(audioPlayerReceiver);

        StopCommand stopCommand = new StopCommand(audioPlayerReceiver);

        RewindCommand rewindCommand = new RewindCommand(audioPlayerReceiver);

        KeyBoardInvoker keyBoardInvoker = new KeyBoardInvoker();
        //播放音乐
        keyBoardInvoker.setCommand(playCommand);
        keyBoardInvoker.invoke();
        //倒带
        keyBoardInvoker.setCommand(rewindCommand);
        keyBoardInvoker.invoke();
        //停止
        keyBoardInvoker.setCommand(stopCommand);
        keyBoardInvoker.invoke();
    }
}
