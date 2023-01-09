package com.patterns.strategy.strategies_and_singletons;

public class MyPayStrategy {
    private static MyPayStrategy instance;

    private PayStrategy strategy;

    private MyPayStrategy() {
    }

    public static MyPayStrategy getInstance() {
        if (instance == null) {
            instance = new MyPayStrategy();
        }
        return instance;
    }

    public void setStrategy(PayStrategy strategy) {
        this.strategy = strategy;
    }

    public PayStrategy getStrategy() {
        return strategy;
    }

    public void collectPaymentDetails() {
        strategy.collectPaymentDetails();
    }

    public boolean pay(int paymentAmount) {
        return strategy.pay(paymentAmount);
    }

}
