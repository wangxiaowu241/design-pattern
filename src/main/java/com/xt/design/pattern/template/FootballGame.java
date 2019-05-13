package com.xt.design.pattern.template;

public class FootballGame extends AbstractGame {
    @Override
    protected void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");

    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished!");

    }
}
