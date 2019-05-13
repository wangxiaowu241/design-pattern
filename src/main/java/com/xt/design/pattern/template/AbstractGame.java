package com.xt.design.pattern.template;

public abstract class AbstractGame {

    /**
     * 初始化游戏
     */
    protected abstract void initialize();

    /**
     * 具体玩耍游戏
     */
    protected abstract void startPlay();

    /**
     * 停止游戏
     */
    protected abstract void endPlay();

    public void play() {

        initialize();

        startPlay();

        endPlay();
    }
}
