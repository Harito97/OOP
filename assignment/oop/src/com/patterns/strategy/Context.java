package com.patterns.strategy;

public class Context implements Strategy{
    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int execute(int a, int b){
        return strategy.execute(a, b);
    }
}
