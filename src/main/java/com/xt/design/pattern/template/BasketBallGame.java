package com.xt.design.pattern.template;

public class BasketBallGame extends AbstractGame {
    @Override
    protected void initialize() {
        System.out.println("BasketBall Game Initialized! Start playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("BasketBall Game Started. Enjoy the game!");

    }

    @Override
    protected void endPlay() {
        System.out.println("BasketBall Game Finished!");

    }
}
