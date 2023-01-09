package com.patterns.strategy;

public class ConcreteStrategyMultiply implements Strategy{
    public int execute(int a, int b){
        return a * b;
    }
}
