package com.patterns.strategy.ex_strategy;

public class ClientUse {
    public static void main(String[] args) {
        Vehicle car = new DiveIntoWater();
        car.whatCanDo();
        car = new FlyOnSky();
        car.whatCanDo();
        car = new RunOnGround();
        car.whatCanDo();
    }
}
